//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vhudson-jaxb-ri-2.2-147 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2011.07.29 at 03:02:40 PM EDT 
//


package flinn.rcopia.model;

import java.math.BigDecimal;
import java.math.BigInteger;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * <p>Java class for SigDataType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SigDataType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Drug" type="{http://www.drfirst.com/}DrugType"/>
 *         &lt;element name="Action" type="{http://www.drfirst.com/}AN30"/>
 *         &lt;element name="Dose" type="{http://www.drfirst.com/}AN30"/>
 *         &lt;element name="DoseUnit" type="{http://www.drfirst.com/}AN30" minOccurs="0"/>
 *         &lt;element name="Route" type="{http://www.drfirst.com/}AN30" minOccurs="0"/>
 *         &lt;element name="DoseTiming" type="{http://www.drfirst.com/}AN100" minOccurs="0"/>
 *         &lt;element name="DoseOther" type="{http://www.drfirst.com/}AN100" minOccurs="0"/>
 *         &lt;element name="Duration" type="{http://www.w3.org/2001/XMLSchema}positiveInteger" minOccurs="0"/>
 *         &lt;element name="Quantity">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}decimal">
 *               &lt;minExclusive value="0"/>
 *               &lt;pattern value="\d{1,14}(\.)?\d{0,3}"/>
 *               &lt;maxInclusive value="99999999999.999"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="QuantityUnit" type="{http://www.drfirst.com/}AN30"/>
 *         &lt;element name="Refills" type="{http://www.drfirst.com/}RefillType" minOccurs="0"/>
 *         &lt;element name="SubstitutionPermitted" type="{http://www.drfirst.com/}YNType"/>
 *         &lt;element name="PatientNotes" type="{http://www.drfirst.com/}AN2000" minOccurs="0"/>
 *         &lt;element name="OtherNotes" type="{http://www.drfirst.com/}AN2000" minOccurs="0"/>
 *         &lt;element name="Comments" type="{http://www.drfirst.com/}AN4000" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SigDataType", propOrder = {
    "drug",
    "action",
    "dose",
    "doseUnit",
    "route",
    "doseTiming",
    "doseOther",
    "duration",
    "quantity",
    "quantityUnit",
    "refills",
    "substitutionPermitted",
    "patientNotes",
    "otherNotes",
    "comments"
})
public class SigDataType {

    @XmlElement(name = "Drug", required = true)
    protected DrugType drug;
    @XmlElement(name = "Action", required = true)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String action;
    @XmlElement(name = "Dose", required = true)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String dose;
    @XmlElement(name = "DoseUnit")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String doseUnit;
    @XmlElement(name = "Route")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String route;
    @XmlElement(name = "DoseTiming")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String doseTiming;
    @XmlElement(name = "DoseOther")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String doseOther;
    @XmlElement(name = "Duration")
    @XmlSchemaType(name = "positiveInteger")
    protected BigInteger duration;
    @XmlElement(name = "Quantity", required = true)
    protected BigDecimal quantity;
    @XmlElement(name = "QuantityUnit", required = true)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String quantityUnit;
    @XmlElement(name = "Refills")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String refills;
    @XmlElement(name = "SubstitutionPermitted", required = true)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String substitutionPermitted;
    @XmlElement(name = "PatientNotes")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String patientNotes;
    @XmlElement(name = "OtherNotes")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String otherNotes;
    @XmlElement(name = "Comments")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String comments;

    /**
     * Gets the value of the drug property.
     * 
     * @return
     *     possible object is
     *     {@link DrugType }
     *     
     */
    public DrugType getDrug() {
        return drug;
    }

    /**
     * Sets the value of the drug property.
     * 
     * @param value
     *     allowed object is
     *     {@link DrugType }
     *     
     */
    public void setDrug(DrugType value) {
        this.drug = value;
    }

    /**
     * Gets the value of the action property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAction() {
        return action;
    }

    /**
     * Sets the value of the action property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAction(String value) {
        this.action = value;
    }

    /**
     * Gets the value of the dose property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDose() {
        return dose;
    }

    /**
     * Sets the value of the dose property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDose(String value) {
        this.dose = value;
    }

    /**
     * Gets the value of the doseUnit property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDoseUnit() {
        return doseUnit;
    }

    /**
     * Sets the value of the doseUnit property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDoseUnit(String value) {
        this.doseUnit = value;
    }

    /**
     * Gets the value of the route property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRoute() {
        return route;
    }

    /**
     * Sets the value of the route property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRoute(String value) {
        this.route = value;
    }

    /**
     * Gets the value of the doseTiming property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDoseTiming() {
        return doseTiming;
    }

    /**
     * Sets the value of the doseTiming property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDoseTiming(String value) {
        this.doseTiming = value;
    }

    /**
     * Gets the value of the doseOther property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDoseOther() {
        return doseOther;
    }

    /**
     * Sets the value of the doseOther property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDoseOther(String value) {
        this.doseOther = value;
    }

    /**
     * Gets the value of the duration property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getDuration() {
        return duration;
    }

    /**
     * Sets the value of the duration property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setDuration(BigInteger value) {
        this.duration = value;
    }

    /**
     * Gets the value of the quantity property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getQuantity() {
        return quantity;
    }

    /**
     * Sets the value of the quantity property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setQuantity(BigDecimal value) {
        this.quantity = value;
    }

    /**
     * Gets the value of the quantityUnit property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getQuantityUnit() {
        return quantityUnit;
    }

    /**
     * Sets the value of the quantityUnit property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setQuantityUnit(String value) {
        this.quantityUnit = value;
    }

    /**
     * Gets the value of the refills property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRefills() {
        return refills;
    }

    /**
     * Sets the value of the refills property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRefills(String value) {
        this.refills = value;
    }

    /**
     * Gets the value of the substitutionPermitted property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSubstitutionPermitted() {
        return substitutionPermitted;
    }

    /**
     * Sets the value of the substitutionPermitted property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSubstitutionPermitted(String value) {
        this.substitutionPermitted = value;
    }

    /**
     * Gets the value of the patientNotes property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPatientNotes() {
        return patientNotes;
    }

    /**
     * Sets the value of the patientNotes property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPatientNotes(String value) {
        this.patientNotes = value;
    }

    /**
     * Gets the value of the otherNotes property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOtherNotes() {
        return otherNotes;
    }

    /**
     * Sets the value of the otherNotes property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOtherNotes(String value) {
        this.otherNotes = value;
    }

    /**
     * Gets the value of the comments property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getComments() {
        return comments;
    }

    /**
     * Sets the value of the comments property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setComments(String value) {
        this.comments = value;
    }

}