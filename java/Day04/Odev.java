package Day04;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class Odev {
    public static void main(String[] args) throws InterruptedException {
        /*

         -C01_TekrarTesti isimli bir class olusturun
2- https://www.amazon.com/ adresine gidin
3- Browseri tam sayfa yapin
4-Sayfayi “refresh” yapin
5- Sayfa basliginin “Spend less” ifadesi icerdigini test edin
6- Gift Cards sekmesine basin
7- Birthday butonuna basin
8- Best Seller bolumunden ilk urunu tiklayin
9- Gift card details’den 25 $’i secin
10-Urun ucretinin 25$ oldugunu test edin
10-Sayfayi kapatin

     */
        System.setProperty("webdriver.chrome.driver","src/resources/drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));

        // a. Verilen web sayfasına gidin. http://a.testaddressbook.com/sign_in
        driver.get("http://a.testaddressbook.com/sign_in");

        // b. Locate email textbox
        WebElement email= driver.findElement(By.cssSelector("#session_email"));

        //  c. Locate password textbox ve
        WebElement pasword= driver.findElement(By.cssSelector("#session_password"));

        // d. Locate signin button
        WebElement singin=driver.findElement(By.cssSelector("input[name='commit']"));

        //  e. Asagidaki kullanıcı adını ve şifreyi girin ve sign in düğmesini tıklayın
        //             i. Username : testtechproed@gmail.com
        //             ii. Password : Test1234!

        email.sendKeys("testtechproed@gmail.com");
        pasword.sendKeys("Test1234!");
        singin.click();
        Thread.sleep(3000);
        driver.close();
    }
}
