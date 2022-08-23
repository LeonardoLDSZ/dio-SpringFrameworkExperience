module com.example.diospringframeworkexperience {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.diospringframeworkexperience to javafx.fxml;
    exports com.example.diospringframeworkexperience;
}