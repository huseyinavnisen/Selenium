package Day03;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class GetMethodlari_Yeniden {
    /*
    -Amazon sayfasına gidiniz
    -Arama kutusunu locate ediniz
    -Arama kutusunun tagName'inin input olduğunu test ediniz
    -Arama kutusunun name atributu'nun değerinin field-keywords olduğunu test ediniz
    -Sayfayı kapatınız
     */
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "src/resources/drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        //-Amazon sayfasına gidiniz
        driver.get("http://www.amazon.com");
        //-Arama kutusunu locate ediniz
        WebElement aramaKutusu = driver.findElement(By.id("twotabsearchtextbox"));
        //-Arama kutusunun tagName'inin input olduğunu test ediniz
        String arananTagName = "input";
        String webElementTagname = aramaKutusu.getTagName();
        if (webElementTagname.contains(arananTagName)) {
            System.out.println("Arama Kutusunun TagName'i : " + webElementTagname + " olduğu için TEST PASSED");
        } else System.out.println("Arama Kutusunun TagName'i : " + webElementTagname + " olmadığı için TEST FAILED");

        //-Arama kutusunun name atribute'nun değerinin field-keywords olduğunu test ediniz
        String arananNameAtribute = "field-keywords";
        String webElementNameAtribute = aramaKutusu.getAttribute("name");
        System.out.println("webElementNameAtribute = " + webElementNameAtribute);
        String webElementClassAtribute = aramaKutusu.getAttribute("class");
        System.out.println("webElementClassAtribute = " + webElementClassAtribute);


        // Arama kutusunun konumunu yazdırınız
        System.out.println("aramaKutusu.getLocation() = " + aramaKutusu.getLocation());


        //-Sayfayı kapatınız


    }

}
