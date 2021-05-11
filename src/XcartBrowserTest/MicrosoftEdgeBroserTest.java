package XcartBrowserTest;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

import java.util.concurrent.TimeUnit;

public class MicrosoftEdgeBroserTest {


    public static void main(String[] args) {

    String baseurl = "https://www.x-cart.com/";
    System.setProperty("webdriver.edge.driver","drivers/msedgedriver.exe");
        WebDriver driver = new EdgeDriver();
        driver.get(baseurl);
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(100, TimeUnit.SECONDS);

        String pagesource = driver.getPageSource();
        System.out.println(pagesource);

        String title = driver.getTitle();
        System.out.println(title);
        boolean verifytitle = title.equals("X-Cart | The Last Ecommerce Platform You Will Ever Need");
        boolean verifytitlecontains = title.contains("Xcart");
        System.out.println(verifytitle);
        System.out.println(verifytitlecontains);
        driver.close();

    }

}
