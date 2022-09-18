package Day02;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class C03_ManageMethodlari_Ornek {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "src/resources/drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();


        // Amazon sayfasina gidelim. https://www.amazon.com/
        driver.get("https://www.amazon.com");

        //  Sayfanin konumunu ve boyutlarini yazdirin
        System.out.println("Sayfanın  Konumu : " + driver.manage().window().getPosition());
        System.out.println("Sayfanın Ölçüleri :" + driver.manage().window().getSize());

        // Sayfanin konumunu ve boyutunu istediginiz sekilde ayarlayin
        driver.manage().window().setPosition(new Point(250, 200));
        Thread.sleep(3000);
        driver.manage().window().setSize(new Dimension(800,600));
        Thread.sleep(3000);

        // Sayfanin sizin istediginiz konum ve boyuta geldigini test edin
        System.out.println("Sayfanın Yeni  Konumu : " + driver.manage().window().getPosition());
        System.out.println("Sayfanın Yeni Ölçüleri :" + driver.manage().window().getSize());

        //  Sayfayi kapatin
        Thread.sleep(2000);
        driver.close();


    }
}
