/**
 * 
 */
package com.app.webservices.util;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

/**
 * @author anubhav kaushik
 * 
 */
public class PropertiesUtil {

	private String propertiesFileName;

	private Properties getPropertyHandle() throws IOException,
			FileNotFoundException {
		Properties prop = new Properties();
		InputStream inputStream = getClass().getClassLoader()
				.getResourceAsStream(propertiesFileName);
		prop.load(inputStream);		
		return prop;
	}

	public String getProperty(String name) throws IOException,
			FileNotFoundException {
		return (String) getPropertyHandle().getProperty("hello");
	}

	public void setPropertiesFileName(String propertiesFileName) {
		this.propertiesFileName = propertiesFileName;
	}
}
