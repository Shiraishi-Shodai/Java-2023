public class Practice41 {
	public static void main (String []args) {
		VidoPlayer v1 = new VidoPlayer();
		CDPlayer c1 = new CDPlayer();
		
		v1.play();
		v1.stop();
		System.out.println("");
		c1.play();
		c1.stop();
	}
}
