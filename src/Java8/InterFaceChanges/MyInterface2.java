package Java8.InterFaceChanges;

public interface MyInterface2 {

	public void testMessage();

	// not availbale in Java 7
	default void newMethod() {
		System.out.println("Interface 1 : Default method");
	}

}
