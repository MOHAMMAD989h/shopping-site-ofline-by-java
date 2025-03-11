package com.example.site;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.input.KeyCode;
import javafx.stage.Stage;
import javafx.scene.input.KeyEvent;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

import static java.math.RoundingMode.DOWN;
import static java.math.RoundingMode.UP;

public class HelloApplication extends Application {
    @Override
    public void start(Stage stage) throws IOException  {
        FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("hello-view.fxml"));
        Scene scene = new Scene(fxmlLoader.load(), 1535, 790);
        scene.addEventFilter(KeyEvent.KEY_PRESSED,(KeyEvent event) -> {
            switch (event.getCode()) {
                case UP:
                case DOWN:
                    event.consume();
                    break;
                default:
                    break;
            }
        });
        stage.setTitle("LenoShop");
        stage.setMinHeight(500);
        stage.setMinWidth(600);
        stage.setScene(scene);
        stage.show();
    }
    public static void main(String[] args) {
        try {
            File ProKamel = new File("ProKamel.txt");
            File prices = new File("Prices.txt");
            File myproducts = new File("products.txt");
            File Sefareshat = new File("Sefareshat.txt");
            File nahayi = new File("nahayi.txt");
            if (!ProKamel.exists() && ProKamel.createNewFile()) {
                System.out.println("ProKamel.txt created successfully.");
                FileWriter writer = new FileWriter(ProKamel);
                writer.write("LOQ 15IRH8 Corei7-13620H RTX4050 16GB 512GB/LOQ 15IRX9 Corei7-13650HX RTX4050 16GB 1TB/LOQ 16IRH8 Core i7-13620H RTX 4060 16GB 512GB/LegionPro7 Core i9-13900HX RTX 4080 32GB 1TB/LOQ 15IRX9 Corei7-13650HX RTX4050 16GB 512GB/LOQ 15ARP9 Ryzen7 7435HS RTX4060 16GB 512GB/LegionPro5 16IRX9 Core i7-14650HX RTX 4060 32GB 1TB/LegionPro5 16IRX8 Core i9-13900HX RTX 4070 32GB 2TB/LOQ 15IRH8 Corei7-13620H RTX4060 32GB 2TB FHD/Legion5 16IRX9 Corei7-14650HX RTX4060 64GB 2TB/Legion5 16IRX9 Corei9-14900HX RTX4060 16GB 1TB" +
                        "/Legion5Pro Y9000P Core i9-14900HX RTX 4060 16GB 1TB/YOGA Pro16sEVO Corei9-13905H RTX4060 32GB 1TB/ThinkBook16 Ryzen 7 7840H RTX 4050 32GB 1TB/ThinkBookT14p Core Ultra 9 185H RTX 4050 32GB 1TB/LOQ15 ARP9 Ryzen7 7435HS RTX4050 16GB 512GB/IdeaPad3 Core i3-1215U UHD 8GB 256GB/IdeaPadSlim3 Corei5-13420H UHDXe 8GB 512GB/IdeaPadSlim 3 15IRU8 Core i3-1305U UHD 8GB 256GB/IdeaPadSlim3 15IRH8 Core i7-13620H UHD 16GB 512GB/IdeaPadSlim3 Ryzen7 7730UR XVega8 8GB 512GB/V15G4 Ryzen5 7520U 610M 8GB 512GB/V15G 4Athlon Silver7120U 610M 8GB 256GB/IdeaPad1N4020 Celeron N4020 UHD 600 4GB 256GB/IdeaPadSlim 3 15IRU8 Core i3-1305U UHD 8GB 1TB/IdeaPad 115IGL7 Celeron N4020 UHD 600 8GB 256GB/IdeaPad 115AMN7 Ryzen5 7520U 610M 8GB 256GB/IdeaPad 115AMN7 Ryzen5 7520U 610M 8GB 512GB/IdeaPad5 Corei5-1235U MX550 16GB 512GB/LOQ 15IRH8 Core i5-12450H RTX 2050 8GB 512GB/IdeaPad5 Corei5-1235U MX550 16GB 1TB/ThinkBook 15G2 Corei5-1135G7 MX450 16GB 256GB/ThinkPadE14 Core i7-1355U MX550 16GB 512GB/ThinkBook 15G2 Corei5-1135G7 MX450 16GB 512GB/IdeaPad Gaming 315IHU6 Core i5-11320H RTX 2050 16GB 512GB/IdeaPad Gaming 315ACH6 Ryzen 5 5500H RTX 2050 16GB 512GB/LOQ15IAX9 Core i5-12450HX RTX 3050 12GB 512GB/Legion5 Core i5-10500H RTX 3050 8GB 512GB/ThinkPadX1 Tablet/LenovoTabPlus/TabP12/TabP12Pro/MICROUSB/TAB37/Lenovo TabM9/LenovoTabM10(3rdGen)/LenovoTabP11Pro/LenovoTabExtreme/YogaDuet7i7i/5v1.5a/YogaDuet7ii5/MIIX510/Lenovo tabP11Pro/YOGAPro 16sEVO Corei9-13905H RTX4060 32GB 1TB/LOQ15 ARP9 Ryzen 7 7435HS RTX 4050 16GB 512GB/YOGAPro14s EVO Core i9-13905H RTX 4060 32GB 1TB/یوگاSlim7Pro/9iGen9 Core Ultra 7 155H Arc 16GB 1TB OLED/YogaSlim7 x14Gen9 X Elite Adreno 16GB 1TB/Legion K500/Think TK200 Think Plus/SK-8821 Slim/Lenovo Essential Wireless Combo/Lenovo SK-8823 EKB-536A/Lenovo Numeric FKL808/Lecoo WS202 2.4GHz/Lenovo K4800s/LENOVO YOGA/Legion M500/Legion Pro 5/Casual Toploader T210/Lenovo M20/Legion STAR Y360/Thinkplus G70/Legion Y660 Pro/Backpack B510/Casual B210/Lenovo Legion H200/Legion Y480/Lenovo LP3 Pro/ LP5 Earphone/Legion/Lenovo LEGION SPEED MAX/Legion K300/Legion M600/20v 3.25a/Lenovo TS13/Armored Backpack/");
                writer.close();
            }

            if (!myproducts.exists() && myproducts.createNewFile()) {
                System.out.println("products.txt created successfully.");
                FileWriter writer = new FileWriter(myproducts);
                writer.write("LOQ15IRH8Corei7-13620HRTX405016GB512GB LOQ15IRX9Corei7-13650HXRTX405016GB1TB LOQ16IRH8 LegionPro7 LOQ15IRX9Corei7-13650HXRTX405016GB512GB LOQ15ARP9Ryzen77435HSRTX406016GB512GB LegionPro516IRX9 LegionPro516IRX8 LOQ15IRH8Corei7-13620HRTX406032GB2TBFHD " +
                        "Legion516IRX9Corei7-14650HXRTX406064GB2TB Legion516IRX9Corei9-14900HXRTX406016GB1TB Legion5ProY9000P YOGAPro16sEVOCorei9-13905HRTX406032GB1TB ThinkBook16 ThinkBookT14p LOQ15ARP9Ryzen77435HSRTX405016GB512GB IdeaPad3 IdeaPadSlim3Corei5-13420HUHDXe8GB512GB IdeaPadSlim315IRU8 IdeaPadSlim315IRH8 IdeaPadSlim3Ryzen77730URXVega88GB512GB V15G4Ryzen57520U610M8GB512GB V15G4AthlonSilver7120U610M8GB256GB IdeaPad1N4020 " +
                        "IdeaPadSlim315IRU8 IdeaPad115IGL7 IdeaPad115AMN7Ryzen57520U610M8GB256GB IdeaPad115AMN7Ryzen57520U610M8GB512GB IdeaPad5Corei5-1235UMX55016GB512GB LOQ15IRH8 IdeaPad5Corei5-1235UMX55016GB1TB ThinkBook15G2Corei5-1135G7MX45016GB256GB ThinkPadE14 ThinkBook15G2Corei5-1135G7MX45016GB512GB IdeaPadGaming315IHU6 IdeaPadGaming315ACH6 LOQ15IAX9 Legion5 ThinkPadX1Tablet " +
                        "LenovoTabPlus TabP12 TabP12Pro MICROUSB TAB37 LenovoTabM9 LenovoTabM10(3rdGen) LenovoTabP11Pro LenovoTabExtreme YogaDuet7i7i 5v1.5a YogaDuet7ii5 MIIX510 LenovotabP11Pro YOGAPro16sEVOCorei9-13905HRTX406032GB1TB LOQ15ARP9 YOGAPro14s یوگاSlim7Pro 9iGen9 YogaSlim7x14Gen9");
                writer.close();
            }

            if (!prices.exists() && prices.createNewFile()) {
                System.out.println("Prices.txt created successfully.");
                FileWriter writer = new FileWriter(prices);
                writer.write("56,500,000/72,500,000/73,900,000/159,900,000/70,900,000/72,900,000/117,900,000/139,900,000/79,900,000/69,900,000/99,900,000/0/0/101,900,000/170,900,000/69,900,000/28,300,000/31,400,000/26,500,000/41,000,000/32,000,000/29,100,000/17,200,000/17,900,000/26,300,000/18,500,000/25,300,000/28,600,000/47,500,000/48,700,00/49,200,000/47,900,000/0/48,000,000/0/59,800,000/56,000,000/0/20,200,000/30,300,000/30,700,000/56,590,000/186,000/325,000/9,702,000/15,606,000/0/0/0/230,000/0/0/0/169,900,000/99,900,000/139,900,000/115,900,000/0/95,900,000/5,325,000/2,750,000/366,000/1,819,000/867,000/730,000/375,000/590,000/5,215,000/1,989,000/4,480,000/872,000/98,000/1,330,000/2,480,000/2,273,000/1,198,000/990,000/1,330,000/1,280,000///2,950,000/2,560,000///");
                writer.close();
            }
            if (!Sefareshat.exists() && Sefareshat.createNewFile()) {
                System.out.println("Prices.txt created successfully.");
                FileWriter writer = new FileWriter(Sefareshat);
                writer.write("");
                writer.close();
            }
            if (!nahayi.exists() && nahayi.createNewFile()) {
                System.out.println("Prices.txt created successfully.");
                FileWriter writer = new FileWriter(Sefareshat);
                writer.write("");
                writer.close();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        File buyer=new File("buyer.txt");
        File price = new File("price.txt");
        if(price.exists()&&buyer.exists()){
            if(buyer.delete()&& price.delete()){
                System.out.println("deleted the File:"+buyer.getName());
                System.out.println("deleted the File:"+price.getName());
            }else{
            System.out.println("Failed to delete the Files");
            }
        }

        launch();
    }

}
