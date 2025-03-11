package com.example.site;

import javafx.animation.TranslateTransition;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;
import javafx.event.ActionEvent;

import java.io.*;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.StringTokenizer;

public class profile {

    @FXML
    private ComboBox<?> com1;

    @FXML
    private VBox vbox_profile;

    @FXML
    private Label txtName;

    @FXML
    private Label txtUsername;

    @FXML
    private Label txtEmail;

    @FXML
    private Label txtPostcode;

    @FXML
    private Label txtAddress;

    @FXML
    private VBox vbox_changepass;

    @FXML
    private TextField txt_oldpassword;

    @FXML
    private TextField txt_coldpassword;

    @FXML
    private TextField txt_newpassword;

    @FXML
    private TextField txt_cnewpassword;

    @FXML
    private Label label_resilt_change;

    @FXML
    private VBox vbox_changeuser1;

    @FXML
    private TextField txt_oldusername1;

    @FXML
    private TextField txt_newusername1;

    @FXML
    private Label label_resilt_change1;

    @FXML
    private Button buttonChange;

    @FXML
    private VBox vbox_change1;

    @FXML
    private Connection connect;

    @FXML
    public PreparedStatement prepare;

    @FXML
    private Button si_sendcode;

    @FXML
    public ResultSet result;

    @FXML
    private TextField si_username;


    static boolean mm = false;
    static boolean loginID = false;

    loginpage login = new loginpage();

    public void initialize() {
        txtName.setText(loginpage.resi_name);
        txtUsername.setText(loginpage.username);
        txtEmail.setText(loginpage.resi_email);
        txtPostcode.setText(loginpage.resi_postcode);
        txtAddress.setText(loginpage.resi_address);
        System.out.println(loginpage.resi_name +"****");
        System.out.println(loginpage.username +"****");
        System.out.println(loginpage.resi_email +"****");
        System.out.println(loginpage.resi_postcode +"****");
        System.out.println(loginpage.resi_address +"****");
    }

    @FXML
    public void Changepass2(ActionEvent event) {
        TranslateTransition slider = new TranslateTransition();

        slider.setNode(vbox_changepass);

        slider.setOnFinished((event1) -> {
            vbox_profile.setVisible(false);
            vbox_changepass.setVisible(true);
            vbox_changeuser1.setVisible(false);
            vbox_change1.setVisible(false);
        });
        slider.play();

    }

    @FXML
    public void Changepass3(ActionEvent event) {
        if(txt_oldpassword.isVisible()){
            System.out.println(!(txt_oldpassword.equals(txt_coldpassword)));
            if(txt_oldpassword.getText().length() < 8 || !(txt_oldpassword.getText().matches(".*[A-Z].*")) || !(txt_oldpassword.getText().equals(txt_coldpassword.getText()))){
                label_resilt_change.setText("password must be at least 8 characters");
            }
            else{
                String selectdata = "SELECT * FROM employee WHERE password= ?";

                connect = DataBase1.connectDB();

                try{
                    prepare = connect.prepareStatement(selectdata);
                    prepare.setString(1, txt_oldpassword.getText());
                    result = prepare.executeQuery();

                    if(result.next()){
                        label_resilt_change.setText("");
                        label_resilt_change.setText("Seccessfully");

                        TranslateTransition slider = new TranslateTransition();

                        slider.setNode(si_sendcode);

                        slider.setOnFinished((event1) -> {
                            txt_oldpassword.setVisible(false);
                            txt_coldpassword.setVisible(false);
                            txt_newpassword.setVisible(true);
                            txt_cnewpassword.setVisible(true);
                        });

                        slider.play();

                    }
                    else{
                        label_resilt_change.setText("");
                        label_resilt_change.setText("Inccrect passwords");

                    }
                }
                catch (Exception e) {
                    e.printStackTrace();
                }

            }

        }
        else if(txt_newpassword.isVisible()){
            if(txt_newpassword.getText().length() < 8 || !(txt_newpassword.getText().matches(".*[A-Z].*")) || !(txt_newpassword.getText().equals(txt_cnewpassword.getText()))){
                label_resilt_change.setText("password must be at least 8 characters");
            }
            else {
                String selectdata = "UPDATE employee SET password =? WHERE password = ?";

                connect = DataBase1.connectDB();

                try {
                    prepare = connect.prepareStatement(selectdata);
                    prepare.setString(1, txt_newpassword.getText());
                    prepare.setString(2, txt_oldpassword.getText());
                    int result = prepare.executeUpdate();


                    if (result > 0) {
                        label_resilt_change.setText("");
                        label_resilt_change.setText("Seccessfully");
                    } else {
                        label_resilt_change.setText("");
                        label_resilt_change.setText("Incorrect  password");
                    }


                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        }
    }

    String infor = null;


    @FXML
    public void Changeuser1(ActionEvent event) {
        TranslateTransition slider = new TranslateTransition();

        slider.setNode(vbox_changepass);

        slider.setOnFinished((event1) -> {
            vbox_profile.setVisible(false);
            vbox_changepass.setVisible(false);
            vbox_changeuser1.setVisible(true);
            vbox_change1.setVisible(false);
        });
        slider.play();
        infor = "username";
        txt_oldusername1.setPromptText("نام کاربری قبلی");
        txt_newusername1.setPromptText("نام کاربری جدید");
        buttonChange.setText("تغییر نام کاربری");

    }

    @FXML
    public void backchangeToprofile(ActionEvent event) {openNewWindow("profile1.fxml","Profile",event);}

    @FXML
    public void changeAddress1(ActionEvent event) {
        TranslateTransition slider = new TranslateTransition();

        slider.setNode(vbox_changepass);

        slider.setOnFinished((event1) -> {
            vbox_profile.setVisible(false);
            vbox_changepass.setVisible(false);
            vbox_changeuser1.setVisible(true);
            vbox_change1.setVisible(false);
        });
        slider.play();
        infor = "address";
        txt_oldusername1.setPromptText("ادرس قبلی");
        txt_newusername1.setPromptText("ادرس جدید");
        buttonChange.setText("ادرس کاربری");

    }

    @FXML
    public void changeEmail1(ActionEvent event) {
        TranslateTransition slider = new TranslateTransition();

        slider.setNode(vbox_changepass);

        slider.setOnFinished((event1) -> {
            vbox_profile.setVisible(false);
            vbox_changepass.setVisible(false);
            vbox_changeuser1.setVisible(true);
            vbox_change1.setVisible(false);
        });
        slider.play();
        infor = "email";
        txt_oldusername1.setPromptText("ایمیل قبلی");
        txt_newusername1.setPromptText("ایمیل جدید");
        buttonChange.setText("ایمیل کاربری");

    }

    @FXML
    public void changeName1(ActionEvent event) {
        TranslateTransition slider = new TranslateTransition();

        slider.setNode(vbox_changepass);

        slider.setOnFinished((event1) -> {
            vbox_profile.setVisible(false);
            vbox_changepass.setVisible(false);
            vbox_changeuser1.setVisible(true);
            vbox_change1.setVisible(false);
        });
        slider.play();
        infor = "name";
        txt_oldusername1.setPromptText("نام قبلی");
        txt_newusername1.setPromptText("نام  جدید");
        buttonChange.setText("تغییر نام ");

    }

    @FXML
    public void changePostcode1(ActionEvent event) {
        TranslateTransition slider = new TranslateTransition();

        slider.setNode(vbox_changepass);

        slider.setOnFinished((event1) -> {
            vbox_profile.setVisible(false);
            vbox_changepass.setVisible(false);
            vbox_changeuser1.setVisible(true);
            vbox_change1.setVisible(false);
        });
        slider.play();
        infor = "postcode";
        txt_oldusername1.setPromptText("پست کد قبلی");
        txt_newusername1.setPromptText("پست کد جدید");
        buttonChange.setText("تغییر پست کد ");

    }

    @FXML
    void changeUser1(ActionEvent event) {
        ChangeuserCls(infor ,txt_oldusername1 ,txt_newusername1 ,event);
    }
    public void openNewWindow(String fxmlFile, String title, javafx.event.ActionEvent event) {
        try {
            FXMLLoader loader = new FXMLLoader(getClass().getResource(fxmlFile));
            Scene scene = new Scene(loader.load(), 1535, 790);


            Stage stage = new Stage();
            stage.setScene(scene);
            stage.setTitle(title);
            stage.show();


            Stage currentStage = (Stage) ((Node) event.getSource()).getScene().getWindow();
            currentStage.close();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    public void ChangeuserCls(String name11, TextField old1 , TextField new1, javafx.event.ActionEvent actionEvent) {
        if(old1.isVisible()){
            if(old1.getText().length() < 3 ){
                label_resilt_change.setText( name11+" must be at least 3 characters");
            }
            else{
                loginpage.username =name11;
                String selectdata = "SELECT * FROM employee WHERE "+name11+"= ?";

                connect = DataBase1.connectDB();

                try{
                    prepare = connect.prepareStatement(selectdata);
                    prepare.setString(1, old1.getText());
                    result = prepare.executeQuery();

                    if(result.next()){
                        label_resilt_change.setText("");
                        label_resilt_change.setText("Seccessfully");

                        TranslateTransition slider = new TranslateTransition();

                        slider.setNode(si_sendcode);

                        slider.setOnFinished((event1) -> {
                            old1.setVisible(false);
                            new1.setVisible(true);
                        });

                        slider.play();

                    }
                    else{
                        label_resilt_change.setText("");
                        label_resilt_change.setText("Inccrect username");

                    }
                }
                catch (Exception e) {
                    e.printStackTrace();
                }

            }

        }
        else if(new1.isVisible()){
            if(new1.getText().length() < 3 ){
                label_resilt_change.setText("username must be at least 3 characters");
            }
            else {
                String selectdata = "UPDATE employee SET "+name11+"=? WHERE "+name11+"= ?";

                connect = DataBase1.connectDB();

                try {
                    prepare = connect.prepareStatement(selectdata);
                    prepare.setString(1, new1.getText());
                    prepare.setString(2, old1.getText());
                    int result = prepare.executeUpdate();
                    openNewWindow("profile1.fxml","Profile",actionEvent);


                    if (result > 0) {
                        label_resilt_change.setText("");
                        label_resilt_change.setText("Seccessfully");
                    } else {
                        label_resilt_change.setText("");
                        label_resilt_change.setText("Incorrect  username");
                    }


                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        }

    }
        @FXML
    public void logOutProfile(ActionEvent event) {
            openNewWindow("loginpage.fxml","Loginpage",event);
            loginID = false;
            File Sefareshat=new File("Sefareshat.txt");
            File buyer=new File("buyer.txt");
            File price = new File("price.txt");
            String filePath2="Sefareshat.txt";
            String filePath = "buyer.txt";
            String filePath1 = "price.txt";
            try {
                // خواندن فایل
                File file2=new File(filePath2);
                File file = new File(filePath);
                BufferedReader reader = new BufferedReader(new FileReader(file));
                StringBuilder content = new StringBuilder();
                String line;

                // پردازش هر خط از فایل
                while ((line = reader.readLine()) != null) {
                    StringTokenizer tokenizer = new StringTokenizer(line, "/\n"); // جداسازی کلمات با فاصله
                    while (tokenizer.hasMoreTokens()) {
                        String word = tokenizer.nextToken();
                        System.out.println(word);
                        content.append("/").append(loginpage.username).append("/").append(word).append("\n");
                    }
                }
                reader.close();
                // بازنویسی فایل
                BufferedWriter writer = new BufferedWriter(new FileWriter(file2,true));
                writer.write(content.toString().trim()); // نوشتن محتوای جدید
                writer.close();

                System.out.println("فایل با موفقیت بازنویسی شد.");
            } catch (FileNotFoundException e) {
                System.out.println("خطا در پردازش فایل: " + e.getMessage());
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
            try {
                // خواندن فایل
                File file2=new File(filePath2);
                File file1 = new File(filePath1);
                BufferedReader reader = new BufferedReader(new FileReader(file1));
                StringBuilder content = new StringBuilder();
                String line1;

                // پردازش هر خط از فایل
                while ((line1 = reader.readLine()) != null) {
                    StringTokenizer tokenizer1 = new StringTokenizer(line1, "/\n"); // جداسازی کلمات با فاصله
                    while (tokenizer1.hasMoreTokens()) {
                        String word = tokenizer1.nextToken();
                        content.append("/.").append(loginpage.username).append("/").append(word).append("\n");

                    }
                }
                reader.close();
                // بازنویسی فایل
                BufferedWriter writer = new BufferedWriter(new FileWriter(file2,true));
                writer.write(content.toString().trim()); // نوشتن محتوای جدید
                writer.close();

                System.out.println("فایل با موفقیت بازنویسی شد.");
            } catch (FileNotFoundException e) {
                System.out.println("خطا در پردازش فایل: " + e.getMessage());
            } catch (IOException e) {
                throw new RuntimeException(e);
            }

            if(buyer.delete()&& price.delete()){
                System.out.println("deleted the File:"+buyer.getName());
                System.out.println("deleted the File:"+price.getName());
            }else{
                System.out.println("Failed to delete the File");
            }
    }


    @FXML
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

    @FXML
    public void sabadpageProfile(ActionEvent event) {
        try {
            FXMLLoader loader = new FXMLLoader(getClass().getResource("sabad.fxml"));
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

    @FXML
    public void why(ActionEvent event) {
        try {
            FXMLLoader loader = new FXMLLoader(getClass().getResource("/com/example/site/why.fxml"));
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

}
