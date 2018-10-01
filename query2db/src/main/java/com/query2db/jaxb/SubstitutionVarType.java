//
// 이 파일은 JAXB(JavaTM Architecture for XML Binding) 참조 구현 2.3.0 버전을 통해 생성되었습니다. 
// <a href="https://javaee.github.io/jaxb-v2/">https://javaee.github.io/jaxb-v2/</a>를 참조하십시오. 
// 이 파일을 수정하면 소스 스키마를 재컴파일할 때 수정 사항이 손실됩니다. 
// 생성 날짜: 2018.10.01 시간 08:47:29 PM KST 
//


package com.query2db.jaxb;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>SubstitutionVarType complex type에 대한 Java 클래스입니다.
 * 
 * <p>다음 스키마 단편이 이 클래스에 포함되는 필요한 콘텐츠를 지정합니다.
 * 
 * <pre>
 * &lt;complexType name="SubstitutionVarType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="subs-var" maxOccurs="unbounded"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="columnDelimeter" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *                   &lt;element name="content" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *                   &lt;element name="selectDBName" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *                 &lt;/sequence&gt;
 *                 &lt;attribute name="id" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *                 &lt;attribute name="createMethod" type="{}SubVarsCreateType" /&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SubstitutionVarType", propOrder = {
    "subsVar"
})
public class SubstitutionVarType {

    @XmlElement(name = "subs-var", required = true)
    protected List<SubstitutionVarType.SubsVar> subsVar;

    /**
     * Gets the value of the subsVar property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the subsVar property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSubsVar().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SubstitutionVarType.SubsVar }
     * 
     * 
     */
    public List<SubstitutionVarType.SubsVar> getSubsVar() {
        if (subsVar == null) {
            subsVar = new ArrayList<SubstitutionVarType.SubsVar>();
        }
        return this.subsVar;
    }


    /**
     * <p>anonymous complex type에 대한 Java 클래스입니다.
     * 
     * <p>다음 스키마 단편이 이 클래스에 포함되는 필요한 콘텐츠를 지정합니다.
     * 
     * <pre>
     * &lt;complexType&gt;
     *   &lt;complexContent&gt;
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *       &lt;sequence&gt;
     *         &lt;element name="columnDelimeter" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
     *         &lt;element name="content" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
     *         &lt;element name="selectDBName" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
     *       &lt;/sequence&gt;
     *       &lt;attribute name="id" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
     *       &lt;attribute name="createMethod" type="{}SubVarsCreateType" /&gt;
     *     &lt;/restriction&gt;
     *   &lt;/complexContent&gt;
     * &lt;/complexType&gt;
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "columnDelimeter",
        "content",
        "selectDBName"
    })
    public static class SubsVar {

        @XmlElement(required = true)
        protected String columnDelimeter;
        @XmlElement(required = true)
        protected String content;
        @XmlElement(required = true)
        protected String selectDBName;
        @XmlAttribute(name = "id")
        protected String id;
        @XmlAttribute(name = "createMethod")
        protected String createMethod;

        /**
         * columnDelimeter 속성의 값을 가져옵니다.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getColumnDelimeter() {
            return columnDelimeter;
        }

        /**
         * columnDelimeter 속성의 값을 설정합니다.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setColumnDelimeter(String value) {
            this.columnDelimeter = value;
        }

        /**
         * content 속성의 값을 가져옵니다.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getContent() {
            return content;
        }

        /**
         * content 속성의 값을 설정합니다.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setContent(String value) {
            this.content = value;
        }

        /**
         * selectDBName 속성의 값을 가져옵니다.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getSelectDBName() {
            return selectDBName;
        }

        /**
         * selectDBName 속성의 값을 설정합니다.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setSelectDBName(String value) {
            this.selectDBName = value;
        }

        /**
         * id 속성의 값을 가져옵니다.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getId() {
            return id;
        }

        /**
         * id 속성의 값을 설정합니다.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setId(String value) {
            this.id = value;
        }

        /**
         * createMethod 속성의 값을 가져옵니다.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getCreateMethod() {
            return createMethod;
        }

        /**
         * createMethod 속성의 값을 설정합니다.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setCreateMethod(String value) {
            this.createMethod = value;
        }

    }

}
