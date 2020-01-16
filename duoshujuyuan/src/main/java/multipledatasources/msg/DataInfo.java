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
 *         &lt;element ref="{http://www.w3.org/2000/09/xmldsig#}PocketInfo"/>
 *         &lt;element name="BussinessData">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="BtrnbShopsPutrecBsc" type="{http://www.w3.org/2000/09/xmldsig#}BtrnbShopsPutrecBsc" minOccurs="0"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
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
    "pocketInfo",
    "bussinessData",
        "fileName"
})
@XmlRootElement(name = "DataInfo")
public class DataInfo {

    @XmlElement(name = "PocketInfo", required = true)
    protected PocketInfo pocketInfo;
    @XmlElement(name = "BussinessData", required = true)
    protected BussinessData bussinessData;
    @XmlElement(name = "FileName", required = true)
    protected String fileName;

    /**
     * 获取pocketInfo属性的值。
     * 
     * @return
     *     possible object is
     *     {@link PocketInfo }
     *     
     */
    public PocketInfo getPocketInfo() {
        return pocketInfo;
    }

    /**
     * 设置pocketInfo属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link PocketInfo }
     *     
     */
    public void setPocketInfo(PocketInfo value) {
        this.pocketInfo = value;
    }

    public BussinessData getBussinessData() {
        return bussinessData;
    }

    public void setBussinessData(BussinessData bussinessData) {
        this.bussinessData = bussinessData;
    }

    public String getFileName() {
        return fileName;
    }

    public void setFileName(String fileName) {
        this.fileName = fileName;
    }
}
