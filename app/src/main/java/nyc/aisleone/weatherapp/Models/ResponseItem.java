package nyc.aisleone.weatherapp.Models;

import java.util.List;

public class ResponseItem{
	private Loc loc;
	private Profile profile;
	private List<PeriodsItem> periods;
	private String interval;

	public Loc getLoc(){
		return loc;
	}

	public Profile getProfile(){
		return profile;
	}

	public List<PeriodsItem> getPeriods(){
		return periods;
	}

	public String getInterval(){
		return interval;
	}

	@Override
 	public String toString(){
		return 
			"ResponseItem{" + 
			"loc = '" + loc + '\'' + 
			",profile = '" + profile + '\'' + 
			",periods = '" + periods + '\'' + 
			",interval = '" + interval + '\'' + 
			"}";
		}
}