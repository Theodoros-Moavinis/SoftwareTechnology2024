import java.io.IOException;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.stage.Stage;
import javafx.fxml.FXMLLoader;

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
    void ContinueButtonClicked(ActionEvent event) throws IOException {
        // για να μπορεί να μεπει ενας test user, για δοκιμαστικόυς σκοπούς, comment out

        if (UsernameField.getText().equals(testUser.getName()) && PasswordField.getText().equals(testUser.getPassword())) {

            //δεν χρησιμοποιούμε switch_scene γιατί εχεί να μεταφέρει
            //δεδομένα μεταξύ controllers
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
