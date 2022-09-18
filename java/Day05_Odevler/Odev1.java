package Day05_Odevler;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;
import java.util.List;

public class Odev1 {

   /*
1-https://the-internet.herokuapp.com/add_remove_elements/ adresine gidin
2- Add Element butonuna 10 kez basinız
3- 10 kez Add element butonuna basıldığını test ediniz
4 - Delete butonuna görünmeyene kadar basınız
5- Delete butonunun görünmediğini test ediniz
6- Sayfayı kapatınız
 */


    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "src/resources/drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        //https://the-internet.herokuapp.com/add_remove_elements/ adresine gidin
        driver.get("https://the-internet.herokuapp.com/add_remove_elements/");
        // 2-  Add Element butonuna 10 kez basinız
        Thread.sleep(2000);

        for (int i = 0; i < 10; i++) {
            Thread.sleep(500);
            driver.findElement(By.xpath("//*[text()='Add Element']")).click();
        }

        // 3- 10 kez Add element butonuna basıldığını test ediniz
        List<WebElement> deleteButonList = driver.findElements(By.xpath("//*[text()='Delete']"));
        int gercekDeleteButonSayisi = 10;

    }
}
