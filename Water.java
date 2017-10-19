public class Water extends  Mammal {

	private String name;
	public Water(String name)
	{
		super(name);
		super.can_move();
	}
	public void can_move()
	{
		System.out.println("Lives in water");
	}
}
