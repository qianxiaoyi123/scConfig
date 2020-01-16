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
 *         &lt;element name="pocket_id">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;minLength value="0"/>
 *               &lt;maxLength value="128"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="total_pocket_qty" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="cur_pocket_no" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="is_unstructured" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;length value="1"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
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
    "totalPocketQty",
    "curPocketNo",
    "isUnstructured"
})
@XmlRootElement(name = "PocketInfo")
public class PocketInfo {

    @XmlElement(name = "total_pocket_qty")
    protected int totalPocketQty;
    @XmlElement(name = "cur_pocket_no")
    protected int curPocketNo;
    @XmlElement(name = "is_unstructured")
    protected String isUnstructured;

    /**
     * 获取totalPocketQty属性的值。
     * 
     */
    public int getTotalPocketQty() {
        return totalPocketQty;
    }

    /**
     * 设置totalPocketQty属性的值。
     * 
     */
    public void setTotalPocketQty(int value) {
        this.totalPocketQty = value;
    }

    /**
     * 获取curPocketNo属性的值。
     * 
     */
    public int getCurPocketNo() {
        return curPocketNo;
    }

    /**
     * 设置curPocketNo属性的值。
     * 
     */
    public void setCurPocketNo(int value) {
        this.curPocketNo = value;
    }

    /**
     * 获取isUnstructured属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIsUnstructured() {
        return isUnstructured;
    }

    /**
     * 设置isUnstructured属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIsUnstructured(String value) {
        this.isUnstructured = value;
    }

}
