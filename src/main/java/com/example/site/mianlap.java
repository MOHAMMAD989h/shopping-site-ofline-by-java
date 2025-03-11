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

public class mianlap implements Initializable {

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
        if ("لوازم جانبی".equals(selectedOption)) {
            openNewWindow("janebi.fxml", "لوازم جانبی", event);
        }
        if("تبلت ها و لوازم جانبی".equals(selectedOption)){
            openNewWindow("tablet.fxml","تبلت ها و لوازم جانبی",event);
        }
    }
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
    public void backpage(ActionEvent event) {
        openNewWindow("lap.fxml","lenoShop",event);
    }
    public void mainpage(ActionEvent event) {
        try {
            FXMLLoader loader = new FXMLLoader(getClass().getResource("hello-view.fxml"));
            Scene scene = new Scene(loader.load(), 1535, 790);

            // ایجاد و نمایش صفحه جدید
            Stage stage = new Stage();
            stage.setScene(scene);
            stage.setTitle("LenoShop");
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

    public void mian4(ActionEvent event) {
        openNewWindow("mian4.fxml","lenoShop",event);
    }
    public void mian3(ActionEvent event) {
        openNewWindow("mian3.fxml","lenoShop",event);
    }
    public void mian8(ActionEvent event) {
        openNewWindow("mian8.fxml","lenoShop",event);
    }
    public void mian2(ActionEvent event) {
        openNewWindow("mian2.fxml","lenoShop",event);
    }
    public void mian1(ActionEvent event) {
        openNewWindow("mian1.fxml","lenoShop",event);
    }
    public void mian7(ActionEvent event) {
        openNewWindow("mian7.fxml","lenoShop",event);
    }
    public void mian6(ActionEvent event) {
        openNewWindow("mian6.fxml","lenoShop",event);
    }
    public void mian5(ActionEvent event) {
        openNewWindow("mian5.fxml","lenoShop",event);
    }
    public void mian10(ActionEvent event) {
        openNewWindow("mian10.fxml","lenoShop",event);
    }
    public void mian9(ActionEvent event) {
        openNewWindow("mian9.fxml","lenoShop",event);
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

    public void mianlapToProfile(ActionEvent actionEvent) {
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
