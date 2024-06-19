import java.io.IOException;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

public class RegisterWindowController extends Controller {

    
    @FXML
    private Button BackButton;

    @FXML
    private Button ContinueButton;

    @FXML
    private TextField FirstNameField;

    @FXML
    private TextField LastNameField;

    @FXML
    private TextField EmailField;

    @FXML
    private TextField PhoneNumberField;

    @FXML
    private TextField CountryChoice;

    @FXML
    private TextField CityField;
    
    @FXML
    private TextField UsernameField;

    @FXML
    private TextArea ErrorTextArea;

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
        if (inputIsValid()) {
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

    
    boolean inputIsValid() {
        boolean isValid = true;
        ErrorTextArea.setText("");
        if (FirstNameField.getText().trim().isEmpty()) {
            ErrorTextArea.appendText("First name required\n");
            isValid = false;
        }

        if (LastNameField.getText().trim().isEmpty()) {
            ErrorTextArea.appendText("Last name required\n");
            isValid = false;
        }

        if (EmailField.getText().trim().isEmpty()) {
            ErrorTextArea.appendText("Email required\n");
            isValid = false;
        }

        if (PhoneNumberField.getText().trim().length() != 10) {
            ErrorTextArea.appendText("Phone number must be 10 digits\n");
            isValid = false;
        }

        if (EmailField.getText().trim().isEmpty()) {
            ErrorTextArea.appendText("Email required\n");
            isValid = false;
        }

        if (UsernameField.getText().trim().isEmpty()) {
            ErrorTextArea.appendText("Username cannot be empty\n");
            isValid = false;
        }

        if (PasswordField.getText().trim().isEmpty()) {
            ErrorTextArea.appendText("Password cannot be empty\n");
            isValid = false;
        }

        if (RepeatPasswordField.getText().trim().isEmpty()) {
            ErrorTextArea.appendText("Repeat password cannot be empty\n");
            isValid = false;
        }

        if (PasswordField.getText().equals(RepeatPasswordField.getText())) {
            ErrorTextArea.appendText("Repeat password must be the same\n");
            isValid = false;
        }
        return isValid;
    }

}
