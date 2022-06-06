package stuff;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Random;
import java.util.function.BinaryOperator;

import javafx.fxml.FXML;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.control.ListCell;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;

public class MathController {
	
	Random rand;

	@FXML private ComboBox<Character> typeSelector;
	@FXML private TextField firstField;
	@FXML private TextField secondField;
	@FXML private TextArea resultArea;

	@FXML
	private void initialize() {
		rand = new Random();
		Collection<Character> tmp = new ArrayList<>();
		tmp.add('+');
		tmp.add('*');
		tmp.add('/');
		tmp.add('-');
		typeSelector.getItems().addAll(tmp);
		typeSelector.getSelectionModel().select(0);
	}


	/**
	 * Gather doubles from two textfields, apply a mathematical method, and update a text component.
	 */
	@FXML
	private void onCalculate() {

		double n1, n2;

		try {
			n1 = Double.parseDouble(firstField.getText());
			n2 = Double.parseDouble(secondField.getText());
		} catch (NumberFormatException e) {
			throw new IllegalStateException("Must calculate on numbers");
		}

		BinaryOperator<Integer> func2 = (x1, x2) -> x1 + x2;
		BinaryOperator<Double> operator;
		switch(typeSelector.getValue()) {
			case '+':
				operator = (a, b) -> a + b;
				break;
			case '-':
				operator = (a, b) -> a - b;
				break;
			case '*':
				operator = (a, b) -> a * b;
				break;
			case '/':
				operator = (a, b) -> a / b;
				break;
			default:
				throw new IllegalStateException("Operator must be one of: +-*/");
		}

		resultArea.setText(operator.apply(n1, n2).toString());
	}

	@FXML
	private void randomizeNumbers() {
		Random rand = new Random();

		double n1 = rand.nextDouble() * 100;
		double n2 = rand.nextDouble() * 100;

		firstField.setText(String.valueOf(n1));
		secondField.setText(String.valueOf(n2));
	}
}
