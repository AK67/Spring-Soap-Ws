//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.7 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2015.02.12 at 12:05:40 PM IST 
//


package com.app.webservices.schoolapp.eventretrievalservice;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import com.stage.beans.Event;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="databaseresponse" type="{http://beans.stage.com}Event"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "databaseresponse"
})
@XmlRootElement(name = "GetEventResponse")
public class GetEventResponse {

    @XmlElement(required = true)
    protected Event databaseresponse;

    /**
     * Gets the value of the databaseresponse property.
     * 
     * @return
     *     possible object is
     *     {@link Event }
     *     
     */
    public Event getDatabaseresponse() {
        return databaseresponse;
    }

    /**
     * Sets the value of the databaseresponse property.
     * 
     * @param value
     *     allowed object is
     *     {@link Event }
     *     
     */
    public void setDatabaseresponse(Event value) {
        this.databaseresponse = value;
    }

}