module com.example.ukolprog {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.ukolprog to javafx.fxml;
    exports com.example.ukolprog;
}