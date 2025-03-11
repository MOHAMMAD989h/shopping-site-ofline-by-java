package com.example.site;

import javafx.animation.KeyFrame;
import javafx.animation.Timeline;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.stage.Stage;
import javafx.util.Duration;

import java.io.*;
import java.net.URL;
import java.util.ResourceBundle;
import java.util.StringTokenizer;

import static com.example.site.loginpage.*;

public class lap10 implements Initializable {
    @FXML
    public Label alart;
    public void kharid (ActionEvent event) {
        if(loginpage.mm){
            alart.setText("محصول شما به سبد خرید اضافه شد");
            // ایجاد تایمر برای حذف متن بعد از چند ثانیه
            Timeline timeline = new Timeline(new KeyFrame(Duration.seconds(2), event1 -> {
                alart.setText(""); // حذف متن
            }));
            timeline.setCycleCount(1); // فقط یک بار اجرا شود
            timeline.play(); // اجرای تایمر
            int indexPro = 25; //شماره کلمه ای که می خواهم بگیرم
            int I = 0;
            int I1 = 0;// شمارنده کلمه ها
            File ProKamel = new File("ProKamel.txt");
            File prices = new File("Prices.txt");
            // خواند محتوای فایل با استفاده از BufferedReader
            try  {
                BufferedReader reader1 = new BufferedReader(new FileReader(ProKamel));
                String line1=reader1.readLine();

                StringTokenizer tokenizer1 = new StringTokenizer(line1,"/\n");
                // بررسی اینکه آیا حداقل یک کلمه وجود دارد
                while (tokenizer1.hasMoreTokens()) {
                    String firstWord1 = tokenizer1.nextToken();
                    // بررسی اینکه آیا به خط مورد نظر رسیده‌ایم
                    if (I == indexPro) {
                        // استفاده از StringTokenizer برای جدا کردن کلمات خط
                        // بررسی اینکه آیا حداقل یک کلمه وجود دارد
                        if (tokenizer1.hasMoreTokens()) {// گرفتن اولین کلمه
                            File buyer = new File("buyer.txt");
                            // ایجاد فایل جدید اگر وجود نداشته باشد
                            if (!buyer.exists()) {
                                if (buyer.createNewFile()) {
                                    System.out.println("File created: " + buyer.getName());
                                }
                            }
                            // نوشتن اولین کلمه در buyer.txt
                            try (FileWriter myWriter = new FileWriter("buyer.txt", true)) {// "true" برای اضافه کردن به فایل
                                myWriter.write(firstWord1+"\n");}
                            catch (IOException e) {
                                e.printStackTrace();
                            }
                        }
                        break; // پایان حلقه پس از پردازش خط مورد نظر
                    }
                    I++;
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
            try  {
                BufferedReader reader2 = new BufferedReader(new FileReader(prices));
                String line2=reader2.readLine();

                StringTokenizer tokenizer2 = new StringTokenizer(line2,"/\n");
                // بررسی اینکه آیا حداقل یک کلمه وجود دارد
                String firstWord2 ="";
                while (tokenizer2.hasMoreTokens()) {
                    firstWord2 = tokenizer2.nextToken();
                    // بررسی اینکه آیا به خط مورد نظر رسیده‌ایم
                    if (I1 == indexPro) {
                        // استفاده از StringTokenizer برای جدا کردن کلمات خط
                        // بررسی اینکه آیا حداقل یک کلمه وجود دارد
                        if (tokenizer2.hasMoreTokens()) {// گرفتن اولین کلمه
                            File price = new File("price.txt");
                            // ایجاد فایل جدید اگر وجود نداشته باشد
                            if (!price.exists()) {
                                if(price.createNewFile()) {
                                    System.out.println("File created: " + price.getName());
                                }
                            }
                            // نوشتن اولین کلمه در buyer.txt
                            try(FileWriter myWriter1 = new FileWriter("price.txt", true)){
                                myWriter1.write(firstWord2+"\n");// "true" برای اضافه کردن به فای
                            } catch (IOException e) {
                                e.printStackTrace();
                            }
                        }
                        // پایان حلقه پس خط مورد نظر
                    }
                    I1++;
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }else{
            openNewWindow("loginpage.fxml","login",event);
        }
    }
    @FXML
    public ComboBox<String> com1;
    ObservableList<String> list = FXCollections.observableArrayList("لپ تاپ ها","تبلت ها و لوازم جانبی", "لوازم جانبی");

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
        if ("تبلت ها و لوازم جانبی".equals(selectedOption)) {
            openNewWindow("tablet.fxml", "تبلت ها و لوازم جانبی", event);
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
    public void mainpage(ActionEvent event) {
        try {
            FXMLLoader loader = new FXMLLoader(getClass().getResource("hello-view.fxml"));
            Scene scene = new Scene(loader.load(), 1535, 790);

            // ایجاد و نمایش صفحه جدید
            Stage stage = new Stage();
            stage.setScene(scene);
            stage.setTitle("لنوو مارکت");
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
        openNewWindow("edarilap.fxml","lenoShop",event);
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

    public void lap10ToProfile(ActionEvent actionEvent) {
        try {
            FXMLLoader loader = new FXMLLoader(getClass().getResource("/com/example/site/loginpage.fxml"));
            Scene scene = new Scene(loader.load(), 1535, 790);

            // ایجاد و نمایش صفحه جدید
            Stage stage = new Stage();
            stage.setScene(scene);
            stage.setTitle("profile");
            stage.show();

            // بستن صفحه فعلی
            Stage currentStage = (Stage) ((Node) actionEvent.getSource()).getScene().getWindow();
            currentStage.close();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
