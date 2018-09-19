package nyc.aisleone.weatherapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.widget.TextView;
import java.util.List;
import nyc.aisleone.weatherapp.Models.Forecast;
import nyc.aisleone.weatherapp.Models.PeriodsItem;
import nyc.aisleone.weatherapp.Utils.Retrofit2Client;
import nyc.aisleone.weatherapp.Utils.WeatherService;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;

public class MainActivity extends AppCompatActivity {

  static final String TAG = "DICKS";
  TextView dateTime;
  TextView maxTemp;
  TextView minTemp;
  private RecyclerView forecastRecyclerView;
  private RecyclerView.Adapter forecastAdapter;
  private RecyclerView.LayoutManager layoutManager;

  @Override
  protected void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_main);
    forecastRecyclerView = findViewById(R.id.forecase_rv);

    layoutManager = new LinearLayoutManager(this,LinearLayoutManager.VERTICAL,false);
    forecastRecyclerView.setLayoutManager(layoutManager);


    Call<Forecast> forecastCall = Retrofit2Client.getInstance().getWeatherService().getWeatherForecast();

    forecastCall.enqueue(new Callback<Forecast>() {
      @Override public void onResponse(Call<Forecast> call, Response<Forecast> response) {
        if(response.isSuccessful()){
          Forecast forecast = response.body();
          generateWeather(forecast);
        }
      }

      @Override public void onFailure(Call<Forecast> call, Throwable t) {
        Log.d(TAG, "onFailure: "+t.getMessage());
      }
    });
  }

  private void generateWeather(Forecast forecast) {
    List<PeriodsItem> periodsItems = forecast.getResponse().get(0).getPeriods();
    forecastAdapter = new ForecastAdapter(periodsItems);
    forecastRecyclerView.setAdapter(forecastAdapter);
  }
}
