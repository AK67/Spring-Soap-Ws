package com.app.webservices.dao;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.math.BigInteger;

import javax.sql.DataSource;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

import com.app.webservices.mapper.EventMaper;
import com.app.webservices.util.PropertiesUtil;
import com.stage.beans.Event;

public class EventRetrievalJDBCTemplate implements EventRetrievalDAO{

	  

	private JdbcTemplate jdbcTemplateObject;	
	private PropertiesUtil propertyHandler;
	private DataSource dataSource;
	
	public void setDataSource(DataSource dataSource) {
		this.dataSource = dataSource;
		if(dataSource != null)
			this.jdbcTemplateObject = new JdbcTemplate(dataSource);
		else
			System.out.println("datasource is null !!!");
	}

	

	public void setPropertyHandler(PropertiesUtil propertyHandler) {
		this.propertyHandler = propertyHandler;
	}

	public Event getEvent(BigInteger eventId) {
		Event event1 = new Event();
		propertyHandler.setPropertiesFileName("application.properties");
		try {			
			 DriverManagerDataSource DMDS = new DriverManagerDataSource();
			  DMDS.setDriverClassName("com.mysql.jdbc.Driver");
			  DMDS.setUrl("jdbc:mysql://localhost:3307/test");
			  DMDS.setUsername("root");
			  DMDS.setPassword("password1");
			  setDataSource(DMDS);
			  String SQL = "select * from  event where eventId = 1";
			event1 = jdbcTemplateObject.queryForObject(SQL, 
		                        new Object[]{event1}, new EventMaper());
			if(event1 == null)
				event1 = new Event();
			
			
		} finally {
		}
		
	    return event1;
	}
	 
}
