package java_calculator;
import javax.script.ScriptEngine;
import javax.script.ScriptEngineManager;
import javax.script.ScriptException;
import javax.swing.JButton;
import java.lang.String;

public class EqualsButton extends JButton{
	
	public EqualsButton() {
		super("=");
	}
	
	public String evaluate(String exp) {
		try {
			ScriptEngineManager manager = new ScriptEngineManager();
			ScriptEngine engine = manager.getEngineByName("js");        
			Object result = engine.eval(exp);
			return String.valueOf(result);
		} catch(ScriptException e) {
			return "Error";
		}
	}
}
