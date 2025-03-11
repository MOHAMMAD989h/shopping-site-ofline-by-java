package com.example.site;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.control.ComboBox;
import javafx.stage.Stage;
import java.net.URL;
import java.util.ResourceBundle;

import static com.example.site.loginpage.*;

public class tablet implements Initializable {
    @FXML
    public ComboBox<String> com1;
    ObservableList<String> list = FXCollections.observableArrayList("لپ تاپ ها","لوازم جانبی");

    @Override
    public void initialize(URL location, ResourceBundle resources) {
        com1.setItems(list);
        com1.setOnAction(this::handleComboBoxAction);
    }
    public void handleComboBoxAction(ActionEvent event) {
        String selectedOption = com1.getValue();
        if("لپ تاپ ها".equals(selectedOption)){
            openNewWindow("lap.fxml","لپتاپ ها",event);
        }
        if ("لوازم جانبی".equals(selectedOption)) {
            openNewWindow("janebi.fxml", "لوازم جانبی", event);
        }
        if("تبلت ها و لوازم جانبی".equals(selectedOption)){
            openNewWindow("tablet.fxml","تبلت ها و لوازم جانبی",event);
        }
    }

    //باز شدن صفحه کنسول های بازی
    public void openNewWindow(String fxmlFile, String title, ActionEvent event) {
        try {
            FXMLLoader loader = new FXMLLoader(getClass().getResource(fxmlFile));
            Scene scene = new Scene(loader.load(), 1535, 790);


            Stage stage = new Stage();
            stage.setScene(scene);
            stage.setTitle(title);
            stage.show();


            Stage currentStage = (Stage) ((Node) event.getSource()).getScene().getWindow();
            currentStage.close();
            if(fxmlFile.equals("/com/example/site/profile1.fxml")){System.out.println("اینجا امدم");
                loginpage controller = loader.getController();
                controller.txtName.setText(resi_name);
                controller.txtUsername.setText(username);
                controller.txtEmail.setText(resi_email);
                controller.txtPostcode.setText(resi_postcode);
                controller.txtAddress.setText(resi_address);
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    public void mainpage(ActionEvent event) {
        try {
            FXMLLoader loader = new FXMLLoader(getClass().getResource("hello-view.fxml"));
            Scene scene = new Scene(loader.load(), 1535, 790);

            // ایجاد و نمایش صفحه جدید
            Stage stage = new Stage();
            stage.setScene(scene);
            stage.setTitle("lenoShop");
            stage.show();

            // بستن صفحه فعلی
            Stage currentStage = (Stage) ((Node) event.getSource()).getScene().getWindow();
            currentStage.close();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    public void why(ActionEvent event) {
        try {
            FXMLLoader loader = new FXMLLoader(getClass().getResource("why.fxml"));
            Scene scene = new Scene(loader.load(), 1535, 790);

            // ایجاد و نمایش صفحه جدید
            Stage stage = new Stage();
            stage.setScene(scene);
            stage.setTitle("چرا لنوو");
            stage.show();

            // بستن صفحه فعلی
            Stage currentStage = (Stage) ((Node) event.getSource()).getScene().getWindow();
            currentStage.close();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    public void backpage(ActionEvent event) {
        openNewWindow("hello-view.fxml","lenoShop",event);
    }
    public void sabadpage(ActionEvent event) {
        if(loginpage.mm) {
            try {
                FXMLLoader loader = new FXMLLoader(getClass().getResource("/com/example/site/sabad.fxml"));
                Scene scene = new Scene(loader.load(), 1535, 790);

                // ایجاد و نمایش صفحه جدید
                Stage stage = new Stage();
                stage.setScene(scene);
                stage.setTitle("lenoshop");
                stage.show();

                // بستن صفحه فعلی
                Stage currentStage = (Stage) ((Node) event.getSource()).getScene().getWindow();
                currentStage.close();

            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        else {
            try {
                FXMLLoader loader = new FXMLLoader(getClass().getResource("/com/example/site/loginpage.fxml"));
                Scene scene = new Scene(loader.load(), 1535, 790);

                // ایجاد و نمایش صفحه جدید
                Stage stage = new Stage();
                stage.setScene(scene);
                stage.setTitle("profile");
                stage.show();

                // بستن صفحه فعلی
                Stage currentStage = (Stage) ((Node) event.getSource()).getScene().getWindow();
                currentStage.close();

            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }
    //تبلت ها
    public void tablet1 (ActionEvent event) { openNewWindow("tablet1.fxml", "LenoShop", event); }
    public void tablet2 (ActionEvent event) { openNewWindow("tablet2.fxml", "LenoShop", event); }
    public void tablet3(ActionEvent event) { openNewWindow("tablet3.fxml", "LenoShop", event); }
    public void tablet4(ActionEvent event) { openNewWindow("tablet4.fxml", "LenoShop", event); }
    public void tablet5 (ActionEvent event) { openNewWindow("tablet5.fxml", "LenoShop", event); }
    public void tablet6 (ActionEvent event) { openNewWindow("tablet6.fxml", "LenoShop", event); }
    public void tablet7 (ActionEvent event) { openNewWindow("tablet7.fxml", "LenoShop", event); }
    public void tablet8 (ActionEvent event) { openNewWindow("tablet8.fxml", "LenoShop", event); }
    public void tablet9 (ActionEvent event) { openNewWindow("tablet9.fxml", "LenoShop", event); }
    public void tablet10 (ActionEvent event) { openNewWindow("tablet10.fxml", "LenoShop", event); }
    public void tablet11(ActionEvent event) { openNewWindow("tablet11.fxml", "LenoShop", event); }
    public void tablet12(ActionEvent event) { openNewWindow("tablet12.fxml", "LenoShop", event); }
    public void tablet13(ActionEvent event) { openNewWindow("tablet13.fxml", "LenoShop", event); }
    public void tablet14(ActionEvent event) { openNewWindow("tablet14.fxml", "LenoShop", event); }
    public void tablet15 (ActionEvent event) { openNewWindow("tablet15.fxml", "LenoShop", event); }

    public void tabletToProfile(ActionEvent actionEvent) {
        try {
            if(loginpage.loginID) {
                openNewWindow("/com/example/site/profile1.fxml","Profile",actionEvent);
            }
            else{
                openNewWindow("/com/example/site/loginpage.fxml","Loginpage",actionEvent);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

