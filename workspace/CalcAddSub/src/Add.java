
public class Add{

	int a;
	int b;
	public void setValues(String [] args) {
		this.a = Integer.parseInt(args[0]);
		this.b = Integer.parseInt(args[1]);
	}
	
	public void calcAdd(String [] args) {
		setValues(args);
		System.out.println(this.a+"+"+this.b+"="+(this.a+this.b));
	}
}
