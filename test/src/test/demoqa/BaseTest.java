import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.Selenide;
import org.junit.jupiter.api.BeforeAll;

public class BaseTest {
    @BeforeAll
    static void beforeAll() {
        Configuration.baseUrl = "http://demoqa.com";
        Configuration.browser = "CHROME";
        Configuration.browserSize = "1920x1080";
    }
}
