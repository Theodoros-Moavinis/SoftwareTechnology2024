import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.stage.Stage;
import javafx.scene.Node;

public class UserSelectController extends Controller {
    //έχουν W μπροστά γιατί είναι στο Welcome view.
    @FXML
    private Button GuestBtn;

    @FXML
    private Button W_LogInBtn;

    @FXML
    private Button W_SignUpBtn;

    @FXML
    void GuestBtn_Clicked(ActionEvent event) {
        switch_scene(event, "guest_view.fxml");
    }

    @FXML
    void W_LogInBtn_Clicked(ActionEvent event) {
        switch_scene(event, "log_in_view.fxml");
    }

    @FXML
    void W_SignUpBtn_Clicked(ActionEvent event) {
        switch_scene(event, "register_view.fxml");
    }

}