package multipledatasources.msg;

import java.io.Serializable;
import java.util.Date;

public class ReceiveMsg implements Serializable {
    /**
     * 自增ID
     */
    private String id;

    /**
     * 报文ID
     */
    private String messageId;

    /**
     * 业务单证编码
     */
    private String bizId;

    /**
     * 报文类型
     */
    private String messageCode;

    /**
     * 发送方ID
     */
    private String senderId;

    /**
     * 发送时间
     */
    private Date sendTime;

    /**
     * 接收时间
     */
    private Date receiveTime;

    /**
     * 创建时间
     */
    private Date createTime;

    /**
     * 最后处理时间
     */
    private Date lastProcessingTime;

    /**
     * SEND_MSG_SSS101
     */
    private static final long serialVersionUID = 1L;

    /**
     * 自增ID
     * @return ID 自增ID
     */
    public String getId() {
        return id;
    }

    /**
     * 自增ID
     * @param id 自增ID
     */
    public void setId(String id) {
        this.id = id;
    }

    /**
     * 报文ID
     * @return MESSAGE_ID 报文ID
     */
    public String getMessageId() {
        return messageId;
    }

    /**
     * 报文ID
     * @param messageId 报文ID
     */
    public void setMessageId(String messageId) {
        this.messageId = messageId == null ? null : messageId.trim();
    }

    /**
     * 业务单证编码
     * @return BIZ_ID 业务单证编码
     */
    public String getBizId() {
        return bizId;
    }

    /**
     * 业务单证编码
     * @param bizId 业务单证编码
     */
    public void setBizId(String bizId) {
        this.bizId = bizId == null ? null : bizId.trim();
    }

    /**
     * 报文类型
     * @return MESSAGE_CODE 报文类型
     */
    public String getMessageCode() {
        return messageCode;
    }

    /**
     * 报文类型
     * @param messageCode 报文类型
     */
    public void setMessageCode(String messageCode) {
        this.messageCode = messageCode == null ? null : messageCode.trim();
    }

    /**
     * 发送方ID
     * @return SENDER_ID 发送方ID
     */
    public String getSenderId() {
        return senderId;
    }

    /**
     * 发送方ID
     * @param senderId 发送方ID
     */
    public void setSenderId(String senderId) {
        this.senderId = senderId == null ? null : senderId.trim();
    }


    public Date getReceiveTime() {
        return receiveTime;
    }

    public void setReceiveTime(Date receiveTime) {
        this.receiveTime = receiveTime;
    }

    /**
     * 创建时间
     * @return CREATE_TIME 创建时间
     */
    public Date getCreateTime() {
        return createTime;
    }

    /**
     * 创建时间
     * @param createTime 创建时间
     */
    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    /**
     * 最后处理时间
     * @return LAST_PROCESSING_TIME 最后处理时间
     */
    public Date getLastProcessingTime() {
        return lastProcessingTime;
    }

    /**
     * 最后处理时间
     * @param lastProcessingTime 最后处理时间
     */
    public void setLastProcessingTime(Date lastProcessingTime) {
        this.lastProcessingTime = lastProcessingTime;
    }

    public Date getSendTime() {
        return sendTime;
    }

    public void setSendTime(Date sendTime) {
        this.sendTime = sendTime;
    }
}