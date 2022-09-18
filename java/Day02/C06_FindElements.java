package Day02;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;
import java.util.List;

public class C06_FindElements {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","src/resources/drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));

        // amazon sayfasına gidin
        driver.get("https://www.amazon.com");

        // amazondaki tag'lardan link (a) olanların sayisini yazdırın
        List<WebElement> tag= driver.findElements(By.tagName("a"));
        System.out.println("a taglarının Sayısı : " +tag.size());


        // amazondaki tag'lardan input taglarının  sayisiniı yazdırın
        List<WebElement> tag1= driver.findElements(By.tagName("input"));
        System.out.println("input taglarının Sayısı : " +tag1.size());



    }
}
