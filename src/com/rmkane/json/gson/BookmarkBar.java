package com.rmkane.json.gson;

public class BookmarkBar extends Folder {

	public BookmarkBar() {
		super();
		setName("Bookmarks bar");
		setType("folder");
	}
	
	public BookmarkBar(Children children) {
		super();
		setChildren(children);
		setName("Bookmarks bar");
		setType("folder");
		
	}
	
	public BookmarkBar (Children children, String date_added, String date_modified,
	    String id, String name, String type) {
		super(children, date_added, date_modified, id, name, type);
	}

	@Override
  public String toString() {
	  return "'bookmark_bar': { 'children': " + children + "}";
  }
}
