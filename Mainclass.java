public class Mainclass {

	public static void main(String[] args) {
		Oviparous ob1=new Oviparous("Eagle");
		ob1.can_move();
		Animal ob2=new Birds("Crow");
		ob2.can_move();
		Animal ob3=new Insects("Butterfly");
		ob3.can_move();
		Mammal ob4=new Mammal("Cat");
		ob4.can_move();
		Animal ob5=new Land("Cow");
		ob5.can_move();
		Animal ob6=new Water("Whale");
		ob6.can_move();
		DoSomething x=new DoSomething();
		x.doSomething(ob1);
		x.doSomething(ob2);
		x.doSomething(ob3);
		x.doSomething(ob4);
		x.doSomething(ob5);
		x.doSomething(ob6);
	}

}
