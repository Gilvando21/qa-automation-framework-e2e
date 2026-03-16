
package ui;

import com.microsoft.playwright.*;
import org.junit.jupiter.api.Test;
import core.utils.ScreenshotUtils;

public class PurchaseFlowTest {

    @Test
    void purchaseFlow(){

        try (Playwright playwright = Playwright.create()) {

            Browser browser = playwright.chromium().launch(
                new BrowserType.LaunchOptions().setHeadless(false)
            );

            BrowserContext context = browser.newContext();
            Page page = context.newPage();

            page.navigate("https://www.saucedemo.com/");

            page.fill("#user-name","standard_user");
            page.fill("#password","secret_sauce");
            page.click("#login-button");

            ScreenshotUtils.capture(page,"login-success");

            page.click("#add-to-cart-sauce-labs-backpack");

            ScreenshotUtils.capture(page,"product-added");

            page.click(".shopping_cart_link");

            ScreenshotUtils.capture(page,"cart");

            page.click("#checkout");

            page.fill("#first-name","QA");
            page.fill("#last-name","Automation");
            page.fill("#postal-code","12345");

            page.click("#continue");

            ScreenshotUtils.capture(page,"checkout-overview");

            page.click("#finish");

            ScreenshotUtils.capture(page,"order-complete");

            System.out.println("Purchase flow executed successfully");

            browser.close();
        }
    }
}
