package com.pojo.twitter;

public class Description {
	
	 private String[] urls;

	    public String[] getUrls ()
	    {
	        return urls;
	    }

	    public void setUrls (String[] urls)
	    {
	        this.urls = urls;
	    }

	    @Override
	    public String toString()
	    {
	        return "ClassPojo [urls = "+urls+"]";
	    }

}
