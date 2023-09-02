import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class forPractise {
    @Test
    public void aSimpleTest() {
        WebDriverManager.chromedriver().setup();
//        System.setProperty("webdriver.chrome.driver", "\"C:\\\\ chromedriver.exe\"");
        WebDriver driver = new ChromeDriver();
        driver.get("https://ya.ru/");
        driver.quit();
    }

}
