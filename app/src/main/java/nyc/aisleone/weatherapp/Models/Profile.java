package nyc.aisleone.weatherapp.Models;

public class Profile{
	private String tz;

	public String getTz(){
		return tz;
	}

	@Override
 	public String toString(){
		return 
			"Profile{" + 
			"tz = '" + tz + '\'' + 
			"}";
		}
}
