package com.util;



import org.apache.http.HttpHeaders;
import org.apache.http.HttpResponse;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.client.methods.HttpUriRequest;
import org.apache.http.impl.client.HttpClientBuilder;

import com.pojo.GithubUser;
import com.pojo.twitter.User;

import oauth.signpost.OAuthConsumer;
import oauth.signpost.commonshttp.CommonsHttpOAuthConsumer;

public class RestUtil {
	
	HttpUriRequest request;
	HttpResponse response;
	private GithubUser user;
	private User twitteruser;
	//HttpUriRequest req;
	//HttpResponse resp;
	String URI = Configuration.URI;
	String TWITTERURI = Configuration.TWITTERURI;
	
	

	public User getTwitteruser() {
		return twitteruser;
	}

	public void setTwitteruser(User twitteruser) {
		this.twitteruser = twitteruser;
	}

	public GithubUser getUser() {
		return user;
	}

	public void setUser(GithubUser user) {
		this.user = user;
	}
	//twitter autherntication(Oauth 1)
	public void addAuthentication(){
		
		try {
		
		OAuthConsumer consumer = new CommonsHttpOAuthConsumer(Configuration.CONSUMER_KEY, Configuration.CONSUMER_SECRET);
		
		consumer.setTokenWithSecret(Configuration.ACCESS_TOKEN, Configuration.CONSUMER_KEY);
		
		
			consumer.sign(request);
		
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	//twitter get request
	public void getTwitterRequest(String resourceUrn,String screenname,int count){
		try{
			
		 request = new HttpGet(TWITTERURI+resourceUrn+"screen_name ="+screenname+"&count="+count);
		 
		 
		 request.addHeader(HttpHeaders.CONTENT_TYPE,"application/json");
		 
		 addAuthentication();
		 
		 
			this.response= HttpClientBuilder.create().build().execute(request);
			
			if(response!=null){
			
	setTwitteruser(ResourceUtil.retrieveResource(response, User.class));	
				
			}
			
			else{
				System.out.println("something went wrong");
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	public void getRequest(String resourceUrn){
		
		request = new HttpGet(URI+resourceUrn);
		
		request.addHeader(HttpHeaders.CONTENT_TYPE, "application/json");
		
		try {
			this.response = HttpClientBuilder.create().build().execute(request);
			
			
			if(response!=null){
				
		setUser(ResourceUtil.retrieveResource(response, GithubUser.class));
			}
			else{
				System.out.println("something went wrong");
			}
		
		} catch (Exception e) {
			e.printStackTrace();
		}
	} 
	
	public int validateStatusCode(){
		
		return response.getStatusLine().getStatusCode();
	}
	



}
