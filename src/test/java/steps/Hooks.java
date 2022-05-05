//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//

package steps;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import utils.CommonMethods;

public class Hooks extends CommonMethods {
    public Hooks() {
    }

    @Before
    public void start() {
        this.openBrowserAndLauchApplication();
    }

    @After
    public void end() {
        tearDown();
    }
}
