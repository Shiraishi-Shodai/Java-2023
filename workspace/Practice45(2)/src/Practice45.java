
public class Practice45 {
	public static void main(String []args) {
		
		Animal [] ary = new Animal[3];
		
		ary[0] = new Cat("タマ");
		ary[1] = new Dog("ポチ");
		ary[2] = new Animal("レオ");
		
		for(Animal m: ary) {
			m.makeSound();
		}
		
		for(int i = ary.length-1;i>=0;i--) {
			food(ary[i]);
		}
			
	}
	
	static void food(Animal s) {
		System.out.println(s.name+"に餌をやります");
	}
	
	
}
