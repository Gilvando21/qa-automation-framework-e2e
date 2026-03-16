package core.utils;

import com.microsoft.playwright.Page;
import java.nio.file.Paths;

public class ScreenshotUtils {

    // NOVO MÉTODO
    public static void capture(Page page, String name){
        page.screenshot(
            new Page.ScreenshotOptions()
                .setPath(Paths.get("screenshots/" + name + ".png"))
        );

        System.out.println("Screenshot saved: " + name);
    }

    // COMPATIBILIDADE COM TESTES ANTIGOS
    public static void take(Page page, String name){
        capture(page, name);
    }
}