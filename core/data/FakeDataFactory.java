
package core.data;

import java.util.UUID;

public class FakeDataFactory {

    public static String randomEmail() {
        return "user_" + UUID.randomUUID() + "@test.com";
    }

    public static String randomName() {
        return "User_" + UUID.randomUUID().toString().substring(0,8);
    }
}
