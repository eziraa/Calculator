module com.example.samplecalculator {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.samplecalculator to javafx.fxml;
    exports com.example.samplecalculator;
}