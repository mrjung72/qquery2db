//
// 이 파일은 JAXB(JavaTM Architecture for XML Binding) 참조 구현 2.3.0 버전을 통해 생성되었습니다. 
// <a href="https://javaee.github.io/jaxb-v2/">https://javaee.github.io/jaxb-v2/</a>를 참조하십시오. 
// 이 파일을 수정하면 소스 스키마를 재컴파일할 때 수정 사항이 손실됩니다. 
// 생성 날짜: 2018.10.01 시간 03:30:48 PM KST 
//


package com.query2db.jaxb;

import java.math.BigDecimal;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>EnvironmentVarsInfo complex type에 대한 Java 클래스입니다.
 * 
 * <p>다음 스키마 단편이 이 클래스에 포함되는 필요한 콘텐츠를 지정합니다.
 * 
 * <pre>
 * &lt;complexType name="EnvironmentVarsInfo"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="maxLimitSelectRows" type="{http://www.w3.org/2001/XMLSchema}decimal"/&gt;
 *         &lt;element name="rowsForCommit" type="{http://www.w3.org/2001/XMLSchema}decimal"/&gt;
 *         &lt;element name="loggingLevel" type="{}LoggingLevelType"/&gt;
 *         &lt;element name="selectDBId" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="insertDBId" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "EnvironmentVarsInfo", propOrder = {
    "maxLimitSelectRows",
    "rowsForCommit",
    "loggingLevel",
    "selectDBId",
    "insertDBId"
})
public class EnvironmentVarsInfo {

    @XmlElement(required = true)
    protected BigDecimal maxLimitSelectRows;
    @XmlElement(required = true)
    protected BigDecimal rowsForCommit;
    @XmlElement(required = true)
    protected String loggingLevel;
    @XmlElement(required = true)
    protected String selectDBId;
    @XmlElement(required = true)
    protected String insertDBId;

    /**
     * maxLimitSelectRows 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getMaxLimitSelectRows() {
        return maxLimitSelectRows;
    }

    /**
     * maxLimitSelectRows 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setMaxLimitSelectRows(BigDecimal value) {
        this.maxLimitSelectRows = value;
    }

    /**
     * rowsForCommit 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getRowsForCommit() {
        return rowsForCommit;
    }

    /**
     * rowsForCommit 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setRowsForCommit(BigDecimal value) {
        this.rowsForCommit = value;
    }

    /**
     * loggingLevel 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLoggingLevel() {
        return loggingLevel;
    }

    /**
     * loggingLevel 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLoggingLevel(String value) {
        this.loggingLevel = value;
    }

    /**
     * selectDBId 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSelectDBId() {
        return selectDBId;
    }

    /**
     * selectDBId 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSelectDBId(String value) {
        this.selectDBId = value;
    }

    /**
     * insertDBId 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInsertDBId() {
        return insertDBId;
    }

    /**
     * insertDBId 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInsertDBId(String value) {
        this.insertDBId = value;
    }

}
