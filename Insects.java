public class Insects extends Oviparous {

	private String name;
	public Insects(String name)
	{
		super(name);
		super.can_move();
	}
	public void can_move()
	{
		System.out.println("It's an Insect");
	}
}
