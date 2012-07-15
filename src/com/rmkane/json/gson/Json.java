package com.rmkane.json.gson;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

import com.google.gson.Gson;

public class Json {
	private final Gson gson;
	private static Json JSON;

	private Json() {
		gson = new Gson();
	}

	public static Json getInstance() {
		if (JSON == null) {
			JSON = new Json();
		}
		return JSON;
	}

	public String toJson(Object t) {
		return gson.toJson(t);
	}

	public <T> T fromJson(String jsonString, Class<T> clazz) {
		return gson.fromJson(jsonString, clazz);
	}

	public String parse(String fileName, boolean slurp) {
		File file = null;
		Scanner scan = null;
		String line = "";
		try {
			file = new File(fileName);
			scan = new Scanner(file);
			while (scan.hasNextLine()) {
				if (slurp)
					line += scan.nextLine().trim();
				else
					line += scan.nextLine() + "\n";
			}
		} catch (FileNotFoundException e) {
			System.out.println("File Not Found: " + e.getMessage());
			return null;
		} finally {
			try {
				scan.close();
			} catch (NullPointerException e) {
				System.out.println("Scanner Empty: " + e.getMessage());
				return null;
			}
		}
		return line;
	}

	public String trimLeft(String str) {
		return str.replace("^\\s+", "");
	}

	public String trimRight(String str) {
		return str.replace("\\s+$", "");
	}

}