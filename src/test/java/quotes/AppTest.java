/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package quotes;

import org.junit.Test;
import static org.junit.Assert.*;

public class AppTest {
    @Test public void testAppHasAGreeting() {


       String actual =  App.getJson();
String expected = "George Orwell  “If liberty means anything at all it means the right to tell people what they do not want to hear.”  28 likes";
       assertEquals("app should have a greeting", expected, actual );
    }
}
