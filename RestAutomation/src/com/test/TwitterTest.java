package com.test;

import static org.testng.AssertJUnit.assertEquals;
import org.apache.http.HttpStatus;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.util.RestUtil;

public class TwitterTest extends BaseTest {
	
	RestUtil util;
	
	@BeforeClass
	public void beforeClass(){
		
		util = new RestUtil();
		
		util.getTwitterRequest("statuses/user_timeline.json?","mary",2);
	}
	@Test
	public void testStatusCode(){
		
		assertEquals(HttpStatus.SC_OK,util.validateStatusCode());
	}
	@Test
	public void testId(){
		
		assertEquals("38453",util.getTwitteruser().getId_str());
	}
	@Test
	public void testFriendsCount(){
		
		assertEquals("Heaven",util.getTwitteruser().getLocation());
	}

}

