
public class AnimalMain { // executes the classes
	public static void main (String[] args){
		Animal a = new Animal();
		System.out.println(a.eat());
		System.out.println(a.sleep());
		
		//make it so the cat class prints eat, sleep and purr
		Cat c = new Cat();
		System.out.println(c.eat());
		System.out.println(c.sleep());
		System.out.println(c.purr());
		
		//make a new class for bird that can also fly
		Bird b = new Bird();
		System.out.println(b.eat());
		System.out.println(b.sleep());
		System.out.println(b.fly());
	}

}
