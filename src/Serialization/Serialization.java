package Serialization;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

public class Serialization implements Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 6500887007763026055L;
	
	
	final transient int x = 10;
	
	public static void main(String[] args) throws IOException, ClassNotFoundException {
		
		FileOutputStream fileOutputStream = new FileOutputStream("abc.txt");
		@SuppressWarnings("resource")
		ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream);
		objectOutputStream.writeObject(new Serialization());
		
		FileInputStream fileInputStream = new FileInputStream("abc.txt");
		@SuppressWarnings("resource")
		ObjectInputStream inputStream = new ObjectInputStream(fileInputStream);
		Serialization serialization =  (Serialization) inputStream.readObject();
		System.out.println(serialization.x);
		
		
	}

}
