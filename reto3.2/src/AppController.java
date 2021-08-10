import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;

public class AppController {

    @FXML
    private TextField N;

    @FXML
    private TextArea Input;

    @FXML
    private TextArea Output;

    @FXML
    private Button Calcular;

    @FXML
    private Button limpiar;

    @FXML
    void onCalcular(ActionEvent event) {
        input input = new input();
        input.loadData(Integer.parseInt(N.getText()),Input.getText());
        Output.setText(input.stat1() + "\n" + input.stat2() + "\n" + input.stat3());
    }

    @FXML
    void onLimpiar(ActionEvent event) {

    }

}

