package XcartBrowserTest;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

import java.util.concurrent.TimeUnit;

public class InternetExplorerBrowserTest {

    public static void main(String[] args) {

        String baseurl = "https://www.x-cart.com/  ";
        System.setProperty("webdriver.ie.driver","drivers/IEDriverServer.exe");
        WebDriver driver = new InternetExplorerDriver();
        driver.get(baseurl);
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(100, TimeUnit.SECONDS) ;


        String pagesource = driver.getPageSource();
        System.out.println(pagesource);

        String title = driver.getTitle();
        boolean verifytitle = title.equals("Xcard The Last Ecommerce");
        boolean verifytitlecontains = title.contains("Ecommerce");
        System.out.println(verifytitle);
        System.out.println(title);
        driver.close();
    }
}
