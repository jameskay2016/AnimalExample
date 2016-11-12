
public class Bird extends Animal{

	public Bird(){//constructor
		System.out.println("Now I am a Cat!");
	}
	@Override //we are replacing the parent class method
	public String sleep(){
		return "A bird sleeps ...";
	}
	@Override
	public String eat(){
		return "A bird eats ...";
	}
	public String fly(){
		return "A bird flys ...";
	}

}
