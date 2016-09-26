package com.test;

import static org.testng.AssertJUnit.assertEquals;
import org.apache.http.HttpStatus;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.util.RestUtil;

public class GithubTest extends BaseTest {
	
	RestUtil util;
	
	@BeforeClass
	public void beforeClass(){
		
		util = new RestUtil();
		
		util.getRequest("users/whiteboxhub");

	}
	@Test
	public void testSatusCode(){
		
	assertEquals(HttpStatus.SC_OK,util.validateStatusCode());
		
	}
	@Test
	public void testUserLogin(){
		
		assertEquals("WhiteboxHub",util.getUser().getLogin());
	}
	@Test
	public void testId(){
		
		assertEquals("4023110",util.getUser().getId());
	}
	@Test
	public void testName(){
		
		assertEquals("WBL-Training",util.getUser().getName());
	}
	
	

}
