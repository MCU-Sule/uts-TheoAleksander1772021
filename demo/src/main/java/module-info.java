module com.uts.demo {
    requires javafx.controls;
    requires javafx.fxml;
    requires java.sql;


    opens com.uts.demo to javafx.fxml;
    exports com.uts.demo;
}