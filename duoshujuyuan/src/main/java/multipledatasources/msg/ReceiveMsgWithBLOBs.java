package multipledatasources.msg;

import java.io.Serializable;

public class ReceiveMsgWithBLOBs extends ReceiveMsg implements Serializable {
    private String tableName;

    /**
     * 消息数据
     */
    private String messageContent;

    /**
     * 备注
     */
    private String notes;

    /**
     * SEND_MSG_SSS101
     */
    private static final long serialVersionUID = 1L;

    /**
     * 消息数据
     * @return MESSAGE_CONTENT 消息数据
     */
    public String getMessageContent() {
        return messageContent;
    }

    /**
     * 消息数据
     * @param messageContent 消息数据
     */
    public void setMessageContent(String messageContent) {
        this.messageContent = messageContent == null ? null : messageContent.trim();
    }

    /**
     * 备注
     * @return NOTES 备注
     */
    public String getNotes() {
        return notes;
    }

    /**
     * 备注
     * @param notes 备注
     */
    public void setNotes(String notes) {
        this.notes = notes == null ? null : notes.trim();
    }

    public String getTableName() {
        return tableName;
    }

    public void setTableName(String tableName) {
        this.tableName = tableName;
    }
}