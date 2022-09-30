module com.mycompany.oficinaproj {
    requires javafx.controls;
    requires javafx.fxml;

    opens com.mycompany.oficinaproj to javafx.fxml;
    exports com.mycompany.oficinaproj;
}
