//
// 이 파일은 JAXB(JavaTM Architecture for XML Binding) 참조 구현 2.3.0 버전을 통해 생성되었습니다. 
// <a href="https://javaee.github.io/jaxb-v2/">https://javaee.github.io/jaxb-v2/</a>를 참조하십시오. 
// 이 파일을 수정하면 소스 스키마를 재컴파일할 때 수정 사항이 손실됩니다. 
// 생성 날짜: 2018.10.01 시간 03:30:48 PM KST 
//


package com.query2db.jaxb;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.query2db.jaxb package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _Query2Db_QNAME = new QName("", "query2db");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.query2db.jaxb
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link SubstitutionVarType }
     * 
     */
    public SubstitutionVarType createSubstitutionVarType() {
        return new SubstitutionVarType();
    }

    /**
     * Create an instance of {@link QueryDefine }
     * 
     */
    public QueryDefine createQueryDefine() {
        return new QueryDefine();
    }

    /**
     * Create an instance of {@link PrePostProcess }
     * 
     */
    public PrePostProcess createPrePostProcess() {
        return new PrePostProcess();
    }

    /**
     * Create an instance of {@link DataTransportType }
     * 
     */
    public DataTransportType createDataTransportType() {
        return new DataTransportType();
    }

    /**
     * Create an instance of {@link EnvironmentVarsInfo }
     * 
     */
    public EnvironmentVarsInfo createEnvironmentVarsInfo() {
        return new EnvironmentVarsInfo();
    }

    /**
     * Create an instance of {@link SubstitutionVarType.SubsVar }
     * 
     */
    public SubstitutionVarType.SubsVar createSubstitutionVarTypeSubsVar() {
        return new SubstitutionVarType.SubsVar();
    }

    /**
     * Create an instance of {@link QueryDefine.Query }
     * 
     */
    public QueryDefine.Query createQueryDefineQuery() {
        return new QueryDefine.Query();
    }

    /**
     * Create an instance of {@link PrePostProcess.Query }
     * 
     */
    public PrePostProcess.Query createPrePostProcessQuery() {
        return new PrePostProcess.Query();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DataTransportType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link DataTransportType }{@code >}
     */
    @XmlElementDecl(namespace = "", name = "query2db")
    public JAXBElement<DataTransportType> createQuery2Db(DataTransportType value) {
        return new JAXBElement<DataTransportType>(_Query2Db_QNAME, DataTransportType.class, null, value);
    }

}
