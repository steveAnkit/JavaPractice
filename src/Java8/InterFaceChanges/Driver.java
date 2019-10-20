package Java8.InterFaceChanges;

public class Driver {

	public static void main(String[] args) {
		

		MyInterface myInterface = new ImplementingClass1();
		myInterface.newMethod();
		myInterface.testMessage();
		MyInterface.staticMethod();
		
		
	}

}
