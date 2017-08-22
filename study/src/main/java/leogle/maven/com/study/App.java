package leogle.maven.com.study;

import java.util.UUID;

/**
 * Hello world!
 *
 */
public class App {
	public static void main(String[] args) {
		System.out.println("Hello World!");
		App obj = new App();
		System.out.println("Unique ID:" + obj.generateUniqueKey());
	}

	public String generateUniqueKey() {
		String uuid = UUID.randomUUID().toString();
		return uuid;
	}
}
