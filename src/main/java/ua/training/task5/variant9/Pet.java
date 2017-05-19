package ua.training.task5.variant9;

public class Pet extends Animal implements Breathable{

	private String name;

	public Pet(String type, int legs, int children, String name) {
		super(type, legs, children);
		this.name = name;
	}

	public String getName() {
		return name;
	}

	@CallMe
	public void setName(String name) {
		this.name = name;
	}
	
	public void breathe() {
		System.out.println("*breathing*");
	}

	@Override
	public String toString() {
		return super.toString() + " name : " + name;
	}

}
