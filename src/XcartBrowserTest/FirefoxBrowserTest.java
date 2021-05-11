package XcartBrowserTest;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.json.JsonInput;

import java.util.concurrent.TimeUnit;

public class FirefoxBrowserTest {

    public static void main(String[] args) {

        String baseurl = "https://www.x-cart.com/  ";
        System.setProperty("webdriver.gecko.driver","drivers/geckodriver.exe");
        WebDriver driver = new FirefoxDriver();

        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(100, TimeUnit.SECONDS);
        driver.get(baseurl);

      //  String pagesource = driver.getPageSource();
        //System.out.println(pagesource);

        String title = driver.getTitle();
        System.out.println(title);
        boolean verifytitle = title.equals("Xcart The last Ecommerce");
        boolean verifytitlecontain = title.contains("the");
        System.out.println(verifytitle);
        System.out.println(verifytitlecontain);
        driver.close();
    }
}
