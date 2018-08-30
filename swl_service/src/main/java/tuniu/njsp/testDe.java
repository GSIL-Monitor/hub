package tuniu.njsp;

import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import scala.Char;

import java.math.BigDecimal;

/**
 * Created by songweiliang on 2017/11/22.
 */
public class testDe
{
    public  static void main(String[] args) throws CloneNotSupportedException {

        Long time = System.currentTimeMillis();
        String s = "{\"success\":true,\"msg\":\"成功执行\",\"errorCode\":200,\"data\":{\"refundFlag\":true,\"orderSaleRemark\":\"\",\"confirmInfo\":[{\"adultNum\":2,\"childNum\":0,\"flag\":1,\"provideContactTel\":\"400-797-5000\",\"createTime\":\"2017-08-17 13:27:31\",\"provideContactFax\":\"\",\"provideContactName\":\"\",\"totalMoney\":2.00,\"confirmId\":442726,\"departDate\":\"2017-08-31\",\"confirmStatus\":2,\"url\":\"\"}],\"attach\":[{\"fileName\":\"保险保单\",\"type\":\"14\",\"url\":\"http://10.10.32.194:14401/ins-web/shn/manage/line/get/downloadPolicy/2827053100201700681\"},{\"fileName\":\"保险保单\",\"type\":\"14\",\"url\":\"http://10.10.32.194:14401/ins-web/shn/manage/line/get/downloadPolicy/2827053100201700680\"}],\"insuranceFlag\":0,\"noticePdfUrl\":\"\",\"distributeProductId\":210013552,\"distributeProductName\":\"[春节]&lt;联运测试自动化测试专用勿动谢谢游&gt;test\",\"labelType\":null,\"productType\":1,\"orderRemark\":null,\"orderStatus\":\"已取消\",\"availableCoupon\":null,\"couponId\":\"\",\"couponName\":null,\"couponAmount\":null,\"salerName\":\"\",\"salerTelExt\":\"\",\"acctId\":100012,\"distributeId\":200003,\"orderInfo\":{\"departureTime\":\"2017-08-31 00:00:00\",\"orderType\":56,\"canPay\":\"1\",\"orderId\":1022717617,\"productChildClassId\":0,\"adultCount\":2,\"clearTime\":\"2017-08-18 13:27:30\",\"sourceSystem\":6,\"signStatus\":1,\"contractRouteName\":\"1022717617签约行程.pdf\",\"contractRouteUrl\":\"http://fb2.tuniu-sit.org/fb2/t2/group1/M00/05/34/Cgogo1mVK22INTihAAKgMTUx3ikAAABVgAAAAAAAqBJ029.pdf\",\"source\":3,\"productLineDesName\":0,\"productName\":\"[春节]<联运测试自动化测试专用勿动谢谢游>test\",\"startCityName\":\"南京\",\"orderTime\":\"2017-08-17 13:27:28\",\"payedPrice\":0,\"productLineDesGroup\":64,\"action\":\"0000000000000010\",\"pgaOrderStatusCode\":\"OS001\",\"contactMail\":\"5132@qq.com\",\"attach\":[{\"fileName\":\"保险保单\",\"type\":\"14\",\"url\":\"http://10.10.32.194:14401/ins-web/shn/manage/line/get/downloadPolicy/2827053100201700681\"},{\"fileName\":\"保险保单\",\"type\":\"14\",\"url\":\"http://10.10.32.194:14401/ins-web/shn/manage/line/get/downloadPolicy/2827053100201700680\"}],\"noticeUrl\":[],\"productLineDesType\":8,\"nums\":2,\"productType\":1,\"desCityName\":\"澳门\",\"flightInfo\":[],\"productClassId\":1,\"signTime\":\"2017-08-17 13:36:40\",\"productId\":210013552,\"amoutPrice\":2.0,\"contactName\":\"途牛测试\",\"contactFixPhone\":\"15937246384\",\"childCount\":0,\"startCityCode\":1602,\"returnTime\":\"2017-09-02 00:00:00\",\"invoiceList\":[{\"agents\":[{\"agentId\":12266,\"agentType\":2,\"agentManagerName\":\"陈金明\",\"orderId\":1022717617,\"agentName\":\"陈祥祥\",\"agentManagerId\":1954},{\"agentId\":13894,\"agentType\":3,\"agentManagerName\":\"王小青\",\"orderId\":1022717617,\"agentName\":\"陈元兵\",\"agentManagerId\":13830},{\"agentId\":13830,\"agentType\":6,\"agentManagerName\":\"李青3\",\"orderId\":1022717617,\"agentName\":\"王小青\",\"agentManagerId\":3584}],\"companyBankAccount\":\"4352352532525223525252525\",\"salerName\":\"王小青\",\"typeName\":\"增值税普通发票\",\"billState\":4,\"contacter_address\":\"安徽(省)合肥(市)发鬼地方个人工的人格上肉个\",\"contacter_tel\":\"15937246384\",\"remark\":\"\",\"taxpayerIdentity\":\"91110105795109711c\",\"title\":\"测试抬头-途牛旅游网2222\",\"content\":\"旅游费\",\"zip_code\":\"\",\"addressId\":137221949,\"delivery_num\":\"\",\"invoiceMethod\":1,\"delivery_type\":\"3\",\"invoiceType\":2,\"companyBankName\":\"50字符太长了了了，江苏省南京\",\"id\":539047526,\"state\":2,\"email\":\"\",\"amount\":1.0,\"stateDesc\":\"已退票\",\"refundReason\":\"\",\"companyTel\":\"123-324地飞过倒挂的\",\"expressState\":3,\"invoicePdfUrl\":\"\",\"companyId\":7,\"contacter\":\"9\",\"companyAddress\":\"区玄武大道699-32号，途牛大厦\",\"saler_id\":13830,\"add_time\":\"2017-08-17 00:00:00\",\"status\":\"已退票\"},{\"agents\":[{\"agentId\":12266,\"agentType\":2,\"agentManagerName\":\"陈金明\",\"orderId\":1022717617,\"agentName\":\"陈祥祥\",\"agentManagerId\":1954},{\"agentId\":13894,\"agentType\":3,\"agentManagerName\":\"王小青\",\"orderId\":1022717617,\"agentName\":\"陈元兵\",\"agentManagerId\":13830},{\"agentId\":13830,\"agentType\":6,\"agentManagerName\":\"李青3\",\"orderId\":1022717617,\"agentName\":\"王小青\",\"agentManagerId\":3584}],\"companyBankAccount\":\"4352352532525223525252525\",\"salerName\":\"王小青\",\"typeName\":\"增值税普通发票\",\"billState\":0,\"contacter_address\":\"安徽(省)合肥(市)发鬼地方个人工的人格上肉个\",\"contacter_tel\":\"15937246384\",\"remark\":\"\",\"taxpayerIdentity\":\"91110105795109711c\",\"title\":\"测试抬头-途牛旅游网2222\",\"content\":\"保险费\",\"zip_code\":\"\",\"addressId\":137221949,\"delivery_num\":\"\",\"invoiceMethod\":1,\"delivery_type\":\"3\",\"invoiceType\":2,\"companyBankName\":\"50字符太长了了了，江苏省南京\",\"id\":539047528,\"state\":2,\"email\":\"\",\"amount\":0.0,\"stateDesc\":\"待开票\",\"refundReason\":\"\",\"companyTel\":\"123-324地飞过倒挂的\",\"expressState\":0,\"invoicePdfUrl\":\"\",\"companyId\":4,\"contacter\":\"9\",\"companyAddress\":\"\",\"saler_id\":13830,\"add_time\":\"2017-08-17 00:00:00\",\"status\":\"待开票\"},{\"agents\":[{\"agentId\":12266,\"agentType\":2,\"agentManagerName\":\"陈金明\",\"orderId\":1022717617,\"agentName\":\"陈祥祥\",\"agentManagerId\":1954},{\"agentId\":13894,\"agentType\":3,\"agentManagerName\":\"王小青\",\"orderId\":1022717617,\"agentName\":\"陈元兵\",\"agentManagerId\":13830},{\"agentId\":13830,\"agentType\":6,\"agentManagerName\":\"李青3\",\"orderId\":1022717617,\"agentName\":\"王小青\",\"agentManagerId\":3584}],\"companyBankAccount\":\"\",\"salerName\":\"圣香\",\"typeName\":\"增值税普通发票\",\"billState\":4,\"contacter_address\":\"途牛大厦\",\"contacter_tel\":\"185****7661\",\"remark\":\"xxx\",\"taxpayerIdentity\":\"\",\"title\":\"xxx\",\"content\":\"代订交通费\",\"zip_code\":\"\",\"addressId\":115,\"delivery_num\":\"\",\"invoiceMethod\":1,\"delivery_type\":\"0\",\"invoiceType\":2,\"companyBankName\":\"\",\"id\":539047988,\"state\":2,\"email\":\"\",\"amount\":30.0,\"stateDesc\":\"已退票\",\"refundReason\":\"\",\"companyTel\":\"\",\"expressState\":2,\"invoicePdfUrl\":\"\",\"companyId\":4,\"contacter\":\"胡艳玲\",\"companyAddress\":\"\",\"saler_id\":20294,\"add_time\":\"2017-10-09 00:00:00\",\"status\":\"已退票\"}],\"tourResList\":[{\"schemeList\":[{\"resourceId\":2147599978,\"departsStartDate\":\"2017-08-31 00:00:00\",\"addTime\":\"2017-08-17 00:00:00\",\"baseGenTourResourceId\":2147599978,\"adultCount\":2,\"adultPrice\":5199.0,\"childPriceCount\":0,\"addName\":\"系统\",\"journeyId\":577444,\"priceList\":[],\"duration\":3,\"opNotice\":\"\",\"busService\":\"0\",\"updateUid\":39,\"custNotice\":\"\",\"resManagerName\":\"王丹5\",\"addUid\":39,\"startTransportWay\":1,\"id\":38634,\"isUpgradePlan\":0,\"departsEndDate\":\"2017-09-02 00:00:00\",\"resStatus\":\"已核损\",\"resCharger\":5118,\"desCity\":0,\"startCity\":0,\"upgradePlanName\":\"基础方案 \",\"night\":2,\"resChargerName\":\"王丹5\",\"adultPriceCount\":0,\"backTransportWay\":1,\"resourceName\":\"[春节]<联运测试自动化测试专用勿动谢谢游>test\",\"updateTime\":\"2017-08-17 00:00:00\",\"childCount\":0,\"revertName\":\"陈祥祥\",\"updateName\":\"系统\",\"resSubType\":1,\"resourceMainId\":2000295810,\"resManager\":5118,\"childPrice\":4888.0,\"isBandTourist\":false,\"status\":14,\"resourceType\":27}],\"journeyId\":577444}],\"hotelInfo\":[],\"bookCityCode\":\"1602\",\"orderInsuranceInfo\":[{\"explain\":\"\",\"returnComScale\":0.0,\"resourceId\":1517339468,\"billFilePath\":\"http://10.10.32.194:14401/ins-web/shn/manage/line/get/downloadPolicy/2827053100201700680\",\"groupType\":1,\"addTime\":\"2017-08-17 13:27:29\",\"buyDate\":\"2017-08-17 00:00:00\",\"num\":2,\"remark\":\"\",\"insuranceType\":2,\"journeyId\":577443,\"delFlag\":0,\"descriptions\":[{\"name\":\"【保障项名称】\",\"value\":\"(test) 保额(100 万元) 保障项描述(天set)\"}],\"touristId\":\"137221932\",\"hasFalse\":false,\"identityType\":0,\"updateUid\":13830,\"price\":195.0,\"lossPercentage\":0.0,\"guaranteAmountLimit\":0,\"id\":45670,\"resStatus\":\"已确认\",\"shouldDoPlugin\":true,\"selected\":0,\"expirationDate\":\"2017-09-02 00:00:00\",\"limitNum\":1,\"supplierName\":\"美亚财产保险有限公司上海分公司\",\"touristName\":\"小小\",\"operateType\":0,\"bandTouristDelFlag\":0,\"updateTime\":\"2017-08-24 13:19:28\",\"resourceMainId\":2000295808,\"errorMsg\":\"\",\"onlineChangeFlag\":false,\"limitDayStart\":1,\"nonClusterFlag\":false,\"insuranceNum\":\"2827053100201700680\",\"buyStatus\":7,\"isGive\":0,\"name\":\"SIT_环境默认保险旅行意外险方案一\",\"interactiveWithStm\":true,\"limitDayEnd\":7,\"hasWaiting\":false,\"effectiveDate\":\"2017-08-31 00:00:00\",\"status\":10,\"resourceType\":15}],\"orderOtherInfo\":[{\"pickUpInfo\":\"\",\"dfcInfo\":\"\"}],\"tourists\":[{\"birthday\":\"1985-01-01\",\"isBaby\":false,\"country\":\"中国\",\"firstname\":\"dfgdg\",\"pspt_id\":\"G26326\",\"intlTel\":\"008615937246384\",\"pspt_type\":2,\"destnPostcode\":\"\",\"macvisaType\":0,\"psptEndDate\":\"2023-02-17\",\"birthPlace\":\"\",\"custId\":6675807,\"tel\":\"15937246384\",\"personType\":1,\"hkmacIssueOrgan\":\"\",\"issueOrgan\":\"\",\"email\":\"\",\"person_id\":137221933,\"sex\":1,\"intlCode\":\"0086\",\"lastname\":\"dfgd\",\"touristType\":0,\"telCountryId\":40,\"bindResource\":0,\"name\":\"大大\",\"destnAddress\":\"\",\"hkvisaType\":0,\"mark\":0,\"age\":32},{\"birthday\":\"1985-01-01\",\"isBaby\":false,\"country\":\"中国\",\"firstname\":\"dfgdfg\",\"pspt_id\":\"G34636\",\"intlTel\":\"008615937246384\",\"pspt_type\":2,\"destnPostcode\":\"\",\"macvisaType\":0,\"psptEndDate\":\"2024-02-17\",\"birthPlace\":\"\",\"custId\":6675807,\"tel\":\"15937246384\",\"personType\":2,\"hkmacIssueOrgan\":\"\",\"issueOrgan\":\"\",\"email\":\"\",\"person_id\":137221932,\"sex\":1,\"intlCode\":\"0086\",\"lastname\":\"dgdf\",\"touristType\":0,\"telCountryId\":40,\"bindResource\":0,\"name\":\"小小\",\"destnAddress\":\"\",\"hkvisaType\":0,\"mark\":0,\"age\":32}],\"statusCode\":\"OS0099\",\"status\":\"已取消（签约后）\"},\"productCatType\":2,\"customInfo\":{}},\"traceId\":\"78b860558c174d5cbda333441c733e71\"}";
        Object value = getValue4Key("agentManagerId", JSONArray.parseObject(s));
        System.out.println(JSONArray.toJSONString(value));
        System.out.println(System.currentTimeMillis() - time);
    }

    public static Object getValue4Key(String key,Object o){
        Object value = null;
        if(!key.isEmpty() && o!= null) {
            if (o instanceof JSONArray) {
                value = getValue4KeyList(key, (JSONArray) o);
            } else {
                value = getValue4KeyMap(key, (JSONObject) o);
            }
        }
        return value;
    }

    /**
     * for jsonObject
     * @param key
     * @param json
     * @return
     */
    public  static Object getValue4KeyMap(String key, JSONObject json){
        Object value = null;
        JSONArray valueArr = new JSONArray();
        if(json.containsKey(key)){
           return json.get(key);
        }
        for (String innerKey:json.keySet()){
            if(!isLeaf(json.get(innerKey))){
                if(json.get(innerKey) instanceof JSONArray){
                    valueArr = getValue4KeyList(key,json.getJSONArray(innerKey));
                    if(valueArr.size() >0){
                        return valueArr;
                    }
                }else{
                    //对于map来说，拿到一个值就可以了
                    value = getValue4KeyMap(key,json.getJSONObject(innerKey));
                    if(value != null){
                        return value;
                    }
                }
            }

        }
        return value;
    }

    /**
     * for jsonArray
     * @param key
     * @param json
     * @return
     */
    public static JSONArray getValue4KeyList(String key,JSONArray json){
        JSONArray value = new JSONArray();
        for (Object o:json){
            Object oneValue = null;
            if(isLeaf(o)){
                continue;
            }else if(o instanceof JSONArray){
                oneValue = getValue4KeyList(key,(JSONArray)o);
            }else{
                oneValue = getValue4KeyMap(key,(JSONObject)o);
            }
            if(oneValue != null){
                value.add(oneValue);
            }
        }
        return value;
    }

    public static Boolean isLeaf(Object o){
        if(o == null){
            return true;
        }
        if(o instanceof String){
            return true;
        }
        if(o instanceof Integer){
            return true;
        }
        if(o instanceof Long){
            return true;
        }
        if(o instanceof Float){
            return true;
        }
        if(o instanceof Double){
            return true;
        }
        if(o instanceof Byte){
            return true;
        }
        if(o instanceof Boolean){
            return true;
        }
        if(o instanceof Char){
            return true;
        }
        if(o instanceof BigDecimal){
            return true;
        }
        return false;
    }
}


