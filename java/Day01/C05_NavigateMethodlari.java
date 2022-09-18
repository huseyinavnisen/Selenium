package Day01;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class C05_NavigateMethodlari {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver","src/resources/drivers/chromedriver.exe");
        WebDriver driver =new ChromeDriver();
        driver.manage().window().maximize();
         driver.navigate().to("https://amazon.com");
         // driver.navigate().to() methodu sayfada ileri - geri yapacaksak kullanılır.

        // driver.get() metodu gibi bizi istediğimiz url'ye götürür.
        driver.navigate().to("https://techproeducation.com");

        // soru: tekrar amazona dönelim.
        Thread.sleep(3000);
        driver.navigate().back();

        // Tekrar TechPro ya gidelim
        Thread.sleep(3000);
        driver.navigate().forward();

        // Techpro sayfasını yenileyelim
        Thread.sleep(3000);
        driver.navigate().refresh();

        // sayfayı kapa
        driver.close();
    }
}
