package HFDesign_Duck_Simulator_StrategyPattern;

public class MallardDuck extends Duck{
	

	public MallardDuck() {
		super();
		
		quackBehaviour = new MallardQuack();
		flyBehaviour = new MallardFly();
	}

	@Override
	public void display() {
		
		System.out.println("MallardDuck Display");
		
	}

	
	

}
