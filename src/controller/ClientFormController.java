package controller;

import com.jfoenix.controls.JFXButton;
import com.jfoenix.controls.JFXTextField;
import javafx.event.ActionEvent;
import javafx.scene.control.Label;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class ClientFormController {
    public JFXButton btnMiniId;
    public Label lblClientName;
    public VBox vBox;
    public AnchorPane clientContext;
    private Stage stage;


    public void initialize(){


    }

    public void inti(Stage stage){
        this.stage=stage;
    }

    public void btnMinimizeOnAction(ActionEvent actionEvent) {
        stage.setIconified(true);
    }

    public void btnCloseOnAction(ActionEvent actionEvent) {
        stage.close();
    }

    public void ImageMouseClicked(MouseEvent mouseEvent) {


    }

    public void msgSendOnAction(ActionEvent actionEvent) {


    }
}
