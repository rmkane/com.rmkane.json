package example;

import example.Person;

public class Application {

	@SuppressWarnings("unused")
	public static void main(String... args) {
		Json json = Json.getInstance();
		System.out.println("Java to Json");

		Person p1 = new Person(1L, "Joe", "Blow");
		String jsonString = json.toJson(p1);
		System.out.println(p1 + "\t-->\t" + jsonString);

		System.out.println("-----------");

		System.out.println("Json to Java");

		String person2JsonString = json.parse("src/person.json", true);
		Person p2 = json.fromJson(person2JsonString, Person.class);
		System.out.println(person2JsonString + "\t-->\t" + p2);

		// dispBookmarks();

	}

	public static void dispBookmarks() {
		String localAppData = System.getenv("APPDATA") + "/../Local/";
		String chromeUserData = "Google/Chrome/User Data/Default/";
		String bookmarks = localAppData + chromeUserData + "Bookmarks";
		System.out.println(Json.getInstance().parse(bookmarks, false));
	}
}