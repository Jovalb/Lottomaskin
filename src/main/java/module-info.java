module com.jovo {
    requires javafx.controls;
    requires javafx.fxml;

    opens com.jovo to javafx.fxml;
    exports com.jovo;
}