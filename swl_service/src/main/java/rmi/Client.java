package rmi;

import org.springframework.web.bind.annotation.RequestMapping;

import java.rmi.NotBoundException;
import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;

/**
 * Created by songweiliang on 2017/8/14.
 */
public class Client {
    public static void main(String[] arg){
        //注册管理器
        Registry registry = null;
        try{
            registry = LocateRegistry.getRegistry("127.0.0.1",8088);
            //列出所有注册服务
            String[] list = registry.list();
            for(String s:list){
                System.out.println(s);
            }
        }catch (RemoteException r){

        }

        try {
            //根据命名获取服务
            IService service = null;
            service = (IService) registry.lookup("vince");
            //调用远程方法
            String result = service.queryName("songweiliang");
            //输出结果
            System.out.println(result);
        } catch (RemoteException e) {
            e.printStackTrace();
        } catch (NotBoundException e) {
            e.printStackTrace();
        }

    }
}
