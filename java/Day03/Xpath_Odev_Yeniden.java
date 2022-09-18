package Day03;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class Xpath_Odev_Yeniden {
    /*
        /*
    1-https://the-internet.herokuapp.com/add_remove_elements/ adresine gidin
    2- Add Element butonuna 10 kez basinız
    3- 10 kez Add element butonuna basıldığını test ediniz
    4 - Delete butonuna görünmeyene kadar basınız
    5- Delete butonunun görünmediğini test ediniz
    6- Sayfayı kapatınız
     */


    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver","src/resources/drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        //https://the-internet.herokuapp.com/add_remove_elements/ adresine gidin
        driver.get("https://the-internet.herokuapp.com/add_remove_elements/");
        // 2- Add Element butonuna basin

        // 1. yol :  Buton ile
        // driver.findElement(By.xpath("//*[@onclick='addElement()']")).click();
        // 2. Yol : Buton Texti ile
         driver.findElement(By.xpath("//*[text()='Add Element']")).click();

        // Delete butonu’nun gorunur oldugunu test edin
        WebElement deleteButonu = driver.findElement(By.xpath("//*[@class='added-manually']"));
        if(deleteButonu.isDisplayed()){
            System.out.println("DELETE Butonu Göründü : TEST PASSED");
        } else System.out.println("DELETE butonu Görünmedi : Test FAILED");
        // Delete tusuna basin
        Thread.sleep(3000);
        deleteButonu.click();
        // “Add/Remove Elements” yazisinin gorunur oldugunu test edin
        WebElement addRemoveElementsYazisi= driver.findElement(By.xpath("//h3"));
        if(addRemoveElementsYazisi.isDisplayed()){
            System.out.println("Add/Remove Elements Yazısı VAR : TEST PASSED");
        } else System.out.println("Add/Remove Elements Yazısı YOK : Test FAILED");

        // sayfayı kapat
        driver.close();
    }
}
