package controller;

import java.io.IOException;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.stage.Stage;

public class HomeController {


    @FXML
    Button button1, button2, button3, button4, button5, button6, button7, button8, button9, button10 , button11;

    @FXML
    private Stage stage;

    @FXML
    private Scene scene;

    FXMLLoader loader;

    //BOYGROUP
    // Goes to Product screen
    public void gotobts(ActionEvent event) throws IOException {

        Parent root = FXMLLoader.load(getClass().getResource("/view/BTS.fxml"));
        Scene scene = new Scene(root);
        stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        stage.setScene(scene);
        stage.show();
    }

    // Goes to Product screen
    public void gotoexo(ActionEvent event) throws IOException {

        Parent root = FXMLLoader.load(getClass().getResource("/view/EXO.fxml"));
        Scene scene = new Scene(root);
        stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        stage.setScene(scene);
        stage.show();
    }

    // Goes to Product screen
    public void gotosvt(ActionEvent event) throws IOException {

        Parent root = FXMLLoader.load(getClass().getResource("/view/SVT.fxml"));
        Scene scene = new Scene(root);
        stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        stage.setScene(scene);
        stage.show();
    }

    // Goes to Product screen
    public void gototxt(ActionEvent event) throws IOException {

        Parent root = FXMLLoader.load(getClass().getResource("/view/TXT.fxml"));
        Scene scene = new Scene(root);
        stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        stage.setScene(scene);
        stage.show();
    }

    // Goes to Product screen
    public void gotosrk(ActionEvent event) throws IOException {

        Parent root = FXMLLoader.load(getClass().getResource("/view/SRK.fxml"));
        Scene scene = new Scene(root);
        stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        stage.setScene(scene);
        stage.show();
    }

    //GIRLGROUP
    // Goes to Product screen
    public void gotobp(ActionEvent event) throws IOException {

        Parent root = FXMLLoader.load(getClass().getResource("/view/BP.fxml"));
        Scene scene = new Scene(root);
        stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        stage.setScene(scene);
        stage.show();
    }

    // Goes to Product screen
    public void gototw(ActionEvent event) throws IOException {

        Parent root = FXMLLoader.load(getClass().getResource("/view/TW.fxml"));
        Scene scene = new Scene(root);
        stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        stage.setScene(scene);
        stage.show();
    }

    // Goes to Product screen
    public void gotorv(ActionEvent event) throws IOException {

        Parent root = FXMLLoader.load(getClass().getResource("/view/RV.fxml"));
        Scene scene = new Scene(root);
        stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        stage.setScene(scene);
        stage.show();
    }

    // Goes to Product screen
    public void gotogi(ActionEvent event) throws IOException {

        Parent root = FXMLLoader.load(getClass().getResource("/view/GI.fxml"));
        Scene scene = new Scene(root);
        stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        stage.setScene(scene);
        stage.show();
    }

    // Goes to Product screen
    public void gotonj(ActionEvent event) throws IOException {

        Parent root = FXMLLoader.load(getClass().getResource("/view/NJ.fxml"));
        Scene scene = new Scene(root);
        stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        stage.setScene(scene);
        stage.show();
    }

    
    // Goes to Checkout.fxml
    public void gotocart(ActionEvent event) throws IOException {

        Parent root = FXMLLoader.load(getClass().getResource("/view/Checkout.fxml"));
        Scene scene = new Scene(root);
        stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        stage.setScene(scene);
        stage.show();
    }
}