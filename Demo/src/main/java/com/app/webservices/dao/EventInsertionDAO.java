/**
 * 
 */
package com.app.webservices.dao;

import javax.sql.DataSource;


/**
 * @author anubhav kasuhik
 * 
 */
public interface EventInsertionDAO {

	/**
	 * This is the method to be used to initialize database resources ie.
	 * connection.
	 */
	public void setDataSource(DataSource ds);
	
	/**
	 * This is the method to be used to set Events details 
	 * to the database
	 */
	public boolean setEvent(String notice , String event ) ;
}
