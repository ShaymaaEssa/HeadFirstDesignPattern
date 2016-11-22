package headfirst2008;

public class ModelDuck extends Duck {

	public ModelDuck() {
		super(new Quack(), new FlyRocketPowered());
		// TODO Auto-generated constructor stub
	}

	@Override
	public void display() {
		// TODO Auto-generated method stub
		System.out.println("It is Model Duck");
	}

}
