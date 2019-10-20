package ThreadSafeSingelton;

public class Singelton {

	private Singelton() {

	}

	private static volatile Singelton instance = null;

	public static Singelton getInstance() {

		if (instance == null) {
			
			synchronized (Singelton.class) {
				
				if (instance == null) {
					
					instance = new Singelton();
				}

			}
		}
		return instance;
	}

}
