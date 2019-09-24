package sample;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Tab;
import javafx.scene.control.TextArea;

import java.sql.SQLException;

public class Controller {

    @FXML
    private Tab tab1;

    @FXML
    private TextArea textArea1;

    @FXML
    private Tab tab2;

    @FXML
    private Tab tab3;

    @FXML
    private Button submitButton;

    @FXML
    void showTheResult(ActionEvent event) {
        try{

            DatabaseManager hk = new DatabaseManager();
            hk.selectAll();
            String name = hk.getNameY();
            textArea1.setText(name);


        }
        catch(SQLException ex){
            ex.printStackTrace();
        }

    }
}