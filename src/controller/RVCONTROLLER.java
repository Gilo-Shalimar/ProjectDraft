package controller;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.stage.Stage;
import alert.AlertMaker;

public class RVCONTROLLER implements Initializable {

    @FXML
    Label name1, price1;

    @FXML
    ImageView img1;

    @FXML
    Button button1, button2, button3, cartbutton;

    @FXML
    private Stage stage;

    @FXML
    private Scene scene;

    @FXML
    static Parent homeRoot = null;

    FXMLLoader loader;

    @FXML
    static CheckoutController checkoutController = null;

    @Override
    public void initialize(URL location, ResourceBundle resources) {

        // name1.setText(LoginController.rvbong.getProductName());
        // price1.setText(Double.toString(LoginController.rvbong.getProductPrice()));
        // Image RVIMAGE = new Image(LoginController.rvbong.getProductImage());
        // img1.setImage(RVIMAGE);

    }

    public void buy(ActionEvent event) throws IOException {

        AlertMaker.showSimpleAlert("LIGHTPOP", "Added to Cart");

        Button sourceButton = (Button) event.getSource();

        // If addtocart button is pressed, set product status to true
        if (sourceButton.equals(button2)) {
            LoginController.btsbong.setProductStatus(true);
            LoginController.btsbong.setProductQuantity(1);
            LoginController.cart.addItem(LoginController.checkoutController.pane8);
        }

        LoginController.cart.showItems();
    }

    // Goes to Checkout.fxml
    public void gotocart(ActionEvent event) throws IOException {

        // Load items to cart before switching to checkout page
        LoginController.checkoutController.showItems(LoginController.cart.getItemList());

        // Set initial total amount in checkout page
        LoginController.checkoutController.getInitialAmount();

        Scene scene = new Scene(LoginController.homeRoot);
        stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        stage.setScene(scene);
        stage.show();
    }

    // Goes to Home.fxml
    public void gotohome(ActionEvent event) throws IOException {

        Parent root = FXMLLoader.load(getClass().getResource("/view/Home.fxml"));
        Scene scene = new Scene(root);
        stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        stage.setScene(scene);
        stage.show();
    }
}