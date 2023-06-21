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
import javafx.scene.control.Label;
import javafx.stage.Stage;


public class ReceiptController implements Initializable {

    @FXML
    double item1Amount, item2Amount, item3Amount , item4Amount , item5Amount , item6Amount , item7Amount , item8Amount , item9Amount , item10Amount;

    @FXML
    private Stage stage;

    @FXML
    private Scene scene;

    FXMLLoader loader;

    @FXML
    Label qty1, qty2, qty3, qty4, qty5, qty6, qty7, qty8, qty9, qty10, product1, product2, product3, product4, product5, product6, product7, product8, product9, product10, price1, price2, price3, price4, price5, price6, price7, price8, price9, price10, amount1, amount2, amount3 , amount4, amount5, amount6, amount7, amount8, amount9, amount10, total;

    @Override
    public void initialize(URL location, ResourceBundle resources) {

        if (LoginController.btsbong.getProductStatus()) {
            product1.setText(LoginController.btsbong.getProductName());
            qty1.setText(Double.toString(LoginController.btsbong.getProductQuantity()));
            price1.setText(Double.toString(LoginController.btsbong.getProductPrice()));
            amount1.setText(Double
                    .toString(LoginController.btsbong.getProductPrice() * LoginController.btsbong.getProductQuantity()));

            product1.setVisible(true);
            qty1.setVisible(true);
            price1.setVisible(true);
            amount1.setVisible(true);

            item1Amount = LoginController.btsbong.getProductPrice() * LoginController.btsbong.getProductQuantity();

        }

        if (LoginController.exobong.getProductStatus()) {
            product2.setText(LoginController.exobong.getProductName());
            qty2.setText(Double.toString(LoginController.exobong.getProductQuantity()));
            price2.setText(Double.toString(LoginController.exobong.getProductPrice()));
            amount2.setText(Double
                    .toString(LoginController.exobong.getProductPrice() * LoginController.exobong.getProductQuantity()));

            product2.setVisible(true);
            qty2.setVisible(true);
            price2.setVisible(true);
            amount2.setVisible(true);

            item2Amount = LoginController.exobong.getProductPrice() * LoginController.exobong.getProductQuantity();
        }

        if (LoginController.svtbong.getProductStatus()) {
            product3.setText(LoginController.svtbong.getProductName());
            qty3.setText(Double.toString(LoginController.svtbong.getProductQuantity()));
            price3.setText(Double.toString(LoginController.svtbong.getProductPrice()));
            amount3.setText(Double
                    .toString(LoginController.svtbong.getProductPrice() * LoginController.svtbong.getProductQuantity()));

            product3.setVisible(true);
            qty3.setVisible(true);
            price3.setVisible(true);
            amount3.setVisible(true);

            item3Amount = LoginController.svtbong.getProductPrice() * LoginController.svtbong.getProductQuantity();

        }

        if (LoginController.txtbong.getProductStatus()) {
            product4.setText(LoginController.txtbong.getProductName());
            qty4.setText(Double.toString(LoginController.txtbong.getProductQuantity()));
            price4.setText(Double.toString(LoginController.txtbong.getProductPrice()));
            amount4.setText(Double
                    .toString(LoginController.txtbong.getProductPrice() * LoginController.txtbong.getProductQuantity()));

            product4.setVisible(true);
            qty4.setVisible(true);
            price4.setVisible(true);
            amount4.setVisible(true);

            item4Amount = LoginController.txtbong.getProductPrice() * LoginController.txtbong.getProductQuantity();

        }

        if (LoginController.srkbong.getProductStatus()) {
            product5.setText(LoginController.srkbong.getProductName());
            qty5.setText(Double.toString(LoginController.srkbong.getProductQuantity()));
            price5.setText(Double.toString(LoginController.srkbong.getProductPrice()));
            amount5.setText(Double
                    .toString(LoginController.srkbong.getProductPrice() * LoginController.srkbong.getProductQuantity()));

            product5.setVisible(true);
            qty5.setVisible(true);
            price5.setVisible(true);
            amount5.setVisible(true);

            item5Amount = LoginController.srkbong.getProductPrice() * LoginController.srkbong.getProductQuantity();

        }

        if (LoginController.bpbong.getProductStatus()) {
            product6.setText(LoginController.bpbong.getProductName());
            qty6.setText(Double.toString(LoginController.bpbong.getProductQuantity()));
            price6.setText(Double.toString(LoginController.bpbong.getProductPrice()));
            amount6.setText(Double
                    .toString(LoginController.bpbong.getProductPrice() * LoginController.bpbong.getProductQuantity()));

            product6.setVisible(true);
            qty6.setVisible(true);
            price6.setVisible(true);
            amount6.setVisible(true);

            item6Amount = LoginController.bpbong.getProductPrice() * LoginController.bpbong.getProductQuantity();

        }

        if (LoginController.twbong.getProductStatus()) {
            product7.setText(LoginController.twbong.getProductName());
            qty7.setText(Double.toString(LoginController.twbong.getProductQuantity()));
            price7.setText(Double.toString(LoginController.twbong.getProductPrice()));
            amount7.setText(Double
                    .toString(LoginController.twbong.getProductPrice() * LoginController.twbong.getProductQuantity()));

            product7.setVisible(true);
            qty7.setVisible(true);
            price7.setVisible(true);
            amount7.setVisible(true);

            item7Amount = LoginController.twbong.getProductPrice() * LoginController.twbong.getProductQuantity();

        }

        if (LoginController.rvbong.getProductStatus()) {
            product8.setText(LoginController.rvbong.getProductName());
            qty8.setText(Double.toString(LoginController.rvbong.getProductQuantity()));
            price8.setText(Double.toString(LoginController.rvbong.getProductPrice()));
            amount8.setText(Double
                    .toString(LoginController.rvbong.getProductPrice() * LoginController.rvbong.getProductQuantity()));

            product8.setVisible(true);
            qty8.setVisible(true);
            price8.setVisible(true);
            amount8.setVisible(true);

            item3Amount = LoginController.rvbong.getProductPrice() * LoginController.rvbong.getProductQuantity();

        }

        if (LoginController.gibong.getProductStatus()) {
            product9.setText(LoginController.gibong.getProductName());
            qty9.setText(Double.toString(LoginController.gibong.getProductQuantity()));
            price9.setText(Double.toString(LoginController.gibong.getProductPrice()));
            amount9.setText(Double
                    .toString(LoginController.gibong.getProductPrice() * LoginController.gibong.getProductQuantity()));

            product9.setVisible(true);
            qty9.setVisible(true);
            price9.setVisible(true);
            amount9.setVisible(true);

            item9Amount = LoginController.gibong.getProductPrice() * LoginController.gibong.getProductQuantity();

        }

        if (LoginController.njbong.getProductStatus()) {
            product10.setText(LoginController.njbong.getProductName());
            qty10.setText(Double.toString(LoginController.njbong.getProductQuantity()));
            price10.setText(Double.toString(LoginController.njbong.getProductPrice()));
            amount10.setText(Double
                    .toString(LoginController.njbong.getProductPrice() * LoginController.njbong.getProductQuantity()));

            product10.setVisible(true);
            qty10.setVisible(true);
            price10.setVisible(true);
            amount10.setVisible(true);

            item10Amount = LoginController.njbong.getProductPrice() * LoginController.njbong.getProductQuantity();

        }

        double final_amount = item1Amount + item2Amount + item3Amount + item4Amount + item5Amount + item6Amount + item7Amount + item8Amount + item9Amount + item10Amount;
        total.setText(Double.toString(final_amount));

    }

    // Goes to Home.fxml
    public void gotohome(ActionEvent event) throws IOException {

        Parent root = FXMLLoader.load(getClass().getResource("/view/Home.fxml"));
        Scene scene = new Scene(root);
        stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        stage.setScene(scene);
        stage.show();
    }

    // exit
    public void quit() {
        stage.close();
    }

}
