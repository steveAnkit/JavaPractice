/**
 * 
 */
package HFDesign_Duck_Simulator_StrategyPattern;

/**
 * @author Ankit Sharma
 *
 */
public class ModelDuck extends Duck{
	
	public ModelDuck()
	{
		quackBehaviour = new MallardQuack();
		flyBehaviour = new FlyNoWay();
	}

	@Override
	public void display() {
		
		System.out.println("Model duck display");
		
	}

}
