package nyc.aisleone.weatherapp.Utils;

import nyc.aisleone.weatherapp.Models.Forecast;
import retrofit2.Call;
import retrofit2.http.GET;

public interface WeatherService {

  @GET("forecasts/11101?client_id=uyeQJZtjtLvowWFstsk7v&client_secret=Y0bc6tCdUpzmEkW8MeNyRowcwI7d7GQphPBmcjxe")
  Call<Forecast> getWeatherForecast();
}
