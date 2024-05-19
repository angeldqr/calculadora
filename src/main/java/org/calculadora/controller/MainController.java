package org.calculadora.controller;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;

import java.net.URL;
import java.util.ResourceBundle;

public class MainController implements Initializable {

    int num1, num2, num3;

    @FXML
    private Button buttonSumar;

    @FXML
    private TextField textFieldNumero1;

    @FXML
    private TextField textFieldNumero2;

    @FXML
    private TextField textFieldResultado;

    @FXML
    void setOnActionSumar(ActionEvent event) {
        num1 = Integer.parseInt(textFieldNumero1.getText());
        num2 = Integer.parseInt(textFieldNumero2.getText());
        num3 = num1+num2;
        textFieldResultado.setText(num3+"");
    }

    @Override
    public void initialize(URL location, ResourceBundle resources) {
        num1 = 0;
        num2 = 0;
        num3 = 0;

    }
}
