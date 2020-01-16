package multipledatasources.msg;

import org.apache.commons.lang3.StringUtils;



/**
 * 报文工厂 根据报文类型 生成相应的报文
 */
public class MessageFactory {
    public static MessageHandle createMessageHandle(String messageTypecd) {
        if (StringUtils.isEmpty(messageTypecd)) {
            return null;
        }
        String classPath = MessageTypeEnum.getValueBykeyContain(messageTypecd);

        if (StringUtils.isEmpty(classPath)){
            return null;
        }

        String beanName = classPath.substring(classPath.lastIndexOf(".") + 1, classPath.length());
        return (MessageHandle)SpringUtil.getBean(beanName);
    }
    

}
