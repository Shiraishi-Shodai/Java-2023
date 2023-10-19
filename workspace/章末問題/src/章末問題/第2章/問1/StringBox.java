package 章末問題.第2章.問1;
public class StringBox <E>{
	
	public enum KeyType{
		PADLOCK,BUTTON,DIAL,FINGER
	}
	
	private E object;
	private KeyType key;
	private long count = 0;
	
	public E get() {
		count++;
		switch(this.key) {
		case PADLOCK:
			if(count<1024) {
				return null;
			}
			break;
		case BUTTON:
			if(count<10000) {
				return null;
			}
			break;
		case DIAL:
			if(count<30000) {
				return null;
			}
			break;
		case FINGER:
			if(count<1000000) {
				return null;
			}
			break;
		}
		count = 0;
		return this.object;
	}
	
	public void put(E object) {
		this.object = object;
	}
	
	public StringBox(KeyType key) {
		this.key = key;
	}
}
