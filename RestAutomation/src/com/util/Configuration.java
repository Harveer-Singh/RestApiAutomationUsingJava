package com.util;

import java.io.File;
import java.io.FileReader;
import java.util.Properties;

public class Configuration {
	
	public static String URI;
	
	public static String TWITTERURI;
	public static String CONSUMER_KEY;
	public static String CONSUMER_SECRET;
	public static String ACCESS_TOKEN;
	public static String ACCESS_TOKENSECRET;
	
	public Configuration(){      //constructor...as soon as in basetest configuration object created then loadproperties method also executed.
		
	loadProperties();	
		
	}
	
	public void loadProperties()
	{
	Properties prop = new Properties();
	
	try {
		FileReader reader = new FileReader(new File(String.format("%s/src/com/resources/config.properties", System.getProperty("user.dir"))));
		
		prop.load(reader);
		
		URI = prop.getProperty("uri");
		TWITTERURI = prop.getProperty("twitter_uri");
		CONSUMER_KEY = prop.getProperty("consumer_key");
		CONSUMER_SECRET = prop.getProperty("consumer_secret");
		ACCESS_TOKEN = prop.getProperty("access_token");
		ACCESS_TOKENSECRET = prop.getProperty("access_tokensecret");
		

	
	} catch (Exception e) {
    System.out.println(e);	
	}
	}
		
		
	

}
