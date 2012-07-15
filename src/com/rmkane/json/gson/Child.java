package com.rmkane.json.gson;

public class Child {

	String date_added, id, name, type;
	
	public Child() {
		setDate_added("");
	  setId("");
	  setName("");
	  setType("");
	}
	
	public Child(String name) {
	  setDate_added("");
	  setId("");
	  setName(name);
	  setType("url");
  }

	public Child(String date_added, String id, String name, String type) {
	  setDate_added(date_added);
	  setId(id);
	  setName(name);
	  setType(type);
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

	@Override
  public String toString() {
	  return "'child': {date_added='" + date_added + "', id='" + id + "', name='"
	      + name + "', type='" + type + "'}";
  }
}
