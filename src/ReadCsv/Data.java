package ReadCsv;

public class Data {

	private String city;
	
	private String country;
	
	private String capital;
	

	public Data()
	{
		
	}
	
	
	public Data(String city, String country, String capital) {
		super();
		this.city = city;
		this.country = country;
		this.capital = capital;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public String getCapital() {
		return capital;
	}

	public void setCapital(String capital) {
		this.capital = capital;
	}

}
