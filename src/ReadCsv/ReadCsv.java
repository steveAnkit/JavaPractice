package ReadCsv;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class ReadCsv {
	
	public static void main(String[] args) throws IOException {
		
		
		BufferedReader reader = new BufferedReader(new FileReader("data.csv"));
		String row = null;
		List<Data> datas = new ArrayList<Data>();
 		while ((row = reader.readLine()) != null) {
			
			String[] data = row.split(",");
			
			Data obj = new Data();
			obj.setCity(data[0]);
			obj.setCapital(data[5]);
			obj.setCountry(data[3]);
			datas.add(obj);
			
		}
		
		for (Data data : datas) {
			System.out.println(data.getCity());
		}
		
		reader.close();
		
	}

}
