package java_calculator;
import javax.swing.JButton;
import java.lang.String;

public class ClearButton extends JButton{
	public ClearButton() {
		super("C");
		
	}
	
	public String clear_expression() {
		return "";
	}
}
