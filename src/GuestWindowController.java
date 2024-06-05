import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;

public class GuestWindowController extends Controller{

    @FXML
    private Button DIYButton;

    @FXML
    private Button LogInButton;

    @FXML
    private Button ReservationButton;

    @FXML
    private Button SignUpButton;

    @FXML
    void DIYButtonClicked(ActionEvent event) {

    }

    @FXML
    void LogInButtonClicked(ActionEvent event) {
        popup(event, "LogInWindow.fxml", "LogIn");
    }

    @FXML
    void ReservationButtonClicked(ActionEvent event) {

    }

    @FXML
    void SignUpButtonClicked(ActionEvent event) {
        popup(event, "RegisterWindow.fxml", "Register");
    }

}
