package 第2章.章末問題;

public class StrongBox<E> {
	private keyType key;
	private E item;
	private int count;
	public void put(E i) {
		this.item = i;
	}
	public E get() {
		switch(this.key) {
		case PADLOCK: 
			if(this.count < 1024) {
				return null;
			}
			break;
		case BUTTON: 
			if(this.count < 10000) {
				return null;
			}
			break;
		case DIAL: 
			if(this.count < 30000) {
				return null;
			}
			break;
		case FINGER: 
			if(this.count < 1000000) {
				return null;
			}
			break;
		}
		this.count = 0;
		return this.item;
		
	}
	
	public enum keyType{
		PADLOCK,BUTTON,DIAL,FINGER
	}
	public StrongBox(keyType key){
		this.key = key;
	}
}
