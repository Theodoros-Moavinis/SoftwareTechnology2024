import java.net.URL;
import java.util.ResourceBundle;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.DatePicker;
import javafx.scene.control.ListView;

public class GuestWindowController extends Controller implements Initializable {

    @FXML
    private Button DIYButton;

    @FXML
    private Button LogInButton;

    @FXML
    private ListView<String> PackageListView;

    @FXML
    private Button ReservationButton;

    @FXML
    private Button SignUpButton;

    @FXML
    private DatePicker StartDateField;

    @FXML
    private DatePicker EndDateField;

    @FXML
    private ChoiceBox<String> DestinationChoiceBox;

    @FXML
    private Button SearchButton;


    @FXML
    void DIYButtonClicked(ActionEvent event) {

    }

    @FXML
    void LogInButtonClicked(ActionEvent event) {
        popup(event, "LogInWindow.fxml", "LogIn");
    }

    @FXML
    void ReservationButtonClicked(ActionEvent event) {
        System.out.println(PackageListView.getSelectionModel().getSelectedItem());
    }

    @FXML
    void SignUpButtonClicked(ActionEvent event) {
        popup(event, "RegisterWindow.fxml", "Register");
    }

    String[] ListViewContents = {"test", "test2"};
    String currentString;

    @FXML
    void SearchButtonClicked(ActionEvent event) {
        PackageListView.getItems().clear();
        PackageListView.getItems().addAll(ListViewContents);

    }
    
    String[] Destinations = {"Kilkis", "Thessaloniki", "Rodos"};
    
    @Override
    @FXML
    public void initialize(URL location, ResourceBundle resources) {
        DestinationChoiceBox.getItems().addAll(Destinations);
    }
    

}
