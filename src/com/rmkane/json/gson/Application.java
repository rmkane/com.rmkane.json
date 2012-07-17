package com.rmkane.json.gson;

import java.util.ArrayList;

public class Application {
	
	public static void main(String... args) {
		Json json = Json.getInstance();

		/*
		BookmarkManager bookmark_manager = new BookmarkManager();
		Roots roots = new Roots();
		BookmarkBar bookmark_bar = new BookmarkBar();
		Folder f0 = new Folder("Programming");
		Bookmark b0 = new Bookmark("Git", "http://www.github.com");
		Bookmark b1 = new Bookmark("DreamInCode", "http://www.dreamincode.net");
		Folder f1 = new Folder("Shopping");
		Bookmark b2 = new Bookmark("Amazon", "http://www.amazon.com");
		Bookmark b3 = new Bookmark("Zappos", "http://www.zappos.com");
		Bookmark b4 = new Bookmark("Apple", "http://www.apple.com");
		
		f0.add(b0);
		f0.add(b1);
		f1.add(b2);
		f1.add(b3);
		
		bookmark_bar.add(f0);
		bookmark_bar.add(f1);
		bookmark_bar.add(b4);
		
		roots.setBookmark_bar(bookmark_bar);
		
		bookmark_manager.setChecksum("GoOgLe");
		bookmark_manager.setRoots(roots);
		bookmark_manager.setVersion("1");

		String jsonString = json.toJson(bookmark_manager);
		System.out.println(bookmark_manager+"\n");
		System.out.println(jsonString);
		*/
		
		String bookmarks = getBookmarks();
		BookmarkManager bm = json.fromJson(bookmarks, BookmarkManager.class);
		Roots r = bm.getRoots();
		BookmarkBar bb = r.getBookmark_bar();
		ArrayList<Child> c1 = bb.getChildren();
		Child c2 = c1.get(3);
		ArrayList<Child> c3 = c2.getChildren();
		Child c4 = c3.get(4);
		System.out.println(c4);
		
		String jsonString = json.toJson(c4);
		System.out.println(jsonString);
	}

	public static String getBookmarks() {
		String localAppData = System.getenv("APPDATA") + "/../Local/";
		String chromeUserData = "Google/Chrome/User Data/Default/";
		String bookmarks = localAppData + chromeUserData + "Bookmarks";
		return Json.getInstance().parse(bookmarks, true);
	}
}