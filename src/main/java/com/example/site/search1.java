package com.example.site;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class search1 {
    @FXML
    private VBox productContainer;

    @FXML
    private TextField searchField;

    @FXML
    public ComboBox<String> com1;

    HelloController controller = new HelloController();

    private List<productSearchModel> productList = new ArrayList<>(); // لیست اصلی محصولات

    ObservableList<String> list = FXCollections.observableArrayList("لپ تاپ ها","تبلت ها و لوازم جانبی", "لوازم جانبی");


    @FXML
    public void initialize() {
        try {
            productList.add(new productSearchModel(" LOQ 15IRH8  لنوو - Core i7-13620H RTX 4050 16GB 512GB", "56,500,000", "", "1", "/images/laptop/gaming/1301.png","gaming1.fxml"));
            productList.add(new productSearchModel(" LOQ 15IRX9 لنوو - Core i7-13650HX RTX 4050 16GB 1TB", "72,500,000", "", "2", "/images/laptop/gaming/1302.png","gaming2.fxml"));
            productList.add(new productSearchModel(" LOQ 16IRH8 لنوو - Core i7-13620H RTX 4060 16GB 512GB", "73,900,000", "", "3", "/images/laptop/gaming/1303.png","gaming3.fxml"));
            productList.add(new productSearchModel("لپ تاپ Legion Pro 7 لنوو - Core i9-13900HX RTX 4080 32GB 1TB", "159,900,000", "", "4", "/images/laptop/gaming/1304.png","gaming4.fxml"));
            productList.add(new productSearchModel("لپ تاپ LOQ 15IRX9 لنوو - Core i7-13650HX RTX 4050 16GB 512GB", "70,900,000", "", "5", "/images/laptop/gaming/1305.png","gaming5.fxml"));
            productList.add(new productSearchModel("لپ تاپ LOQ 15ARP9 لنوو - Ryzen 7 7435HS RTX 4060 16GB 512GB", "72,900,000", "", "6", "/images/laptop/gaming/1306.png","gaming6.fxml"));
            productList.add(new productSearchModel("لپ تاپ Legion Pro 5 16IRX9 لنوو - Core i7-14650HX RTX 4060 32GB 1TB", "117,900,000", "", "7", "/images/laptop/gaming/1307.png","gaming7.fxml"));
            productList.add(new productSearchModel("لپ تاپ Legion Pro 5 16IRX8 لنوو - Core i9-13900HX RTX 4070 32GB 2TB", "139,900,000", "", "8", "/images/laptop/gaming/1308.png","gaming8.fxml"));
            productList.add(new productSearchModel("لپ تاپ LOQ 15IRH8 لنوو - Core i7-13620H RTX 4060 32GB 2TB FHD", "79,900,000", "", "9", "/images/laptop/gaming/1309.png","gaming9.fxml"));
            productList.add(new productSearchModel("لپ تاپ Legion 5 16IRX9 لنوو - Core i7-14650HX RTX 4060 64GB 2TB", "69,900,000", "", "10", "/images/laptop/gaming/1310.png","gaming10.fxml"));
            productList.add(new productSearchModel("لپ تاپ Legion 5 16IRX9 لنوو - Core i7-14650HX RTX 4060 64GB 2TB", "99,900,000", "", "11", "/images/laptop/gaming/1311.png","gaming11.fxml"));
            productList.add(new productSearchModel("لپ تاپ Legion 5 Pro Y9000P لنوو - Core i9-14900HX RTX 4060 16GB 1TB", "ناموجود", "", "12", "/images/laptop/gaming/1312.png","gaming12.fxml"));
            productList.add(new productSearchModel("لپ تاپ YOGA Pro 16s لنوو - EVO Core i9-13905H RTX 4060 32GB 1TB", "ناموجود", "", "13", "/images/laptop/gaming/1313.png","gaming13.fxml"));
            productList.add(new productSearchModel("لپ تاپ ThinkBook 16+ لنوو - Ryzen 7 7840H RTX 4050 32GB 1TB", "101,900,000", "", "14", "/images/laptop/gaming/1314.png","gaming14.fxml"));
            productList.add(new productSearchModel("لپ تاپ ThinkBook T14p لنوو - Core Ultra 9 185H RTX 4050 32GB 1TB", "170,900,000", "", "15", "/images/laptop/gaming/1315.png","gaming15.fxml"));
            productList.add(new productSearchModel("لپ تاپ LOQ 15ARP9 لنوو - Ryzen 7 7435HS RTX 4050 16GB 512GB", "69,900,000", "", "16", "/images/laptop/gaming/1306.png","gaming16.fxml"));

            productList.add(new productSearchModel("لپ تاپ IdeaPad 3 لنوو - Core i3-1215U UHD 8GB 256GB", "28,300,000", "", "17", "/images/laptop/edari/1001.png","lap1.fxml"));
            productList.add(new productSearchModel("لپ تاپ IdeaPad Slim 3 لنوو - Core i5-13420H UHD Xe 8GB 512GB", "31,400,000", "", "18", "/images/laptop/edari/1002.png","lap2.fxml"));
            productList.add(new productSearchModel("لپ تاپ IdeaPad Slim 3 15IRU8 لنوو - Core i3-1305U UHD 8GB 256GB", "26,500,000", "", "19", "/images/laptop/edari/1003.png","lap3.fxml"));
            productList.add(new productSearchModel("لپ تاپ IdeaPad Slim 3 15IRH8 لنوو - Core i7-13620H UHD 16GB 512GB", "41,000,000", "", "20", "/images/laptop/edari/1004.png","lap4.fxml"));
            productList.add(new productSearchModel("لپ تاپ IdeaPad Slim 3 لنوو - Ryzen 7 7730U RX Vega 8 8GB 512GB", "32,000,000", "", "21", "/images/laptop/edari/1005.png","lap5.fxml"));
            productList.add(new productSearchModel("لپ تاپ V15 G4 لنوو - Ryzen 5 7520U 610M 8GB 512GB", "29,100,000", "", "22", "/images/laptop/edari/1006.png","lap6.fxml"));
            productList.add(new productSearchModel("لپ تاپ V15 G4 لنوو - Athlon Silver 7120U 610M 8GB 256GB", "17,200,000", "", "23", "/images/laptop/edari/1007.png","lap7.fxml"));
            productList.add(new productSearchModel("لپ تاپ IdeaPad 1 N4020 لنوو - Celeron N4020 UHD 600 4GB 256GB", "17,900,000", "", "24", "/images/laptop/edari/1008.png","lap8.fxml"));
            productList.add(new productSearchModel("لپ تاپ IdeaPad Slim 3 15IRU8 لنوو - Core i3-1305U UHD 8GB 1TB", "26,300,000", "", "25", "/images/laptop/edari/1009.png","lap9.fxml"));
            productList.add(new productSearchModel("لپ تاپ IdeaPad 1 15IGL7 لنوو - Celeron N4020 UHD 600 8GB 256GB", "18,500,000", "", "26", "/images/laptop/edari/1010.png","lap10.fxml"));
            productList.add(new productSearchModel("لپ تاپ IdeaPad 1 15AMN7 لنوو - Ryzen 5 7520U 610M 8GB 512GB", "28,600,000", "", "27", "/images/laptop/edari/1012.png","lap12.fxml"));

            productList.add(new productSearchModel("لپ تاپ IdeaPad 5 لنوو - Core i5-1235U MX550 16GB 512GB", "47,500,000", "", "28", "/images/laptop/میان رده/1201.png","mian1.fxml"));
            productList.add(new productSearchModel("لپ تاپ LOQ 15IRH8 لنوو - Core i5-12450H RTX 2050 8GB 512GB", "48,700,000", "", "29", "/images/laptop/میان رده/1202.png","mian2.fxml"));
            productList.add(new productSearchModel("لپ تاپ IdeaPad 5 لنوو - Core i5-1235U MX550 16GB 1TB", "49,200,000", "", "30", "/images/laptop/میان رده/1203.png","mian3.fxml"));
            productList.add(new productSearchModel("لپ تاپ ThinkBook 15 G2 لنوو - Core i5-1135G7 MX450 16GB 256GB", "47,900,000", "", "31", "/images/laptop/میان رده/1204.png","mian4.fxml"));
            productList.add(new productSearchModel("لپ تاپ ThinkPad E14 لنوو - Core i7-1355U MX550 16GB 512GB", "ناموجود", "", "32", "/images/laptop/میان رده/1205.png","mian5.fxml"));
            productList.add(new productSearchModel("لپ تاپ ThinkBook 15 G2 لنوو - Core i5-1135G7 MX450 16GB 512GB", "48,000,000", "", "33", "/images/laptop/میان رده/1206.png","mian6.fxml"));
            productList.add(new productSearchModel("لپ تاپ IdeaPad Gaming 3 15IHU6 لنوو - Core i5-11320H RTX 2050 16GB 512GB", "ناموجود", "", "34", "/images/laptop/میان رده/1207.png","mian7.fxml"));
            productList.add(new productSearchModel("لپ تاپ IdeaPad Gaming 3 15ACH6 لنوو - Ryzen 5 5500H RTX 2050 16GB 512GB", "59,800,000", "", "35", "/images/laptop/میان رده/1208.png","mian8.fxml"));
            productList.add(new productSearchModel("لپ تاپ LOQ 15IAX9 لنوو - Core i5-12450HX RTX 3050 12GB 512GB", "56,000,000", "", "36", "/images/laptop/میان رده/1209.png","mian9.fxml"));
            productList.add(new productSearchModel("لپ تاپ Legion 5 لنوو - Core i5-10500H RTX 3050 8GB 512GB", "ناموجود", "", "37", "/images/laptop/میان رده/1210.png","mian10.fxml"));

            productList.add(new productSearchModel("تبلت ویندوز لنوو ThinkPad X1 Tablet مدل Gen 3", "20,200,000", "", "38", "/images/تبلت/7.png","tablet1.fxml"));
            productList.add(new productSearchModel("تبلت لنوو Lenovo Tab Plus", "30,300,000", "", "39", "/images/تبلت/3.png","tablet2.fxml"));
            productList.add(new productSearchModel("تبلت لنوو مدل Tab P12", "30,700,000", "", "40", "/images/تبلت/2.png","tablet3.fxml"));
            productList.add(new productSearchModel("تبلت لنوو مدل Tab P12 Pro", "56,590,000", "", "41", "/images/تبلت/1.png","tablet4.fxml"));
            productList.add(new productSearchModel("کابل شارژ تبلت و موبایل لنوو مدل MICRO USB", "186,000", "", "42", "/images/تبلت/11.png","tablet5.fxml"));
            productList.add(new productSearchModel("کیف و محافظ صفحه تبلت لنوو TAB 3 7", "325.000", "", "43", "/images/تبلت/10.png","tablet6.fxml"));
            productList.add(new productSearchModel("تبلت لنوو Lenovo Tab M9 مدل )\"9 MTK)", "9,702,000", "", "44", "/images/تبلت/6.png","tablet7.fxml"));
            productList.add(new productSearchModel("تبلت اندروید لنوو مدل Lenovo Tab M10 (3rd Gen)", "15,606,000", "", "45", "/images/تبلت/3.png","tablet8.fxml"));
            productList.add(new productSearchModel("تبلت لنوو مدل Lenovo Tab P11 Pro", "ناموجود", "", "46", "/images/تبلت/9.png","tablet9.fxml"));
            productList.add(new productSearchModel("تبلت لنوو Lenovo Tab Extreme", "ناموجود", "", "47", "/images/تبلت/8.png","tablet10.fxml"));
            productList.add(new productSearchModel("تبلت لنوو مدل Yoga Duet 7i پردازنده i7", "ناموجود", "", "48", "/images/تبلت/7.png","tablet11.fxml"));
            productList.add(new productSearchModel("شارژر تبلت لنوو 5v 1.5a مدل c-p64", "230,000", "", "49", "/images/تبلت/12.png","tablet12.fxml"));
            productList.add(new productSearchModel("تبلت لنوو مدل Yoga Duet 7i پردازنده i5", "ناموجود", "", "50", "/images/تبلت/7.png","tablet13.fxml"));
            productList.add(new productSearchModel("تبلت ویندوز لنوو MIIX 510", "ناموجود", "", "51", "/images/تبلت/14.png","tablet14.fxml"));
            productList.add(new productSearchModel("کیف و محافظ تبلت لنوو Lenovo tab P11 Pro", "ناموجود", "", "52", "/images/تبلت/13.png","tablet15.fxml"));

            productList.add(new productSearchModel("لپ تاپ YOGA Pro 16s لنوو - EVO Core i9-13905H RTX 4060 32GB 1TB", "169,900,000", "", "53", "/images/laptop/tarrahi/1401.png","tarrahi1.fxml"));
            productList.add(new productSearchModel("لپ تاپ LOQ 15ARP9 لنوو - Ryzen 7 7435HS RTX 4050 16GB 512GB", "99,900,000", "", "54", "/images/laptop/tarrahi/1402.png","tarrahi2.fxml"));
            productList.add(new productSearchModel("لپ تاپ YOGA Pro 14s لنوو - EVO Core i9-13905H RTX 4060 32GB 1TB", "139,900,000", "", "55", "/images/laptop/tarrahi/1403.png","tarrahi3.fxml"));
            productList.add(new productSearchModel("لپ تاپ یوگا Slim 7 Pro لنوو - Ryzen 7 5800H RTX 3050 16GB 1TB", "115,900,000", "", "56", "/images/laptop/tarrahi/1404.png","tarrahi4.fxml"));
            productList.add(new productSearchModel("لپ تاپ یوگا 9i Gen 9 لنوو - Core Ultra 7 155H Arc 16GB 1TB OLED", "ناموجود", "", "57", "/images/laptop/tarrahi/1405.png","tarrahi5.fxml"));
            productList.add(new productSearchModel("لپ تاپ Yoga Slim 7x 14 Gen 9 لنوو - X Elite Adreno 16GB 1TB", "95,900,000", "", "58", "/images/laptop/tarrahi/1406.png","tarrahi6.fxml"));




            // نمایش همه محصولات در ابتد
            updateProductList("");

            // اضافه کردن رویداد برای فیلتر خودکار هنگام تایپ
            searchField.textProperty().addListener((observable, oldValue, newValue) -> updateProductList(newValue));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private void updateProductList(String filter) {
        try {
            // پاک کردن محصولات قبلی
            productContainer.getChildren().clear();

            // فیلتر کردن محصولات بر اساس متن ورودی
            List<productSearchModel> filteredList = productList.stream()
                    .filter(p -> p.getName().toLowerCase().contains(filter.toLowerCase()))
                    .collect(Collectors.toList());

            // نمایش محصولات فیلتر شده
            for (productSearchModel product : filteredList) {
                productContainer.getChildren().add(createProductPane(product));
            }
        }catch (Exception e) {
            e.printStackTrace();
        }
    }

    private AnchorPane createProductPane(productSearchModel product) {
        AnchorPane pane = null;

        pane = new AnchorPane();
        pane.setPrefHeight(200);
        pane.setStyle("-fx-background-color: #f0f0f0; -fx-border-color: #ccc; -fx-padding: 10px;");
        productContainer.setStyle("-fx-max-height: Infinity;-fx-pref-height: USE_COMPUTED_SIZE;");

        // ایجاد و تنظیم عکس محصول
        ImageView imageView = new ImageView();
        if (getClass().getResource(product.getImage()) != null) {
            imageView = new ImageView(new Image(getClass().getResourceAsStream(product.getImage())));
        } else {
            System.out.println("Image not found: " + product.getImage());
            imageView = new ImageView(); // مقداردهی بدون تصویر
        }
        imageView.setFitWidth(50);
        imageView.setFitHeight(50);
        imageView.setLayoutX(10);
        imageView.setLayoutY(10);

        // ایجاد و تنظیم یک Label برای نام محصول
        Label nameLabel = new Label(product.getName());
        nameLabel.setLayoutX(70);
        nameLabel.setLayoutY(20);

        // ایجاد و تنظیم یک Label برای قیمت محصول
        Label priceLabel = new Label("تومان" + product.getPrice());
        priceLabel.setLayoutX(500);
        priceLabel.setLayoutY(20);


        // افزودن عناصر به AnchorPane
        pane.getChildren().addAll(imageView, nameLabel, priceLabel);

        pane.setOnMouseClicked(event -> {
            try {
                openNewWindow(product.getPagePath(), product.getName(), event);
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        });
        return pane;

    }

    public void openNewWindow(String Path , String title, MouseEvent event) throws IOException {
        FXMLLoader loader = new FXMLLoader(getClass().getResource(Path));
        Scene scene = new Scene(loader.load(), 1535, 790);

        // ایجاد و نمایش صفحه جدید
        Stage stage = new Stage();
        stage.setScene(scene);
        stage.setTitle(title);
        stage.show();

        // بستن صفحه فعلی
        Stage currentStage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        currentStage.close();
    }

    public void homeToProfile(ActionEvent actionEvent) {
        controller.openNewWindow("loginpage.fxml","loginpage",actionEvent);
    }

    public void sabadpage(ActionEvent actionEvent) {
        controller.openNewWindow("sabad.fxml","Cart",actionEvent);
    }


    public void why(ActionEvent actionEvent) {
        controller.openNewWindow("why.fxml","Why",actionEvent);
    }

    public void backpage(ActionEvent actionEvent) {
        controller.openNewWindow("hello-view.fxml","Home",actionEvent);
    }
}
