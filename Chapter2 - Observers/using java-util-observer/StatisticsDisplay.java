package chapter2;

import java.util.Observable;
import java.util.Observer;

public class StatisticsDisplay implements DisplayInterface,Observer {

	int humedity ;
	int temp;
	Observable weatherData;

	public  StatisticsDisplay(Observable weatherData) {
		// TODO Auto-generated constructor stub
		this.weatherData = weatherData;
		weatherData.addObserver(this);
	}
	
	@Override
	public void display() {
		// TODO Auto-generated method stub
		System.out.println("Statistics Display: wait for download ");
	}

	@Override
	public void update(Observable o, Object arg) {
		// TODO Auto-generated method stub
		this.temp = temp;
		this.humedity = humedity;
		display ();
	}


//	@Override
//	public void update(int temp, int humedity, int pressure) {
//		// TODO Auto-generated method stub
//		this.temp = temp;
//		this.humedity = humedity;
//		display ();
//		
//	}

}
