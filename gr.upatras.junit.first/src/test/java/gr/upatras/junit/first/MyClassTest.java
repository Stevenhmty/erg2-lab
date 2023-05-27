package gr.upatras.junit.first;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
class MyClassTest {
	

	@Test
	void testMultiply1() {
		MyClass tester = new MyClass();
		assertEquals("Positive", tester.multiply(10, 5), "10 - 5 must be Positive");

	}

	@Test
	void testMultiply2() {
		MyClass tester = new MyClass();
		assertEquals("Negative", tester.multiply(5, 10), "10 - 5 must be Positive");

	}
}
