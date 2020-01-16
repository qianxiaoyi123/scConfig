package multipledatasources.msg;

import org.apache.commons.lang3.StringUtils;

/**
 * 报文类型 与对应的 类
 * SSS - BTM
 * CHK - BTR
 */
public enum MessageTypeEnum {
	 //例子
	 // SAS125("SAS125","cn.gov.customs.msgexchange.msg.model.messageType.SAS125MessageHandle", "BTM", "BTR");
	
	
	/**********************************************发送报文**********************************/
    /**********************************************发送报文**********************************/
	BTM105("BTM105", "cn.gov.customs.msgexchange.msg.model.messageType.SSS105MessageHandle", "BTM", "BTR"),
	//申报终端返回的报文
	BTR103("BTR103", "cn.gov.customs.msgexchange.msg.model.messageType.CHK103MessageHandle", "BTR", "BTM"),
	
	/**********************************************解析报文**********************************/
    /**********************************************解析报文**********************************/
	///解析保文
	BTR145("BTR145","cn.gov.customs.msgexchange.msg.model.messageType.CHK145MessageHandle", "BTR", "BTM"),
	BTR115("BTR115","cn.gov.customs.msgexchange.msg.model.messageType.CHK115MessageHandle", "BTR", "BTM"),
	BTR121("BTR121","cn.gov.customs.msgexchange.msg.model.messageType.CHK121MessageHandle", "BTR", "BTM"),
	BTR101("BTR101","cn.gov.customs.msgexchange.msg.model.messageType.CHK101MessageHandle", "BTR", "BTM"),
	BTM111("BTM111","cn.gov.customs.msgexchange.msg.model.messageType.SSS111MessageHandle", "BTR", "BTM"),
	BTR113("BTR113","cn.gov.customs.msgexchange.msg.model.messageType.CHK113MessageHandle", "BTR", "BTM"),
	BTR107("BTR107","cn.gov.customs.msgexchange.msg.model.messageType.CHK107MessageHandle", "BTR", "BTM"),
	BTM109("BTM109","cn.gov.customs.msgexchange.msg.model.messageType.SSS109MessageHandle", "BTM", "BTR"),
	BTM117("BTM117","cn.gov.customs.msgexchange.msg.model.messageType.SSS117MessageHandle", "BTM", "BTR"),
    BTM107("BTM107","cn.gov.customs.msgexchange.msg.model.messageType.SSS107MessageHandle", "BTM", "BTR"),
    BTM115("BTM115","cn.gov.customs.msgexchange.msg.model.messageType.SSS115MessageHandle", "BTM", "BTR"),

    //进口商品申报单 接收监管系统报文
    BTR105("BTR105","cn.gov.customs.msgexchange.msg.model.messageType.CHK105MessageHandle", "BTR", "BTM"),
    //出口商品申报单 向监管系统发送报文
    BTM125("BTM125","cn.gov.customs.msgexchange.msg.model.messageType.SSS125MessageHandle", "BTM", "BTR"),
    //商铺备案
    BTM103("BTM103","cn.gov.customs.msgexchange.msg.model.messageType.SSS103MessageHandle", "BTM", "BTR"),
    
    //异常日志, 监管系统 接收报文
	BTM113("BTM113","cn.gov.customs.msgexchange.msg.model.messageType.SSS113MessageHandle", "BTM", "BTR"),
	//操作日志,监管系统 接收报文
	BTM119("BTM119","cn.gov.customs.msgexchange.msg.model.messageType.SSS119MessageHandle", "BTM", "BTR"),
	
    BTR127("BTR127","cn.gov.customs.msgexchange.msg.model.messageType.CHK127MessageHandle", "BTR", "BTM"),
    /*参数管理报文发送增加内容开始*/
    BTR129("BTR129","cn.gov.customs.msgexchange.msg.model.MessageTypeHandle.CHK129MessageHandle", "BTR", "BTM"),
    BTR131("BTR131","cn.gov.customs.msgexchange.msg.model.MessageTypeHandle.CHK131MessageHandle", "BTR", "BTM"),
    BTR133("BTR133","cn.gov.customs.msgexchange.msg.model.MessageTypeHandle.CHK133MessageHandle", "BTR", "BTM"),
    BTR135("BTR135","cn.gov.customs.msgexchange.msg.model.MessageTypeHandle.CHK135MessageHandle", "BTR", "BTM"),
    BTR137("BTR137","cn.gov.customs.msgexchange.msg.model.MessageTypeHandle.CHK137MessageHandle", "BTR", "BTM"),
    BTR139("BTR139","cn.gov.customs.msgexchange.msg.model.MessageTypeHandle.CHK139MessageHandle", "BTR", "BTM"),
    BTR141("BTR141","cn.gov.customs.msgexchange.msg.model.MessageTypeHandle.CHK141MessageHandle", "BTR", "BTM"),
    BTR143("BTR143","cn.gov.customs.msgexchange.msg.model.MessageTypeHandle.CHK143MessageHandle", "BTR", "BTM"),
    BTR149("BTR149","cn.gov.customs.msgexchange.msg.model.MessageTypeHandle.CHK149MessageHandle", "BTR", "BTM"),
    /*参数管理增加内容结束*/
    //高风险信息 接收监管系统报文
    BTR119("BTR119","cn.gov.customs.msgexchange.msg.model.messageType.CHK119MessageHandle", "BTR", "BTM"),
	BTR125("BTR125","cn.gov.customs.msgexchange.msg.model.messageType.CHK125MessageHandle", "BTR", "BTM"),
	BTR109("BTR109","cn.gov.customs.msgexchange.msg.model.MessageTypeHandle.CHK109MessageHandle", "BTR", "BTM"),
    BTR111("BTR111","cn.gov.customs.msgexchange.msg.model.MessageTypeHandle.CHK111MessageHandle", "BTR", "BTM"),
    BTR147("BTR147","cn.gov.customs.msgexchange.msg.model.MessageTypeHandle.CHK147MessageHandle", "BTR", "BTM"),
    BTR151("BTR151","cn.gov.customs.msgexchange.msg.model.MessageTypeHandle.CHK151MessageHandle", "BTR", "BTM"),
	
	//人员备案
	 BTM101("BTM101","cn.gov.customs.msgexchange.msg.model.MessageTypeHandle.SSS101MessageHandle", "BTM", "BTR"),
	
	
	/*****************************************************************************************/
	/**************************************定时任务业务处理类**********************************/
	/*****************************************************************************************/
	TSK001("TSK001","cn.gov.customs.msgexchange.msg.model.scheduled.TSK001ScheduledHandle","BTM","TSK"),
	TSK002("TSK002","cn.gov.customs.msgexchange.msg.model.scheduled.TSK002ScheduledHandle","BTM","TSK"),
    TSK111("TSK111","cn.gov.customs.msgexchange.msg.model.scheduled.TSK111ScheduledHandle","BTM","TSK"),
    TSK114("TSK114","cn.gov.customs.msgexchange.msg.model.scheduled.TSK114ScheduledHandle","BTM","TSK");
	
	
	
    private String key;
    private String value;
    private String sendId; //发送方
    private String customsCode; //接收方

    MessageTypeEnum(String key, String value, String sendId, String customsCode) {
        this.key = key;
        this.value = value;
        this.sendId = sendId;
        this.customsCode = customsCode;
    }

    public static String getValue(String key) {
        for (MessageTypeEnum c : MessageTypeEnum.values()) {
            if (c.getKey().equals(key)) {
                return c.value;
            }
        }
        return null;
    }

    public static String getSendId(String key){
        if (StringUtils.isEmpty(key)) return null;
        for (MessageTypeEnum c : MessageTypeEnum.values()) {
            if (c.getKey().equals(key)) {
                return c.sendId;
            }
        }
        return null;
    }

    public static String getValueBykeyContain(String key){
        if (StringUtils.isEmpty(key)) return null;
        for (MessageTypeEnum c : MessageTypeEnum.values()) {
            if (key.contains(c.getKey())) {
                return c.value;
            }
        }
        return null;
    }

    public String getKey() {
        return key;
    }

    public void setKey(String key) {
        this.key = key;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    public String getSendId() {
        return sendId;
    }

    public void setSendId(String sendId) {
        this.sendId = sendId;
    }

    public String getCustomsCode() {
        return customsCode;
    }

    public void setCustomsCode(String customsCode) {
        this.customsCode = customsCode;
    }
}
