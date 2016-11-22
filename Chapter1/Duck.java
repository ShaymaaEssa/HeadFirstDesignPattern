package headfirst2008;

public abstract class Duck {
	
	private QuackBehaviour quackBehaviour;
	private FlyBehaviour flyBehaviour;

	
	
	public Duck(QuackBehaviour quackBehaviour, FlyBehaviour flyBehaviour) {
		super();
		this.quackBehaviour = quackBehaviour;
		this.flyBehaviour = flyBehaviour;
	}
	public  void swim(){
		System.out.println("Swim");
	}
	public abstract void display();
	
	public void performQuack(){
		quackBehaviour.quack();
	}
	public void performFly(){
		flyBehaviour.fly();
	}
	public void setQuackBehaviour(QuackBehaviour quackBehaviour) {
		this.quackBehaviour = quackBehaviour;
	}
	public void setFlyBehaviour(FlyBehaviour flyBehaviour) {
		this.flyBehaviour = flyBehaviour;
	}
	
	
}
