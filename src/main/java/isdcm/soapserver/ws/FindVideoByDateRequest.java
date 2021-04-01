//
// Este archivo ha sido generado por la arquitectura JavaTM para la implantación de la referencia de enlace (JAXB) XML v2.2.7 
// Visite <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Todas las modificaciones realizadas en este archivo se perderán si se vuelve a compilar el esquema de origen. 
// Generado el: 2021.04.01 a las 03:16:31 PM CEST 
//


package isdcm.soapserver.ws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para findVideoByDateRequest complex type.
 *
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 *
 * <pre>
 * &lt;complexType name="findVideoByDateRequest">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="year" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="month" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="day" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "findVideoByDateRequest", propOrder = {
        "year",
        "month",
        "day"
})
public class FindVideoByDateRequest {

    @XmlElement(required = true, defaultValue = "0001")
    protected String year;
    @XmlElement(defaultValue = "01")
    protected String month;
    @XmlElement(defaultValue = "01")
    protected String day;

    /**
     * Obtiene el valor de la propiedad year.
     *
     * @return possible object is
     * {@link String }
     */
    public String getYear() {
        return year;
    }

    /**
     * Define el valor de la propiedad year.
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setYear(String value) {
        this.year = value;
    }

    /**
     * Obtiene el valor de la propiedad month.
     *
     * @return possible object is
     * {@link String }
     */
    public String getMonth() {
        return month;
    }

    /**
     * Define el valor de la propiedad month.
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setMonth(String value) {
        this.month = value;
    }

    /**
     * Obtiene el valor de la propiedad day.
     *
     * @return possible object is
     * {@link String }
     */
    public String getDay() {
        return day;
    }

    /**
     * Define el valor de la propiedad day.
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setDay(String value) {
        this.day = value;
    }

}
