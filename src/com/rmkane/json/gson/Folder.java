package com.rmkane.json.gson;

public class Folder extends Child {

	Children children;
	String date_modified;

	public Folder() {
		super();
		setChildren(new Children());
		setType("folder");
		setDate_modified("");
	}

	public Folder(String name) {
		super(name);
		setChildren(new Children());
		setType("folder");
		setDate_modified("");
	}

	public Folder(Children children, String date_added, String date_modified,
	    String id, String name, String type) {
		super(date_added, id, name, type);
		setChildren(children);
		setType(type);
		setDate_modified(date_modified);
	}

	public void add(Child child) {
		getChildren().add(child);
	}

	public void remove(Child child) {
		getChildren().remove(child);
	}

	public Children getChildren() {
		return children;
	}

	public void setChildren(Children children) {
		this.children = children;
	}

	public String getDate_modified() {
		return date_modified;
	}

	public void setDate_modified(String date_modified) {
		this.date_modified = date_modified;
	}

	@Override
	public String toString() {
		return "'folder': {" + children + ", date_modified='" + date_modified
		    + "', date_added='" + date_added + "', id='" + id + "', name='" + name
		    + "', type='" + type + "', date_modified='" + date_modified + "]";
	}
}
