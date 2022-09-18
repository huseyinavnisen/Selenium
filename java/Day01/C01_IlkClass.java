package Day01;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class C01_IlkClass {
    public static void main(String[] args) {
        /*
        bir otomasyon yapmak için webdriver yeri gösterilir
        bunun için  System.setProperty() methodu kullanılır.
        method içine ilk önce drive yazarız, ikinci olarak fiziki yolu kopyalarız.
         */
        System.setProperty("webdriver.chrome.driver","src/resources/drivers/chromedriver.exe");
        WebDriver driver=new ChromeDriver();


    }
}
