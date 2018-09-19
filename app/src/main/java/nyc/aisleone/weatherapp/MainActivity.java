package nyc.aisleone.weatherapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

  @Override
  protected void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_main);
    String url =
        "http://api.aerisapi.com/forecasts/11101?client_id=uyeQJZtjtLvowWFstsk7v&client_secret=Y0bc6tCdUpzmEkW8MeNyRowcwI7d7GQphPBmcjxe";
  }
}
