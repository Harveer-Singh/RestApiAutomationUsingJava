package com.pojo.twitter;

public class Entities {
	
	 private String[] symbols;

	    private Urls[] urls;

	    private String[] hashtags;

	    private String[] user_mentions;

	    public String[] getSymbols ()
	    {
	        return symbols;
	    }

	    public void setSymbols (String[] symbols)
	    {
	        this.symbols = symbols;
	    }

	    public Urls[] getUrls ()
	    {
	        return urls;
	    }

	    public void setUrls (Urls[] urls)
	    {
	        this.urls = urls;
	    }

	    public String[] getHashtags ()
	    {
	        return hashtags;
	    }

	    public void setHashtags (String[] hashtags)
	    {
	        this.hashtags = hashtags;
	    }

	    public String[] getUser_mentions ()
	    {
	        return user_mentions;
	    }

	    public void setUser_mentions (String[] user_mentions)
	    {
	        this.user_mentions = user_mentions;
	    }

	    @Override
	    public String toString()
	    {
	        return "ClassPojo [symbols = "+symbols+", urls = "+urls+", hashtags = "+hashtags+", user_mentions = "+user_mentions+"]";
	    }
}
