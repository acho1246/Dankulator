package model;

import view.CaclulatorGui;

public class Calculator {
	private String firstNumber;
	private String secondNumber;
	private String operator;
	private String answer;
	private State readingFirst = new ReadingFirstOnly();
	private State secondOnly = new ReadingSecondOnly();
	private State currentState;
	
	public void start() {
		currentState = readingFirst;
		firstNumber = "";
		secondNumber = "";
		CaclulatorGui gui = new CaclulatorGui();
		
	}
	
	public void read() {
		currentState.read();
	}
	
	public void setOperator(String operator) {
			
	}
	
	public class ReadingFirstOnly implements State{
		public void read() {
			
		}
	}
	
	public class ReadingSecondOnly implements State{
		
	}
	
	public class Error implements State{
		
	}

}
