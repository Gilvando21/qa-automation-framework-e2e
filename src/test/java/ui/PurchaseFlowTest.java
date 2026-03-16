
import com.microsoft.playwright.*;
import org.junit.jupiter.api.Test;

public class PurchaseFlowTest {

    @Test
    void testPurchaseFlow(){

        try (Playwright playwright = Playwright.create()) {

            Browser browser = playwright.chromium().launch();
            Page page = browser.newPage();

            page.navigate("https://www.saucedemo.com/");
            System.out.println("Login page opened");

        }

    }

}
