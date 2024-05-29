import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;

public class GuestViewController {

    @FXML
    private Button DIY_package_btn;
    
    @FXML
    private Button LogInButton;

    @FXML
    private Button SignUpButton;

    
    @FXML
    void DIY_Clicked(ActionEvent event) {
        System.out.println("DIY");
    }

    @FXML
    void LogInButtonClicked(ActionEvent event) {
        System.out.println("login");
    }

    @FXML
    void SignUpButtonClicked(ActionEvent event) {
        System.out.println("SignUp");
    }

}
