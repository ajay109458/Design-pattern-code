package structural.adapter;

public class Main {
	
	public Main() {
		WildDog dog = new WildDog();
		WildDogAdapter wildDogAdapter = new WildDogAdapter(dog);
		
		Hunter hunter = new Hunter();
		hunter.hunt(wildDogAdapter);
	}

}
