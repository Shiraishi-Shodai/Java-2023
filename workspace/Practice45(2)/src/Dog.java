
public class Dog extends Animal{
	
	public Dog(String name) {
		super(name);
	}

	public void makeSound() {
		System.out.println(this.name+"は吠えます、「ワン！」");
	}
	
}

