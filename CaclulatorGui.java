package view;

import javafx.application.*;
import javafx.scene.*;
import javafx.scene.control.*;
import javafx.stage.*;
import model.Calculator;
import javafx.scene.layout.*;
import javafx.event.*;
import javafx.geometry.Insets;

//import javafx.geometry.Insets;
import java.text.NumberFormat;

@SuppressWarnings("restriction")
public class CaclulatorGui extends Application{
	private TextArea displayArea;
	private String digit;

	@Override
	public void start(Stage primaryStage) {
		
		int sceneWidth = 230, sceneHeight = 240;
		
		int verSpaceBetweenNodes = 8, horSpaceBetweenNodes = 8;
		int paneBorderTop = 20, paneBorderRight = 20;
		int paneBorderBottom = 20, paneBorderLeft = 20;
		
		displayArea = new TextArea();
		displayArea.setEditable(false);
		displayArea.setWrapText(true);
		displayArea.setPrefWidth(230);
		displayArea.setPrefHeight(80);

		ScrollPane scrollPane = new ScrollPane(displayArea);
		
		GridPane pane = new GridPane();
		pane.setHgap(horSpaceBetweenNodes);
		pane.setVgap(verSpaceBetweenNodes);
		pane.setPadding(new Insets(paneBorderTop, paneBorderRight, 
					    paneBorderBottom, paneBorderLeft));
		
		
		
		/* Adding elements */
		BorderPane borderPane = new BorderPane();
		//borderPane.setTop(dataEntryArea);
		borderPane.setTop(scrollPane);
		//borderPane.setRight(total);
		//borderPane.setBottom(total);
		borderPane.setCenter(pane);
		
				Button button = new Button("CE");
		pane.add(button, 0, 0);
		
		Button button1 = new Button("C");
		pane.add(button1, 1, 0);
		
		Button button2 = new Button("1/x");
		pane.add(button2, 2, 0);
		
		Button button3 = new Button("sqrt");
		pane.add(button3, 3, 0);
		
		Button button4 = new Button("7");
		pane.add(button4, 0, 1);
		
		Button button5 = new Button("8");
		pane.add(button5, 1, 1);
		
		Button button6 = new Button("9");
		pane.add(button6, 2, 1);
		
		Button button7 = new Button("4");
		pane.add(button7, 0, 2);
		
		Button button8 = new Button("5");
		pane.add(button8, 1, 2);
		
		Button button9 = new Button("6");
		pane.add(button9, 2, 2);
		
		Button button10 = new Button("3");
		pane.add(button10, 0, 3);
		

		Button button11 = new Button("2");
		pane.add(button11, 1, 3);
		
		Button button12 = new Button("1");
		pane.add(button12, 2, 3);
		
		Button button13 = new Button("+");
		pane.add(button13, 3, 1);
		
		Button button14 = new Button("-");
		pane.add(button14, 3, 2);
		
		Button button15 = new Button("0");
		pane.add(button15, 3, 3);
		
		Button button16 = new Button(".");
		pane.add(button16, 4, 3);
		
		Button button17 = new Button("/");
		pane.add(button17, 4, 2);
		
		Button button18 = new Button("x");
		pane.add(button18, 4, 1);
		
		
		/* Display the stage */
		Scene scene = new Scene(borderPane, sceneWidth, sceneHeight);
		primaryStage.setTitle("Calculator");
		primaryStage.setScene(scene);
		primaryStage.show();
		
		button4.setOnAction(new EventHandler<ActionEvent>() {
			public void handle(ActionEvent e) {
				digit = "7";
				
				displayArea.setText(digit);
			}
		});
		
		button5.setOnAction(new EventHandler<ActionEvent>() {
			public void handle(ActionEvent e) {
				digit = "8";
				
				displayArea.setText(digit)
			}
		});
		
		button6.setOnAction(new EventHandler<ActionEvent>() {
			public void handle(ActionEvent e) {
				digit = "9";
				displayArea.setText(digit);
			}
		});
		
		button7.setOnAction(new EventHandler<ActionEvent>() {
			public void handle(ActionEvent e) {
				digit = "4";
				
				displayArea.setText(digit);
			}
		});
		
		button8.setOnAction(new EventHandler<ActionEvent>() {
			public void handle(ActionEvent e) {
				digit = "5";
				
				displayArea.setText(digit);
			}
		});
		
		button9.setOnAction(new EventHandler<ActionEvent>() {
			public void handle(ActionEvent e) {
				digit = "6";
				
				displayArea.setText(digit);
			}
		});
		
		button10.setOnAction(new EventHandler<ActionEvent>() {
			public void handle(ActionEvent e) {
				digit = "3";
				
				displayArea.setText(digit);
			}
		});
		
		button11.setOnAction(new EventHandler<ActionEvent>() {
			public void handle(ActionEvent e) {
				digit = "2";
				
				displayArea.setText(digit);
			}
		});
		
		button12.setOnAction(new EventHandler<ActionEvent>() {
			public void handle(ActionEvent e) {
				digit = "1";
				
				displayArea.setText(digit);
			}
		});
		
		button13.setOnAction(new EventHandler<ActionEvent>() {
			public void handle(ActionEvent e) {
				digit = "+";
				
				displayArea.setText(digit);
			}
		});
		
		button14.setOnAction(new EventHandler<ActionEvent>() {
			public void handle(ActionEvent e) {
				digit = "-";
				
				displayArea.setText(digit);
			}
		});
		
		button15.setOnAction(new EventHandler<ActionEvent>() {
			public void handle(ActionEvent e) {
				digit = "0";
				
				displayArea.setText(digit);
			}
		});
		
		button16.setOnAction(new EventHandler<ActionEvent>() {
			public void handle(ActionEvent e) {
				digit = ".";
				
				displayArea.setText(digit);
			}
		});
		
		button17.setOnAction(new EventHandler<ActionEvent>() {
			public void handle(ActionEvent e) {
				digit = "/";
				
				displayArea.setText(digit);
			}
		});
		
		button18.setOnAction(new EventHandler<ActionEvent>() {
			public void handle(ActionEvent e) {
				digit = "*";
				
				displayArea.setText(digit);
			}
		});
		
		

	}
	
	public String getDigit() {
		return digit;
	}
	
	
	
	public static void main(String[] args) {
		Application.launch(args);
	}

}
