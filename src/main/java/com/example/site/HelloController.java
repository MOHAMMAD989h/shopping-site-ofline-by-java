package com.example.site;
import javafx.scene.control.Control;
import javafx.scene.control.ScrollPane;
import javafx.scene.control.TextField;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.control.ComboBox;
import javafx.scene.input.KeyCode;
import javafx.scene.input.KeyEvent;
import javafx.scene.input.MouseEvent;
import javafx.stage.Stage;

import java.io.IOException;
import java.net.URL;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;
import java.util.ResourceBundle;

import static com.example.site.loginpage.*;

public class HelloController implements Initializable {

    @FXML
    public void homeToProfile(ActionEvent event) throws IOException {
        /*FXMLLoader loderMoshtari= new FXMLLoader(getClass().getResource("/com/example/site/login.fxml"));
        loginpage moshtari=loderMoshtari.getController();
        moshtari.txtName.setText(resi_name);
        moshtari.txtUsername.setText(username);
        moshtari.txtEmail.setText(resi_email);
        moshtari.txtPostcode.setText(resi_postcode);
        moshtari.txtAddress.setText(resi_address);*/
        try {
            if(loginpage.loginID) {
                openNewWindow("/com/example/site/profile1.fxml","Profile",event);
            }
            else{
                openNewWindow("/com/example/site/loginpage.fxml","Loginpage",event);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    @FXML
    public ComboBox<String> com1;
    @FXML
    private ScrollPane myScrollPane;
    ObservableList<String> list = FXCollections.observableArrayList("لپ تاپ ها","تبلت ها و لوازم جانبی", "لوازم جانبی");
    @Override
    public void initialize(URL location, ResourceBundle resources) {
        com1.setItems(list);
        com1.setOnAction(this::handleComboBoxAction);

        imagePaths = new ArrayList<>();
        imagePaths.add(getClass().getResource("/Images/main menu/2.jpg").toExternalForm());
        imagePaths.add(getClass().getResource("/Images/main menu/3.jpg").toExternalForm());
        imagePaths.add(getClass().getResource("/Images/main menu/4.jpg").toExternalForm());

        showImage();
        /*myScrollPane.addEventFilter(KeyEvent.KEY_PRESSED, event -> {
            if (event.getCode() == KeyCode.UP || event.getCode() == KeyCode.DOWN) {
                event.consume();
                double scrollAmount = (event.getCode() == KeyCode.UP) ? 0.05 : -0.05 ;
                double newValue = myScrollPane.getVvalue() + scrollAmount;
                newValue = Math.max(0, Math.min(1, newValue));

                myScrollPane.setVvalue(newValue);
            }
        });*/

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

    //باز شدن صفحه صفحه ها
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

    public void cart1(ActionEvent event) {
        try {
            FXMLLoader loader = new FXMLLoader(getClass().getResource("cart1.fxml"));
            Scene scene = new Scene(loader.load(), 1535, 790);


            Stage stage = new Stage();
            stage.setScene(scene);
            stage.setTitle("cart1");
            stage.show();


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


            Stage stage = new Stage();
            stage.setScene(scene);
            stage.setTitle("چرا لنوو");
            stage.show();


            Stage currentStage = (Stage) ((Node) event.getSource()).getScene().getWindow();
            currentStage.close();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    @FXML
    private ImageView imageView;
    private List<String> imagePaths;
    private int currentIndex = 0;
    public void handleLeftClick() {
        if (!imagePaths.isEmpty()) {

            currentIndex = (currentIndex - 1 + imagePaths.size()) % imagePaths.size();
            showImage();
        }
    }

    public void handleRightClick() {
        if (!imagePaths.isEmpty()) {

            currentIndex = (currentIndex + 1) % imagePaths.size();
            showImage();
        }
    }

    private void showImage() {

        Image image = new Image(imagePaths.get(currentIndex));
        imageView.setImage(image);
    }

    public void backpage(ActionEvent event) {
        openNewWindow("hello-view.fxml","lenoShop",event);
    }
    public void lap1(ActionEvent event) {
        openNewWindow("gaming2.fxml","lenoShop",event);
    }
    public void lap2(ActionEvent event) {
        openNewWindow("mian1.fxml","lenoShop",event);
    }
    public void lap3(ActionEvent event) {
        openNewWindow("mian2.fxml","lenoShop",event);
    }
    public void lap4(ActionEvent event) {
        openNewWindow("lap2.fxml","lenoShop",event);
    }
    public void lap5(ActionEvent event) {
        openNewWindow("lap3.fxml","lenoShop",event);
    }
    public void lap6(ActionEvent event) {
        openNewWindow("lap5.fxml","lenoShop",event);
    }
    public void lap7(ActionEvent event) {
        openNewWindow("lap7.fxml","lenoShop",event);
    }
    public void lap8(ActionEvent event) {
        openNewWindow("lap10.fxml","lenoShop",event);
    }

    public void sabadpage(ActionEvent event) {
        if(loginpage.mm) {
            openNewWindow("sabad.fxml", "lenoShop", event);
        }
        else {
            openNewWindow("loginpage.fxml", "lenoShop", event);
        }
    }
    @FXML
    private TextField textfieldHome;

    /*public void searchHome(ActionEvent event) {
        String[] namesearch = {"LOQ 15IRH8","LOQ 15IRX9","LOQ 16IRH8","Legion Pro 7","LOQ 15IRX9","LOQ 15ARP9","Legion Pro 5 16IRX9","Legion Pro 5 16IRX8","LOQ 15IRH8","Legion 5 16IRX9","Legion 5 16IRX9","Legion 5 Pro Y9000P","YOGA Pro 16s","ThinkBook 16+","ThinkBook T14p"
                ,"LOQ 15ARP9","gaming laptop","janebi","laptop","IdeaPad 3","IdeaPad Slim 3","IdeaPad Slim 3 15IRU8","IdeaPad Slim 3 15IRH8","IdeaPad Slim 3 512GB","V15 G4 512GB","V15 G4 256GB","IdeaPad 1 N4020","IdeaPad Slim 3 15IRU8","IdeaPad 1 15IGL7","IdeaPad 1 15AMN7","IdeaPad 5 512GB","LOQ 15IRH8"
                ,"IdeaPad 5 1TB","ThinkBook 15 G2","ThinkPad E14 512GB","ThinkBook 15 G2 512GB","IdeaPad Gaming 3 15IHU6","IdeaPad Gaming 3 15ACH6","LOQ 15IAX9","Legion 5 512GB","lap top","tablet","ThinkPad X1 Tablet","Lenovo Tab Plus","Tab P12","Tab P12 Pro","MICRO USB","TAB 3 7","Lenovo Tab M9"
                ,"Lenovo Tab M10","Lenovo Tab P11 Pro","Lenovo Tab Extreme","Yoga Duet 7i","5v 1.5a","Yoga Duet","MIIX 510","Lenovo tab P11 Pro","YOGA Pro 16s","LOQ 15ARP9","YOGA Pro 14s 1TB","Yoga Slim 7 Pro","Yoga Gen 9","Yoga Slim 7x","design"};
        String[] labelsearch = {"gaming1","gaming2","gaming3","gaming4","gaming5","gaming6","gaming7","gaming8","gaming9","gaming10","gaming11","gaming12","gaming13","gaming14","gaming15","gaming16","gaminglap"
                ,"janebi","lap","lap1","lap2","lap3","lap4","lap5","lap6","lap7","lap8","lap9","lap10","lap12","mian1","mian2","mian3","mian4","mian5","mian6","mian7","mian8","mian9","mian10","mianlap","tablet","tablet1","tablet2","tablet3","tablet4","tablet5","tablet6","tablet7","tablet8","tablet9"
                ,"tablet10","tablet11","tablet12","tablet13","tablet14","tablet15","tarrahi1","tarrahi2","tarrahi3","tarrahi4","tarrahi5","tarrahi6","tarrahilap"};
        String searchBar = textfieldHome.getText();
        for(int i = 0; i<namesearch.length; i++){
            if (namesearch[i].equals(searchBar) || namesearch[i].toLowerCase().equals(searchBar) || namesearch[i].toUpperCase().equals(searchBar)){
                try {
                    FXMLLoader loader = new FXMLLoader(getClass().getResource("/com/example/site/" +labelsearch[i]+".fxml" ));
                    Scene scene = new Scene(loader.load(), 1535, 790);

                    // ایجاد و نمایش صفحه جدید
                    Stage stage = new Stage();
                    stage.setScene(scene);
                    stage.setTitle(namesearch[i]);
                    stage.show();

                    // بستن صفحه فعلی
                    Stage currentStage = (Stage) ((Node) event.getSource()).getScene().getWindow();
                    currentStage.close();

                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        }
    }*/public void searchBar(ActionEvent actionEvent) {
        openNewWindow("search.fxml","Search",actionEvent);
    }

    public void chatBot(ActionEvent actionEvent) {
        openNewWindow("chatConto.fxml","ChatBot",actionEvent);
    }
}
