import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;

public class RegisterWindowController extends Controller {

    @FXML
    private Button BackButton;

    @FXML
    private Button ContinueButton;

    @FXML
    private TextField UsernameField;

    @FXML
    private Label ErrorTextArea;

    @FXML
    private PasswordField PasswordField;

    @FXML
    private PasswordField RepeatPasswordField;

    @FXML
    void BackButtonClicked(ActionEvent event) {
        switch_scene(event, "WelcomeWindow.fxml");
    }

    @FXML
    void ContinueButtonClicked(ActionEvent event) {
        if (PasswordField.getText().equals(RepeatPasswordField.getText())) {
            User currentUser = new User(UsernameField.getText(), PasswordField.getText());
            switch_scene(event, "UserWindow.fxml");
        }

    }

}
