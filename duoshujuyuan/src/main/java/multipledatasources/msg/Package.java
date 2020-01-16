//
// 此文件是由 JavaTM Architecture for XML Binding (JAXB) 引用实现 v2.2.8-b130911.1802 生成的
// 请访问 <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// 在重新编译源模式时, 对此文件的所有修改都将丢失。
// 生成时间: 2018.06.27 时间 07:40:02 PM CST 
//


package multipledatasources.msg;

import javax.xml.bind.annotation.*;


/**
 * <p>anonymous complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element ref="{http://www.w3.org/2000/09/xmldsig#}EnvelopInfo"/>
 *         &lt;element ref="{http://www.w3.org/2000/09/xmldsig#}DataInfo"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "envelopInfo",
    "dataInfo"
})
@XmlRootElement(name = "Package")
public class Package {

    @XmlElement(name = "EnvelopInfo", required = true)
    protected EnvelopInfo envelopInfo;
    @XmlElement(name = "DataInfo", required = true)
    protected DataInfo dataInfo;

    /**
     * 获取envelopInfo属性的值。
     * 
     * @return
     *     possible object is
     *     {@link EnvelopInfo }
     *     
     */
    public EnvelopInfo getEnvelopInfo() {
        return envelopInfo;
    }

    /**
     * 设置envelopInfo属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link EnvelopInfo }
     *     
     */
    public void setEnvelopInfo(EnvelopInfo value) {
        this.envelopInfo = value;
    }

    /**
     * 获取dataInfo属性的值。
     * 
     * @return
     *     possible object is
     *     {@link DataInfo }
     *     
     */
    public DataInfo getDataInfo() {
        return dataInfo;
    }

    /**
     * 设置dataInfo属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link DataInfo }
     *     
     */
    public void setDataInfo(DataInfo value) {
        this.dataInfo = value;
    }

}
