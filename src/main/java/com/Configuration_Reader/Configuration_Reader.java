package com.Configuration_Reader;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

// It should be constructor

public class Configuration_Reader {
	
	public Properties p;
	
	public  Configuration_Reader() throws IOException{
		
		
		File f = new File("C:\\Users\\eyogesh\\eclipse-workspace\\Adactin\\config.properties");
	FileInputStream fis = new FileInputStream(f);
	
	p = new Properties();
	
	p.load(fis);
	
	}
	
	public String getBrowserName() {
		String browsername = p.getProperty("browserName");
		return browsername;
	}
	
	public String getdb_url() {
		String db_url = p.getProperty("db_url");
		return db_url;
	}
	
	public String getUserName() {
		String username = p.getProperty("username");
		return username;
		
	}
	
	public String getPassword() {
		String password = p.getProperty("password");
		return password;
	}

}
