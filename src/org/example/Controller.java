package org.example;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Controller {
    @FXML
    private TextField textField;
    @FXML
    private TextArea textArea;
    @FXML
    private Button sendBtn;

    @FXML
    private void clickSendMsg(ActionEvent actionEvent) {
        if (!textField.getText().equals("")) {
            textArea.appendText(getTime() + ": " +textField.getText() + System.lineSeparator());
            textField.clear();
            textField.requestFocus();
        }
    }

    public String getTime() {
        return new SimpleDateFormat("HH:mm:ss").format(new Date());
    }

}
