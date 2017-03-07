//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vhudson-jaxb-ri-2.2-147
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a>
// Any modifications to this file will be lost upon recompilation of the source schema.
// Generated on: 2011.07.29 at 03:02:40 PM EDT
//


package flinn.rcopia.model;

import javax.xml.bind.annotation.*;


/**
 * <p>Java class for RcExtResponseType complex type.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.
 *
 * <pre>
 * &lt;complexType name="RcExtResponseType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="TraceInformation" type="{http://www.drfirst.com/}TraceInformationType"/>
 *         &lt;element name="Request" type="{http://www.drfirst.com/}RcExtRequestType"/>
 *         &lt;element name="Response" type="{http://www.drfirst.com/}ResponseType"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 *
 *
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RcExtResponseType", propOrder = {
    "traceInformation",
    "request",
    "response"
})
@XmlRootElement(name = "RcExtResponse")
public class RcExtResponseType {

    @XmlElement(name = "TraceInformation", required = true)
    protected TraceInformationType traceInformation;
    @XmlElement(name = "Request", required = true)
    protected RcExtRequestType request;
    @XmlElement(name = "Response", required = true)
    protected ResponseType response;

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
     * Gets the value of the request property.
     *
     * @return
     *     possible object is
     *     {@link RcExtRequestType }
     *
     */
    public RcExtRequestType getRequest() {
        return request;
    }

    /**
     * Sets the value of the request property.
     *
     * @param value
     *     allowed object is
     *     {@link RcExtRequestType }
     *
     */
    public void setRequest(RcExtRequestType value) {
        this.request = value;
    }

    /**
     * Gets the value of the response property.
     *
     * @return
     *     possible object is
     *     {@link ResponseType }
     *
     */
    public ResponseType getResponse() {
        return response;
    }

    /**
     * Sets the value of the response property.
     *
     * @param value
     *     allowed object is
     *     {@link ResponseType }
     *
     */
    public void setResponse(ResponseType value) {
        this.response = value;
    }

}
