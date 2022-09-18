package Day03;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;
import java.util.List;

public class Xpath_Yeniden {
    /*
    https://the-internet.herokuapp.com/add_remove_elements/ adresine gidin
    2- Add Element butonuna basin
    Delete butonu’nun gorunur oldugunu test edin
    Delete tusuna basin
    “Add/Remove Elements” yazisinin gorunur oldugunu test edin

     */
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "src/resources/drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        //https://the-internet.herokuapp.com/add_remove_elements/ adresine gidin
        driver.get("https://the-internet.herokuapp.com/add_remove_elements/");
        // 2- Add Element butonuna basin
        WebElement AddElementButonu = driver.findElement(By.xpath("//*[text()='Add Element']"));
        AddElementButonu.click();
        // 1. yol :  Buton ile
        // driver.findElement(By.xpath("//*[@onclick='addElement()']")).click();
        // 2. Yol : Buton Texti ile


        // Delete butonu’nun gorunur oldugunu test edin
        WebElement deleteButonu = driver.findElement(By.xpath("//*[@class='added-manually']"));
        if (deleteButonu.isDisplayed()) {
            System.out.println("DELETE butonu görüldü; TEST PASSED");
        } else System.out.println("DELETE butonu görülmedi; TEST FAILED");
        // Delete tusuna basin
        deleteButonu.click();
        // “Add/Remove Elements” yazisinin gorunur oldugunu test edin
        WebElement AddRemoveElements =driver.findElement(By.xpath("//h3"));

        if(AddRemoveElements.isDisplayed()){
            System.out.println("Add/Remove Elements yazısı görüldüğü ; TEST PASSED");
        } else  System.out.println("Add/Remove Elements yazısı görülmedi ; TEST FAILED");



        // sayfayı kapat

    }
}
