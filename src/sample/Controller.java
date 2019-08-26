package sample;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.input.MouseEvent;
import javafx.scene.control.TextField;

public class Controller {

    @FXML
    private Button btnEnter;

    @FXML
    private TextField txtName;

    @FXML
    private Label lblName;

    @FXML
    void showName(MouseEvent event) {
        //System.out.println("In showName");
        String name = txtName.getText();
        lblName.setText("Hello " + name);
    }

}