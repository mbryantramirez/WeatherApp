package nyc.aisleone.weatherapp.Models;

import java.util.List;

public class Forecast{
	private boolean success;
	private List<ResponseItem> response;
	private Object error;

	public boolean isSuccess(){
		return success;
	}

	public List<ResponseItem> getResponse(){
		return response;
	}

	public Object getError(){
		return error;
	}

	@Override
 	public String toString(){
		return 
			"Forecast{" + 
			"success = '" + success + '\'' + 
			",response = '" + response + '\'' + 
			",error = '" + error + '\'' + 
			"}";
		}
}