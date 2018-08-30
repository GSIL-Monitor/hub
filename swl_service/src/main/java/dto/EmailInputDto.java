package dto;

/**
 * Created by songweiliang on 2017/8/10.
 */

import java.util.List;

/**
 * Created by caojunwei on 2016/7/11.
 */
public class EmailInputDto {

    /**
     * 订单号
     */
    private Integer orderId;

    /**
     * 发送人当前uid
     */
    private Integer senderUid;

    public Integer getOrderId() {
        return orderId;
    }

    public void setOrderId(Integer orderId) {
        this.orderId = orderId;
    }

    public Integer getSenderUid() {
        return senderUid;
    }

    public void setSenderUid(Integer senderUid) {
        this.senderUid = senderUid;
    }



    /**
     * 系统编码
     */
    private String systemCode;

    /**
     * 业务编码
     */
    private String businessId;

    /**
     * 发送人
     */
    private String senderName;

    /**
     * 主题
     */
    private String subject;

    /**
     * 正文
     */
    private String msgText;

    /**
     * 收件人列表
     */
    private List<String> recipientEmails;

    /**
     * 抄送人列表
     */
    private List<String> ccEmails;


    public String getSystemCode() {
        return systemCode;
    }

    public void setSystemCode(String systemCode) {
        this.systemCode = systemCode;
    }

    public String getBusinessId() {
        return businessId;
    }

    public void setBusinessId(String businessId) {
        this.businessId = businessId;
    }

    public String getSenderName() {
        return senderName;
    }

    public void setSenderName(String senderName) {
        this.senderName = senderName;
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public String getMsgText() {
        return msgText;
    }

    public void setMsgText(String msgText) {
        this.msgText = msgText;
    }

    public List<String> getRecipientEmails() {
        return recipientEmails;
    }

    public void setRecipientEmails(List<String> recipientEmails) {
        this.recipientEmails = recipientEmails;
    }

    public List<String> getCcEmails() {
        return ccEmails;
    }

    public void setCcEmails(List<String> ccEmails) {
        this.ccEmails = ccEmails;
    }


}
