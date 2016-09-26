package com.pojo.twitter;

public class MyPojo {
	
	 private String contributors;

	    private String text;

	    private String geo;

	    private String retweeted;

	    private String in_reply_to_screen_name;

	    private String possibly_sensitive;

	    private String truncated;

	    private String lang;

	    private Entities entities;

	    private String in_reply_to_status_id_str;

	    private String is_quote_status;

	    private String id;

	    private String source;

	    private String in_reply_to_user_id_str;

	    private String favorited;

	    private String in_reply_to_status_id;

	    private String retweet_count;

	    private String created_at;

	    private String in_reply_to_user_id;

	    private String favorite_count;

	    private String id_str;

	    private String place;

	    private User user;

	    private String coordinates;

	    public String getContributors ()
	    {
	        return contributors;
	    }

	    public void setContributors (String contributors)
	    {
	        this.contributors = contributors;
	    }

	    public String getText ()
	    {
	        return text;
	    }

	    public void setText (String text)
	    {
	        this.text = text;
	    }

	    public String getGeo ()
	    {
	        return geo;
	    }

	    public void setGeo (String geo)
	    {
	        this.geo = geo;
	    }

	    public String getRetweeted ()
	    {
	        return retweeted;
	    }

	    public void setRetweeted (String retweeted)
	    {
	        this.retweeted = retweeted;
	    }

	    public String getIn_reply_to_screen_name ()
	    {
	        return in_reply_to_screen_name;
	    }

	    public void setIn_reply_to_screen_name (String in_reply_to_screen_name)
	    {
	        this.in_reply_to_screen_name = in_reply_to_screen_name;
	    }

	    public String getPossibly_sensitive ()
	    {
	        return possibly_sensitive;
	    }

	    public void setPossibly_sensitive (String possibly_sensitive)
	    {
	        this.possibly_sensitive = possibly_sensitive;
	    }

	    public String getTruncated ()
	    {
	        return truncated;
	    }

	    public void setTruncated (String truncated)
	    {
	        this.truncated = truncated;
	    }

	    public String getLang ()
	    {
	        return lang;
	    }

	    public void setLang (String lang)
	    {
	        this.lang = lang;
	    }

	    public Entities getEntities ()
	    {
	        return entities;
	    }

	    public void setEntities (Entities entities)
	    {
	        this.entities = entities;
	    }

	    public String getIn_reply_to_status_id_str ()
	    {
	        return in_reply_to_status_id_str;
	    }

	    public void setIn_reply_to_status_id_str (String in_reply_to_status_id_str)
	    {
	        this.in_reply_to_status_id_str = in_reply_to_status_id_str;
	    }

	    public String getIs_quote_status ()
	    {
	        return is_quote_status;
	    }

	    public void setIs_quote_status (String is_quote_status)
	    {
	        this.is_quote_status = is_quote_status;
	    }

	    public String getId ()
	    {
	        return id;
	    }

	    public void setId (String id)
	    {
	        this.id = id;
	    }

	    public String getSource ()
	    {
	        return source;
	    }

	    public void setSource (String source)
	    {
	        this.source = source;
	    }

	    public String getIn_reply_to_user_id_str ()
	    {
	        return in_reply_to_user_id_str;
	    }

	    public void setIn_reply_to_user_id_str (String in_reply_to_user_id_str)
	    {
	        this.in_reply_to_user_id_str = in_reply_to_user_id_str;
	    }

	    public String getFavorited ()
	    {
	        return favorited;
	    }

	    public void setFavorited (String favorited)
	    {
	        this.favorited = favorited;
	    }

	    public String getIn_reply_to_status_id ()
	    {
	        return in_reply_to_status_id;
	    }

	    public void setIn_reply_to_status_id (String in_reply_to_status_id)
	    {
	        this.in_reply_to_status_id = in_reply_to_status_id;
	    }

	    public String getRetweet_count ()
	    {
	        return retweet_count;
	    }

	    public void setRetweet_count (String retweet_count)
	    {
	        this.retweet_count = retweet_count;
	    }

	    public String getCreated_at ()
	    {
	        return created_at;
	    }

	    public void setCreated_at (String created_at)
	    {
	        this.created_at = created_at;
	    }

	    public String getIn_reply_to_user_id ()
	    {
	        return in_reply_to_user_id;
	    }

	    public void setIn_reply_to_user_id (String in_reply_to_user_id)
	    {
	        this.in_reply_to_user_id = in_reply_to_user_id;
	    }

	    public String getFavorite_count ()
	    {
	        return favorite_count;
	    }

	    public void setFavorite_count (String favorite_count)
	    {
	        this.favorite_count = favorite_count;
	    }

	    public String getId_str ()
	    {
	        return id_str;
	    }

	    public void setId_str (String id_str)
	    {
	        this.id_str = id_str;
	    }

	    public String getPlace ()
	    {
	        return place;
	    }

	    public void setPlace (String place)
	    {
	        this.place = place;
	    }

	    public User getUser ()
	    {
	        return user;
	    }

	    public void setUser (User user)
	    {
	        this.user = user;
	    }

	    public String getCoordinates ()
	    {
	        return coordinates;
	    }

	    public void setCoordinates (String coordinates)
	    {
	        this.coordinates = coordinates;
	    }

	    @Override
	    public String toString()
	    {
	        return "ClassPojo [contributors = "+contributors+", text = "+text+", geo = "+geo+", retweeted = "+retweeted+", in_reply_to_screen_name = "+in_reply_to_screen_name+", possibly_sensitive = "+possibly_sensitive+", truncated = "+truncated+", lang = "+lang+", entities = "+entities+", in_reply_to_status_id_str = "+in_reply_to_status_id_str+", is_quote_status = "+is_quote_status+", id = "+id+", source = "+source+", in_reply_to_user_id_str = "+in_reply_to_user_id_str+", favorited = "+favorited+", in_reply_to_status_id = "+in_reply_to_status_id+", retweet_count = "+retweet_count+", created_at = "+created_at+", in_reply_to_user_id = "+in_reply_to_user_id+", favorite_count = "+favorite_count+", id_str = "+id_str+", place = "+place+", user = "+user+", coordinates = "+coordinates+"]";
	    }

}
