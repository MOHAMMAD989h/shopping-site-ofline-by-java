module com.example.site {
    requires javafx.controls;
    requires javafx.fxml;

    requires org.controlsfx.controls;
    requires org.kordamp.bootstrapfx.core;
    requires java.desktop;
    requires java.sql;
    requires mysql.connector.j;
    requires org.json;

    opens com.example.site to javafx.fxml;
    exports com.example.site;
}