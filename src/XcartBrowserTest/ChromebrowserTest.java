package XcartBrowserTest;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class ChromebrowserTest {

    public static void main(String[] args) {
        String baseurl = "https://www.x-cart.com/  ";
        System.setProperty("webdriver.chorme.driver","drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get(baseurl);
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(100, TimeUnit.SECONDS);

        String pagesource = driver.getPageSource();
        System.out.println(pagesource);

        String title = driver.getTitle();
        boolean verifytitle = title.equals("Xcart The Last Ecommerce Plateform");
        boolean verifytitlecontain = title.contains(("platform"));
        System.out.println(verifytitle);
        System.out.println(verifytitlecontain);
        driver.close();

    }
}
