module com.example.oop {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.oop to javafx.fxml;
    exports com.example.oop;
    opens chap01_06object to javafx.fxml;
    exports chap01_06object.equals_;
    opens chap01_06object.equals_ to javafx.fxml;
}