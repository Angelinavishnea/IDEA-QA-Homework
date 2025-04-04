import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.time.Duration;
import java.util.List;

public class LocatorsTicketservice {
    WebDriver driver;


    @BeforeMethod
    public void setUp(){
        driver = new ChromeDriver();
        driver.navigate().to("https://ticket-service-69443.firebaseapp.com/");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
    }
    @Test
    public void openTicketservice(){

        System.out.println("Test1");
        driver.findElement(By.xpath("//*[text()='Calendar']")); //?????
        System.out.println("Calendar exists.");

        System.out.println("Test2");
        driver.findElement(By.cssSelector(".menu-line")); //class
        System.out.println("Burger Menu exists.");

        System.out.println("Test3");
        WebElement h2 = driver.findElement(By.tagName("h2"));
        System.out.println("header = " + h2);

        System.out.println("Test4");
        driver.findElement(By.cssSelector("img"));
        System.out.println("Image found.");

        System.out.println("Test5");
        List<WebElement> images = driver.findElements(By.cssSelector("img"));
        System.out.println(images.size() + " images were found.");

        System.out.println("Test6");
        List<WebElement> events = driver.findElements(By.tagName("Events"));
        System.out.println(" all ' events' words were found.");

        System.out.println("Test7 : all links");
        List<WebElement> links = driver.findElements(By.tagName("a"));
        for (WebElement element : links) {
            System.out.println(element.getAttribute("href"));
            System.out.println(element.getText());
        }

        System.out.println("Test8");
        List<WebElement> events_links = driver.findElements(By.linkText("EVENTS"));
        for (WebElement element : events_links) {
            System.out.println(element);
            System.out.println("next");
        }

        System.out.println("Test9");
        List<WebElement> number_one = driver.findElements(By.xpath("//*[text()='1']"));;
        for (WebElement element : number_one) {
            System.out.println(element);
        }

        System.out.println("Test10");
        List<WebElement> icons = driver.findElements(By.tagName("i"));
        System.out.println("icons exist.");

    }

    @AfterMethod(enabled = true)
    public void tearDown(){
        driver.quit();
    }

}

