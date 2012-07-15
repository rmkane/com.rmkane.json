package com.rmkane.json.gson;

public class Bookmark extends Child {

	String url;

	public Bookmark() {
		super();
		setUrl("");
	}

	public Bookmark(String name, String url) {
		super(name);
		setType("url");
		setUrl(url);
	}

	public Bookmark(String date_added, String id, String name, String type,
	    String url) {
		super();
		setDate_added(date_added);
		setId(id);
		setName(name);
		setType(type);
		setUrl(url);
	}

	public String getUrl() {
		return url;
	}

	public void setUrl(String url) {
		this.url = url;
	}

	@Override
	public String toString() {
		return "'bookmark': {date_added='" + date_added + "', id='" + id
		    + "', name='" + name + "', type='" + type + "', url='" + url + "'}";
	}
}
