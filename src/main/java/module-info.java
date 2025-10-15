module org.example.javagameproject {
    requires javafx.controls;
    requires javafx.fxml;


    opens org.example.javagameproject to javafx.fxml;
    exports org.example.javagameproject;
}