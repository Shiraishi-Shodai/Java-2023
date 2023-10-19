
public class Subtract extends Add{
 public void calcSubtract(String []args) {
	 setValues(args);
	 System.out.println(this.a+"-"+this.b+"="+(this.a-this.b));
 }
 
 public void caclAdd_sub(String []args) {
	 calcAdd(args);
 }
}
