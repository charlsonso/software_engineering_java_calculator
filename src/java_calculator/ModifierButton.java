package java_calculator;
import java.lang.String;
import javax.swing.JButton;

public class ModifierButton extends JButton{
	String value;
	
	public ModifierButton(String val) {
		super(val);
		value = val;
	}

	public String add_modifier_to_expression(String exp) {
		String result = exp + value;
		return result;
	}
	
	
}
