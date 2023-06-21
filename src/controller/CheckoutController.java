package controller;

import java.io.IOException;
import java.net.URL;
import java.util.ArrayList;
import java.util.ResourceBundle;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.Node;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.Pane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class CheckoutController implements Initializable {

    @FXML
    Pane pane1, pane2, pane3, pane4, pane5, pane6, pane7, pane8, pane9, pane10;

    @FXML
    VBox myvbox;

    @FXML
    Label name1, name2, name3, name4, name5, name6, name7, name8, name9, name10, price1, price2, price3, price4, price5, price6, price7, price8, price9, price10, total;

    @FXML
    ImageView img1, img2, img3, img4, img5, img6, img7, img8, img9, img10;

    @FXML
    private ChoiceBox<String> choicebox1, choicebox2, choicebox3, choicebox4, choicebox5, choicebox6, choicebox7, choicebox8, choicebox9, choicebox10;

    private String[] quantity = { "1", "2", "3" , "4", "5"};

    @Override
    public void initialize(URL location, ResourceBundle resources) {

        //BOYGROUP
        name1.setText(LoginController.btsbong.getProductName());
        price1.setText(Double.toString(LoginController.btsbong.getProductPrice()));
        Image bts = new Image(LoginController.btsbong.getProductImage());
        img1.setImage(bts);

        name2.setText(LoginController.exobong.getProductName());
        price2.setText(Double.toString(LoginController.exobong.getProductPrice()));
        Image exo = new Image(LoginController.exobong.getProductImage());
        img2.setImage(exo);

        name3.setText(LoginController.svtbong.getProductName());
        price3.setText(Double.toString(LoginController.svtbong.getProductPrice()));
        Image svt = new Image(LoginController.svtbong.getProductImage());
        img3.setImage(svt);

        name4.setText(LoginController.txtbong.getProductName());
        price4.setText(Double.toString(LoginController.txtbong.getProductPrice()));
        Image txt = new Image(LoginController.txtbong.getProductImage());
        img4.setImage(txt);

        name5.setText(LoginController.srkbong.getProductName());
        price5.setText(Double.toString(LoginController.srkbong.getProductPrice()));
        Image srk = new Image(LoginController.srkbong.getProductImage());
        img5.setImage(srk);

        //GIRLGROUP
        name6.setText(LoginController.bpbong.getProductName());
        price6.setText(Double.toString(LoginController.bpbong.getProductPrice()));
        Image bp = new Image(LoginController.bpbong.getProductImage());
        img6.setImage(bp);

        name7.setText(LoginController.twbong.getProductName());
        price7.setText(Double.toString(LoginController.twbong.getProductPrice()));
        Image tw = new Image(LoginController.twbong.getProductImage());
        img7.setImage(tw);

        name8.setText(LoginController.rvbong.getProductName());
        price8.setText(Double.toString(LoginController.rvbong.getProductPrice()));
        Image rv = new Image(LoginController.rvbong.getProductImage());
        img8.setImage(rv);

        name9.setText(LoginController.gibong.getProductName());
        price9.setText(Double.toString(LoginController.gibong.getProductPrice()));
        Image gi = new Image(LoginController.gibong.getProductImage());
        img9.setImage(gi);

        name10.setText(LoginController.njbong.getProductName());
        price10.setText(Double.toString(LoginController.njbong.getProductPrice()));
        Image nj = new Image(LoginController.njbong.getProductImage());
        img10.setImage(nj);


        // Set default quantities in choicebox to 1
        choicebox1.setValue("1");
        choicebox2.setValue("1");
        choicebox3.setValue("1");
        choicebox4.setValue("1");
        choicebox5.setValue("1");
        choicebox6.setValue("1");
        choicebox7.setValue("1");
        choicebox8.setValue("1");
        choicebox9.setValue("1");
        choicebox10.setValue("1");

        // Insert quantity array to choicebox
        choicebox1.getItems().addAll(quantity);
        choicebox2.getItems().addAll(quantity);
        choicebox3.getItems().addAll(quantity);
        choicebox4.getItems().addAll(quantity);
        choicebox5.getItems().addAll(quantity);
        choicebox6.getItems().addAll(quantity);
        choicebox7.getItems().addAll(quantity);
        choicebox8.getItems().addAll(quantity);
        choicebox9.getItems().addAll(quantity);
        choicebox10.getItems().addAll(quantity);

        // Add event handler on all choiceboxes
        choicebox1.setOnAction(this::computeTotal);
        choicebox2.setOnAction(this::computeTotal);
        choicebox3.setOnAction(this::computeTotal);
        choicebox4.setOnAction(this::computeTotal);
        choicebox5.setOnAction(this::computeTotal);
        choicebox6.setOnAction(this::computeTotal);
        choicebox7.setOnAction(this::computeTotal);
        choicebox8.setOnAction(this::computeTotal);
        choicebox9.setOnAction(this::computeTotal);
        choicebox10.setOnAction(this::computeTotal);
    }

    public void computeTotal(ActionEvent event) {

        double totalAmount = 0;
        double item1Amount = 0;
        double item2Amount = 0;
        double item3Amount = 0;
        double item4Amount = 0;
        double item5Amount = 0;
        double item6Amount = 0;
        double item7Amount = 0;
        double item8Amount = 0;
        double item9Amount = 0;
        double item10Amount = 0;

        ChoiceBox source = (ChoiceBox) event.getSource();

        // If product is chosen, compute item amount
        if (LoginController.btsbong.getProductStatus()) {

            double qty = Double.parseDouble(choicebox1.getValue());
            LoginController.btsbong.setProductQuantity(qty);
            item1Amount = LoginController.btsbong.getProductPrice() * qty;

            if (source == choicebox1) {
                item1Amount = LoginController.btsbong.getProductPrice() * qty;
            }
        }

        if (LoginController.exobong.getProductStatus()) {

            double qty = Double.parseDouble(choicebox2.getValue());
            LoginController.exobong.setProductQuantity(qty);
            item2Amount = LoginController.exobong.getProductPrice() * qty;

            if (source == choicebox2) {
                item2Amount = LoginController.exobong.getProductPrice() * qty;
            }
        }

        if (LoginController.svtbong.getProductStatus()) {

            double qty = Double.parseDouble(choicebox3.getValue());
            LoginController.svtbong.setProductQuantity(qty);
            item3Amount = LoginController.svtbong.getProductPrice() * qty;

            if (source == choicebox3) {
                item3Amount = LoginController.svtbong.getProductPrice() * qty;
            }
        }

        if (LoginController.txtbong.getProductStatus()) {

            double qty = Double.parseDouble(choicebox4.getValue());
            LoginController.txtbong.setProductQuantity(qty);
            item4Amount = LoginController.txtbong.getProductPrice() * qty;

            if (source == choicebox4) {
                item4Amount = LoginController.txtbong.getProductPrice() * qty;
            }
        }
        
        if (LoginController.srkbong.getProductStatus()) {

            double qty = Double.parseDouble(choicebox5.getValue());
            LoginController.srkbong.setProductQuantity(qty);
            item5Amount = LoginController.srkbong.getProductPrice() * qty;

            if (source == choicebox5) {
                item5Amount = LoginController.srkbong.getProductPrice() * qty;
            }
        }
        
        if (LoginController.bpbong.getProductStatus()) {

            double qty = Double.parseDouble(choicebox6.getValue());
            LoginController.bpbong.setProductQuantity(qty);
            item6Amount = LoginController.bpbong.getProductPrice() * qty;

            if (source == choicebox6) {
                item6Amount = LoginController.bpbong.getProductPrice() * qty;
            }
        }

        if (LoginController.twbong.getProductStatus()) {

            double qty = Double.parseDouble(choicebox7.getValue());
            LoginController.twbong.setProductQuantity(qty);
            item7Amount = LoginController.twbong.getProductPrice() * qty;

            if (source == choicebox8) {
                item7Amount = LoginController.twbong.getProductPrice() * qty;
            }
        }

        if (LoginController.rvbong.getProductStatus()) {

            double qty = Double.parseDouble(choicebox8.getValue());
            LoginController.rvbong.setProductQuantity(qty);
            item8Amount = LoginController.rvbong.getProductPrice() * qty;

            if (source == choicebox9) {
                item8Amount = LoginController.rvbong.getProductPrice() * qty;
            }
        }

        if (LoginController.gibong.getProductStatus()) {

            double qty = Double.parseDouble(choicebox9.getValue());
            LoginController.gibong.setProductQuantity(qty);
            item9Amount = LoginController.gibong.getProductPrice() * qty;

            if (source == choicebox10) {
                item9Amount = LoginController.gibong.getProductPrice() * qty;
            }
        }

        if (LoginController.njbong.getProductStatus()) {

            double qty = Double.parseDouble(choicebox10.getValue());
            LoginController.njbong.setProductQuantity(qty);
            item10Amount = LoginController.njbong.getProductPrice() * qty;

            if (source == choicebox4) {
                item10Amount = LoginController.njbong.getProductPrice() * qty;
            }
        }

        // Compute total amount for all items chosen
        totalAmount = item1Amount + item2Amount + item3Amount + item4Amount + item5Amount + item6Amount + item7Amount + item8Amount + item9Amount + item10Amount;

        // Display total amount in total label
        total.setText(Double.toString(totalAmount));
    }

    // Computes initial Amount before modifying item quantity
    public void getInitialAmount() {

        double totalAmount = 0.00;

        if (LoginController.btsbong.getProductStatus()) {
            totalAmount += LoginController.btsbong.getProductPrice();
        }

        if (LoginController.exobong.getProductStatus()) {
            totalAmount += LoginController.exobong.getProductPrice();
        }

        if (LoginController.svtbong.getProductStatus()) {
            totalAmount += LoginController.svtbong.getProductPrice();
        }

         if (LoginController.txtbong.getProductStatus()) {
            totalAmount += LoginController.txtbong.getProductPrice();
        }

        if (LoginController.srkbong.getProductStatus()) {
            totalAmount += LoginController.srkbong.getProductPrice();
        }

        if (LoginController.bpbong.getProductStatus()) {
            totalAmount += LoginController.bpbong.getProductPrice();
        }

        if (LoginController.twbong.getProductStatus()) {
            totalAmount += LoginController.twbong.getProductPrice();
        }

        if (LoginController.rvbong.getProductStatus()) {
            totalAmount += LoginController.rvbong.getProductPrice();
        }

        if (LoginController.gibong.getProductStatus()) {
            totalAmount += LoginController.gibong.getProductPrice();
        }

        if (LoginController.njbong.getProductStatus()) {
            totalAmount += LoginController.njbong.getProductPrice();
        }

        total.setText(Double.toString(totalAmount));
    }

    // Go to Receipt Page
    public void checkout(ActionEvent event) throws IOException {

        Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        FXMLLoader loader = new FXMLLoader(getClass().getResource("/view/Receipt.fxml"));
        Parent root = loader.load();
        Scene scene = new Scene(root);
        stage.setScene(scene);
        stage.show();

    }

    // Go to Home Page
    public void gotohome(ActionEvent event) throws IOException {

        Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        FXMLLoader loader = new FXMLLoader(getClass().getResource("/view/Home.fxml"));
        Parent root = loader.load();
        Scene scene = new Scene(root);
        stage.setScene(scene);
        stage.show();

    }

    // Show all items in ArrayList
    public void showItems(ArrayList<Pane> itemList) {
        for (Pane p : itemList)
        //  if (!myvbox.getChildren().contains(p)){
            myvbox.getChildren().add(p);
        // }
    }
}