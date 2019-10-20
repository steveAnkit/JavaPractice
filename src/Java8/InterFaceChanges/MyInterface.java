package Java8.InterFaceChanges;

public interface MyInterface {
	
	public void testMessage();
	
	//not availbale in Java 7
	default void newMethod()
	{
		System.out.println("from default method");
	}

	
	static void staticMethod()
	{
		System.out.println("this is static method");
	}
	
}
