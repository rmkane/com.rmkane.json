package com.rmkane.json.gson;

public class BookmarkManager {

	String checksum, version;
	Roots roots;

	public BookmarkManager() {
		setChecksum("");
		setRoots(new Roots());
		setVersion("");
	}

	public BookmarkManager(String checksum, Roots roots, String version) {
		setChecksum(checksum);
		setRoots(roots);
		setVersion(version);
	}

	public String getChecksum() {
		return checksum;
	}

	public void setChecksum(String checksum) {
		this.checksum = checksum;
	}

	public Roots getRoots() {
		return roots;
	}

	public void setRoots(Roots roots) {
		this.roots = roots;
	}

	public String getVersion() {
		return version;
	}

	public void setVersion(String version) {
		this.version = version;
	}

	@Override
	public String toString() {
		return "{ checksum='" + checksum + "', roots='"
		    + roots + "', version='" + version + "'}";
	}

}
