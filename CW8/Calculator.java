import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.stage.Stage;

public class Calculator extends Application {

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) throws Exception {
        Label num1Label = new Label("Number 1:");
        Label num2Label = new Label("Number 2:");
        Label total = new Label("");
        TextField number1 = new TextField();
        TextField number2 = new TextField();
        Button plus = new Button("+");
        Button minus = new Button("-");
        Button multiply = new Button("x");
        Button divide = new Button("/");
        plus.setOnAction(e->{
            double amount = Double.parseDouble(number1.getText()) + Double.parseDouble(number2.getText());
            total.setText(String.format("%,.2f", amount));
        });
        minus.setOnAction(e->{
            double amount = Double.parseDouble(number1.getText()) - Double.parseDouble(number2.getText());
            total.setText(String.format("%,.2f", amount));
        });
        multiply.setOnAction(e->{
            double amount = Double.parseDouble(number1.getText()) * Double.parseDouble(number2.getText());
            total.setText(String.format("%,.2f", amount));
        });
        divide.setOnAction(e->{
            double amount = Double.parseDouble(number1.getText()) / Double.parseDouble(number2.getText());
            total.setText(String.format("%,.2f", amount));
        });
        HBox buttonCell = new HBox(plus, minus, multiply, divide);
        HBox totalCell = new HBox(total);
        buttonCell.setAlignment(Pos.CENTER);
        buttonCell.setSpacing(5);
        totalCell.setAlignment(Pos.CENTER);
        GridPane gp = new GridPane();
        gp.setAlignment(Pos.CENTER);
        gp.setVgap(10);
        gp.setHgap(15);
        gp.add(num1Label, 0, 0);
        gp.add(number1, 1, 0);
        gp.add(num2Label, 0, 1);
        gp.add(number2, 1, 1);
        gp.add(buttonCell, 0, 2, 2, 1);
        gp.add(totalCell, 0, 3, 2, 1);

        Scene scene = new Scene(gp, 360, 150);
        primaryStage.setScene(scene);
        primaryStage.setTitle("Calculator");
        primaryStage.show();
    }
}
