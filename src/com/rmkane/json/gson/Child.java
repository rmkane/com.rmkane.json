package com.rmkane.json.gson;

import java.util.ArrayList;

public class Child {

	String date_added, id, name, type, url, date_modified;
	ArrayList<Child> children;

	public Child() {
		setDate_added("");
		setId("");
		setName("");
		setType("");
		
	}
	
	public Child(String type, String name) {
		setDate_added("");
		setId("");
		setName(name);
		setType(type);
		
		if (type.equals("url")) {
			setUrl("");
		} else if(type.equals("folder")) {
			setDate_modified("");
			setChildren(new ArrayList<Child>());
		} else {
			
		}
	}

	public Child(String date_added, String id, String name, String type, String url, String date_modified, ArrayList<Child> children) {
		setDate_added(date_added);
		setId(id);
		setName(name);
		setType(type);
		if (type.equals("url")) {
			setUrl(url);
		} else if(type.equals("folder")) {
			setDate_modified(date_modified);
			setChildren(children);
		} else {
			
		}
	}

	public String getDate_added() {
		return date_added;
	}

	public void setDate_added(String date_added) {
		this.date_added = date_added;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getUrl() {
		return url;
	}

	public void setUrl(String url) {
		this.url = url;
	}

	public String getDate_modified() {
		return date_modified;
	}

	public void setDate_modified(String date_modified) {
		this.date_modified = date_modified;
	}

	public ArrayList<Child> getChildren() {
		return children;
	}

	public void setChildren(ArrayList<Child> children) {
		this.children = children;
	}

	@Override
	public String toString() {
		return "'child': {date_added='" + date_added + "', id=" + id + "', name='"
				+ name + "', type='" + type + "', url='" + url + "', date_modified='"
				+ date_modified + "', children='" + children + "'}";
	}
	
	
}
