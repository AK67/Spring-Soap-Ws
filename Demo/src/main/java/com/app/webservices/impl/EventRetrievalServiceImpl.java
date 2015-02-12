/**
 * 
 */
package com.app.webservices.impl;

import java.math.BigInteger;

import org.springframework.beans.factory.annotation.Autowired;

import com.app.webservices.dao.EventRetrievalDAO;
import com.stage.beans.Event;


/**
 * @author Anubhav Kaushik
 *
 */
public class EventRetrievalServiceImpl implements EventRetrievalService{

	@Autowired
    EventRetrievalDAO evntRetrievalDao;

	public Event getEvent(BigInteger eventId) {
		 
		return evntRetrievalDao.getEvent(eventId);
	}

	




	
}
