import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;

public class LogInWindowController extends Controller{

    @FXML
    private Button BackButton;

    @FXML
    private Button ContinueButton;

    @FXML
    private TextField EmailField;

    @FXML
    private Label ErrorArea;

    @FXML
    private PasswordField PasswordField;

    @FXML
    void BackButtonClicked(ActionEvent event) {
        switch_scene(event, "WelcomeWindow.fxml");
    }

    @FXML
    void ContinueButtonClicked(ActionEvent event) {

    }

}
