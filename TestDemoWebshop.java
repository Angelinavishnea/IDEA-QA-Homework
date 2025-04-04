import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TestDemoWebshop {
    WebDriver driver;

    @BeforeMethod(enabled = true)
    public void setUp(){
        driver = new ChromeDriver();
        driver.get(" https://demowebshop.tricentis.com/ ");
        System.out.println("Step 1");
    }

    @Test(enabled = true)
    public void openWebshop(){
        System.out.println("Step 2");
    }

    @AfterMethod(enabled = true)
    public void tearDown(){
        driver.quit();
        System.out.println("Step 3");
    }

}


