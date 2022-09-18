package Day03;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;
import java.util.Arrays;
import java.util.List;

public class TekrarTesti_Yeniden {
    /*
      1. Bir class oluşturun : AmazonSearchTest
      2. Main method oluşturun ve aşağıdaki görevi tamamlayın.
      a. web sayfasına gidin. https://www.amazon.com/
      b. Search(ara) “city bike”
      c. Amazon'da görüntülenen ilgili sonuçların sayısını yazdırın
      e. Sonra karşınıza çıkan ilk sonucun resmine tıklayın
    */
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "src/resources/drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        //a. web sayfasına gidin. https://www.amazon.com/
        driver.get("https://www.amazon.com");
        //b. Search(ara) “city bike”
        WebElement aramaKutusu = driver.findElement(By.id("twotabsearchtextbox"));
        aramaKutusu.sendKeys("city bike", Keys.ENTER);

        //c. Amazon'da görüntülenen ilgili sonuçların sayısını yazdırın
        List<WebElement> aramaSonucu = driver.findElements(By.className("sg-col-inner"));
        String sonucYazisi = aramaSonucu.get(0).getText();
        System.out.println("Bulunan city bike :" + sonucYazisi + " adet'tir");
        //d. Sadece sonuç sayısını yazdırınız

        // Sonuc sayısını LAMBDA ile yazdırınız

        //e. Sonra karşınıza çıkan ilk sonucun resmine tıklayın
        List<WebElement> resimler = driver.findElements(By.className("s-image"));
        resimler.get(0).click();
        Thread.sleep(2000);
        driver.navigate().back();
        List<WebElement> resimler1 = driver.findElements(By.className("s-image"));
       resimler1.get(1).click();

    //Sayfayı kapatınız


    }
}
