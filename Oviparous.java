public class Oviparous extends Animal {

	private String name;
	public Oviparous(String name)
	{
		super(name);
		super.can_move();
	}
	public void can_move()
	{
			System.out.println("It's an Oviparous");
	}
}
