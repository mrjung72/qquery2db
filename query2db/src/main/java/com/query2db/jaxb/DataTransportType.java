//
// 이 파일은 JAXB(JavaTM Architecture for XML Binding) 참조 구현 2.3.0 버전을 통해 생성되었습니다. 
// <a href="https://javaee.github.io/jaxb-v2/">https://javaee.github.io/jaxb-v2/</a>를 참조하십시오. 
// 이 파일을 수정하면 소스 스키마를 재컴파일할 때 수정 사항이 손실됩니다. 
// 생성 날짜: 2018.10.01 시간 03:30:48 PM KST 
//


package com.query2db.jaxb;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>DataTransportType complex type에 대한 Java 클래스입니다.
 * 
 * <p>다음 스키마 단편이 이 클래스에 포함되는 필요한 콘텐츠를 지정합니다.
 * 
 * <pre>
 * &lt;complexType name="DataTransportType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="env-vars" type="{}EnvironmentVarsInfo"/&gt;
 *         &lt;element name="pre-proc" type="{}PrePostProcess"/&gt;
 *         &lt;element name="main-proc" type="{}QueryDefine"/&gt;
 *         &lt;element name="post-proc" type="{}PrePostProcess"/&gt;
 *         &lt;element name="subs-vars" type="{}SubstitutionVarType"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DataTransportType", propOrder = {
    "envVars",
    "preProc",
    "mainProc",
    "postProc",
    "subsVars"
})
public class DataTransportType {

    @XmlElement(name = "env-vars", required = true)
    protected EnvironmentVarsInfo envVars;
    @XmlElement(name = "pre-proc", required = true)
    protected PrePostProcess preProc;
    @XmlElement(name = "main-proc", required = true)
    protected QueryDefine mainProc;
    @XmlElement(name = "post-proc", required = true)
    protected PrePostProcess postProc;
    @XmlElement(name = "subs-vars", required = true)
    protected SubstitutionVarType subsVars;

    /**
     * envVars 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link EnvironmentVarsInfo }
     *     
     */
    public EnvironmentVarsInfo getEnvVars() {
        return envVars;
    }

    /**
     * envVars 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link EnvironmentVarsInfo }
     *     
     */
    public void setEnvVars(EnvironmentVarsInfo value) {
        this.envVars = value;
    }

    /**
     * preProc 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link PrePostProcess }
     *     
     */
    public PrePostProcess getPreProc() {
        return preProc;
    }

    /**
     * preProc 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link PrePostProcess }
     *     
     */
    public void setPreProc(PrePostProcess value) {
        this.preProc = value;
    }

    /**
     * mainProc 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link QueryDefine }
     *     
     */
    public QueryDefine getMainProc() {
        return mainProc;
    }

    /**
     * mainProc 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link QueryDefine }
     *     
     */
    public void setMainProc(QueryDefine value) {
        this.mainProc = value;
    }

    /**
     * postProc 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link PrePostProcess }
     *     
     */
    public PrePostProcess getPostProc() {
        return postProc;
    }

    /**
     * postProc 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link PrePostProcess }
     *     
     */
    public void setPostProc(PrePostProcess value) {
        this.postProc = value;
    }

    /**
     * subsVars 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link SubstitutionVarType }
     *     
     */
    public SubstitutionVarType getSubsVars() {
        return subsVars;
    }

    /**
     * subsVars 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link SubstitutionVarType }
     *     
     */
    public void setSubsVars(SubstitutionVarType value) {
        this.subsVars = value;
    }

}
