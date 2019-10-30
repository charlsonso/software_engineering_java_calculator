package java_calculator;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class TestModifierButton {
	ModifierButton test;
	
	@Test
	void test_constructor() {
		init();
	}
	
	@Test
	void test_add_modifier_to_expression() {
		init();
		String result = test.add_modifier_to_expression("0");
		assert(result.equals("00"));
	}
	
	void init(){
		test = new ModifierButton("0");
	}

}
