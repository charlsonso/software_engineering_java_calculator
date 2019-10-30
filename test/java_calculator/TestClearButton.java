package java_calculator;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class TestClearButton {
	ClearButton cb;
	
	@Test
	void test_init() {
		init();
	}
	
	@Test
	void test_clear() {
		init();
		String val = cb.clear_expression();
		assertTrue(val.contentEquals(""));
	}
	
	void init() {
		cb = new ClearButton();
	}

}
