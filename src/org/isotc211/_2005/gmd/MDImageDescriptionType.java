//
// 이 파일은 JAXB(JavaTM Architecture for XML Binding) 참조 구현 2.2.8-b130911.1802 버전을 통해 생성되었습니다. 
// <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a>를 참조하십시오. 
// 이 파일을 수정하면 소스 스키마를 재컴파일할 때 수정 사항이 손실됩니다. 
// 생성 날짜: 2015.03.03 시간 05:39:41 PM KST 
//


package org.isotc211._2005.gmd;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;
import org.isotc211._2005.gco.BooleanPropertyType;
import org.isotc211._2005.gco.IntegerPropertyType;
import org.isotc211._2005.gco.RealPropertyType;


/**
 * Information about an image's suitability for use
 * 
 * <p>MD_ImageDescription_Type complex type에 대한 Java 클래스입니다.
 * 
 * <p>다음 스키마 단편이 이 클래스에 포함되는 필요한 콘텐츠를 지정합니다.
 * 
 * <pre>
 * &lt;complexType name="MD_ImageDescription_Type">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.isotc211.org/2005/gmd}MD_CoverageDescription_Type">
 *       &lt;sequence>
 *         &lt;element name="illuminationElevationAngle" type="{http://www.isotc211.org/2005/gco}Real_PropertyType" minOccurs="0"/>
 *         &lt;element name="illuminationAzimuthAngle" type="{http://www.isotc211.org/2005/gco}Real_PropertyType" minOccurs="0"/>
 *         &lt;element name="imagingCondition" type="{http://www.isotc211.org/2005/gmd}MD_ImagingConditionCode_PropertyType" minOccurs="0"/>
 *         &lt;element name="imageQualityCode" type="{http://www.isotc211.org/2005/gmd}MD_Identifier_PropertyType" minOccurs="0"/>
 *         &lt;element name="cloudCoverPercentage" type="{http://www.isotc211.org/2005/gco}Real_PropertyType" minOccurs="0"/>
 *         &lt;element name="processingLevelCode" type="{http://www.isotc211.org/2005/gmd}MD_Identifier_PropertyType" minOccurs="0"/>
 *         &lt;element name="compressionGenerationQuantity" type="{http://www.isotc211.org/2005/gco}Integer_PropertyType" minOccurs="0"/>
 *         &lt;element name="triangulationIndicator" type="{http://www.isotc211.org/2005/gco}Boolean_PropertyType" minOccurs="0"/>
 *         &lt;element name="radiometricCalibrationDataAvailability" type="{http://www.isotc211.org/2005/gco}Boolean_PropertyType" minOccurs="0"/>
 *         &lt;element name="cameraCalibrationInformationAvailability" type="{http://www.isotc211.org/2005/gco}Boolean_PropertyType" minOccurs="0"/>
 *         &lt;element name="filmDistortionInformationAvailability" type="{http://www.isotc211.org/2005/gco}Boolean_PropertyType" minOccurs="0"/>
 *         &lt;element name="lensDistortionInformationAvailability" type="{http://www.isotc211.org/2005/gco}Boolean_PropertyType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "MD_ImageDescription_Type", propOrder = {
    "illuminationElevationAngle",
    "illuminationAzimuthAngle",
    "imagingCondition",
    "imageQualityCode",
    "cloudCoverPercentage",
    "processingLevelCode",
    "compressionGenerationQuantity",
    "triangulationIndicator",
    "radiometricCalibrationDataAvailability",
    "cameraCalibrationInformationAvailability",
    "filmDistortionInformationAvailability",
    "lensDistortionInformationAvailability"
})
public class MDImageDescriptionType
    extends MDCoverageDescriptionType
{

    protected RealPropertyType illuminationElevationAngle;
    protected RealPropertyType illuminationAzimuthAngle;
    protected MDImagingConditionCodePropertyType imagingCondition;
    protected MDIdentifierPropertyType imageQualityCode;
    protected RealPropertyType cloudCoverPercentage;
    protected MDIdentifierPropertyType processingLevelCode;
    protected IntegerPropertyType compressionGenerationQuantity;
    protected BooleanPropertyType triangulationIndicator;
    protected BooleanPropertyType radiometricCalibrationDataAvailability;
    protected BooleanPropertyType cameraCalibrationInformationAvailability;
    protected BooleanPropertyType filmDistortionInformationAvailability;
    protected BooleanPropertyType lensDistortionInformationAvailability;

    /**
     * illuminationElevationAngle 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link RealPropertyType }
     *     
     */
    public RealPropertyType getIlluminationElevationAngle() {
        return illuminationElevationAngle;
    }

    /**
     * illuminationElevationAngle 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link RealPropertyType }
     *     
     */
    public void setIlluminationElevationAngle(RealPropertyType value) {
        this.illuminationElevationAngle = value;
    }

    public boolean isSetIlluminationElevationAngle() {
        return (this.illuminationElevationAngle!= null);
    }

    /**
     * illuminationAzimuthAngle 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link RealPropertyType }
     *     
     */
    public RealPropertyType getIlluminationAzimuthAngle() {
        return illuminationAzimuthAngle;
    }

    /**
     * illuminationAzimuthAngle 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link RealPropertyType }
     *     
     */
    public void setIlluminationAzimuthAngle(RealPropertyType value) {
        this.illuminationAzimuthAngle = value;
    }

    public boolean isSetIlluminationAzimuthAngle() {
        return (this.illuminationAzimuthAngle!= null);
    }

    /**
     * imagingCondition 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link MDImagingConditionCodePropertyType }
     *     
     */
    public MDImagingConditionCodePropertyType getImagingCondition() {
        return imagingCondition;
    }

    /**
     * imagingCondition 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link MDImagingConditionCodePropertyType }
     *     
     */
    public void setImagingCondition(MDImagingConditionCodePropertyType value) {
        this.imagingCondition = value;
    }

    public boolean isSetImagingCondition() {
        return (this.imagingCondition!= null);
    }

    /**
     * imageQualityCode 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link MDIdentifierPropertyType }
     *     
     */
    public MDIdentifierPropertyType getImageQualityCode() {
        return imageQualityCode;
    }

    /**
     * imageQualityCode 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link MDIdentifierPropertyType }
     *     
     */
    public void setImageQualityCode(MDIdentifierPropertyType value) {
        this.imageQualityCode = value;
    }

    public boolean isSetImageQualityCode() {
        return (this.imageQualityCode!= null);
    }

    /**
     * cloudCoverPercentage 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link RealPropertyType }
     *     
     */
    public RealPropertyType getCloudCoverPercentage() {
        return cloudCoverPercentage;
    }

    /**
     * cloudCoverPercentage 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link RealPropertyType }
     *     
     */
    public void setCloudCoverPercentage(RealPropertyType value) {
        this.cloudCoverPercentage = value;
    }

    public boolean isSetCloudCoverPercentage() {
        return (this.cloudCoverPercentage!= null);
    }

    /**
     * processingLevelCode 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link MDIdentifierPropertyType }
     *     
     */
    public MDIdentifierPropertyType getProcessingLevelCode() {
        return processingLevelCode;
    }

    /**
     * processingLevelCode 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link MDIdentifierPropertyType }
     *     
     */
    public void setProcessingLevelCode(MDIdentifierPropertyType value) {
        this.processingLevelCode = value;
    }

    public boolean isSetProcessingLevelCode() {
        return (this.processingLevelCode!= null);
    }

    /**
     * compressionGenerationQuantity 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link IntegerPropertyType }
     *     
     */
    public IntegerPropertyType getCompressionGenerationQuantity() {
        return compressionGenerationQuantity;
    }

    /**
     * compressionGenerationQuantity 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link IntegerPropertyType }
     *     
     */
    public void setCompressionGenerationQuantity(IntegerPropertyType value) {
        this.compressionGenerationQuantity = value;
    }

    public boolean isSetCompressionGenerationQuantity() {
        return (this.compressionGenerationQuantity!= null);
    }

    /**
     * triangulationIndicator 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link BooleanPropertyType }
     *     
     */
    public BooleanPropertyType getTriangulationIndicator() {
        return triangulationIndicator;
    }

    /**
     * triangulationIndicator 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link BooleanPropertyType }
     *     
     */
    public void setTriangulationIndicator(BooleanPropertyType value) {
        this.triangulationIndicator = value;
    }

    public boolean isSetTriangulationIndicator() {
        return (this.triangulationIndicator!= null);
    }

    /**
     * radiometricCalibrationDataAvailability 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link BooleanPropertyType }
     *     
     */
    public BooleanPropertyType getRadiometricCalibrationDataAvailability() {
        return radiometricCalibrationDataAvailability;
    }

    /**
     * radiometricCalibrationDataAvailability 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link BooleanPropertyType }
     *     
     */
    public void setRadiometricCalibrationDataAvailability(BooleanPropertyType value) {
        this.radiometricCalibrationDataAvailability = value;
    }

    public boolean isSetRadiometricCalibrationDataAvailability() {
        return (this.radiometricCalibrationDataAvailability!= null);
    }

    /**
     * cameraCalibrationInformationAvailability 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link BooleanPropertyType }
     *     
     */
    public BooleanPropertyType getCameraCalibrationInformationAvailability() {
        return cameraCalibrationInformationAvailability;
    }

    /**
     * cameraCalibrationInformationAvailability 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link BooleanPropertyType }
     *     
     */
    public void setCameraCalibrationInformationAvailability(BooleanPropertyType value) {
        this.cameraCalibrationInformationAvailability = value;
    }

    public boolean isSetCameraCalibrationInformationAvailability() {
        return (this.cameraCalibrationInformationAvailability!= null);
    }

    /**
     * filmDistortionInformationAvailability 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link BooleanPropertyType }
     *     
     */
    public BooleanPropertyType getFilmDistortionInformationAvailability() {
        return filmDistortionInformationAvailability;
    }

    /**
     * filmDistortionInformationAvailability 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link BooleanPropertyType }
     *     
     */
    public void setFilmDistortionInformationAvailability(BooleanPropertyType value) {
        this.filmDistortionInformationAvailability = value;
    }

    public boolean isSetFilmDistortionInformationAvailability() {
        return (this.filmDistortionInformationAvailability!= null);
    }

    /**
     * lensDistortionInformationAvailability 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link BooleanPropertyType }
     *     
     */
    public BooleanPropertyType getLensDistortionInformationAvailability() {
        return lensDistortionInformationAvailability;
    }

    /**
     * lensDistortionInformationAvailability 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link BooleanPropertyType }
     *     
     */
    public void setLensDistortionInformationAvailability(BooleanPropertyType value) {
        this.lensDistortionInformationAvailability = value;
    }

    public boolean isSetLensDistortionInformationAvailability() {
        return (this.lensDistortionInformationAvailability!= null);
    }

}
