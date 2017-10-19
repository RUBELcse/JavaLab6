public class Land extends  Mammal {

	private String name;
	public Land(String name)
	{
		super(name);
		super.can_move();
	}
	public void can_move()
	{
		System.out.println("Lives in land");
	}
}
