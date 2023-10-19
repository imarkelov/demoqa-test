package demoqa;

import com.codeborne.selenide.Configuration;
import org.testng.annotations.BeforeTest;

public class BaseTest {
    public void beforeAll() {
        Configuration.baseUrl = "http://demoqa.com";
        Configuration.browser = "CHROME";
        Configuration.browserSize = "1920x1080";
    }
}
