package com.pojo.twitter;

public class Urls {
	
	 private String expanded_url;

	    private String[] indices;

	    private String display_url;

	    private String url;

	    public String getExpanded_url ()
	    {
	        return expanded_url;
	    }

	    public void setExpanded_url (String expanded_url)
	    {
	        this.expanded_url = expanded_url;
	    }

	    public String[] getIndices ()
	    {
	        return indices;
	    }

	    public void setIndices (String[] indices)
	    {
	        this.indices = indices;
	    }

	    public String getDisplay_url ()
	    {
	        return display_url;
	    }

	    public void setDisplay_url (String display_url)
	    {
	        this.display_url = display_url;
	    }

	    public String getUrl ()
	    {
	        return url;
	    }

	    public void setUrl (String url)
	    {
	        this.url = url;
	    }

	    @Override
	    public String toString()
	    {
	        return "ClassPojo [expanded_url = "+expanded_url+", indices = "+indices+", display_url = "+display_url+", url = "+url+"]";
	    }

}
