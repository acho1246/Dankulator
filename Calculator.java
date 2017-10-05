package model;

public class Calculator {
	private String firstNumber;
	private String secondNumber;
	private String operator	;
	private String answer;
	private State readingFirst = new ReadingFirstOnly();
	private State secondOnly = new ReadingSecondOnly();
	private State currentState = readingFirst;
	
	public class ReadingFirstOnly implements State{
		
	}
	
	public class ReadingSecondOnly implements State{
		
	}
	
	public class Error implements State{
		
	}

}
