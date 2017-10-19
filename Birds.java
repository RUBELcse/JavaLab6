public class Birds extends Oviparous {

	private String name;
	public Birds(String name)
	{
		super(name);
		super.can_move();
	}
	public void can_move()
	{
		System.out.println("It's a Bird");
	}
}
