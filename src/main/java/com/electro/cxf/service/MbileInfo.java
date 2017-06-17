
package com.electro.cxf.service;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>mbileInfo complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="mbileInfo">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="electrombileAlarmStatus" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="electrombileCoordinate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="electrombileElectric" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="electrombileElectrical" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="electrombileNo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="electrombileRepairStatus" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="electrombileStatus" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="electrombileType" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "mbileInfo", propOrder = {
    "electrombileAlarmStatus",
    "electrombileCoordinate",
    "electrombileElectric",
    "electrombileElectrical",
    "electrombileNo",
    "electrombileRepairStatus",
    "electrombileStatus",
    "electrombileType"
})
public class MbileInfo {

    protected String electrombileAlarmStatus;
    protected String electrombileCoordinate;
    protected String electrombileElectric;
    protected String electrombileElectrical;
    protected String electrombileNo;
    protected Integer electrombileRepairStatus;
    protected Integer electrombileStatus;
    protected Integer electrombileType;

    /**
     * 获取electrombileAlarmStatus属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getElectrombileAlarmStatus() {
        return electrombileAlarmStatus;
    }

    /**
     * 设置electrombileAlarmStatus属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setElectrombileAlarmStatus(String value) {
        this.electrombileAlarmStatus = value;
    }

    /**
     * 获取electrombileCoordinate属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getElectrombileCoordinate() {
        return electrombileCoordinate;
    }

    /**
     * 设置electrombileCoordinate属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setElectrombileCoordinate(String value) {
        this.electrombileCoordinate = value;
    }

    /**
     * 获取electrombileElectric属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getElectrombileElectric() {
        return electrombileElectric;
    }

    /**
     * 设置electrombileElectric属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setElectrombileElectric(String value) {
        this.electrombileElectric = value;
    }

    /**
     * 获取electrombileElectrical属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getElectrombileElectrical() {
        return electrombileElectrical;
    }

    /**
     * 设置electrombileElectrical属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setElectrombileElectrical(String value) {
        this.electrombileElectrical = value;
    }

    /**
     * 获取electrombileNo属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getElectrombileNo() {
        return electrombileNo;
    }

    /**
     * 设置electrombileNo属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setElectrombileNo(String value) {
        this.electrombileNo = value;
    }

    /**
     * 获取electrombileRepairStatus属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getElectrombileRepairStatus() {
        return electrombileRepairStatus;
    }

    /**
     * 设置electrombileRepairStatus属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setElectrombileRepairStatus(Integer value) {
        this.electrombileRepairStatus = value;
    }

    /**
     * 获取electrombileStatus属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getElectrombileStatus() {
        return electrombileStatus;
    }

    /**
     * 设置electrombileStatus属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setElectrombileStatus(Integer value) {
        this.electrombileStatus = value;
    }

    /**
     * 获取electrombileType属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getElectrombileType() {
        return electrombileType;
    }

    /**
     * 设置electrombileType属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setElectrombileType(Integer value) {
        this.electrombileType = value;
    }

}
