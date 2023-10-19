
public class Dog extends Animal{
	Dog(String name) {
		super(name);
	}

	public void makeSound() {
		System.out.println(this.name + "が吠えます、「ワン！！」");
	}
}
