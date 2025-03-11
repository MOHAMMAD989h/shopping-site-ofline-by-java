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

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

public class cart1 implements Initializable {
    @FXML
    public void cart1ToProfile(ActionEvent event) throws IOException {
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
    @FXML
    public ComboBox<String> com1;
    ObservableList<String> list = FXCollections.observableArrayList("قطعات کامپیوتر", "سیستم های یکپارچه", "کنسول های بازی", "لپ تاپ");

    @Override
    public void initialize(URL location, ResourceBundle resources) {
        com1.setItems(list);
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

    public void homeToCart1(ActionEvent event) {
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