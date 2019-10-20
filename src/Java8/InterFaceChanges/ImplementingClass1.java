package Java8.InterFaceChanges;

public class ImplementingClass1 implements MyInterface, MyInterface2{

	@Override
	public void testMessage() {
		
		System.out.println("implemented method");
		
	}

	@Override
	public void newMethod() {
		System.out.println("Default implementation in implementing class");
	}

}
