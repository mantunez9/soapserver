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
 * <p>Clase Java para findVideoByTittleRequest complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="findVideoByTittleRequest">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="tittle" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "findVideoByTittleRequest", propOrder = {
    "tittle"
})
public class FindVideoByTittleRequest {

    @XmlElement(required = true)
    protected String tittle;

    /**
     * Obtiene el valor de la propiedad tittle.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTittle() {
        return tittle;
    }

    /**
     * Define el valor de la propiedad tittle.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTittle(String value) {
        this.tittle = value;
    }

}
