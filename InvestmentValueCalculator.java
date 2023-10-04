/* Exercise 15.5 from the book.

 * 
 * (Create an investment-value calculator)
 * 
 * Write a program that calculates the future value of an investment at
 * a given interest rate for a specified number of years. The formula
 * for the calculation is:
 * 
 * futureValue = investmentAmount * (1 + monthlyInterestRate)years * 12
 * 
 * Use text fields for the investment amount, number of years, and annual
 * interest rate. Display the future amount in a text field when the user
 * clicks the Calculate button, as shown in Figure 15.27b.
 */

// import all the needed stuff
import javafx.application.Application;
import javafx.geometry.HPos;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

public class InvestmentValueCalculator extends Application {
  @Override // override the start method in the Application class
  public void start(Stage primaryStage) {
    // create a pane and set its properties
    GridPane pane = new GridPane();
    pane.setAlignment(Pos.CENTER); // setting center alignment
    pane.setPadding(new Insets(11.5, 12.5, 13.5, 14.5));
    pane.setHgap(5.5); 
    pane.setVgap(5.5); // Set vGap to 5.5px
    
    // place nodes in the pane
    pane.add(new Label("Investment Amount:"), 0, 0);
    pane.add(new TextField(), 1, 0);
    pane.add(new Label("Amount of Years: "), 0, 1); 
    pane.add(new TextField(), 1, 1);
    pane.add(new Label("Annual Interest Rate: "), 0, 2);
    pane.add(new TextField(), 1, 2);
    pane.add(new Label("Future Value: "), 0, 3);
    pane.add(new TextField(), 1, 3);
    // makes a new button
    Button btAdd = new Button("Calculate");
    // adds the button into the pane
    pane.add(btAdd, 1, 4);
    // sets the horizontal alignment for the button
    GridPane.setHalignment(btAdd, HPos.RIGHT);
    
    // create a scene and place it in the stage
    Scene scene = new Scene(pane);
    primaryStage.setTitle("ShowGridPane"); // set the stage title
    primaryStage.setScene(scene); // put the scene in the stage
    primaryStage.show(); // display the stage
  }
  
  public static void main(String[] args) {
    launch(args); // launch the thingy to the screen
  }
} 
