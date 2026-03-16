
package ui.tests;

import com.microsoft.playwright.*;
import core.utils.ScreenshotUtils;
import org.junit.jupiter.api.*;

public class PurchaseFlowTest {

 static Playwright playwright;
 static Browser browser;
 static Page page;

 @BeforeAll
 static void setup(){

  playwright = Playwright.create();
  browser = playwright.chromium().launch(
   new BrowserType.LaunchOptions().setHeadless(true));

  page = browser.newPage();

 }

 @Test
 void purchaseFlow(){

  page.navigate("https://www.saucedemo.com");

  page.fill("#user-name","standard_user");
  page.fill("#password","secret_sauce");
  page.click("#login-button");

  ScreenshotUtils.take(page,"01_login");

  page.click("text=Add to cart");
  ScreenshotUtils.take(page,"02_add_product");

  page.click(".shopping_cart_link");
  ScreenshotUtils.take(page,"03_cart");

  page.click("#checkout");
  ScreenshotUtils.take(page,"04_checkout");

  page.fill("#first-name","QA");
  page.fill("#last-name","Automation");
  page.fill("#postal-code","00000");
  page.click("#continue");

  ScreenshotUtils.take(page,"05_checkout_data");

  page.click("#finish");

  ScreenshotUtils.take(page,"06_payment");

 }

 @AfterAll
 static void teardown(){

  browser.close();
  playwright.close();

 }

}
