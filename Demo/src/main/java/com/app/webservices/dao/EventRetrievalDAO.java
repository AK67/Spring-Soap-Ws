package com.app.webservices.dao;

import java.math.BigInteger;

import javax.sql.DataSource;

import com.stage.beans.Event;

public interface EventRetrievalDAO {

	/**
	 * This is the method to be used to initialize database resources ie.
	 * connection.
	 */
	public void setDataSource(DataSource ds);
	
	/**
	 * This is the method to be used to get the event details 
	 * from the database
	 */
	public Event getEvent(BigInteger eventId) ;
}
