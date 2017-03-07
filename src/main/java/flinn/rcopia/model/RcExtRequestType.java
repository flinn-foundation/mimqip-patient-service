//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vhudson-jaxb-ri-2.2-147
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a>
// Any modifications to this file will be lost upon recompilation of the source schema.
// Generated on: 2011.07.29 at 03:02:40 PM EDT
//


package flinn.rcopia.model;

import javax.xml.bind.annotation.*;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * <p>Java class for RcExtRequestType complex type.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.
 *
 * <pre>
 * &lt;complexType name="RcExtRequestType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="TraceInformation" type="{http://www.drfirst.com/}TraceInformationType"/>
 *         &lt;element name="Caller" type="{http://www.drfirst.com/}CallerType"/>
 *         &lt;element name="SystemName" type="{http://www.drfirst.com/}AN30"/>
 *         &lt;element name="RcopiaPracticeUsername" type="{http://www.drfirst.com/}AN30"/>
 *         &lt;element name="Request" type="{http://www.drfirst.com/}RequestType"/>
 *       &lt;/sequence>
 *       &lt;attribute name="version" type="{http://www.drfirst.com/}AN10" fixed="1.9" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 *
 *
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RcExtRequestType", propOrder = {
    "traceInformation",
    "caller",
    "systemName",
    "rcopiaPracticeUsername",
    "request"
})
@XmlRootElement(name = "RcExtRequest")
public class RcExtRequestType {

    @XmlElement(name = "TraceInformation", required = true)
    protected TraceInformationType traceInformation;
    @XmlElement(name = "Caller", required = true)
    protected CallerType caller;
    @XmlElement(name = "SystemName", required = true)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String systemName;
    @XmlElement(name = "RcopiaPracticeUsername", required = true)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String rcopiaPracticeUsername;
    @XmlElement(name = "Request", required = true)
    protected RequestType request;
    @XmlAttribute(name = "version")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String version;

    /**
     * Gets the value of the traceInformation property.
     *
     * @return
     *     possible object is
     *     {@link TraceInformationType }
     *
     */
    public TraceInformationType getTraceInformation() {
        return traceInformation;
    }

    /**
     * Sets the value of the traceInformation property.
     *
     * @param value
     *     allowed object is
     *     {@link TraceInformationType }
     *
     */
    public void setTraceInformation(TraceInformationType value) {
        this.traceInformation = value;
    }

    /**
     * Gets the value of the caller property.
     *
     * @return
     *     possible object is
     *     {@link CallerType }
     *
     */
    public CallerType getCaller() {
        return caller;
    }

    /**
     * Sets the value of the caller property.
     *
     * @param value
     *     allowed object is
     *     {@link CallerType }
     *
     */
    public void setCaller(CallerType value) {
        this.caller = value;
    }

    /**
     * Gets the value of the systemName property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getSystemName() {
        return systemName;
    }

    /**
     * Sets the value of the systemName property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setSystemName(String value) {
        this.systemName = value;
    }

    /**
     * Gets the value of the rcopiaPracticeUsername property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getRcopiaPracticeUsername() {
        return rcopiaPracticeUsername;
    }

    /**
     * Sets the value of the rcopiaPracticeUsername property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setRcopiaPracticeUsername(String value) {
        this.rcopiaPracticeUsername = value;
    }

    /**
     * Gets the value of the request property.
     *
     * @return
     *     possible object is
     *     {@link RequestType }
     *
     */
    public RequestType getRequest() {
        return request;
    }

    /**
     * Sets the value of the request property.
     *
     * @param value
     *     allowed object is
     *     {@link RequestType }
     *
     */
    public void setRequest(RequestType value) {
        this.request = value;
    }

    /**
     * Gets the value of the version property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getVersion() {
        if (version == null) {
            return "1.9";
        } else {
            return version;
        }
    }

    /**
     * Sets the value of the version property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setVersion(String value) {
        this.version = value;
    }

}
