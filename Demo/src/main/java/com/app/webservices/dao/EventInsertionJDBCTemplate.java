/**
 * 
 */
package com.app.webservices.dao;

import java.io.FileNotFoundException;
import java.io.IOException;

import javax.sql.DataSource;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

import com.stage.beans.Event;
import com.app.webservices.mapper.EventMaper;
import com.app.webservices.util.PropertiesUtil;
/**
 * @author Anubhav
 *
 */
public class EventInsertionJDBCTemplate implements EventInsertionDAO {
	


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

	public boolean setEvent(String notice, String event) {
		//Event event1 = new Event();
		boolean isInserted = false;
		try {
			// DMDS is hardcoded at this moment ,make it read application.properties
			//propertyHandler = new PropertiesUtil();
			//propertyHandler.setPropertiesFileName("application.properties");
			  DriverManagerDataSource DMDS = new DriverManagerDataSource();
			  DMDS.setDriverClassName("com.mysql.jdbc.Driver");
			  DMDS.setUrl("jdbc:mysql://localhost:3307/test");
			  DMDS.setUsername("root");
			  DMDS.setPassword("password1");
			  setDataSource(DMDS);
			  String SQL = "INSERT INTO eventtable ( Event, Notice)VALUES ( 'Stavange2r', 'Norway'); ";
				//event1 = jdbcTemplateObject.queryForObject(SQL, new Object[]{event1}, new EventMaper());
			  jdbcTemplateObject.update(SQL);
			/*if(event1 == null)
				event1 = new Event();
			*/
			//System.out.println("Printing values : " + propertyHandler.getProperty("hello"));
		} finally {
		}
		
	    return isInserted;
	}

	
}
