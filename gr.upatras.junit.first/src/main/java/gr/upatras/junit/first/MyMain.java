package gr.upatras.junit.first;

public class MyMain {
	public static void main(String[] args) {
		MyClass m = new MyClass();
		String result = m.multiply(10,5);
		System.out.println("To apotelesma einai " + result);
	}
}
