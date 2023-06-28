module com.example.javafx {
    requires javafx.controls;
    requires javafx.fxml;
    requires commons.math3;

    opens com.example.javafx to javafx.fxml;
    exports com.example.javafx;
}
