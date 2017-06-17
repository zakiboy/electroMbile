
package com.electro.cxf.service;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>unlockingMobile complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="unlockingMobile">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="member" type="{http://service.cxf.electrombile.com/}weChatMember" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "unlockingMobile", propOrder = {
    "member"
})
public class UnlockingMobile {

    protected WeChatMember member;

    /**
     * 获取member属性的值。
     * 
     * @return
     *     possible object is
     *     {@link WeChatMember }
     *     
     */
    public WeChatMember getMember() {
        return member;
    }

    /**
     * 设置member属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link WeChatMember }
     *     
     */
    public void setMember(WeChatMember value) {
        this.member = value;
    }

}
