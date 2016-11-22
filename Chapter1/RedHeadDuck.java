package headfirst2008;

public class RedHeadDuck extends Duck{

	public RedHeadDuck() {
		// TODO Auto-generated constructor stub
		super(new Squack() , new FlyWithWings());
	}
	@Override
	public void display() {
		// TODO Auto-generated method stub
		System.out.println("It is Redhead Duck");
	}

}
