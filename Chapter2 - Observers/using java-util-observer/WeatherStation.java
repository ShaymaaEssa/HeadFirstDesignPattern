package chapter2;

public class WeatherStation {

	
	
	public static void main (String [] args){
		WeatherData weatherData  = new WeatherData();
		
		CurrentConditionDisplay currentConditionDisplay = new CurrentConditionDisplay(weatherData);
		ForecastDisplay forecastDisplay = new ForecastDisplay(weatherData);
		StatisticsDisplay statisticsDisplay = new StatisticsDisplay(weatherData);
		
		weatherData.setMeasurements(80, 70, 60);
		weatherData.setMeasurements(1000, 700, 600);
		
	
	}
}
