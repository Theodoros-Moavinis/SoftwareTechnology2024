import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;

public class LogInWindowController extends Controller {

    @FXML
    private Button BackButton;

    @FXML
    private Button ContinueButton;

    @FXML
    private TextField UsernameField;

    @FXML
    private Label ErrorArea;

    @FXML
    private PasswordField PasswordField;

    @FXML
    void BackButtonClicked(ActionEvent event) {
        switch_scene(event, "WelcomeWindow.fxml");
    }

    // test user, comment out later
    User testUser = new User("test", "password");

    @FXML
    void ContinueButtonClicked(ActionEvent event) {
        // για να μπορεί να μεπει ενας test user, για δοκιμαστικόυς σκοπούς, comment out 

        if (UsernameField.getText().equals(testUser.getName()) && PasswordField.getText().equals(testUser.getPassword())) {
            switch_scene(event, "UserWindow.fxml");
        }
    }

}
