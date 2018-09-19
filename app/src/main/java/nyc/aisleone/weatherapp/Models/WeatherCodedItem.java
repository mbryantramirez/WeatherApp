package nyc.aisleone.weatherapp.Models;

public class WeatherCodedItem{
	private String dateTimeISO;
	private String wx;
	private int timestamp;

	public String getDateTimeISO(){
		return dateTimeISO;
	}

	public String getWx(){
		return wx;
	}

	public int getTimestamp(){
		return timestamp;
	}

	@Override
 	public String toString(){
		return 
			"WeatherCodedItem{" + 
			"dateTimeISO = '" + dateTimeISO + '\'' + 
			",wx = '" + wx + '\'' + 
			",timestamp = '" + timestamp + '\'' + 
			"}";
		}
}
