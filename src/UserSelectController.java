import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.stage.Stage;

public class UserSelectController {

    @FXML
    private Button GuestBtn;

    @FXML
    private Button W_LogInBtn;

    @FXML
    private Button W_SignUpBtn;

    @FXML
    void GuestBtn_Clicked(ActionEvent event) {
        try {
            FXMLLoader loader = new FXMLLoader(getClass().getResource("guest_view.fxml"));
            Parent root = loader.load();
            Stage stage = new Stage();
            stage.setScene(new Scene(root));
            stage.show();

            //κάπως πρέπει το προηγούμενο stage να κλείνει.
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @FXML
    void W_LogInBtn_Clicked(ActionEvent event) {

    }

    @FXML
    void W_SignUpBtn_Clicked(ActionEvent event) {

    }

}