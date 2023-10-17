package practiceForm;

import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Selenide.open;

public class StudentRegistrationForm {


    @Test
    void successRegistration() {
        open("/automation-practice-form");
    }
}
