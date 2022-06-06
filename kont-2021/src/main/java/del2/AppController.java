package del2;

import javafx.fxml.FXML;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;

public class AppController {

	@FXML private TextArea output;
	@FXML private TextField username;
	@FXML private TextField password;

	public static String logInSuccess = "Gratulerer du har logget inn!";
	public static String logInFailed = "Feil brukernavn eller passord";

	 @FXML
	 private void onLogIn() {
		 output.setText(username.getText().equals("admin") && password.getText().equals("admin")
		 	? logInSuccess
			: logInFailed
		);
 }
}
