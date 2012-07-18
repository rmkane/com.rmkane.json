package com.rmkane.json;

public class Roots {

	BookmarkBar bookmark_bar;
	BookmarkBar other; // ** Not going to implement yet
	BookmarkBar synced; // * Same ^

	public Roots() {
		setBookmark_bar(new BookmarkBar());
	}

	public Roots(BookmarkBar bookmark_bar) {
		setBookmark_bar(bookmark_bar);
	}

	public BookmarkBar getBookmark_bar() {
		return bookmark_bar;
	}

	public void setBookmark_bar(BookmarkBar bookmark_bar) {
		this.bookmark_bar = bookmark_bar;
	}

	@Override
	public String toString() {
		return "roots': { " + bookmark_bar + "]";
	}
}
