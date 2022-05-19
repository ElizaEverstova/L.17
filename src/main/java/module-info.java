module com.example.l_17 {
    requires javafx.controls;
    requires javafx.fxml;

    requires com.dlsc.formsfx;

    opens com.example.l_17 to javafx.fxml;
    exports com.example.l_17;
}