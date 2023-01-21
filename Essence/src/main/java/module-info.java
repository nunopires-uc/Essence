module eu.essence.essence {
    requires javafx.controls;
    requires javafx.fxml;

    opens eu.essence.essence to javafx.fxml;
    exports eu.essence.essence;
}
