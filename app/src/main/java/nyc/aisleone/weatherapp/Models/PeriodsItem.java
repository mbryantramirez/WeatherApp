package nyc.aisleone.weatherapp.Models;

import java.util.List;

public class PeriodsItem{
	private Integer timestamp;
	private String validTime;
	private String dateTimeISO;
	private Integer maxTempC;
	private Integer maxTempF;
	private Integer minTempC;
	private Integer minTempF;
	private Integer avgTempC;
	private Integer avgTempF;
	private Object tempC;
	private Object tempF;
	private Integer pop;
	private Double precipMM;
	private Double precipIN;
	private Object iceaccum;
	private Object iceaccumMM;
	private Object iceaccumIN;
	private Integer maxHumidity;
	private Integer minHumidity;
	private Integer humidity;
	private Object uvi;
	private Integer pressureMB;
	private Double pressureIN;
	private Integer sky;
	private Integer snowCM;
	private Integer snowIN;
	private Integer feelslikeC;
	private Integer feelslikeF;
	private Integer minFeelslikeC;
	private Integer minFeelslikeF;
	private Integer maxFeelslikeC;
	private Integer maxFeelslikeF;
	private Integer avgFeelslikeC;
	private Integer avgFeelslikeF;
	private Integer dewpointC;
	private Integer dewpointF;
	private Integer maxDewpointC;
	private Integer maxDewpointF;
	private Integer minDewpointC;
	private Integer minDewpointF;
	private Integer avgDewpointC;
	private Integer avgDewpointF;
	private Integer windDirDEG;
	private String windDir;
	private Integer windDirMaxDEG;
	private String windDirMax;
	private Integer windDirMinDEG;
	private String windDirMin;
	private Integer windGustKTS;
	private Integer windGustKPH;
	private Integer windGustMPH;
	private Integer windSpeedKTS;
	private Integer windSpeedKPH;
	private Integer windSpeedMPH;
	private Integer windSpeedMaxKTS;
	private Integer windSpeedMaxKPH;
	private Integer windSpeedMaxMPH;
	private Integer windSpeedMinKTS;
	private Integer windSpeedMinKPH;
	private Integer windSpeedMinMPH;
	private Integer windDir80mDEG;
	private String windDir80m;
	private Integer windDirMax80mDEG;
	private String windDirMax80m;
	private Integer windDirMin80mDEG;
	private String windDirMin80m;
	private Integer windGust80mKTS;
	private Integer windGust80mKPH;
	private Integer windGust80mMPH;
	private Integer windSpeed80mKTS;
	private Integer windSpeed80mKPH;
	private Integer windSpeed80mMPH;
	private Integer windSpeedMax80mKTS;
	private Integer windSpeedMax80mKPH;
	private Integer windSpeedMax80mMPH;
	private Integer windSpeedMin80mKTS;
	private Integer windSpeedMin80mKPH;
	private Integer windSpeedMin80mMPH;
	private String weather;
	private List<WeatherCoded> weatherCoded = null;
	private String weatherPrimary;
	private String weatherPrimaryCoded;
	private String cloudsCoded;
	private String icon;
	private Boolean isDay;
	private Integer sunrise;
	private String sunriseISO;
	private Integer sunset;
	private String sunsetISO;

	public Integer getTimestamp() {
		return timestamp;
	}

	public void setTimestamp(Integer timestamp) {
		this.timestamp = timestamp;
	}

	public String getValidTime() {
		return validTime;
	}

	public void setValidTime(String validTime) {
		this.validTime = validTime;
	}

	public String getDateTimeISO() {
		return dateTimeISO;
	}

	public void setDateTimeISO(String dateTimeISO) {
		this.dateTimeISO = dateTimeISO;
	}

	public Integer getMaxTempC() {
		return maxTempC;
	}

	public void setMaxTempC(Integer maxTempC) {
		this.maxTempC = maxTempC;
	}

	public Integer getMaxTempF() {
		return maxTempF;
	}

	public void setMaxTempF(Integer maxTempF) {
		this.maxTempF = maxTempF;
	}

	public Integer getMinTempC() {
		return minTempC;
	}

	public void setMinTempC(Integer minTempC) {
		this.minTempC = minTempC;
	}

	public Integer getMinTempF() {
		return minTempF;
	}

	public void setMinTempF(Integer minTempF) {
		this.minTempF = minTempF;
	}

	public Integer getAvgTempC() {
		return avgTempC;
	}

	public void setAvgTempC(Integer avgTempC) {
		this.avgTempC = avgTempC;
	}

	public Integer getAvgTempF() {
		return avgTempF;
	}

	public void setAvgTempF(Integer avgTempF) {
		this.avgTempF = avgTempF;
	}

	public Object getTempC() {
		return tempC;
	}

	public void setTempC(Object tempC) {
		this.tempC = tempC;
	}

	public Object getTempF() {
		return tempF;
	}

	public void setTempF(Object tempF) {
		this.tempF = tempF;
	}

	public Integer getPop() {
		return pop;
	}

	public void setPop(Integer pop) {
		this.pop = pop;
	}

	public Double getPrecipMM() {
		return precipMM;
	}

	public void setPrecipMM(Double precipMM) {
		this.precipMM = precipMM;
	}

	public Double getPrecipIN() {
		return precipIN;
	}

	public void setPrecipIN(Double precipIN) {
		this.precipIN = precipIN;
	}

	public Object getIceaccum() {
		return iceaccum;
	}

	public void setIceaccum(Object iceaccum) {
		this.iceaccum = iceaccum;
	}

	public Object getIceaccumMM() {
		return iceaccumMM;
	}

	public void setIceaccumMM(Object iceaccumMM) {
		this.iceaccumMM = iceaccumMM;
	}

	public Object getIceaccumIN() {
		return iceaccumIN;
	}

	public void setIceaccumIN(Object iceaccumIN) {
		this.iceaccumIN = iceaccumIN;
	}

	public Integer getMaxHumidity() {
		return maxHumidity;
	}

	public void setMaxHumidity(Integer maxHumidity) {
		this.maxHumidity = maxHumidity;
	}

	public Integer getMinHumidity() {
		return minHumidity;
	}

	public void setMinHumidity(Integer minHumidity) {
		this.minHumidity = minHumidity;
	}

	public Integer getHumidity() {
		return humidity;
	}

	public void setHumidity(Integer humidity) {
		this.humidity = humidity;
	}

	public Object getUvi() {
		return uvi;
	}

	public void setUvi(Object uvi) {
		this.uvi = uvi;
	}

	public Integer getPressureMB() {
		return pressureMB;
	}

	public void setPressureMB(Integer pressureMB) {
		this.pressureMB = pressureMB;
	}

	public Double getPressureIN() {
		return pressureIN;
	}

	public void setPressureIN(Double pressureIN) {
		this.pressureIN = pressureIN;
	}

	public Integer getSky() {
		return sky;
	}

	public void setSky(Integer sky) {
		this.sky = sky;
	}

	public Integer getSnowCM() {
		return snowCM;
	}

	public void setSnowCM(Integer snowCM) {
		this.snowCM = snowCM;
	}

	public Integer getSnowIN() {
		return snowIN;
	}

	public void setSnowIN(Integer snowIN) {
		this.snowIN = snowIN;
	}

	public Integer getFeelslikeC() {
		return feelslikeC;
	}

	public void setFeelslikeC(Integer feelslikeC) {
		this.feelslikeC = feelslikeC;
	}

	public Integer getFeelslikeF() {
		return feelslikeF;
	}

	public void setFeelslikeF(Integer feelslikeF) {
		this.feelslikeF = feelslikeF;
	}

	public Integer getMinFeelslikeC() {
		return minFeelslikeC;
	}

	public void setMinFeelslikeC(Integer minFeelslikeC) {
		this.minFeelslikeC = minFeelslikeC;
	}

	public Integer getMinFeelslikeF() {
		return minFeelslikeF;
	}

	public void setMinFeelslikeF(Integer minFeelslikeF) {
		this.minFeelslikeF = minFeelslikeF;
	}

	public Integer getMaxFeelslikeC() {
		return maxFeelslikeC;
	}

	public void setMaxFeelslikeC(Integer maxFeelslikeC) {
		this.maxFeelslikeC = maxFeelslikeC;
	}

	public Integer getMaxFeelslikeF() {
		return maxFeelslikeF;
	}

	public void setMaxFeelslikeF(Integer maxFeelslikeF) {
		this.maxFeelslikeF = maxFeelslikeF;
	}

	public Integer getAvgFeelslikeC() {
		return avgFeelslikeC;
	}

	public void setAvgFeelslikeC(Integer avgFeelslikeC) {
		this.avgFeelslikeC = avgFeelslikeC;
	}

	public Integer getAvgFeelslikeF() {
		return avgFeelslikeF;
	}

	public void setAvgFeelslikeF(Integer avgFeelslikeF) {
		this.avgFeelslikeF = avgFeelslikeF;
	}

	public Integer getDewpointC() {
		return dewpointC;
	}

	public void setDewpointC(Integer dewpointC) {
		this.dewpointC = dewpointC;
	}

	public Integer getDewpointF() {
		return dewpointF;
	}

	public void setDewpointF(Integer dewpointF) {
		this.dewpointF = dewpointF;
	}

	public Integer getMaxDewpointC() {
		return maxDewpointC;
	}

	public void setMaxDewpointC(Integer maxDewpointC) {
		this.maxDewpointC = maxDewpointC;
	}

	public Integer getMaxDewpointF() {
		return maxDewpointF;
	}

	public void setMaxDewpointF(Integer maxDewpointF) {
		this.maxDewpointF = maxDewpointF;
	}

	public Integer getMinDewpointC() {
		return minDewpointC;
	}

	public void setMinDewpointC(Integer minDewpointC) {
		this.minDewpointC = minDewpointC;
	}

	public Integer getMinDewpointF() {
		return minDewpointF;
	}

	public void setMinDewpointF(Integer minDewpointF) {
		this.minDewpointF = minDewpointF;
	}

	public Integer getAvgDewpointC() {
		return avgDewpointC;
	}

	public void setAvgDewpointC(Integer avgDewpointC) {
		this.avgDewpointC = avgDewpointC;
	}

	public Integer getAvgDewpointF() {
		return avgDewpointF;
	}

	public void setAvgDewpointF(Integer avgDewpointF) {
		this.avgDewpointF = avgDewpointF;
	}

	public Integer getWindDirDEG() {
		return windDirDEG;
	}

	public void setWindDirDEG(Integer windDirDEG) {
		this.windDirDEG = windDirDEG;
	}

	public String getWindDir() {
		return windDir;
	}

	public void setWindDir(String windDir) {
		this.windDir = windDir;
	}

	public Integer getWindDirMaxDEG() {
		return windDirMaxDEG;
	}

	public void setWindDirMaxDEG(Integer windDirMaxDEG) {
		this.windDirMaxDEG = windDirMaxDEG;
	}

	public String getWindDirMax() {
		return windDirMax;
	}

	public void setWindDirMax(String windDirMax) {
		this.windDirMax = windDirMax;
	}

	public Integer getWindDirMinDEG() {
		return windDirMinDEG;
	}

	public void setWindDirMinDEG(Integer windDirMinDEG) {
		this.windDirMinDEG = windDirMinDEG;
	}

	public String getWindDirMin() {
		return windDirMin;
	}

	public void setWindDirMin(String windDirMin) {
		this.windDirMin = windDirMin;
	}

	public Integer getWindGustKTS() {
		return windGustKTS;
	}

	public void setWindGustKTS(Integer windGustKTS) {
		this.windGustKTS = windGustKTS;
	}

	public Integer getWindGustKPH() {
		return windGustKPH;
	}

	public void setWindGustKPH(Integer windGustKPH) {
		this.windGustKPH = windGustKPH;
	}

	public Integer getWindGustMPH() {
		return windGustMPH;
	}

	public void setWindGustMPH(Integer windGustMPH) {
		this.windGustMPH = windGustMPH;
	}

	public Integer getWindSpeedKTS() {
		return windSpeedKTS;
	}

	public void setWindSpeedKTS(Integer windSpeedKTS) {
		this.windSpeedKTS = windSpeedKTS;
	}

	public Integer getWindSpeedKPH() {
		return windSpeedKPH;
	}

	public void setWindSpeedKPH(Integer windSpeedKPH) {
		this.windSpeedKPH = windSpeedKPH;
	}

	public Integer getWindSpeedMPH() {
		return windSpeedMPH;
	}

	public void setWindSpeedMPH(Integer windSpeedMPH) {
		this.windSpeedMPH = windSpeedMPH;
	}

	public Integer getWindSpeedMaxKTS() {
		return windSpeedMaxKTS;
	}

	public void setWindSpeedMaxKTS(Integer windSpeedMaxKTS) {
		this.windSpeedMaxKTS = windSpeedMaxKTS;
	}

	public Integer getWindSpeedMaxKPH() {
		return windSpeedMaxKPH;
	}

	public void setWindSpeedMaxKPH(Integer windSpeedMaxKPH) {
		this.windSpeedMaxKPH = windSpeedMaxKPH;
	}

	public Integer getWindSpeedMaxMPH() {
		return windSpeedMaxMPH;
	}

	public void setWindSpeedMaxMPH(Integer windSpeedMaxMPH) {
		this.windSpeedMaxMPH = windSpeedMaxMPH;
	}

	public Integer getWindSpeedMinKTS() {
		return windSpeedMinKTS;
	}

	public void setWindSpeedMinKTS(Integer windSpeedMinKTS) {
		this.windSpeedMinKTS = windSpeedMinKTS;
	}

	public Integer getWindSpeedMinKPH() {
		return windSpeedMinKPH;
	}

	public void setWindSpeedMinKPH(Integer windSpeedMinKPH) {
		this.windSpeedMinKPH = windSpeedMinKPH;
	}

	public Integer getWindSpeedMinMPH() {
		return windSpeedMinMPH;
	}

	public void setWindSpeedMinMPH(Integer windSpeedMinMPH) {
		this.windSpeedMinMPH = windSpeedMinMPH;
	}

	public Integer getWindDir80mDEG() {
		return windDir80mDEG;
	}

	public void setWindDir80mDEG(Integer windDir80mDEG) {
		this.windDir80mDEG = windDir80mDEG;
	}

	public String getWindDir80m() {
		return windDir80m;
	}

	public void setWindDir80m(String windDir80m) {
		this.windDir80m = windDir80m;
	}

	public Integer getWindDirMax80mDEG() {
		return windDirMax80mDEG;
	}

	public void setWindDirMax80mDEG(Integer windDirMax80mDEG) {
		this.windDirMax80mDEG = windDirMax80mDEG;
	}

	public String getWindDirMax80m() {
		return windDirMax80m;
	}

	public void setWindDirMax80m(String windDirMax80m) {
		this.windDirMax80m = windDirMax80m;
	}

	public Integer getWindDirMin80mDEG() {
		return windDirMin80mDEG;
	}

	public void setWindDirMin80mDEG(Integer windDirMin80mDEG) {
		this.windDirMin80mDEG = windDirMin80mDEG;
	}

	public String getWindDirMin80m() {
		return windDirMin80m;
	}

	public void setWindDirMin80m(String windDirMin80m) {
		this.windDirMin80m = windDirMin80m;
	}

	public Integer getWindGust80mKTS() {
		return windGust80mKTS;
	}

	public void setWindGust80mKTS(Integer windGust80mKTS) {
		this.windGust80mKTS = windGust80mKTS;
	}

	public Integer getWindGust80mKPH() {
		return windGust80mKPH;
	}

	public void setWindGust80mKPH(Integer windGust80mKPH) {
		this.windGust80mKPH = windGust80mKPH;
	}

	public Integer getWindGust80mMPH() {
		return windGust80mMPH;
	}

	public void setWindGust80mMPH(Integer windGust80mMPH) {
		this.windGust80mMPH = windGust80mMPH;
	}

	public Integer getWindSpeed80mKTS() {
		return windSpeed80mKTS;
	}

	public void setWindSpeed80mKTS(Integer windSpeed80mKTS) {
		this.windSpeed80mKTS = windSpeed80mKTS;
	}

	public Integer getWindSpeed80mKPH() {
		return windSpeed80mKPH;
	}

	public void setWindSpeed80mKPH(Integer windSpeed80mKPH) {
		this.windSpeed80mKPH = windSpeed80mKPH;
	}

	public Integer getWindSpeed80mMPH() {
		return windSpeed80mMPH;
	}

	public void setWindSpeed80mMPH(Integer windSpeed80mMPH) {
		this.windSpeed80mMPH = windSpeed80mMPH;
	}

	public Integer getWindSpeedMax80mKTS() {
		return windSpeedMax80mKTS;
	}

	public void setWindSpeedMax80mKTS(Integer windSpeedMax80mKTS) {
		this.windSpeedMax80mKTS = windSpeedMax80mKTS;
	}

	public Integer getWindSpeedMax80mKPH() {
		return windSpeedMax80mKPH;
	}

	public void setWindSpeedMax80mKPH(Integer windSpeedMax80mKPH) {
		this.windSpeedMax80mKPH = windSpeedMax80mKPH;
	}

	public Integer getWindSpeedMax80mMPH() {
		return windSpeedMax80mMPH;
	}

	public void setWindSpeedMax80mMPH(Integer windSpeedMax80mMPH) {
		this.windSpeedMax80mMPH = windSpeedMax80mMPH;
	}

	public Integer getWindSpeedMin80mKTS() {
		return windSpeedMin80mKTS;
	}

	public void setWindSpeedMin80mKTS(Integer windSpeedMin80mKTS) {
		this.windSpeedMin80mKTS = windSpeedMin80mKTS;
	}

	public Integer getWindSpeedMin80mKPH() {
		return windSpeedMin80mKPH;
	}

	public void setWindSpeedMin80mKPH(Integer windSpeedMin80mKPH) {
		this.windSpeedMin80mKPH = windSpeedMin80mKPH;
	}

	public Integer getWindSpeedMin80mMPH() {
		return windSpeedMin80mMPH;
	}

	public void setWindSpeedMin80mMPH(Integer windSpeedMin80mMPH) {
		this.windSpeedMin80mMPH = windSpeedMin80mMPH;
	}

	public String getWeather() {
		return weather;
	}

	public void setWeather(String weather) {
		this.weather = weather;
	}

	public List<WeatherCoded> getWeatherCoded() {
		return weatherCoded;
	}

	public void setWeatherCoded(List<WeatherCoded> weatherCoded) {
		this.weatherCoded = weatherCoded;
	}

	public String getWeatherPrimary() {
		return weatherPrimary;
	}

	public void setWeatherPrimary(String weatherPrimary) {
		this.weatherPrimary = weatherPrimary;
	}

	public String getWeatherPrimaryCoded() {
		return weatherPrimaryCoded;
	}

	public void setWeatherPrimaryCoded(String weatherPrimaryCoded) {
		this.weatherPrimaryCoded = weatherPrimaryCoded;
	}

	public String getCloudsCoded() {
		return cloudsCoded;
	}

	public void setCloudsCoded(String cloudsCoded) {
		this.cloudsCoded = cloudsCoded;
	}

	public String getIcon() {
		return icon;
	}

	public void setIcon(String icon) {
		this.icon = icon;
	}

	public Boolean getIsDay() {
		return isDay;
	}

	public void setIsDay(Boolean isDay) {
		this.isDay = isDay;
	}

	public Integer getSunrise() {
		return sunrise;
	}

	public void setSunrise(Integer sunrise) {
		this.sunrise = sunrise;
	}

	public String getSunriseISO() {
		return sunriseISO;
	}

	public void setSunriseISO(String sunriseISO) {
		this.sunriseISO = sunriseISO;
	}

	public Integer getSunset() {
		return sunset;
	}

	public void setSunset(Integer sunset) {
		this.sunset = sunset;
	}

	public String getSunsetISO() {
		return sunsetISO;
	}

	public void setSunsetISO(String sunsetISO) {
		this.sunsetISO = sunsetISO;
	}

}
class WeatherCoded {

	private Integer timestamp;
	private String wx;
	private String dateTimeISO;

	public Integer getTimestamp() {
		return timestamp;
	}

	public void setTimestamp(Integer timestamp) {
		this.timestamp = timestamp;
	}

	public String getWx() {
		return wx;
	}

	public void setWx(String wx) {
		this.wx = wx;
	}

	public String getDateTimeISO() {
		return dateTimeISO;
	}

	public void setDateTimeISO(String dateTimeISO) {
		this.dateTimeISO = dateTimeISO;
	}
}