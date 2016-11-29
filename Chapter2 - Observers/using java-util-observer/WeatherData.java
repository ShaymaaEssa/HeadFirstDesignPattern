package chapter2;

import java.util.ArrayList;
import java.util.Observable;


public class WeatherData extends Observable //implements SubjectInterface
{
	int temperature =10;
	int humidity = 20;
	int pressure = 30;
	
	
	public WeatherData () {
		
	}
	public void measurementChanged(){
		setChanged();
		notifyObservers(this);
		
	}
	public int getTemperature() {
		return temperature;
	}
	public int getHumidity() {
		return humidity;
	}
	public int getPressure() {
		return pressure;
	}
	

//	@Override
//	public void notifyObserver() {
//		// TODO Auto-generated method stub
//		for (Observer item : observers){
//			item.update(temperature, humidity, pressure);
//		}
//		
//	}
//	@Override
//	public void registerObserver(chapter2.Observer observer) {
//		// TODO Auto-generated method stub
//		observers.add(observer);
//		
//	}
//	@Override
//	public void removeObserver(chapter2.Observer observer) {
//		// TODO Auto-generated method stub
//		observers.remove(observer);
//		
//	}
//	
	public void setMeasurements (int temperature, int humidity,int pressure){
		this.temperature = temperature;
		this.humidity = humidity;
		this.pressure = pressure;
		
		measurementChanged();
	}
	
	
	

}
