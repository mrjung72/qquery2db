//
// 이 파일은 JAXB(JavaTM Architecture for XML Binding) 참조 구현 2.3.0 버전을 통해 생성되었습니다. 
// <a href="https://javaee.github.io/jaxb-v2/">https://javaee.github.io/jaxb-v2/</a>를 참조하십시오. 
// 이 파일을 수정하면 소스 스키마를 재컴파일할 때 수정 사항이 손실됩니다. 
// 생성 날짜: 2018.10.01 시간 03:30:48 PM KST 
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
 * <p>QueryDefine complex type에 대한 Java 클래스입니다.
 * 
 * <p>다음 스키마 단편이 이 클래스에 포함되는 필요한 콘텐츠를 지정합니다.
 * 
 * <pre>
 * &lt;complexType name="QueryDefine"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="query" maxOccurs="unbounded"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="title" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *                   &lt;element name="inputTableName" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *                   &lt;element name="indexRebuildYn" type="{}YnType" minOccurs="0"/&gt;
 *                   &lt;element name="initSql" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                   &lt;element name="selectSql" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *                   &lt;element name="subVarsId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                 &lt;/sequence&gt;
 *                 &lt;attribute name="useYn" type="{}YnType" /&gt;
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
@XmlType(name = "QueryDefine", propOrder = {
    "query"
})
public class QueryDefine {

    @XmlElement(required = true)
    protected List<QueryDefine.Query> query;

    /**
     * Gets the value of the query property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the query property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getQuery().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link QueryDefine.Query }
     * 
     * 
     */
    public List<QueryDefine.Query> getQuery() {
        if (query == null) {
            query = new ArrayList<QueryDefine.Query>();
        }
        return this.query;
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
     *         &lt;element name="title" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
     *         &lt;element name="inputTableName" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
     *         &lt;element name="indexRebuildYn" type="{}YnType" minOccurs="0"/&gt;
     *         &lt;element name="initSql" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *         &lt;element name="selectSql" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
     *         &lt;element name="subVarsId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *       &lt;/sequence&gt;
     *       &lt;attribute name="useYn" type="{}YnType" /&gt;
     *     &lt;/restriction&gt;
     *   &lt;/complexContent&gt;
     * &lt;/complexType&gt;
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "title",
        "inputTableName",
        "indexRebuildYn",
        "initSql",
        "selectSql",
        "subVarsId"
    })
    public static class Query {

        @XmlElement(required = true)
        protected String title;
        @XmlElement(required = true)
        protected String inputTableName;
        protected String indexRebuildYn;
        protected String initSql;
        @XmlElement(required = true)
        protected String selectSql;
        protected String subVarsId;
        @XmlAttribute(name = "useYn")
        protected String useYn;

        /**
         * title 속성의 값을 가져옵니다.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getTitle() {
            return title;
        }

        /**
         * title 속성의 값을 설정합니다.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setTitle(String value) {
            this.title = value;
        }

        /**
         * inputTableName 속성의 값을 가져옵니다.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getInputTableName() {
            return inputTableName;
        }

        /**
         * inputTableName 속성의 값을 설정합니다.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setInputTableName(String value) {
            this.inputTableName = value;
        }

        /**
         * indexRebuildYn 속성의 값을 가져옵니다.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getIndexRebuildYn() {
            return indexRebuildYn;
        }

        /**
         * indexRebuildYn 속성의 값을 설정합니다.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setIndexRebuildYn(String value) {
            this.indexRebuildYn = value;
        }

        /**
         * initSql 속성의 값을 가져옵니다.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getInitSql() {
            return initSql;
        }

        /**
         * initSql 속성의 값을 설정합니다.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setInitSql(String value) {
            this.initSql = value;
        }

        /**
         * selectSql 속성의 값을 가져옵니다.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getSelectSql() {
            return selectSql;
        }

        /**
         * selectSql 속성의 값을 설정합니다.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setSelectSql(String value) {
            this.selectSql = value;
        }

        /**
         * subVarsId 속성의 값을 가져옵니다.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getSubVarsId() {
            return subVarsId;
        }

        /**
         * subVarsId 속성의 값을 설정합니다.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setSubVarsId(String value) {
            this.subVarsId = value;
        }

        /**
         * useYn 속성의 값을 가져옵니다.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getUseYn() {
            return useYn;
        }

        /**
         * useYn 속성의 값을 설정합니다.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setUseYn(String value) {
            this.useYn = value;
        }

    }

}
