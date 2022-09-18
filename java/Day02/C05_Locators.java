package Day02;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class C05_Locators {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver","src/resources/drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
        driver.get("https://www.amazon.com");

        // amazonda Nutella Arat
        WebElement aramaKutusu = driver.findElement(By.id("twotabsearchtextbox"));
        aramaKutusu.sendKeys("Nutella" + Keys.ENTER);
        driver.manage().window().minimize();
        Thread.sleep(2000);

        driver.manage().window().maximize();
        Thread.sleep(2000);
        WebElement aramayeri = driver.findElement(By.id("twotabsearchtextbox"));
        aramayeri.clear();
        aramayeri.sendKeys("laptop"+Keys.ENTER);

        // Become an Affiliate linkine tıkla
        // driver.findElement(By.linkText("Become an Affiliate")).click();

        // driver.findElement(By.partialLinkText("an Affiliate")).click();// linkin bir kısmı

    }
}
