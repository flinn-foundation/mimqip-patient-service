//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vhudson-jaxb-ri-2.2-147 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2011.07.29 at 03:02:40 PM EDT 
//


package flinn.rcopia.model;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * 
 * 				MedicationList is used in many top-level places and thus this type is a choice of types that
 * 				conform with each of them. It will be confusing
 *             
 * 
 * <p>Java class for MedicationType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="MedicationType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;choice>
 *         &lt;sequence>
 *           &lt;element name="Deleted" type="{http://www.drfirst.com/}YNType"/>
 *           &lt;element name="RcopiaID" type="{http://www.drfirst.com/}RcopiaIDType"/>
 *           &lt;element name="ExternalID" type="{http://www.drfirst.com/}ExternalIDType" minOccurs="0"/>
 *           &lt;element name="Patient" type="{http://www.drfirst.com/}SimplePatientType" minOccurs="0"/>
 *           &lt;element name="Provider" type="{http://www.drfirst.com/}ProviderType" minOccurs="0"/>
 *           &lt;element name="Preparer" type="{http://www.drfirst.com/}ProviderType" minOccurs="0"/>
 *           &lt;element name="Pharmacy" type="{http://www.drfirst.com/}PharmacyType"/>
 *           &lt;element name="HasScheduledDrug" type="{http://www.drfirst.com/}YNType"/>
 *           &lt;element name="DrugCodingLevel" type="{http://www.drfirst.com/}DrugCodingLevelType" minOccurs="0"/>
 *           &lt;element name="HistorySource" type="{http://www.drfirst.com/}AN50" minOccurs="0"/>
 *           &lt;element name="Sig" type="{http://www.drfirst.com/}SigDataType"/>
 *           &lt;element name="StartDate" type="{http://www.drfirst.com/}RcopiaDateType"/>
 *           &lt;element name="StopDate" type="{http://www.drfirst.com/}RcopiaDateType" minOccurs="0"/>
 *           &lt;element name="FillDate" type="{http://www.drfirst.com/}RcopiaDateType" minOccurs="0"/>
 *           &lt;element name="StopReason" type="{http://www.drfirst.com/}AN200" minOccurs="0"/>
 *           &lt;element name="SigChangedDate" type="{http://www.drfirst.com/}RcopiaDateType"/>
 *           &lt;element name="LastModifiedBy" type="{http://www.drfirst.com/}ProviderType"/>
 *           &lt;element name="LastModifiedDate" type="{http://www.drfirst.com/}RcopiaDateType"/>
 *           &lt;element name="Prescription" minOccurs="0">
 *             &lt;complexType>
 *               &lt;complexContent>
 *                 &lt;extension base="{http://www.drfirst.com/}ComplexRcopiaIDType">
 *                   &lt;sequence>
 *                     &lt;element name="ReplacesMedication" type="{http://www.drfirst.com/}DrugIDType" minOccurs="0"/>
 *                   &lt;/sequence>
 *                 &lt;/extension>
 *               &lt;/complexContent>
 *             &lt;/complexType>
 *           &lt;/element>
 *           &lt;element name="ProblemList" type="{http://www.drfirst.com/}ProblemListType" minOccurs="0"/>
 *           &lt;element name="Height" type="{http://www.drfirst.com/}AN20" minOccurs="0"/>
 *           &lt;element name="Weight" type="{http://www.drfirst.com/}AN20" minOccurs="0"/>
 *           &lt;element name="IntendedUse" type="{http://www.drfirst.com/}AN100" minOccurs="0"/>
 *         &lt;/sequence>
 *       &lt;/choice>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "MedicationType", propOrder = {
    "deleted",
    "rcopiaID",
    "externalID",
    "patient",
    "provider",
    "preparer",
    "pharmacy",
    "hasScheduledDrug",
    "drugCodingLevel",
    "historySource",
    "sig",
    "startDate",
    "stopDate",
    "fillDate",
    "stopReason",
    "sigChangedDate",
    "lastModifiedBy",
    "lastModifiedDate",
    "prescription",
    "problemList",
    "height",
    "weight",
    "intendedUse"
})
public class MedicationType {

    @XmlElement(name = "Deleted")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String deleted;
    @XmlElement(name = "RcopiaID")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String rcopiaID;
    @XmlElement(name = "ExternalID")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String externalID;
    @XmlElement(name = "Patient")
    protected SimplePatientType patient;
    @XmlElement(name = "Provider")
    protected ProviderType provider;
    @XmlElement(name = "Preparer")
    protected ProviderType preparer;
    @XmlElement(name = "Pharmacy")
    protected PharmacyType pharmacy;
    @XmlElement(name = "HasScheduledDrug")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String hasScheduledDrug;
    @XmlElement(name = "DrugCodingLevel")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String drugCodingLevel;
    @XmlElement(name = "HistorySource")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String historySource;
    @XmlElement(name = "Sig")
    protected SigDataType sig;
    @XmlElement(name = "StartDate")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String startDate;
    @XmlElement(name = "StopDate")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String stopDate;
    @XmlElement(name = "FillDate")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String fillDate;
    @XmlElement(name = "StopReason")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String stopReason;
    @XmlElement(name = "SigChangedDate")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String sigChangedDate;
    @XmlElement(name = "LastModifiedBy")
    protected ProviderType lastModifiedBy;
    @XmlElement(name = "LastModifiedDate")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String lastModifiedDate;
    @XmlElement(name = "Prescription")
    protected Prescription prescription;
    @XmlElement(name = "ProblemList")
    protected ProblemListType problemList;
    @XmlElement(name = "Height")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String height;
    @XmlElement(name = "Weight")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String weight;
    @XmlElement(name = "IntendedUse")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String intendedUse;

    /**
     * Gets the value of the deleted property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDeleted() {
        return deleted;
    }

    /**
     * Sets the value of the deleted property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDeleted(String value) {
        this.deleted = value;
    }

    /**
     * Gets the value of the rcopiaID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRcopiaID() {
        return rcopiaID;
    }

    /**
     * Sets the value of the rcopiaID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRcopiaID(String value) {
        this.rcopiaID = value;
    }

    /**
     * Gets the value of the externalID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getExternalID() {
        return externalID;
    }

    /**
     * Sets the value of the externalID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setExternalID(String value) {
        this.externalID = value;
    }

    /**
     * Gets the value of the patient property.
     * 
     * @return
     *     possible object is
     *     {@link SimplePatientType }
     *     
     */
    public SimplePatientType getPatient() {
        return patient;
    }

    /**
     * Sets the value of the patient property.
     * 
     * @param value
     *     allowed object is
     *     {@link SimplePatientType }
     *     
     */
    public void setPatient(SimplePatientType value) {
        this.patient = value;
    }

    /**
     * Gets the value of the provider property.
     * 
     * @return
     *     possible object is
     *     {@link ProviderType }
     *     
     */
    public ProviderType getProvider() {
        return provider;
    }

    /**
     * Sets the value of the provider property.
     * 
     * @param value
     *     allowed object is
     *     {@link ProviderType }
     *     
     */
    public void setProvider(ProviderType value) {
        this.provider = value;
    }

    /**
     * Gets the value of the preparer property.
     * 
     * @return
     *     possible object is
     *     {@link ProviderType }
     *     
     */
    public ProviderType getPreparer() {
        return preparer;
    }

    /**
     * Sets the value of the preparer property.
     * 
     * @param value
     *     allowed object is
     *     {@link ProviderType }
     *     
     */
    public void setPreparer(ProviderType value) {
        this.preparer = value;
    }

    /**
     * Gets the value of the pharmacy property.
     * 
     * @return
     *     possible object is
     *     {@link PharmacyType }
     *     
     */
    public PharmacyType getPharmacy() {
        return pharmacy;
    }

    /**
     * Sets the value of the pharmacy property.
     * 
     * @param value
     *     allowed object is
     *     {@link PharmacyType }
     *     
     */
    public void setPharmacy(PharmacyType value) {
        this.pharmacy = value;
    }

    /**
     * Gets the value of the hasScheduledDrug property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHasScheduledDrug() {
        return hasScheduledDrug;
    }

    /**
     * Sets the value of the hasScheduledDrug property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHasScheduledDrug(String value) {
        this.hasScheduledDrug = value;
    }

    /**
     * Gets the value of the drugCodingLevel property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDrugCodingLevel() {
        return drugCodingLevel;
    }

    /**
     * Sets the value of the drugCodingLevel property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDrugCodingLevel(String value) {
        this.drugCodingLevel = value;
    }

    /**
     * Gets the value of the historySource property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHistorySource() {
        return historySource;
    }

    /**
     * Sets the value of the historySource property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHistorySource(String value) {
        this.historySource = value;
    }

    /**
     * Gets the value of the sig property.
     * 
     * @return
     *     possible object is
     *     {@link SigDataType }
     *     
     */
    public SigDataType getSig() {
        return sig;
    }

    /**
     * Sets the value of the sig property.
     * 
     * @param value
     *     allowed object is
     *     {@link SigDataType }
     *     
     */
    public void setSig(SigDataType value) {
        this.sig = value;
    }

    /**
     * Gets the value of the startDate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStartDate() {
        return startDate;
    }

    /**
     * Sets the value of the startDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStartDate(String value) {
        this.startDate = value;
    }

    /**
     * Gets the value of the stopDate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStopDate() {
        return stopDate;
    }

    /**
     * Sets the value of the stopDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStopDate(String value) {
        this.stopDate = value;
    }

    /**
     * Gets the value of the fillDate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFillDate() {
        return fillDate;
    }

    /**
     * Sets the value of the fillDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFillDate(String value) {
        this.fillDate = value;
    }

    /**
     * Gets the value of the stopReason property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStopReason() {
        return stopReason;
    }

    /**
     * Sets the value of the stopReason property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStopReason(String value) {
        this.stopReason = value;
    }

    /**
     * Gets the value of the sigChangedDate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSigChangedDate() {
        return sigChangedDate;
    }

    /**
     * Sets the value of the sigChangedDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSigChangedDate(String value) {
        this.sigChangedDate = value;
    }

    /**
     * Gets the value of the lastModifiedBy property.
     * 
     * @return
     *     possible object is
     *     {@link ProviderType }
     *     
     */
    public ProviderType getLastModifiedBy() {
        return lastModifiedBy;
    }

    /**
     * Sets the value of the lastModifiedBy property.
     * 
     * @param value
     *     allowed object is
     *     {@link ProviderType }
     *     
     */
    public void setLastModifiedBy(ProviderType value) {
        this.lastModifiedBy = value;
    }

    /**
     * Gets the value of the lastModifiedDate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLastModifiedDate() {
        return lastModifiedDate;
    }

    /**
     * Sets the value of the lastModifiedDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLastModifiedDate(String value) {
        this.lastModifiedDate = value;
    }

    /**
     * Gets the value of the prescription property.
     * 
     * @return
     *     possible object is
     *     {@link Prescription }
     *     
     */
    public Prescription getPrescription() {
        return prescription;
    }

    /**
     * Sets the value of the prescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link Prescription }
     *     
     */
    public void setPrescription(Prescription value) {
        this.prescription = value;
    }

    /**
     * Gets the value of the problemList property.
     * 
     * @return
     *     possible object is
     *     {@link ProblemListType }
     *     
     */
    public ProblemListType getProblemList() {
        return problemList;
    }

    /**
     * Sets the value of the problemList property.
     * 
     * @param value
     *     allowed object is
     *     {@link ProblemListType }
     *     
     */
    public void setProblemList(ProblemListType value) {
        this.problemList = value;
    }

    /**
     * Gets the value of the height property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHeight() {
        return height;
    }

    /**
     * Sets the value of the height property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHeight(String value) {
        this.height = value;
    }

    /**
     * Gets the value of the weight property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getWeight() {
        return weight;
    }

    /**
     * Sets the value of the weight property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setWeight(String value) {
        this.weight = value;
    }

    /**
     * Gets the value of the intendedUse property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIntendedUse() {
        return intendedUse;
    }

    /**
     * Sets the value of the intendedUse property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIntendedUse(String value) {
        this.intendedUse = value;
    }


    /**
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;extension base="{http://www.drfirst.com/}ComplexRcopiaIDType">
     *       &lt;sequence>
     *         &lt;element name="ReplacesMedication" type="{http://www.drfirst.com/}DrugIDType" minOccurs="0"/>
     *       &lt;/sequence>
     *     &lt;/extension>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "replacesMedication"
    })
    public static class Prescription
        extends ComplexRcopiaIDType
    {

        @XmlElement(name = "ReplacesMedication")
        protected DrugIDType replacesMedication;

        /**
         * Gets the value of the replacesMedication property.
         * 
         * @return
         *     possible object is
         *     {@link DrugIDType }
         *     
         */
        public DrugIDType getReplacesMedication() {
            return replacesMedication;
        }

        /**
         * Sets the value of the replacesMedication property.
         * 
         * @param value
         *     allowed object is
         *     {@link DrugIDType }
         *     
         */
        public void setReplacesMedication(DrugIDType value) {
            this.replacesMedication = value;
        }

    }

}
