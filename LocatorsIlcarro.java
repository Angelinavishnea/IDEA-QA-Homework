import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.time.Duration;

public class LocatorsIlcarro {
    WebDriver driver;

    @BeforeMethod
    public void setUp() {
        driver = new ChromeDriver();
        driver.get("https://ilcarro.web.app/let-car-work");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
    }

    @Test
    public void testEnterAddress() {
        driver.findElement(By.xpath("//input[@placeholder = 'Enter your address']"));
        driver.findElement(By.xpath("//input[contains(@placeholder,'Enter you')]"));
        driver.findElement(By.xpath("//input[starts-with(@placeholder,'Ent')]"));

        driver.findElement(By.xpath("//input[@id='pickUpPlace']"));
        driver.findElement(By.xpath("//input[contains(@id,'pickUp')]"));
        driver.findElement(By.xpath("//input[contains(@class, 'pac-target-input')]"));

        driver.findElement(By.cssSelector("#pickUpPlace"));
        driver.findElement(By.cssSelector("input#pickUpPlace"));
        driver.findElement(By.id("pickUpPlace"));
    }

    @Test
    public void testHeader() {
        driver.findElement(By.xpath("//h1[@class ='title']"));
        driver.findElement(By.xpath("//h1[contains(@class,'title')]"));

        driver.findElement(By.xpath("//h1[text() = ' Let the car work ']"));
        driver.findElement(By.xpath("//h1[contains(text(), ' Let the car work ')]"));

        driver.findElement(By.xpath("//div/h1"));

        driver.findElement(By.cssSelector("h1.title"));
        driver.findElement(By.className("title"));

        WebElement text1 = driver.findElement(By.xpath("//h1[text() = ' Let the car work ']"));
        Assert.assertEquals(text1.getText(),"Let the car work");
    }

    @AfterMethod
    public void tearDown() {
        driver.quit();
    }
}


