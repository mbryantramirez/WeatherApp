package nyc.aisleone.weatherapp.Models;

public class Loc{
	private double mlong;
	private double lat;

	public double getMlong(){
		return mlong;
	}

	public double getLat(){
		return lat;
	}

	@Override
 	public String toString(){
		return 
			"Loc{" + 
			"long = '" + mlong + '\'' +
			",lat = '" + lat + '\'' + 
			"}";
		}
}
