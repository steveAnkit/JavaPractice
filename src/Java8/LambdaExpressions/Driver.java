package Java8.LambdaExpressions;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Driver {
	
	public static void main(String[] args) {
		
		MyFunctionalInterface msg = () -> {
			
			return "hello";
		};
		
		
		System.out.println(msg.sayHello());
		
		List<String> list=new ArrayList<String>();  
	       list.add("Rick");         
	       list.add("Negan");       
	       list.add("Daryl");         
	       list.add("Glenn");         
	       list.add("Carl");     
	       
	       //iteration on list
	       list.forEach(
	    		   (names) -> System.out.println(names)
	    		   );
	       
	       
	       Map<String, Integer> prices = new HashMap<>();
			prices.put("Apple", 50);
			prices.put("Orange", 20);
			prices.put("Banana", 10);
			prices.put("Grapes", 40);
			prices.put("Papaya", 50);
			
			// iterate over map
			prices.forEach(
					(K,V) -> System.out.println("Key: " + K + ", value: " + V)
					);
			
			
			long count = list.stream().filter(str -> str.length()<6).count();
			System.out.println(count);
	       
	}

}
