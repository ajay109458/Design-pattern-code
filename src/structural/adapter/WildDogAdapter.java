package structural.adapter;

public class WildDogAdapter implements ILion{
	
	private WildDog dog;
	
	public WildDogAdapter(WildDog dog) {
		this.dog = dog;
	}

	public String roar() {
		return "adapter" + dog.bark();
	}
	
}
