package structural.adapter;

public class Hunter {

	public void hunt(ILion lion) {
		System.out.println("Hunting a lion" + lion.roar());
	}
	
}
