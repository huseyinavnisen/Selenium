package Day03;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;
import java.util.List;

public class SinifCalismasi_Yeniden {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "src/resources/drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
        /*
        Main method oluşturun ve aşağıdaki görevi tamamlayın.
        a. http://a.testaddressbook.com adresine gidiniz.
        b. Sign in butonuna basin
        c. email textbox,password textbox, and signin button elementlerini locate ediniz..
        d. Kullanıcı adını ve şifreyi aşağıya girin ve oturum aç (sign in)buttonunu tıklayın:
        i. Username : testtechproed@gmail.com
        ii. Password : Test1234!
        e. Expected user id nin testtechproed@gmail.com oldugunu dogrulayin(verify).
        f. “Addresses” ve “Sign Out” textlerinin görüntülendiğini( displayed) doğrulayin(verify).
        3. Sayfada kac tane link oldugunu bulun.
         */
        //a. http://a.testaddressbook.com adresine gidiniz.
        driver.get("http://a.testaddressbook.com");
        //b. Sign in butonuna basin
        WebElement signin = driver.findElement(By.id("sign-in"));
        signin.click();
        //c. email textbox,password textbox, and signin button elementlerini locate ediniz..
        WebElement eMail = driver.findElement(By.id("session_email"));
        //eMail.sendKeys("deneme mail");
        // Thread.sleep(2000);
        // eMail.clear();

        WebElement pasword = driver.findElement(By.id("session_password"));
        // pasword.sendKeys("deneme pasword");
        //Thread.sleep(2000);
        //pasword.clear();

        WebElement signinButonu = driver.findElement(By.name("commit"));


        //d. Kullanıcı adını ve şifreyi aşağıya girin ve oturum aç (sign in)buttonunu tıklayın:
        //i. Username : testtechproed@gmail.com
        //ii. Password : Test1234!
        eMail.sendKeys("testtechproed@gmail.com");
        pasword.sendKeys("Test1234!");
        signinButonu.click();

        //e. Expected user id nin testtechproed@gmail.com oldugunu dogrulayin(verify).
        WebElement arananEmail = driver.findElement(By.className("navbar-text"));
        String arananEmailYazisi = arananEmail.getText();
        String aratilanEmailYazisi = "testtechproed@gmail.com";
        if (aratilanEmailYazisi.contains(arananEmailYazisi)) {
            System.out.println("Bulunan e-mail ;  " + aratilanEmailYazisi + "  olduğu için TEST PASSED");
        } else System.out.println("Bulunan e-mail ;  " + aratilanEmailYazisi + "  olmadığı için TEST FAILED");


        /*
         Bir Webelementin üzerindeki yaziyi konsolda yazdırabilmek için getText() methodu kullanılır
         */
        //f. “Addresses” ve “Sign Out” textlerinin görüntülendiğini( displayed) doğrulayin(verify).

        WebElement AddresssesYazisi = driver.findElement(By.linkText("Addresses"));
        WebElement signOutYazisi = driver.findElement(By.linkText("Sign out"));

        if (AddresssesYazisi.isDisplayed()) {
            System.out.println(AddresssesYazisi.getText() + " Yazısı Ekranda Gözüktüğü için; TEST PASSED");
        } else System.out.println(AddresssesYazisi.getText() + " Yazısı Ekranda Gözükmediği için; TEST FAILED");

        if (signOutYazisi.isDisplayed()) {
            System.out.println(signOutYazisi.getText() + " Yazısı Ekrenda Gözüktüğü için; TEST PASSED");
        } else System.out.println(signOutYazisi.getText() + " Yazısı Ekrenda Gözükmediği için; TEST FAILED ");

        //3. Sayfada kac tane link oldugunu bulun.
        List<WebElement> linkler = driver.findElements(By.tagName("a"));
        System.out.println(linkler.size());

        //4. Linkleri yazdırınız
        // for (int i = 0; i <linkler.size() ; i++) {
        //     System.out.println(linkler.get(i).getText());
        // }


       // for (WebElement each : linkler) {
      //      System.out.println("Link :" + each.getText());
     //   }


        //5. Linkleri LAMBDA ile yazdırınız
        linkler.forEach(t -> System.out.println("Linkler : " + t.getText()));
        //6. Sayfayı kapatınız
        driver.close();

    }
}
