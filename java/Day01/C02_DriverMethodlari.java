package Day01;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class C02_DriverMethodlari {
    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver", "src/resources/drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        // Amazon sayfasına gidiniz
        driver.get("https://amazon.com");
        //Kaynak kodların içinde "Gateway" kelisinin oldugunu test ediniz
        // System.out.println(driver.getPageSource());
        String istenenKelime = "Gatewat";
        if (driver.getPageSource().contains(istenenKelime)) {
            System.out.println("PageSourse testi PASSED");
        } else System.out.println("PageSourse testi FAILED");
        driver.close();
        // driver.quit(); // birden fazla sayfa warsa hepsini kapatır.
    }
}
