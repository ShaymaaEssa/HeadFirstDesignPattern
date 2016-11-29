package chapter2;



//this interface to represent subject methods

public interface SubjectInterface {

	public void registerObserver(Observer observer);
	public void removeObserver(Observer observer);
	public void notifyObserver();
	
}
