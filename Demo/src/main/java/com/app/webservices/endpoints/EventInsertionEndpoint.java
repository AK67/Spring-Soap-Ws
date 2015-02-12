/**
 * 
 */
package com.app.webservices.endpoints;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ws.server.endpoint.annotation.Endpoint;
import org.springframework.ws.server.endpoint.annotation.PayloadRoot;
import org.springframework.ws.server.endpoint.annotation.RequestPayload;
import org.springframework.ws.server.endpoint.annotation.ResponsePayload;

import com.app.webservices.impl.EventEntryService;
import com.app.webservices.schoolapp.service.SetEventRequest;
import com.app.webservices.schoolapp.service.SetEventResponse;
import com.stage.beans.Event;
/**
 * @author Anubhav Kaushik
 *
 */
@Endpoint
public class EventInsertionEndpoint {

	private static final String TARGET_NAMESPACE = "http://com/app/webservices/schoolapp/service";
	
	@Autowired
	private EventEntryService eventEntryService;
	
	@PayloadRoot(localPart = "SetEventRequest", namespace = TARGET_NAMESPACE)
	public @ResponsePayload SetEventResponse setEvent(@RequestPayload SetEventRequest request) {
	
		SetEventResponse serviceResponse = new SetEventResponse();
		try {
			Event event = request.getEventdetails();
			System.out.println(request.getEventdetails().getEvents());
			boolean entryUpdatedSuccessfully = (boolean) eventEntryService.setEvent(event.getEvents(),event.getNotice());
			if(entryUpdatedSuccessfully) 
				serviceResponse.setDatabaseresponse("Updated Successfully");
			else
				serviceResponse.setDatabaseresponse("Updated Failed");
			
		} catch (Exception e) {
			serviceResponse.setDatabaseresponse("Updated Failed");
			e.printStackTrace();
		}
		//serviceResponse.setDatabaseresponse("bullet with butterfly wings");
		System.out.println("setting REsponse");
		//System.out.println(serviceResponse.getDatabaseresponse());
		return serviceResponse;
	}
	
	public void setEventEntryService(EventEntryService eventEntryService) {this.eventEntryService = eventEntryService;
	}

	/**
	 * @param accountLookupService the accountLookupService to set
	 */
		
}
