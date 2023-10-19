package demoqa.practiceForm;


import com.codeborne.selenide.Configuration;
import demoqa.BaseTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import static com.codeborne.selenide.Selenide.open;


public class RegistrationFormsTest extends BaseTest {
    @BeforeTest

    Configuration.baseUrl

    @Test

    void successRegistration() {
        open("/automation-practice-form");
    }
}
