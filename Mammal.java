public class Mammal extends Animal {

	private String name;
	public Mammal(String name)
	{
		super(name);
		super.can_move();
	}
	public void can_move()
	{
				System.out.println("It's a Mammals");
	}
}
