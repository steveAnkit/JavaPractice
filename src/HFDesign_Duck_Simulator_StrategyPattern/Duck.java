package HFDesign_Duck_Simulator_StrategyPattern;

public abstract class Duck {
	
	IFlyBehaviour flyBehaviour;
	
	IQuackBehaviour quackBehaviour;
	
	public abstract void display();

	
	public void performFly()
	{
		flyBehaviour.fly();
	}
	
	public void performQuack()
	{
		quackBehaviour.quack();
	}

	
	public void setFlyBehaviour(IFlyBehaviour behaviour)
	{
		flyBehaviour = behaviour;
	}
	

	public void setQBehaviour(IQuackBehaviour behaviour)
	{
		quackBehaviour = behaviour;
	}
	
}
