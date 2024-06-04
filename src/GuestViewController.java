import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;

public class GuestViewController extends Controller{

    @FXML
    private Button DIY_package_btn;
    
    @FXML
    private Button LogInButton;

    @FXML
    private Button SignUpButton;

    @FXML
    private Button rsrvBtn;
    
    @FXML
    void DIY_Clicked(ActionEvent event) {
        System.out.println("DIY");
    }

    @FXML
    void LogInButtonClicked(ActionEvent event) {
        //System.out.println("login");
        popup(event, "log_in_view.fxml", "Log In");
    }

    @FXML
    void SignUpButtonClicked(ActionEvent event) {
        System.out.println("SignUp");
    }


    @FXML
    void rsrvBtnClicked(ActionEvent event) {

    }

}
