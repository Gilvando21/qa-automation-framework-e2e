
package ui;

import com.microsoft.playwright.*;
import org.junit.jupiter.api.Test;
import core.utils.ScreenshotUtils;

public class MultiBrowserTest {

    @Test
    void runInAllBrowsers(){

        try (Playwright playwright = Playwright.create()) {

            run(playwright.chromium());
            run(playwright.firefox());
            run(playwright.webkit());

        }
    }

    private void run(BrowserType browserType){

        Browser browser = browserType.launch(
            new BrowserType.LaunchOptions().setHeadless(false)
        );

        Page page = browser.newPage();

        page.navigate("https://www.saucedemo.com");
        ScreenshotUtils.capture(page, "multi-browser-" + browserType.name());

        browser.close();
    }
}
