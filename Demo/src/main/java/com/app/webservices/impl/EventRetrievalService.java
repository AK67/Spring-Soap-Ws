package com.app.webservices.impl;

import java.math.BigInteger;

import org.springframework.stereotype.Component;

import com.stage.beans.Event;




/**
 * @author Anubhav Kaushik	
 *
 */
public interface EventRetrievalService {

	public Event getEvent(BigInteger eventId) ;
}
