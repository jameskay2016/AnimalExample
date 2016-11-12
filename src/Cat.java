
public class Cat extends Animal {
	public Cat(){//constructor
		System.out.println("Now I am a Cat!");
	}
	@Override //we are replacing the parent class method
	public String sleep(){
		return "A cat sleeps ...";
	}
	@Override
	public String eat(){
		return "A cat eats ...";
	}
	public String purr(){
		return "A cat purrs ...";
	}
}
