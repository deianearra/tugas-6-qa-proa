module com.proasqa.qaautomationproasqa {
    requires javafx.controls;
    requires javafx.fxml;
    requires io.cucumber.java;
    requires selenium.api;
    requires selenium.chrome.driver;
    requires junit;
    requires io.cucumber.junit;


    opens com.proasqa.qaautomationproasqa to javafx.fxml;
    exports com.proasqa.qaautomationproasqa;
}