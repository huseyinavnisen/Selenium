package Day01;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class C04_Ilk_Test {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "src/resources/drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        /*
        1- Amazona git
        2 - Başlığın "Amazon" Olduğunu kontrol et
        3 - url'nin "amazon" olduğunu kontrol et
        4 - sayfayı kapat
         */

        driver.get("https://amazon.com");  // 1

        String actualTitle = driver.getTitle();
        String istenenKelime = "Amazon";
        if (actualTitle.contains(istenenKelime)) {
            System.out.println("Title Testi PASSED");
        }


        String actualUrl = driver.getCurrentUrl();  // 3
        String arananKelime = "amazon";
        if (actualUrl.contains(arananKelime)) {
            System.out.println("Url Testi PASSED");
        }

        driver.close();// 4

    }


}
