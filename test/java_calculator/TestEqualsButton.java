package java_calculator;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class TestEqualsButton {
	EqualsButton eq;
	@Test
	void test_init() {
		init();
	}
	
	@Test
	void test_eval() {
		init();
		String result = eq.evaluate("3*4");
		assertTrue(result.equals("12"));
	}
	
	@Test
	void test_error() {
		init();
		String result = eq.evaluate("3*4.1.2");
		assertTrue(result.equals("Error"));
	}
	
	void init() {
		eq = new EqualsButton();
	}

}
