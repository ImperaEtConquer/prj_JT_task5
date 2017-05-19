package ua.training.task5.variant9;

public class Animal {
	private String type;
	private int legs;
	private int children;

	public Animal(String type, int legs, int children) {
		super();
		this.type = type;
		this.legs = legs;
		this.children = children;
	}

	@CallMe
	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	@CallMe
	public int getLegs() {
		return legs;
	}

	public void setLegs(int legs) {
		this.legs = legs;
	}

	@CallMe
	public int getChildren() {
		return children;
	}

	public void setChildren(int children) {
		this.children = children;
	}

	@Override
	public String toString() {
		return "Animal [type=" + type + ", legs=" + legs + ", children=" + children + "]";
	}

}
