import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.stage.Stage;
import javafx.scene.Node;

public class UserSelectController {
    //έχουν W μπροστά γιατί είναι στο Welcome view.
    @FXML
    private Button GuestBtn;

    @FXML
    private Button W_LogInBtn;

    @FXML
    private Button W_SignUpBtn;

    @FXML
    void GuestBtn_Clicked(ActionEvent event) {
        try {
            //FXMLLoader loader = new FXMLLoader(getClass().getResource("guest_view.fxml"));
            //Parent root = loader.load();
            //Stage stage = new Stage();
            //stage.setScene(new Scene(root));
            //stage.show();

            Parent root  = FXMLLoader.load(getClass().getResource("guest_view.fxml"));
            Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();

            Scene scene =  new Scene(root);
            stage.setScene(scene);

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