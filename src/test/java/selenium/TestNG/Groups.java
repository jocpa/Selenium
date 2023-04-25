package selenium.TestNG;

import org.testng.annotations.Test;

public class Groups {
    @Test (groups = { "smoke", "regression" })
    public void method1() {
        System.out.println("method1");
    }

    @Test (groups = { "smoke" })
    public void method2() {
        System.out.println("method2");
    }
}
