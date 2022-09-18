package Day02;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class C04_Manage_Methodlari_Wait {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","src/resources/drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.amazon.com");
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));

        /*
        İleride wait konusunu daha geniş göreceğiz.
        bir sayfa açılırken ilk başta sayfanın içerisinde bulunan
        elementlere göre bir yükleme süresine ihtiyaç vardır veya bir web elementin kullanılabilmesi
        için zamana ihtiaç olabilir.
        implicitlyWait() bize sayfanın yüklenmesi ve sayfadaki eşementlere ulaşım için
        beklenecek maximum süreyi belirleme olanağı verir.
         */
    }
}
