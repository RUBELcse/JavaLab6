
public class DoSomething {
	
	public void doSomething(Animal ob)
	{
		System.out.println("\n");
		if (ob instanceof Oviparous)
		{
			Oviparous object = (Oviparous) ob;
			object.can_move();
		}
		else if (ob instanceof Mammal)
		{
			Mammal object = (Mammal) ob;
			object.can_move();
		}
		else if (ob instanceof Birds)
		{
			Birds object = (Birds) ob;
			object.can_move();
		}
		else if (ob instanceof Insects)
		{
			Insects object = (Insects) ob;
			object.can_move();
		}
		else if (ob instanceof Land)
		{
			Land object = (Land) ob;
			object.can_move();
		}
		else if (ob instanceof Water)
		{
			Water object = (Water) ob;
			object.can_move();
		}
	}

}
