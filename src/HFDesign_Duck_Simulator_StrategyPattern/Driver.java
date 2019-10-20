package HFDesign_Duck_Simulator_StrategyPattern;

public class Driver {

	public static void main(String[] args) {

		Duck mallard = new MallardDuck();
		mallard.performFly();
		mallard.performQuack();
		
		Duck model = new ModelDuck();
		model.performFly();
		model.performQuack();
		
		model.setFlyBehaviour(new RocketFlying());
		
		model.performFly();
		
	}

}
