import java.io.IOException;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

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
    void ContinueButtonClicked(ActionEvent event) throws IOException {
        if (PasswordField.getText().equals(RepeatPasswordField.getText())) {
            //ο current user είναι αυτός που θα μπει στην βάση
            User currentUser = new User(UsernameField.getText(), PasswordField.getText());

            // δεν χρησιμοποιούμε switch_scene γιατί εχεί να μεταφέρει
            // δεδομένα μεταξύ controllers
            FXMLLoader loader = new FXMLLoader(getClass().getResource("UserWindow.fxml"));
            Parent root = loader.load();

            UserWindowController control = loader.getController();
            control.SetLabelText(UsernameField.getText());
            // Parent root = FXMLLoader.load(getClass().getResource(filename));
            Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();

            Scene scene = new Scene(root);
            stage.setScene(scene);
        }

    }

}
