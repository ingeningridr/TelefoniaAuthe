//
// Este archivo ha sido generado por la arquitectura JavaTM para la implantación de la referencia de enlace (JAXB) XML v2.3.0 
// Visite <a href="https://javaee.github.io/jaxb-v2/">https://javaee.github.io/jaxb-v2/</a> 
// Todas las modificaciones realizadas en este archivo se perderán si se vuelve a compilar el esquema de origen. 
// Generado el: 2022.01.19 a las 06:36:41 PM COT 
//


package com.example.springboot.telefonia.wsdl.mapping;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para anonymous complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="pi_sIdemp" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="pi_sCaja" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="pi_sAeropuerto" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="pi_sEnvio" type="{http://www.w3.org/2001/XMLSchema}base64Binary" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "piSIdemp",
    "piSCaja",
    "piSAeropuerto",
    "piSEnvio"
})
@XmlRootElement(name = "wm_EnvioTransaccionesAENA")
public class WmEnvioTransaccionesAENA {

    @XmlElement(name = "pi_sIdemp")
    protected String piSIdemp;
    @XmlElement(name = "pi_sCaja")
    protected String piSCaja;
    @XmlElement(name = "pi_sAeropuerto")
    protected String piSAeropuerto;
    @XmlElement(name = "pi_sEnvio")
    protected byte[] piSEnvio;

    /**
     * Obtiene el valor de la propiedad piSIdemp.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPiSIdemp() {
        return piSIdemp;
    }

    /**
     * Define el valor de la propiedad piSIdemp.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPiSIdemp(String value) {
        this.piSIdemp = value;
    }

    /**
     * Obtiene el valor de la propiedad piSCaja.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPiSCaja() {
        return piSCaja;
    }

    /**
     * Define el valor de la propiedad piSCaja.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPiSCaja(String value) {
        this.piSCaja = value;
    }

    /**
     * Obtiene el valor de la propiedad piSAeropuerto.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPiSAeropuerto() {
        return piSAeropuerto;
    }

    /**
     * Define el valor de la propiedad piSAeropuerto.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPiSAeropuerto(String value) {
        this.piSAeropuerto = value;
    }

    /**
     * Obtiene el valor de la propiedad piSEnvio.
     * 
     * @return
     *     possible object is
     *     byte[]
     */
    public byte[] getPiSEnvio() {
        return piSEnvio;
    }

    /**
     * Define el valor de la propiedad piSEnvio.
     * 
     * @param value
     *     allowed object is
     *     byte[]
     */
    public void setPiSEnvio(byte[] value) {
        this.piSEnvio = value;
    }

}
