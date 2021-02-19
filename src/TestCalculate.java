import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import static org.testng.Assert.assertEquals;


@Test
public class TestCalculate {
	
	private Calculator calculator;
	
	@BeforeTest
	public void init() {
	calculator = new Calculator();	
	}

	public void emptyStringReturnZer() throws Exception {
		assertEquals(calculator.calculate(""), 0);
	}
	
	public void singleValueIsReplied() throws Exception {
		assertEquals(calculator.calculate("1"), 1);
	}
	
	public void twoNumberDelimiterReturnSum() throws Exception {
		assertEquals(calculator.calculate("1,2"), 3);
	}
	public void twoNumbersNewLineDelimiterReturnSum() throws Exception {
		assertEquals(calculator.calculate("1\n2"), 3);
	}
	public void threeNumberDelimiterBothWaysReturnSum() throws Exception {
		assertEquals(calculator.calculate("1,2,3"), 6);
	}
	
	@Test(expectedExceptions=Exception.class)
	public void negativeInputReturnsException() throws Exception {
		calculator.calculate("-1");
	}
	
	public void ignoresNumberGreaterThan1000() throws Exception{
		assertEquals(calculator.calculate("10,10,10001"), 20);
	}
}
