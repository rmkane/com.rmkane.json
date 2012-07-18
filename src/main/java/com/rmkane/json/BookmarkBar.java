package com.rmkane.json;

import java.util.ArrayList;

public class BookmarkBar extends Child {

	public BookmarkBar() {
		super("folder", "Bookmarks bar");
	}
	
	public BookmarkBar(ArrayList<Child> children) {
		super("folder", "Bookmarks bar");
		setChildren(children);
		setType("folder");
		
	}
	
	public BookmarkBar (String date_added, String id, String name, String type, String url, String date_modified, ArrayList<Child> children) {
		super(date_added, id, name, type, null, date_modified, children);
	}

	@Override
  public String toString() {
	  return "'bookmark_bar': { 'children': " + children + "}";
  }
}
