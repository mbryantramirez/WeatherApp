package nyc.aisleone.weatherapp.Utils;

import okhttp3.OkHttpClient;
import okhttp3.logging.HttpLoggingInterceptor;
import retrofit2.Retrofit;
import retrofit2.converter.moshi.MoshiConverterFactory;

public class Retrofit2Client {

  private static Retrofit2Client instance = null;
  private Retrofit retrofit;
  private OkHttpClient client;
  private WeatherService weatherService;
  private static final String API_URL = "http://api.aerisapi.com/";

  public Retrofit2Client() {
    HttpLoggingInterceptor loggingInterceptor = new HttpLoggingInterceptor();
    loggingInterceptor.setLevel(HttpLoggingInterceptor.Level.BODY);
    OkHttpClient.Builder okHttpBuilder = new OkHttpClient.Builder();
    okHttpBuilder.addInterceptor(loggingInterceptor);
    client = okHttpBuilder.build();

    retrofit = new Retrofit.Builder().baseUrl(API_URL)
        .addConverterFactory(MoshiConverterFactory.create())
        .client(client)
        .build();
    weatherService = retrofit.create(WeatherService.class);
  }

  public static Retrofit2Client getInstance() {
    if (instance == null) {
      instance = new Retrofit2Client();
    }
    return instance;
  }

  public WeatherService getWeatherService() {
    return weatherService;
  }
}
