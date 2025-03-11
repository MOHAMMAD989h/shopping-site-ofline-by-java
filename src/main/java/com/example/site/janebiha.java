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
import javafx.scene.image.Image;
import javafx.scene.text.Text;
import javafx.stage.Stage;
import javafx.scene.image.ImageView;
import javafx.util.Duration;

import java.io.*;
import java.net.URL;
import java.util.ResourceBundle;
import java.util.StringTokenizer;

import static com.example.site.loginpage.*;

public class janebiha implements Initializable {
    @FXML
    public static String method1;
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
    @FXML
    public Label alart;
    @FXML
    public Label label1;
    @FXML
    public Label label2;
    @FXML
    public Label label3;
    @FXML
    public ImageView image;
    @FXML
    public Text text1;
    @FXML
    public Text text2;
    @FXML
    private Label methodLabel;
    public void backpage (ActionEvent event) {
        try {
            FXMLLoader loader = new FXMLLoader(getClass().getResource("janebi.fxml"));
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

    public void setMethod(String method) {
        methodLabel.setText("ورود با متد: " + method);
        if ("new1".equals(method)) {method1="4";
            label1.setText("کیبورد و موس Lenovo Essential Wireless Combo");
            label2.setText("گارانتی18 ماهه لنوو");
            label3.setText("1,819,000 تومان");
            text1.setText("ماوس طرحی زیبا و ساده ارائه می دهد که کاملاً در دست احساس می شود و صفحه کلید دارای یک طراحی نوین با کلید جزیره ای است که تایپ کردن را به یک لذت تبدیل می کند.علاوه بر این ، این ترکیب برای اطمینان از حداکثر قابلیت اطمینان ، شبیه سازی دقیق تست را پشت سر گذاشته است.با داشتن نشانگرهای LED بر روی کلیدهای Caps Lock و Num Lock، به راحتی از اشتباهات تایپ پسورد جلوگیری کنید.");
            text2.setText("طول عمر باتری : بیش از 12 ماه\n" +
                    "نوع اتصال : نانو 2.4GHz Wireless via Nano USB\n" +
                    "وزن :  موس 60g – کیبورد 582g\n" +
                    "دکمه های ماوس : 3 (left click, right click, scroll click)\n" +
                    "دکمه های کیبورد : 106 keys\n" +
                    "سنسور موس : لیزر 1200DPI\n" +
                    "رنگ : مشکی");
            String imagePath = "/Images/janebi/1.png";
            Image img = new Image(getClass().getResource(imagePath).toExternalForm());
            image.setImage(img);

        }
        else if ("new2".equals(method)) {method1="3";
            label1.setText("کیبورد لنوو مدل SK-8821 Slim");
            label2.setText("گارانتی18 ماهه لنوو");
            label3.setText("366,000 تومان");
            text1.setText("کیبورد استوک لنوو مدل SK-8821 Slim اولین چیزی را که این صفحه کلید توجه شما را جلب خواهد کرد ، ابعاد و اندازه ی مناسب آن است . اندازه های 2*16*43 سانتی متر می باشد .جدا از ابعاد 8821 ، ظاهر این صفحه کلید تا حدودی غیر معمول می باشد . کلید ها و حروف ثبت شده روی آن ها بزرگ هستند و هر کلیدی شامل دو لبه در کناره های چپ و راستش می شود .این کیبورد در برابر مایعات مقاوم نیست و ممکن با برخورد با آب کیبورد اتصالی کند.از مهمترین محاسن این کیبورد میتوان به طراحی کامل آمریکایی آن اشاره کرد. به همین دلیل است که تمامی کلید ها به زبان انگلیسی طراحی شده است.همچنین از ویژگی های این کیبورد میتوان به سبک بودن ، ظریف بودن ، دارای کلید های نام پد اشاره کرد.");
            text2.setText("نوع اتصال: باسيم\n" +
                    "طول سیم : 2 متر\n" +
                    "نوع رابط: پورت USB\n" +
                    "ورودي USB: ندارد\n" +
                    "ورودي ميکروفن و هدفون: ندارد\n" +
                    "مقاوم در مقابل نفوذ مايعات: نیست\n" +
                    "ابعاد :  2*16*43\n" +
                    "وزن : 450 گرم");
            String imagePath = "/Images/janebi/2.jpg";
            Image img = new Image(getClass().getResource(imagePath).toExternalForm());
            image.setImage(img);
        }
        else if ("new3".equals(method)) {method1="2";
            label1.setText("کیبورد مکانیکی گیمینگ لنوو Think TK200 Think Plus");
            label2.setText("گارانتی18 ماهه لنوو");
            label3.setText("2,750,000 تومان");
            text1.setText("کیبورد مکانیکی گیمینگ لنوو Think TK200 Think Plus از بهترین الیاف ساخته شده و قادر است یک رابط هوشمند و کاربردی بین شما و کامپیوترتان باشد.با زیبایی آن و دکمه های مکانیکی به راحتی به بازی های اکشن و هیجان انگیز بپردازید.در زیر هر کلید یک کلید مکانیکی قرمز با کیفیت بالا طراحی شده است که با استفاده از بازی ، عملکرد و قابلیت اطمینان در کلاس را در طول عمر 50 میلیون کلیک ارائه می دهد.کلیدهای کیبورد Think TK200 Think Plus به واسطه طراحی خاص خود، حالتی معلق دارند ، به نحوی که کمک می کند تا تایپ کردن و کار با آن بسیار راحت تر و لذت بخش تر شود.کیبورد دارای نور پس زمینه تک رنگ آبی است که زیبایی کیبورد را دو چندان کرده است، اما این تنها نوری نیست که برای پس زمینه وجود داشته باشد،این نور از حروف نیز ساطع می شود. بنابراین شما استفاده راحت تری در تاریکی از کیبورد خواهید داشت.");
            text2.setText("ابعاد : 146mm × 449mm\n" +
                    "وزن : 850 گرم\n" +
                    "نوع اتصال : USB\n" +
                    "عمر متوسط کیبورد : 50 میلیون کیلیک بر هر دکمه\n" +
                    "رنگ : مشکی\n" +
                    "دارای نور پس زمینه آبی");
            String imagePath = "/Images/janebi/3.jpg";
            Image img = new Image(getClass().getResource(imagePath).toExternalForm());
            image.setImage(img);
        }
        else if ("new4".equals(method)) {method1="1";
            label1.setText("کیبورد مکانیکی گیمینگ لنوو Legion K500");
            label2.setText("گارانتی18 ماهه لنوو");
            label3.setText("5,325,000 تومان");
            text1.setText("کیبورد مکانیکی گیمینگ لنوو Legion K500 از بهترین الیاف ساخته شده و قادر است یک رابط هوشمند و کاربردی بین شما و کامپیوترتان باشد.با زیبایی آن و دکمه های مکانیکی به راحتی به بازی های اکشن و هیجان انگیز بپردازید.بدنه با پوشش کربن و رنگ خاکستری و دکمه های مزین  به چراغ های روشن و شفاف RGB که دارای 16.8 میلیون رنگ هستند ،بسیار لونکس هستند و کلیدها به وضوح از روی قاب بیرون می آیند و هر صفحه کلید با لیزر است تا از تأثیر نور درخشان در طرح استفاده کند.در زیر هر کلید یک کلید مکانیکی قرمز با کیفیت بالا طراحی شده است که با استفاده از بازی ، عملکرد و قابلیت اطمینان در کلاس را در طول عمر 50 میلیون کلیک ارائه می دهد.این صفحه کلید با یک استراحت کف قابل جدا شدن با بافت لیزری ساخته شده است تا در برابر گرد و غبار ، گریس و کثیفی مقاومت کند.");
            text2.setText("مشخصات فيزيکي ابعاد: 443.3 x 217.8 x 33.2 mm – وزن: 1.10 کيلوگرم\n" +
                    "نور پس زمینه : 16.8 میلیون رنگ (RGB)\n" +
                    "کلید های رابط : دارد 7 عدد\n" +
                    "رابط USB 2.0\n" +
                    "گارانتی : یکساله بین الملل");
            String imagePath = "/Images/janebi/4.jpg";
            Image img = new Image(getClass().getResource(imagePath).toExternalForm());
            image.setImage(img);
        }
        else if ("new5".equals(method)) {method1="8";
            label1.setText("صفحه کلید USB لنوو Lenovo K4800s");
            label2.setText("گارانتی18 ماهه لنوو");
            label3.setText("590,000 تومان");
            text1.setText("صفحه کلید USB لنوو Lenovo K4800s برای کسانی که به دنبال یک صفحه\u200Cکلید USB معمولی هستند مناسب است.صفحه کلید دارای طراحی کلید جزیره ای است که تایپ کردن را لذت بخش می کند.علاوه بر این، صفحه\u200Cکلید USB لنوو، شبیه\u200Cسازی\u200Cهای آزمایشی دقیقی را پشت سر گذاشت تا از حداکثر قابلیت اطمینان اطمینان حاصل شود.اولین چیزی را که این صفحه کلید توجه شما را جلب خواهد کرد ، ابعاد و اندازه ی مناسب آن است.اندازه های 440x 150 x 26.5 میلی متر می باشد.جدا از ابعاد این کیبورد ، ظاهر این صفحه کلید نیز با چینش ماسبی دارد . کلید ها و حروف ثبت شده روی آن ها بزرگ هستند و هر کلیدی شامل دو لبه در کناره های چپ و راستش می شود.این کیبورد در برابر مایعات مقاوم نیست و ممکن با برخورد با آب کیبورد اتصالی کند.در ضمن این کیبورد از نوع طراحی اسلیم است که آن را بسیار خوش دست کرده است.");
            text2.setText("ابعاد: 440x 150 x 26.5 میلی متر – وزن: 470 گرم\n" +
                    "نوع اتصال: با سیم\n" +
                    "نوع رابط: پورت USB\n" +
                    "طول کابل: 1.5 متر\n" +
                    "تعداد دکمه ها: 104 عدد\n" +
                    "سازگار با: Windows XP/7/8/10\n" +
                    "رنگ: مشکی");
            String imagePath = "/Images/janebi/5.png";
            Image img = new Image(getClass().getResource(imagePath).toExternalForm());
            image.setImage(img);
        }
        else if ("new6".equals(method)) {method1="7";
            label1.setText("موس بی سیم لنوو Lecoo WS202 2.4GHz");
            label2.setText("گارانتی18 ماهه لنوو");
            label3.setText("375,000 تومان");
            text1.setText("موس بی\u200Cسیم لنوو Lecoo WS202 با اتصال 2.4 گیگاهرتزی، تجربه\u200Cای روان و بدون محدودیت را برای کاربران فراهم می\u200Cکند. طراحی ارگونومیک و وزن سبک آن باعث راحتی در استفاده طولانی\u200Cمدت شده و حسگر نوری دقیق، حرکات نرم و کنترل دقیق را تضمین می\u200Cکند. این موس با مصرف انرژی بهینه، عمر باتری بالایی داشته و برای استفاده روزمره، طراحی و حتی گیمینگ سبک گزینه\u200Cای ایده\u200Cآل محسوب می\u200Cشود. همچنین، با اکثر سیستم\u200Cعامل\u200Cها از جمله ویندوز و مک سازگاری دارد و تا فاصله 10 متر اتصال پایداری ارائه می\u200Cدهد که آزادی عمل بیشتری را برای کاربران فراهم می\u200Cکند.");
            text2.setText("رنگ: Black\n" +
                    "نوع اتصال : 2.4G wireless\n" +
                    "تعداد دکمه ها: 4\n" +
                    "دقت و DPI موس : 800-1200-1600DPI\n" +
                    "باتری: 1*AA battery (شامل بسته نیست)\n" +
                    "سیستم عامل: Windows 2000/Win XP/Win7/Win8/Win10\n" +
                    "ابعاد : 9.9 * 6.02 * 3.23cm /3.9 * 2.37 * 1.27in\n" +
                    "وزن: 52 گرم");
            String imagePath = "/Images/janebi/6.jpg";
            Image img = new Image(getClass().getResource(imagePath).toExternalForm());
            image.setImage(img);
        }
        else if ("new7".equals(method)) {method1="6";
            label1.setText("کیبورد لنوو Lenovo Numeric FKL808");
            label2.setText("گارانتی18 ماهه لنوو");
            label3.setText("730,000 تومان");
            text1.setText("کیبورد لنوو Lenovo Numeric FKL808 یک صفحه\u200Cکلید عددی کاربردی و باکیفیت است که برای افرادی که با اعداد و محاسبات زیاد سروکار دارند، گزینه\u200Cای ایده\u200Cآل محسوب می\u200Cشود. طراحی ارگونومیک و کلیدهای نرم آن باعث راحتی در تایپ و کاهش خستگی دست می\u200Cشود. این کیبورد از طریق اتصال باسیم به دستگاه متصل شده و با تمامی سیستم\u200Cعامل\u200Cهای رایج مانند ویندوز و مک سازگاری دارد. کیفیت ساخت بالا و طراحی مینیمال آن باعث می\u200Cشود علاوه بر عملکرد دقیق، فضای کمی را اشغال کرده و گزینه\u200Cای مناسب برای استفاده در محیط\u200Cهای کاری و اداری باشد.");
            text2.setText("رابط اتصال: سیمی\n" +
                    "نوع اتصال: USB 2.0\n" +
                    "وزن: 300 گرم\n" +
                    "ابعاد: 43 ×94 × 181 میلی متر\n" +
                    "مشخصات دیگر: تکنولوژی Plug & Play – سازگار با تمامی سیستم عامل ها");
            String imagePath = "/Images/janebi/7.jpg";
            Image img = new Image(getClass().getResource(imagePath).toExternalForm());
            image.setImage(img);
        }
        else if ("new8".equals(method)) {method1="5";
            label1.setText("کيبورد با سيم لنوو Lenovo SK-8823 EKB-536A");
            label2.setText("گارانتی18 ماهه لنوو");
            label3.setText("867,000 تومان");
            text1.setText("کیبورد با سیم لنوو Lenovo SK-8823 EKB-536A یک صفحه\u200Cکلید مقاوم و خوش\u200Cساخت است که برای استفاده روزمره و اداری طراحی شده است. این کیبورد از طریق اتصال با سیم، پایداری و سرعت بالایی را در انتقال داده\u200Cها ارائه می\u200Cدهد و بدون نیاز به نصب درایور، به راحتی با تمامی سیستم\u200Cعامل\u200Cهای رایج مانند ویندوز و مک سازگار است. طراحی ارگونومیک و کلیدهای نرم و کم\u200Cصدا، تایپ راحت و بدون خستگی را ممکن می\u200Cسازد. همچنین، کیفیت ساخت بالا و دوام کلیدها، این مدل را به گزینه\u200Cای ایده\u200Cآل برای استفاده طولانی\u200Cمدت در محیط\u200Cهای کاری و خانگی تبدیل کرده است.");
            text2.setText("نوع اتصال: باسيم\n" +
                    "طول سیم : 2 متر\n" +
                    "نوع رابط: پورت USB\n" +
                    "ورودي USB: ندارد\n" +
                    "ورودي ميکروفن و هدفون: ندارد\n" +
                    "نور پس زمینه : ندارد\n" +
                    "ابعاد :  20*145*425 میلیمتر\n" +
                    "وزن : 450 گرم");
            String imagePath = "/Images/janebi/8.jpg";
            Image img = new Image(getClass().getResource(imagePath).toExternalForm());
            image.setImage(img);
        }
        else if ("new9".equals(method)) {method1="12";
            label1.setText("کیف لپ تاپ لنوو مدل Casual Toploader T210");
            label2.setText("گارانتی18 ماهه لنوو");
            label3.setText("872,000 تومان");
            text1.setText("کیف لپ\u200Cتاپ لنوو مدل Casual Toploader T210 یک گزینه ایده\u200Cآل برای حمل و محافظت از لپ\u200Cتاپ\u200Cهای تا 15.6 اینچ است. این کیف با طراحی شیک و مینیمال، از جنس پارچه ضدآب و باکیفیت ساخته شده که در برابر رطوبت و گردوغبار مقاوم است. محفظه اصلی جادار آن دارای لایه\u200Cهای محافظ برای جلوگیری از ضربه و آسیب به لپ\u200Cتاپ بوده و جیب\u200Cهای جانبی آن امکان نگهداری لوازم جانبی مانند شارژر، ماوس و مدارک را فراهم می\u200Cکند. دسته مقاوم و بند دوشی قابل تنظیم نیز حمل این کیف را آسان\u200Cتر کرده و آن را به گزینه\u200Cای مناسب برای استفاده روزمره، کاری و دانشگاهی تبدیل کرده است.");
            text2.setText("ابعاد: 362 x 22 x 250 mm میلی متر\n" +
                    "وزن: 435 گرم\n" +
                    "رنگ : خاکستری – مشکی – آبی\n" +
                    "مناسب برای لپ تاپ های : 14 تا 15.6 اینچ لنوو\n" +
                    "قابلیت ها : دارای ضربه گیر – ضدآب – بند چمدان یکپارچه برای سفر راحت تر");
            String imagePath = "/Images/janebi/9.jpg";
            Image img = new Image(getClass().getResource(imagePath).toExternalForm());
            image.setImage(img);
        }
        else if ("new10".equals(method)) {method1="11";
            label1.setText("کیف گیمینگ لپ تاپ لنوو مدل Legion Pro 5");
            label2.setText("گارانتی18 ماهه لنوو");
            label3.setText("4,480,000 تومان");
            text1.setText("کیف گیمینگ لپ\u200Cتاپ لنوو مدل Legion Pro 5 یک گزینه ایده\u200Cآل برای گیمرها و افرادی است که به دنبال یک کیف مقاوم، جادار و با طراحی مدرن هستند. این کیف با فضای داخلی بزرگ، امکان حمل لپ\u200Cتاپ\u200Cهای گیمینگ تا 16 اینچ را فراهم کرده و دارای محفظه\u200Cهای متعدد برای نگهداری لوازم جانبی مانند ماوس، کیبورد، هدفون و سایر تجهیزات گیمینگ است. جنس بدنه مقاوم و ضدآب آن از لپ\u200Cتاپ در برابر ضربه، رطوبت و گردوغبار محافظت می\u200Cکند. طراحی ارگونومیک، بندهای قابل تنظیم و دسته\u200Cهای تقویت\u200Cشده باعث راحتی در حمل شده و آن را به گزینه\u200Cای عالی برای گیمرها، دانشجویان و حرفه\u200Cای\u200Cها تبدیل کرده است.");
            text2.setText("ابعاد: 17 اینچ\n" +
                    "وزن : 475 گرم\n" +
                    "رنگ : سفید – مشکی\n" +
                    "مناسب برای لپ تاپ های : 14 تا 17 اینچ لنوو\n" +
                    "قابلیت ها : دارای ضربه گیر – بند چمدان یکپارچه برای سفر راحت تر");
            String imagePath = "/Images/janebi/10.jpg";
            Image img = new Image(getClass().getResource(imagePath).toExternalForm());
            image.setImage(img);
        }
        else if ("new11".equals(method)) {method1="10";
            label1.setText("موس گیمینگ لنوو مدل Legion M500");
            label2.setText("گارانتی18 ماهه لنوو");
            label3.setText("1,989,000 تومان");
            text1.setText("موس گیمینگ لنوو مدل Legion M500 یک انتخاب حرفه\u200Cای برای گیمرهایی است که به دنبال دقت، سرعت و راحتی در بازی هستند. این موس با طراحی ارگونومیک و بدنه\u200Cای خوش\u200Cدست، امکان استفاده طولانی\u200Cمدت بدون خستگی را فراهم می\u200Cکند. سنسور نوری پیشرفته با دقت قابل تنظیم تا 16,000 DPI، عملکردی دقیق و سریع را ارائه داده و دکمه\u200Cهای قابل برنامه\u200Cریزی، انعطاف بیشتری برای اجرای دستورات در بازی\u200Cها فراهم می\u200Cکنند. نورپردازی RGB جذاب، کیفیت ساخت بالا و سوییچ\u200Cهای مقاوم، این موس را به گزینه\u200Cای ایده\u200Cآل برای گیمرهای حرفه\u200Cای تبدیل کرده است.");
            text2.setText("به لطف سنسور 50 گرمی 400 IPS (Pixart PMW 3389) و سوئیچ DPI در حال پرواز، با حداکثر 16000 DPI\n" +
                    "با میکرو سوئیچ های omron برای دکمه های چپ/راست سریع عمل کنید (50 میلیون کلیک)\n" +
                    "از کنترل کامل با 7 دکمه قابل برنامه ریزی لذت ببرید: چپ، راست، چرخ، سمت x 2، DPI x 2\n" +
                    "رنگ ها را با 16.8 میلیون رنگ RGB 3 منطقه ای (آرم، چرخ اسکرول، پایین) تغییر دهید\n" +
                    "دسته های کناری بافت راحت برای کنترل بهتر\n" +
                    "وزن آهنربای اختیاری 10 گرم\n" +
                    "کابل بافته شده 1.8 متری با بند حلقه\n" +
                    "به راحتی تمام جزئیات را با نرم افزار موجود تنظیم کنید\n" +
                    "3 پروفایل روی برد");
            String imagePath = "/Images/janebi/11.jpg";
            Image img = new Image(getClass().getResource(imagePath).toExternalForm());
            image.setImage(img);
        }
        else if ("new12".equals(method)) {method1="9";
            label1.setText("موس بیسیم یوگا LENOVO YOGA");
            label2.setText("گارانتی18 ماهه لنوو");
            label3.setText("5,215,000 تومان");
            text1.setText("موس بی\u200Cسیم لنوو مدل Lenovo Yoga یک موس مدرن و چندکاره است که طراحی شیک، ارگونومیک و فوق\u200Cالعاده کاربردی را ارائه می\u200Cدهد. این موس با قابلیت چرخش 180 درجه\u200Cای، به\u200Cراحتی به یک ریموت کنترل برای ارائه\u200Cها و جلسات کاری تبدیل می\u200Cشود. اتصال بی\u200Cسیم دوگانه از طریق بلوتوث و دانگل 2.4 گیگاهرتزی، انعطاف\u200Cپذیری بالایی را برای استفاده در دستگاه\u200Cهای مختلف فراهم می\u200Cکند. سنسور نوری دقیق با دقت بالا، حرکتی نرم و روان را تضمین کرده و باتری قابل شارژ داخلی با دوام طولانی، استفاده مداوم و بدون دغدغه را ممکن می\u200Cسازد. طراحی سبک و مینیمال این موس، آن را به گزینه\u200Cای ایده\u200Cآل برای کاربران حرفه\u200Cای، طراحان و افرادی که به\u200Cدنبال یک موس همه\u200Cکاره و مدرن هستند، تبدیل کرده است.");
            text2.setText("نوع اتصال : بی سیم 2.4 گیگاهرتز (از طریق گیرنده نانو یا بلوتوث 5.0)\n" +
                    "DPI : قابل تنظیم سطح  DPI در3 سطح (1600. 1200 ، 800)\n" +
                    "وزن: 60 گرم\n" +
                    "نوع کابل شارژ : USB C به USB A (0.5 متر)\n" +
                    "عمر باتری : 2 ماه\n" +
                    "ویژگی های خاص طراحی پیچ لولا\n" +
                    "محفظه گیرنده USB نانو");
            String imagePath = "/Images/janebi/12.jpg";
            Image img = new Image(getClass().getResource(imagePath).toExternalForm());
            image.setImage(img);
        }
        else if ("new14".equals(method)) {method1="15";
            label1.setText("هدفون سیمی گیمینگ لنوو Thinkplus G70");
            label2.setText("گارانتی18 ماهه لنوو");
            label3.setText("1,200,000 تومان");
            text1.setText("هدفون سیمی گیمینگ لنوو مدل Thinkplus G70 یک انتخاب عالی برای گیمرهایی است که به دنبال کیفیت صدای شفاف، طراحی راحت و عملکرد حرفه\u200Cای هستند. این هدفون با درایورهای قدرتمند، صدایی عمیق و واضح ارائه می\u200Cدهد و تجربه\u200Cای فراگیر را در بازی\u200Cها فراهم می\u200Cکند. میکروفون با قابلیت حذف نویز، ارتباطی شفاف و بدون اختلال را در بازی\u200Cهای آنلاین تضمین کرده و کابل باکیفیت آن، اتصال پایدار و بدون تأخیر را فراهم می\u200Cکند. طراحی ارگونومیک با بالشتک\u200Cهای نرم و سبک بودن بدنه، راحتی استفاده طولانی\u200Cمدت را تضمین کرده و آن را به گزینه\u200Cای مناسب برای گیمرهای حرفه\u200Cای و علاقه\u200Cمندان به صدا تبدیل کرده است.");
            text2.setText("نوع اتصال : با سیم\n" +
                    "رابط اتصال : USB\n" +
                    "جلوه ها : نور دهی RGB\n" +
                    "نوع گوشی : هدفون روی گوش\n" +
                    "عملکرد: هدست گیمینگ\n" +
                    "امپدانس : 32 اهم\n" +
                    "قطر درایور : 50 میلی متر\n" +
                    "طول کابل : 2.2 متر\n" +
                    "وزن : 355 گرم\n" +
                    "رنگ : مشکی\n" +
                    "دارای دفترچه راهنما");
            String imagePath = "/Images/janebi/14.jpg";
            Image img = new Image(getClass().getResource(imagePath).toExternalForm());
            image.setImage(img);
        }
        else if ("new13".equals(method)) {method1="16";
            label1.setText("هدفون گیمینگ لنوو مدل Legion Y660 Pro");
            label2.setText("گارانتی18 ماهه لنوو");
            label3.setText("3,058,000 تومان");
            text1.setText("هدفون گیمینگ لنوو مدل Legion Y660 Pro یک گزینه حرفه\u200Cای برای گیمرهایی است که به دنبال کیفیت صدای فراگیر، طراحی ارگونومیک و عملکرد بی\u200Cنقص هستند. این هدفون با درایورهای قدرتمند، صدایی شفاف و با جزئیات بالا را ارائه می\u200Cدهد و با پشتیبانی از صدای فراگیر، تجربه\u200Cای عمیق و واقعی از بازی\u200Cها را فراهم می\u200Cکند. میکروفون با قابلیت حذف نویز، ارتباطی واضح و بدون اختلال را در بازی\u200Cهای تیمی تضمین می\u200Cکند. طراحی ارگونومیک با بالشتک\u200Cهای نرم و سبک بودن بدنه، راحتی استفاده طولانی\u200Cمدت را فراهم کرده و نورپردازی RGB جذاب، جلوه\u200Cای خاص به تجهیزات گیمینگ شما می\u200Cبخشد. این هدفون با اکثر پلتفرم\u200Cهای گیمینگ سازگار بوده و گزینه\u200Cای ایده\u200Cآل برای گیمرهای حرفه\u200Cای محسوب می\u200Cشود. ");
            text2.setText("نوع اتصال : سیمی\n" +
                    "نوع گوشی : هدفون روی گوش\n" +
                    "عمکرد : هدست گیمینگ\n" +
                    "واسط اتصال: کابل USB\n" +
                    "طول کابل : 2.2 متر\n" +
                    "حساسیت : 105 دسیبل\n" +
                    "وزن : 407 گرم\n" +
                    "دارای دفتر چه راهنما – سی دی درایور – پد متوسط و کوچک – سری میکروفن");
            String imagePath = "/Images/janebi/13.jpg";
            Image img = new Image(getClass().getResource(imagePath).toExternalForm());
            image.setImage(img);
        }
        else if ("new15".equals(method)) {method1="14";
            label1.setText("هدفون گیمینگ لنوو مدل Legion STAR Y360");
            label2.setText("گارانتی18 ماهه لنوو");
            label3.setText("1,545,000 تومان");
            text1.setText("هدفون گیمینگ لنوو مدل Legion STAR Y360 یک انتخاب حرفه\u200Cای برای گیمرهایی است که به دنبال صدای قدرتمند، طراحی ارگونومیک و عملکرد بی\u200Cنقص هستند. این هدفون با درایورهای باکیفیت، صدایی شفاف و فراگیر ارائه می\u200Cدهد و تجربه\u200Cای غوطه\u200Cور در بازی\u200Cها را فراهم می\u200Cکند. میکروفون با قابلیت حذف نویز، ارتباطی واضح و بدون نویز را در مکالمات و بازی\u200Cهای آنلاین تضمین کرده و طراحی سبک با بالشتک\u200Cهای نرم، راحتی استفاده طولانی\u200Cمدت را فراهم می\u200Cکند. همچنین، نورپردازی RGB جذاب، جلوه\u200Cای مدرن به این هدفون بخشیده و آن را به گزینه\u200Cای ایده\u200Cآل برای گیمرهای حرفه\u200Cای تبدیل کرده است.");
            text2.setText("وزن نصب شده : 0.93kg\n" +
                    "نوع اتصال : Wired\n" +
                    "نوع گوشی : هدفون روی گوش\n" +
                    "عمکرد : هدست گیمینگ\n" +
                    "واسط اتصال: کابل USB\n" +
                    "زول کابل : 2.2 متر\n" +
                    "وزن  خالص : 333 گرم\n" +
                    "ابعاد : 96*108*228 میلی متر\n" +
                    "دارای دفتر چه راهنما");
            String imagePath = "/Images/janebi/15.jpg";
            Image img = new Image(getClass().getResource(imagePath).toExternalForm());
            image.setImage(img);
        }
        else if ("new16".equals(method)) {method1="13";
            label1.setText("موس لپ تاپ لنوو مدل Lenovo M20");
            label2.setText("گارانتی18 ماهه لنوو");
            label3.setText("98,000 تومان");
            text1.setText("موس لپ\u200Cتاپ لنوو مدل Lenovo M20 یک موس سبک، کاربردی و خوش\u200Cدست است که برای استفاده روزمره و اداری طراحی شده است. این موس با اتصال باسیم از طریق درگاه USB، پایداری و دقت بالایی را ارائه می\u200Cدهد و بدون نیاز به نصب درایور، به\u200Cراحتی با تمامی سیستم\u200Cعامل\u200Cهای رایج مانند ویندوز و مک سازگار است. طراحی ارگونومیک و بدنه\u200Cی کوچک آن باعث می\u200Cشود به\u200Cراحتی در کیف لپ\u200Cتاپ جا بگیرد و گزینه\u200Cای ایده\u200Cآل برای حمل و استفاده در هر محیطی باشد. حسگر نوری دقیق آن حرکتی نرم و روان را تضمین می\u200Cکند و استفاده طولانی\u200Cمدت بدون خستگی را ممکن می\u200Cسازد. ");
            text2.setText("مدل : m20\n" +
                    "نوع : با سیم\n" +
                    "رنگ : مشکی + بنفش\n" +
                    "سیستم عامل : MAC & WINDOWS\n" +
                    "نوع ارتباط : USB\n" +
                    "وزن : 150 گرم");
            String imagePath = "/Images/janebi/16.jpg";
            Image img = new Image(getClass().getResource(imagePath).toExternalForm());
            image.setImage(img);
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
    public void lap1ToProfile(ActionEvent actionEvent) {
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
    public void kharid1(ActionEvent event){
        String Index = method1;
        int adad=0;
        if("1".equals(Index)){
            adad=59;
        }else if("2".equals(Index)){
            adad=60;
        }else if("3".equals(Index)){
            adad=61;
        }else if("4".equals(Index)){
            adad=62;
        }else if("5".equals(Index)){
            adad=63;
        }else if("6".equals(Index)){
            adad=64;
        }else if("7".equals(Index)){
            adad=65;
        }else if("8".equals(Index)){
            adad=66;
        }else if("9".equals(Index)){
            adad=67;
        }else if("10".equals(Index)){
            adad=68;
        }else if("11".equals(Index)){
            adad=69;
        }else if("12".equals(Index)){
            adad=70;
        }else if("13".equals(Index)){
            adad=71;
        }else if("14".equals(Index)){
            adad=72;
        }else if("15".equals(Index)){
            adad=73;
        }else if("16".equals(Index)) {
            adad = 74;
        }

        kharid(adad,event);
    }




}

