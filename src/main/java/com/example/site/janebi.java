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

public class janebi implements Initializable {
    @FXML
    public Label alart;
    public void kharid (int indexPro,ActionEvent event) {
        if(loginpage.mm){
            alart.setText("محصول شما به سبد خرید اضافه شد");
            // ایجاد تایمر برای حذف متن بعد از چند ثانیه
            Timeline timeline = new Timeline(new KeyFrame(Duration.seconds(2), event1 -> {
                alart.setText(""); // حذف متن
            }));
            timeline.setCycleCount(1); // فقط یک بار اجرا شود
            timeline.play(); // اجرای تایمر//شماره کلمه ای که می خواهم بگیرم
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
    public void kharid1(ActionEvent event){int adad=59;
        kharid(adad,event);
    }
    public void kharid2(ActionEvent event){int adad=60;
        kharid(adad,event);
    }
    public void kharid3(ActionEvent event){int adad=61;
        kharid(adad,event);
    }
    public void kharid4(ActionEvent event){int adad=62;
        kharid(adad,event);
    }
    public void kharid5(ActionEvent event){int adad=63;
        kharid(adad,event);
    }
    public void kharid6(ActionEvent event){int adad=64;
        kharid(adad,event);
    }
    public void kharid7(ActionEvent event){int adad=65;
        kharid(adad,event);
    }
    public void kharid8(ActionEvent event){int adad=66;
        kharid(adad,event);
    }
    public void kharid9(ActionEvent event){int adad=67;
        kharid(adad,event);
    }
    public void kharid10(ActionEvent event){int adad=68;
        kharid(adad,event);
    }
    public void kharid11(ActionEvent event){int adad=69;
        kharid(adad,event);
    }
    public void kharid12(ActionEvent event){int adad=70;
        kharid(adad,event);
    }
    public void kharid13(ActionEvent event){int adad=71;
        kharid(adad,event);
    }
    public void kharid14(ActionEvent event){int adad=72;
        kharid(adad,event);
    }
    public void kharid15(ActionEvent event){int adad=73;
        kharid(adad,event);
    }
    public void kharid16(ActionEvent event){int adad=74;
        kharid(adad,event);
    }
    public void kharid17(ActionEvent event){int adad=75;
        kharid(adad,event);
    }
    public void kharid18(ActionEvent event){int adad=76;
        kharid(adad,event);
    }
    public void kharid19(ActionEvent event){int adad=77;
        kharid(adad,event);
    }
    public void kharid20(ActionEvent event){int adad=78;
        kharid(adad,event);
    }
    public void kharid21(ActionEvent event){int adad=79;
        kharid(adad,event);
    }
    public void kharid22(ActionEvent event){int adad=80;
        kharid(adad,event);
    }
    public void kharid23(ActionEvent event){int adad=81;
        kharid(adad,event);
    }
    public void kharid24(ActionEvent event){int adad=82;
        kharid(adad,event);
    }
    public void kharid25(ActionEvent event){int adad=83;
        kharid(adad,event);
    }
    public void kharid26(ActionEvent event){int adad=84;
        kharid(adad,event);
    }
    public void kharid27(ActionEvent event){int adad=85;
        kharid(adad,event);
    }
    public void kharid28(ActionEvent event){int adad=86;
        kharid(adad,event);
    }
    public void kharid29(ActionEvent event){int adad=87;
        kharid(adad,event);
    }
    public void kharid30(ActionEvent event){int adad=88;
        kharid(adad,event);
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
        if("تبلت ها و لوازم جانبی".equals(selectedOption)){
            openNewWindow("tablet.fxml","تبلت ها و لوازم جانبی",event);
        }
        if("لپ تاپ ها".equals(selectedOption)){
            openNewWindow("lap.fxml","لپتاپ ها",event);
        }
        if ("لوازم جانبی".equals(selectedOption)) {
            openNewWindow("janebi.fxml", "لوازم جانبی", event);
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

    public void janebiToProfile(ActionEvent event) {
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
    public void openNewWindow2 (String fxmlFile, String title, String method, ActionEvent event) {
        try {
            FXMLLoader loader = new FXMLLoader(getClass().getResource(fxmlFile));
            Scene scene = new Scene(loader.load(), 1535, 790);

            //ارسال متد

            janebiha  controller = loader.getController();
            controller.setMethod(method);

            // ایجاد و نمایش صفحه جدید
            Stage stage = new Stage();
            stage.setScene(scene);
            stage.setTitle(title);
            stage.show();

            // بستن صفحه فعلی
            Stage currentStage = (Stage) ((Node) event.getSource()).getScene().getWindow();
            currentStage.close();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    public void new1(ActionEvent event) {
        openNewWindow2("janebiha.fxml", "lenovoShop", "new1", event);
    }
    public void new2(ActionEvent event) {
        openNewWindow2("janebiha.fxml", "lenovoShop", "new2", event);
    }
    public void new3(ActionEvent event) {
        openNewWindow2("janebiha.fxml", "lenovoShop", "new3", event);
    }
    public void new4(ActionEvent event) {
        openNewWindow2("janebiha.fxml", "lenovoShop", "new4", event);
    }
    public void new5(ActionEvent event) {
        openNewWindow2("janebiha.fxml", "lenovoShop", "new5", event);
    }
    public void new6(ActionEvent event) {
        openNewWindow2("janebiha.fxml", "lenovoShop", "new6", event);
    }
    public void new7(ActionEvent event) {
        openNewWindow2("janebiha.fxml", "lenovoShop", "new7", event);
    }
    public void new8(ActionEvent event) {
        openNewWindow2("janebiha.fxml", "lenovoShop", "new8", event);
    }
    public void new9(ActionEvent event) {
        openNewWindow2("janebiha.fxml", "lenovoShop", "new9", event);
    }
    public void new10 (ActionEvent event) {
        openNewWindow2("janebiha.fxml", "lenovoShop", "new10", event);
    }
    public void new11 (ActionEvent event) {
        openNewWindow2("janebiha.fxml", "lenovoShop", "new11", event);
    }
    public void new12(ActionEvent event) {
        openNewWindow2("janebiha.fxml", "lenovoShop", "new12", event);
    }
    public void new13(ActionEvent event) {
        openNewWindow2("janebiha.fxml", "lenovoShop", "new13", event);
    }
    public void new14(ActionEvent event) {
        openNewWindow2("janebiha.fxml", "lenovoShop", "new14", event);
    }
    public void new15(ActionEvent event) {
        openNewWindow2("janebiha.fxml", "lenovoShop", "new15", event);
    }
    public void new16 (ActionEvent event) {
        openNewWindow2("janebiha.fxml", "lenovoShop", "new16", event);
    }
}

