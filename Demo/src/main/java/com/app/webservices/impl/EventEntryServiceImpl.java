/**
 * 
 */
package com.app.webservices.impl;

import org.springframework.beans.factory.annotation.Autowired;

import com.app.webservices.dao.EventInsertionDAO;


/**
 * @author Anubhav Kaushik
 *
 */
public class EventEntryServiceImpl implements EventEntryService {

	@Autowired
    EventInsertionDAO evntdao;

	public boolean setEvent(String Event, String Notice) {
		 evntdao.setEvent( Notice, Event);
		 System.out.println("inside Event entry implementation");
		 return true;
	}
}
