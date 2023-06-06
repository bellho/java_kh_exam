package practice3.model.vo;

public abstract class Animal {
	//Field
	private String name;
	private String kinds;
	
	//Constructor
	protected Animal() {}
	protected Animal(String name, String kinds) {
		this.name = name;
		this.kinds =kinds;
	}
	
	//Method
	public abstract void speak();
	
	@Override
	public String toString() {
		return "Animal [name=" + name + ", kinds=" + kinds + "]";
	}
	
	
}
