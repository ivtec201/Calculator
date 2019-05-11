package sample;

import javafx.application.Platform;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;

public class Controller {

    Button button1;
    Button button2;
    Button button3;

    @FXML
    Label txtAkcja;

    @FXML
    Label txtHist;

    private double wartosc1;
    private double wartosc2;

    @FXML
    public void clickNumber(ActionEvent actionEvent1) {

        button1 = (Button) actionEvent1.getSource();

        txtAkcja.setText(txtAkcja.getText() + button1.getText());

        wartosc1 = Double.valueOf(txtAkcja.getText());
    }

    private String dzialanie = "";

    @FXML
    public void clickAction(ActionEvent actionEvent2) {

        button2 = (Button) actionEvent2.getSource();

        dzialanie = button2.getText();

        wartosc2 = wartosc1;

        txtHist.setText(txtHist.getText() + txtAkcja.getText());

        txtHist.setText(txtHist.getText() + button2.getText());

        txtAkcja.setText("");
    }

    @FXML
    public void equals() {

        double wynik;

        switch (dzialanie) {
            case "+":
                wynik = wartosc2 + wartosc1;
                txtAkcja.setText(String.valueOf(wynik));
//                txtHist.setText(txtHist.getText() + wynik);
                break;
            case "-":
                wynik = wartosc2 - wartosc1;
                txtAkcja.setText(String.valueOf(wynik));
                break;
            case "×":
                wynik = wartosc2 * wartosc1;
                txtAkcja.setText(String.valueOf(wynik));
                break;
            case "÷":
                wynik = wartosc2 / wartosc1;
                txtAkcja.setText(String.valueOf(wynik));
                break;
        }

    }

    @FXML
    public void bckspc() {

        String okno1 = txtAkcja.getText();

        if (okno1.length() != 0) {
            okno1 = okno1.substring(0, okno1.length() - 1);
        }

        txtAkcja.setText(okno1);
    }

    @FXML
    public void c() {

        txtAkcja.setText("");
        txtHist.setText("");
    }

    @FXML
    public void ce() {

        txtAkcja.setText("");
    }

    private String akcja = "";

    boolean x = false;
    boolean y = false;
    boolean z = false;

    public Controller(boolean x, boolean y, boolean z) {
        this.x = x;
        this.y = y;
        this.z = z;
    }

    public boolean isX() {
        return x;
    }

    public boolean isY() {
        return y;
    }

    public boolean isZ() {
        return z;
    }

    @FXML
    public void progOp(ActionEvent actionEvent3) {

        button3 = (Button) actionEvent3.getSource();

        akcja = button2.getText();

        switch (akcja) {
            case "-":
                Platform.exit();
                break;
            case "□":
                y = true;
                break;
            case "X":

                break;
        }

    }
}