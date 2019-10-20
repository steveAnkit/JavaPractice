package HFDesign_Duck_Simulator_StrategyPattern;

public class FlyNoWay implements IFlyBehaviour {

	@Override
	public void fly() {
		
		System.out.println("Do not fly at all");

	}

}
