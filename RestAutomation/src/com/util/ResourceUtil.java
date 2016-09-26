package com.util;


import org.apache.http.HttpResponse;
import org.apache.http.util.EntityUtils;
import org.codehaus.jackson.map.ObjectMapper;

public class ResourceUtil {
	
	public static <X>X retrieveResource(HttpResponse response,Class<X>cl){
		
		String json;
		
		try {
			json = EntityUtils.toString(response.getEntity());
			
			ObjectMapper mapper = new ObjectMapper();
			
			return mapper.readValue(json, cl);
		
		} catch (Exception e) {
			e.printStackTrace();
		}	
		return null;

	}
	


}
