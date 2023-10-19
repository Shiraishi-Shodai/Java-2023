package API;
import java.util.ArrayList;
import java.util.List;
public class PracticeEnum {
	public enum Senkan{
		yamato,
		musashi,
		nagato
	}
	public class Pet{
		private Senkan kin;
		private String name;
		
		public Pet(Senkan sen) {
			this.kin = sen;
		}
	}
	public static void main(String []args) {
		List<Pet> p = new ArrayList<Pet>(3);

		 for (Senkan type : Senkan.values()) {
			 //ordinalは位置情報を返す
			 //valueOfはyamatoなどの特定の値を返す
			 //valuesはすべてを出力
		  System.out.println(Senkan.yamato.ordinal());
		  
		 }	
	}

}
