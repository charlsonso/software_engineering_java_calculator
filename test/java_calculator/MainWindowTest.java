package java_calculator;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class MainWindowTest {
	MainWindow w;
	@Test
	void construct_window_test() {
		init();
	}
	
	@Test
	void test_render_graphics_object() {
		init();
		boolean result = w.render_graphics_elements();
		assertTrue(result);
	}
	
	@Test
	void test_set_labe() {
		init();
		boolean result = w.set_label();
		assertTrue(result);
	}
	
	@Test
	void test_set_action_listener() {
		init();
		boolean result = w.set_action_listener();
		assertTrue(result);
	}
	
	void init() {
		w = new MainWindow();
	}

	
}
