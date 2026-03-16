
package core.data;

import java.util.UUID;

public class FakeData {

 public static String randomEmail(){

  return "user_" + UUID.randomUUID() + "@test.com";
 }

}
