
public class Calculator {
	private final String delimiter = ",|\n";
	public int calculate(String input) throws Exception {
		// TODO Auto-generated method stub
		String[] numbers = input.split(delimiter);
		if(isEmpty(input)) {
			return 0;
		}
		if(input.length()==1) {
			return stringToInt(input);
		}
		else {
			return getSum(numbers);
		}
		
	}
	private int getSum(String[] numbers) throws Exception {
		findNegativeInputException(numbers);
		
		return calculateValues(numbers);
		
	}
	public int calculateValues(String[] numbers) {
		int sum = 0;
		for(String i:numbers) {
			if(stringToInt(i)>1000) {
				continue;
			}
			sum += stringToInt(i);
		}
		return sum;
	}
	public void findNegativeInputException(String[] numbers) throws Exception{
		for(String i:numbers) {
			if(stringToInt(i)<0) {
				throw new Exception("Negative input");
			}
		}
	}
	
	private boolean isEmpty(String input) {
		return input.isEmpty();
	}
	private int stringToInt(String input) {
		return Integer.parseInt(input);
	}
}
