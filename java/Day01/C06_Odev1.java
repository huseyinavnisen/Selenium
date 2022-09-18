package Day01;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class C06_Odev1 {
    public static void main(String[] args) {


        System.setProperty("webdriver.chrome.driver", "src/resources/drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        // Amazon sayfasina gidelim. https://www.amazon.com/
        driver.get("https://www.amazon.com");

        // Sayfa basligini(title) yazdirin
        System.out.println("SAYFA BAŞLIĞI : " + driver.getTitle());

        // Sayfa basliginin “Amazon” icerdigini test edin
        String arananBaslik = "Amazon";
        String reelBaslik = driver.getTitle();

        if (reelBaslik.contains(arananBaslik)) {
            System.out.println(arananBaslik + "  Sayfa Başlığında VAR");
        } else System.out.println(arananBaslik + "  Sayfa Başlığında YOK");

        // Sayfa adresini(url) yazdirin
        System.out.println("SAYFANIN URL ADRESİ : " + driver.getCurrentUrl());


        //Sayfa url’inin “amazon” icerdigini test edin.
        String arananUrl = "amazon";
        String reelUrl = driver.getCurrentUrl();
        if (reelUrl.contains(arananUrl)) {
            System.out.println(arananUrl + "  Sayfa URL'sinde VAR");
        } else System.out.println(arananUrl + " Sayfa URL'sinde YOK");


        // Sayfa handle degerini yazdirin
        System.out.println("Sayfanın HANDLE Kodları : " +driver.getWindowHandle());


        // Sayfa HTML kodlarinda “Gateway” kelimesi gectigini test edin
        String sayfaKodlari = driver.getPageSource();
        String arananKelime = "Gateway";
        if (sayfaKodlari.contains(arananKelime)) {
            System.out.println(arananKelime + " Sayfa Kodlarında VAR");
        } else System.out.println(arananKelime + " Sayfa Kodlarında YOK");


        //Sayfayi kapatin.
        driver.close();

    }
}
