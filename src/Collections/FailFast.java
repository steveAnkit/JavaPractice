package Collections;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class FailFast {

	public static void main(String[] args) {
		
		List<Integer> list = new ArrayList<Integer>();
		
		list.add(1);
		list.add(2);
		list.add(3);
		list.add(4);
		
		System.out.println(list);
		
		Iterator<Integer> iterator = list.iterator();
		
		while (iterator.hasNext()) {
			Integer integer = (Integer) iterator.next();
			System.out.println(integer);
			list.add(10);
		}
		System.out.println("***************************");
		
		  ListIterator<Integer> listIterator = list.listIterator(); 
		  while(listIterator.hasNext())
		  {
			listIterator.add(10);
			listIterator.remove();
			Integer integer = (Integer) listIterator.next();
			System.out.println(integer);
		  
		  }
		 

	}

}
