package junit.runner;

/**
 * This class defines the current version of JUnit
 */
public class Version {
	private Version() {
		// don't instantiate
	}

	public static String id() {
<<<<<<< HEAD
		return "4.13-SNAPSHOT";
=======
		return "4.12";
>>>>>>> refs/heads/greater
	}
	
	public static void main(String[] args) {
		System.out.println(id());
	}
}
