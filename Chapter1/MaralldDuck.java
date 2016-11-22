package headfirst2008;

public class MaralldDuck extends Duck {

	public MaralldDuck() {
		// TODO Auto-generated constructor stub
		super(new Quack() , new FlyWithWings());
	}
	@Override
	public void display() {
		// TODO Auto-generated method stub
		System.out.println("It is MaralldDuck");
	}

}
