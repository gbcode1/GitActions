package demo.hwsw;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class TC1_OpenPage extends BaseTest {
    @Test
    public void test() {
        driver.get("https://hwsw.hu");
    }
}
