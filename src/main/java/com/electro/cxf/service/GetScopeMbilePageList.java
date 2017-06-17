
package com.electro.cxf.service;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>getScopeMbilePageList complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="getScopeMbilePageList">
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
@XmlType(name = "getScopeMbilePageList", propOrder = {
    "member"
})
public class GetScopeMbilePageList {

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
