import java.io.IOException;

import com.sun.swing.internal.plaf.basic.resources.basic_pt_BR;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.Control;
import javafx.scene.control.DatePicker;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

public class RegisterWindowController extends Controller {

    private boolean fieldsAreValid = false;
    @FXML
    private Button BackButton;

    @FXML
    private Button ContinueButton;

    @FXML
    private TextField FirstNameField;

    @FXML
    private TextField LastNameField;

    @FXML
    private DatePicker BirthDayField;
    @FXML
    private TextField EmailField;

    @FXML
    private TextField PhoneNumberField;

    @FXML
    private TextField CountryChoice;

    @FXML
    private TextField CityField;
    
    @FXML
    private TextField GenderChoice;

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

    void colorFieldIf(Control field, boolean hasCorrectInput)
    {
        if (hasCorrectInput)
            field.setStyle("-fx-control-inner-background: white;");
        else
            field.setStyle("-fx-control-inner-background: red;");

    }
    void testIfFieldEmpty(TextField field, String message) {
        boolean fieldIsValid = field.getText().trim().isEmpty();
        if (fieldIsValid) {
            ErrorTextArea.appendText(message + '\n');
            fieldsAreValid = false;
        } 
        colorFieldIf(field, !fieldIsValid);
    }

    void testBirthday() {
        boolean birthdayIsValid = true;
        if(BirthDayField.getValue() == null) {
            ErrorTextArea.appendText("Birth Day can't be empty\n");
            birthdayIsValid = false;
        }
        colorFieldIf(BirthDayField, birthdayIsValid);
    }

    void testEmail() {
        boolean emailIsValid = true;
        String email = EmailField.getText().trim();
        if (email.isEmpty()) {
            ErrorTextArea.appendText("Email required\n");
            emailIsValid = false;
            fieldsAreValid = false;
        }
        else if (!email.contains("@")) {
            ErrorTextArea.appendText("Email incorrect\n");
            emailIsValid = false;
            fieldsAreValid = false;
        } 
        colorFieldIf(EmailField, emailIsValid);
        
    }

    void testPhone() {
        boolean phoneIsValid = false;
        if (PhoneNumberField.getText().trim().length() != 10 
        || !PhoneNumberField.getText().trim().startsWith("69")) {
            ErrorTextArea.appendText("Phone incorrect\n");
            phoneIsValid = false;
            fieldsAreValid = false;
        } 
        colorFieldIf(PhoneNumberField, phoneIsValid);
    }

    void testPassword() {
        boolean passwordIsValid = true;
        String password = PasswordField.getText().trim();
        String repeatPassword = RepeatPasswordField.getText().trim();
        if (password.length() < 8 
        || !password.matches("[A-Z]") 
        || !password.matches("[0-9]")
        || !password.matches("[#?!]")) {
            ErrorTextArea.appendText("Password incorrect. Must have atleast 8 letters, 1 digit and 1 special character (#?!)\n");
            passwordIsValid = false;
            fieldsAreValid = false;
        } else if (!password.equals(repeatPassword)) {
            ErrorTextArea.appendText("Repeat password must be the same\n");
            passwordIsValid = false;
            fieldsAreValid = false;
        }
        colorFieldIf(PasswordField, passwordIsValid);
        colorFieldIf(RepeatPasswordField, passwordIsValid);
    }


    boolean inputIsValid() {
        fieldsAreValid = true;
        ErrorTextArea.setText("");

        testIfFieldEmpty(FirstNameField, "First name required");        
        testIfFieldEmpty(LastNameField, "Last name required");
        testBirthday();     
        testEmail();
        testPhone();
        testIfFieldEmpty(CountryChoice, "Country required");
        testIfFieldEmpty(CityField, "City required");
        testIfFieldEmpty(GenderChoice, "Gender required");
        testIfFieldEmpty(UsernameField, "Username required");
        testPassword();

        return fieldsAreValid;
    }

}
