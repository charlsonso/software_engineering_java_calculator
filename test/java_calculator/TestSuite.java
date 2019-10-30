package java_calculator;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;
 
@RunWith(Suite.class)
@SuiteClasses({
    TestClearButton.class,
    TestEqualsButton.class,
    TestMainWindow.class,
    TestModifierButton.class
})
class TestSuite {

}
