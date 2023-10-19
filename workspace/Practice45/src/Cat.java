
public class Cat extends Animal{
	Cat(String name) {
		super(name);
	}

	public void makeSound() {
		System.out.println(this.name + "が鳴きます、「ニャー！！」");
	}
}
