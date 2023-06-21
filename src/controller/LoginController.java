package controller;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.stage.Stage;


import model.Cart;
import model.BTS;
import model.EXO;
import model.SVT;
import model.TXT;
import model.SRK;
import model.BP;
import model.TW;
import model.RV;
import model.GI;
import model.NJ;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;

public class LoginController implements Initializable {

    @FXML
    TextField mytextfield;

    @FXML
    PasswordField mypasswordfield;

    @FXML
    Button mybutton;

    @FXML
    Label mywarninglabel;

    @FXML
    HomeController homeController = null;

    @FXML
    static CheckoutController checkoutController = null;

    @FXML
    static Parent homeRoot = null;

    FXMLLoader loader;

    static BTS btsbong = new BTS();
    static EXO exobong = new EXO();
    static SVT svtbong = new SVT();
    static TXT txtbong = new TXT();
    static SRK srkbong = new SRK();
    static BP bpbong = new BP();
    static TW twbong = new TW();
    static RV rvbong = new RV();
    static GI gibong = new GI();
    static NJ njbong = new NJ();
    static Cart cart = new Cart();

    @Override
    public void initialize(URL location, ResourceBundle resources) {

        //BOYGROUP
        // =============================================//
        btsbong.setProductName("ARMY BONG");
        btsbong.setProductPrice(3700);
        btsbong.setProductImage("images/BTS.png");
     
        // =============================================//
        exobong.setProductName("EXO LIGHTSTICK VER 2");
        exobong.setProductPrice(2700);
        exobong.setProductImage("images/EXO.png");
       
        // =============================================//
        svtbong.setProductName("CARAT BONG VER 2");
        svtbong.setProductPrice(3300);
        svtbong.setProductImage("images/SVT.png");
       
        // =============================================//
        txtbong.setProductName("MOA BONG");
        txtbong.setProductPrice(3300);
        txtbong.setProductImage("images/TXT.png");
       
        // =============================================//
        srkbong.setProductName("STRAY KIDS LIGHTSTICK");
        srkbong.setProductPrice(2700);
        srkbong.setProductImage("images/SRK.png");

        //GIRLGROUP
        // =============================================//
        bpbong.setProductName("BI-PONG BONG");
        bpbong.setProductPrice(2700);
        bpbong.setProductImage("images/BP.png");
       
        // =============================================//
        twbong.setProductName("CANDY BONG VER 2");
        twbong.setProductPrice(2500);
        twbong.setProductImage("images/TW.png");

        // =============================================//
        rvbong.setProductName("RED VELVET LIGHTSTICK");
        rvbong.setProductPrice(3200);
        rvbong.setProductImage("images/RV.png");

        // =============================================//
        gibong.setProductName("(G)I-DLE LIGHTSTICK VER 2");
        gibong.setProductPrice(2500);
        gibong.setProductImage("images/GI.png");

        // =============================================//
        njbong.setProductName("NEWJEANS LIGHTSTICK");
        njbong.setProductPrice(2500);
        njbong.setProductImage("images/NJ.png");


        // TODO Auto-generated method stub

        try {
            loader = new FXMLLoader(getClass().getResource("/view/Checkout.fxml"));
            homeRoot = loader.load();
        } 
        catch (Exception e) {
            // TODO: handle exception
            e.printStackTrace();

        }

        // Clears all items in Checkout.fxml
        checkoutController = loader.getController();
        checkoutController.myvbox.getChildren().removeAll(checkoutController.myvbox.getChildren());
    }

    public void login(ActionEvent event) throws IOException {

        String username = mytextfield.getText();
        String password = mypasswordfield.getText();

        if (username.equals("a") && password.equals("a")) {

            Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
            FXMLLoader loader = new FXMLLoader(getClass().getResource("/view/Home.fxml"));
            Parent root = loader.load();
            Scene scene = new Scene(root);
            stage.setScene(scene);
            stage.show();
            stage.setResizable(false);

        } else {
            mywarninglabel.setVisible(true);
        }
    }

}