
package core.utils;

import java.io.File;
import java.nio.file.Files;
import java.nio.file.Path;

public class ScreenshotUtils {

    public static void saveScreenshot(byte[] data, String name) {
        try {
            Path path = Path.of("screenshots", name + ".png");
            Files.createDirectories(path.getParent());
            Files.write(path, data);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
