
package com.electro.cxf.service;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>colseLockMobileResponse complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="colseLockMobileResponse">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="return" type="{http://service.cxf.electrombile.com/}baseOutDomain" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "colseLockMobileResponse", propOrder = {
    "_return"
})
public class ColseLockMobileResponse {

    @XmlElement(name = "return")
    protected BaseOutDomain _return;

    /**
     * 获取return属性的值。
     * 
     * @return
     *     possible object is
     *     {@link BaseOutDomain }
     *     
     */
    public BaseOutDomain getReturn() {
        return _return;
    }

    /**
     * 设置return属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link BaseOutDomain }
     *     
     */
    public void setReturn(BaseOutDomain value) {
        this._return = value;
    }

}
