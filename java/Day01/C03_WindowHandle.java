package Day01;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class C03_WindowHandle {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","src/resources/drivers/chromedriver.exe");
        WebDriver driver =new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("http://amazon.com");
        System.out.println(driver.getWindowHandle()); // CDwindow-CB6FB1D81E75F3ED33B98BF806B6BE88
        // her çalıştığında yeni bir pencerede yeni bir code üretir.
        // bu hash code ( CDwindow-CB6FB1D81E75F3ED33B98BF806B6BE88 )ile
        // pencerler arasında gezineceiz.
    }
}
