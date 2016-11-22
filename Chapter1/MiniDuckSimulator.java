package headfirst2008;

public class MiniDuckSimulator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Duck [] duck = {new MaralldDuck() , new RedHeadDuck() , new ModelDuck()};
		for (Duck item : duck){
			item.display();
			item.performQuack();
			item.performFly();
		}
	}

}
