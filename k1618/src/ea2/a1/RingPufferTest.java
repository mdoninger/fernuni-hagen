package ea2.a1;

public class RingPufferTest {

	public static void main(String args[]) {
		RingPuffer<String> ringPuffer = new RingPuffer<String>(10);
		ringPuffer.insert("test");
		
		ringPuffer.print();
	}
}
