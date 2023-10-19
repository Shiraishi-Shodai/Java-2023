package 第2章.ジェネリクス;

public class Box<T>{//⑤Boxクラス 仮型引数を１つ指定する {

	private T object;

	public Box(T object) {
		this.object = object;
	}

	public T get() {
		return this.object;
	}
}