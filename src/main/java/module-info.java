module com.leo.snake {
    requires javafx.controls;
    requires javafx.fxml;

    requires com.dlsc.formsfx;

    opens com.leo.snake to javafx.fxml;
    exports com.leo.snake;
}