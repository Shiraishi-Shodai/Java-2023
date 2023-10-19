
public class Practice45 {
	public static void main(String[] args) {
		Animal[] ary = new Animal[3];
		
//		①Catインスタンスを生成（名前:タマ）し、ary配列に格納
		ary[0] = new Cat("名前:タマ");
//		②Dogインスタンスを生成（名前:ポチ）し、ary配列に格納
		ary[1] = new Dog("名前:ポチ");
//		③Lionインスタンスを生成（名前:レオ）し、ary配列に格納
		ary[2] = new Lion("名前:レオ");

//		④拡張for文を使用し、ary配列の要素を先頭から１件ずつ取り出し {
//			⑤インスタンスのmakeSoundメソッド呼び出し
//		}
		for(Animal a : ary) {
			a.makeSound();
		}
	

//		⑥for文を使用し、ary配列の要素を末尾から１件ずつ取り出し {
//			⑦feedメソッド呼び出し  引数にインスタンス
//		}
		for(int b = ary.length-1;b>=0;b--) {
			feed(ary[b]);
		}
	
	}
	static void feed(Animal x) {
		System.out.println(x.name + "に餌をやります");
	}
}

