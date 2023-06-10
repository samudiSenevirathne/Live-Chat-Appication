package controller;

import com.jfoenix.controls.JFXButton;
import com.jfoenix.controls.JFXTextField;
import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.input.KeyEvent;
import javafx.scene.layout.AnchorPane;
import javafx.scene.paint.Paint;
import javafx.stage.Stage;

import java.io.IOException;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class LoginFormController {

    public JFXButton btnMiniId;
    public AnchorPane loginFormContext;
    public JFXTextField txtClientName;
    public Label lblClientNameWarning;
    private Stage stage;
    static String clientName;

    Matcher clientNameMatcher;

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


    public void btnLoginOnAvtion(ActionEvent actionEvent) throws IOException {
        clientName = txtClientName.getText();
        Stage stage =(Stage) loginFormContext.getScene().getWindow();
        FXMLLoader loader = new FXMLLoader(getClass().getResource("/view/ClientForm.fxml"));
        Scene scene = new Scene(loader.load());
        stage.centerOnScreen();
        stage.setScene(scene);
        ((ClientFormController) loader.getController()).inti(stage);
        txtClientName.clear();
    }

    public void txtClientNameKeyReleasedOnAction(KeyEvent keyEvent) {
        lblClientNameWarning.setText("");
        txtClientName.setFocusColor(Paint.valueOf("Blue"));

        Pattern namePattern = Pattern.compile("^[a-zA-Z]{4,}$");
        clientNameMatcher= namePattern.matcher(txtClientName.getText());

        if (!clientNameMatcher.matches()) {
            txtClientName.requestFocus();
            txtClientName.setFocusColor(Paint.valueOf("Red"));
            lblClientNameWarning.setText("invalid");
        }
    }
}
