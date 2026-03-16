
package core.utils;

import com.microsoft.playwright.Page;
import java.nio.file.Paths;

public class ScreenshotUtils {

 public static void take(Page page,String name){

  page.screenshot(new Page.ScreenshotOptions()
   .setPath(Paths.get("screenshots/" + name + ".png")));

 }
}
