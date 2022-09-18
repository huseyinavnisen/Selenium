package Day05_Odevler;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class Odev2 {


/*
 1- https://www.amazon.com/ adresine gidin
 2- Browseri tam sayfa yapin
 3- Sayfayi "refresh" yapin
 4- Sayfa basliginin "Spend less" ifadesi icerdigini test edin
 5- Gift Cards sekmesine basin
 6- Birthday butonuna basin
 7- Best Seller bolumunden ilk urunu tiklayin
 8- Gift card details'den 25 $'i secin
 9-Urun ucretinin 25$ oldugunu test edin
 10-Sayfayi kapatin
 */



    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "src/resources/drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));



    }
}
