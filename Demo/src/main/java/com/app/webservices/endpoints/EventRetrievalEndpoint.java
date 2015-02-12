/**
 * 
 */
package com.app.webservices.endpoints;

import java.math.BigInteger;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ws.server.endpoint.annotation.Endpoint;
import org.springframework.ws.server.endpoint.annotation.PayloadRoot;
import org.springframework.ws.server.endpoint.annotation.RequestPayload;
import org.springframework.ws.server.endpoint.annotation.ResponsePayload;

import com.app.webservices.impl.EventEntryService;
import com.app.webservices.impl.EventRetrievalService;
import com.app.webservices.schoolapp.eventretrievalservice.GetEventRequest;
import com.app.webservices.schoolapp.eventretrievalservice.GetEventResponse;
import com.app.webservices.schoolapp.service.SetEventRequest;
import com.app.webservices.schoolapp.service.SetEventResponse;
import com.stage.beans.Event;
/**
 * @author Anubhav Kaushik
 *
 */
@Endpoint
public class EventRetrievalEndpoint {

	private static final String TARGET_NAMESPACE = "http://com/app/webservices/schoolapp/eventretrievalservice";
	
	@Autowired
	private EventRetrievalService eventRetrievalService;
	
	@PayloadRoot(localPart = "GetEventRequest", namespace = TARGET_NAMESPACE)
	public @ResponsePayload GetEventResponse setEvent(@RequestPayload GetEventRequest request) {
		Event event1 = new Event();
		GetEventResponse serviceResponse = new GetEventResponse();
		try {
				BigInteger eventId = request.getEventId();
				event1 = eventRetrievalService.getEvent(eventId);			
		} catch (Exception e) {
			System.out.println("Updated Failed");
		}
	
		
		serviceResponse.setDatabaseresponse(event1);
		return serviceResponse;
	}
	
	public void getEventEntryService(
			EventRetrievalService eventRetrievalService) {
		this.eventRetrievalService= eventRetrievalService;
	}
}
