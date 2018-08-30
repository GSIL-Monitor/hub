package assist;

import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import javassist.*;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.lang.reflect.Modifier;
import java.math.BigDecimal;
import java.util.Map;

/**
 * Created by songweiliang on 2017/9/29.
 */
public class Json2Vo {
    private static ClassPool pool = ClassPool.getDefault();
    public static  void main(String[] arg) throws CannotCompileException, NotFoundException, IOException, InstantiationException, IllegalAccessException {
        String s = null;
        JSONObject  json= JSONArray.parseObject(s);
        String voName = "Top";
        jsonTovo(json,voName);

    }
    public static  CtClass  jsonTovo(JSONObject json,String voName) throws CannotCompileException, NotFoundException, IOException, IllegalAccessException, InstantiationException {
        if(json == null ){return null;}
        if(voName == null ){voName = "Data";}
        CtClass ctClass = pool.makeClass("assist."+voName);
        for (String key : json.keySet()){
            CtClass type = getAtributeCt(json,key);
            //添加属性
            CtField field = null;
            field = new CtField(type,key,ctClass);
            field.setModifiers(Modifier.PRIVATE);
            ctClass.addField(field);
            //添加方法
            ctClass.addMethod(CtNewMethod.setter("set"+toUper(key),field));
            ctClass.addMethod(CtNewMethod.getter("get"+toUper(key),field));
        }
        writeFile(ctClass,voName);

        return ctClass;
    }

    private static void writeFile(CtClass a,String fileName) throws IOException, CannotCompileException {
        File file = new File("D://voTmp/"+fileName+".class");
        if(!file.exists()){
            file.createNewFile();
        }
        FileOutputStream out = new FileOutputStream(file);
        out.write(a.toBytecode());
        out.close();
    }

    private static String toUper(String key){
        String methodName = "";
        String keyTmp = key;
        char[] keyCahr = new char[100];
        keyCahr = keyTmp.toCharArray() ;
        keyCahr[0]  = Character.toUpperCase(key.charAt(0));
        methodName = new String(keyCahr);
        return methodName;
    }

    private static CtClass getAtributeCt(JSONObject json,String key){
        String type ="java.lang.String";
        CtClass c = null;
        if(json.get(key) instanceof Integer){
            type = "java.lang.Integer";
        }
        if(json.get(key) instanceof Long){
            type = "java.lang.Long";
        }
        if(json.get(key) instanceof Float) {
            type = "java.lang.Float";
        }
        if(json.get(key)instanceof Double) {
            type = "java.lang.Double";
        }
        if(json.get(key) instanceof Boolean) {
            type = "java.lang.Boolean";
        }
        if(json.get(key) instanceof String) {
            type = "java.lang.String";
        }
        if(json.get(key) instanceof BigDecimal) {
            type = "java.math.BigDecimal";
        }

        if(type != null){
            try {
                c = pool.get(type);
            } catch (NotFoundException e) {
                e.printStackTrace();
            }
        }
        if(json.get(key) instanceof JSONArray) {
            JSONArray jsonArray = json.getJSONArray(key);
            try {
                c = jsonTovo(jsonArray.getJSONObject(0),toUper(key));
            } catch (Exception e) {
              e.printStackTrace();
            }
        }
        if(json.get(key) instanceof Map) {
            try {
                c = jsonTovo(json.getJSONObject(key),toUper(key));
            } catch (Exception e) {
                e.printStackTrace();
            }
        }

        return c;
    }
}
