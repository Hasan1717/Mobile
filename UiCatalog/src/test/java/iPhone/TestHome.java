package iPhone;

import org.testng.annotations.Test;
import pages.Home;
import reporting.TestLogger;

public class TestHome extends Home {
    @Test
    public void test1(){
        TestLogger.log("app is launched ...");
        clickBtns();
        System.out.println("btns clicked ...");
    }
}
