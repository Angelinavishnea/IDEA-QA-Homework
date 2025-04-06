import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.time.Duration;
import java.util.List;

public class LocatorsPhonebook {
    WebDriver driver;

    @BeforeMethod
    public void setUp() {
        driver = new ChromeDriver();
        driver.navigate().to("https://telranedu.web.app/login");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
    }

    @Test
    public void openPhonebook() {
        driver.findElement(By.xpath("//h1[text() = 'PHONEBOOK']"));
        List<WebElement> elements = driver.findElements(By.xpath("//*[contains(text(), 'act')]"));
        System.out.println("Количество " + elements.size()); //должно быть 2!?

        /// Test-case possitive
        /// Verify the Registration button is active after entering arr reuiered fields

        boolean loginIcon = driver.findElement(By.xpath("//a[contains(text(),'LOGIN')]")).isDisplayed();
        System.out.println("1 " + loginIcon);

        WebElement login = driver.findElement(By.xpath("//a[contains(text(),'LOGIN')]"));
        login.click();

        boolean inputEmail = driver.findElement(By.xpath("//input[@placeholder = 'Email']")).isDisplayed();
        System.out.println("2 " + inputEmail);

        driver.findElement(By.xpath("//input[@placeholder = 'Email']")).sendKeys("adminadmin@gmail.com");

        boolean inputPassword = driver.findElement(By.xpath("//input[@placeholder = 'Password']")).isDisplayed();
        System.out.println("3 " + inputPassword);

        driver.findElement(By.xpath("//input[@placeholder = 'Password']")).sendKeys("Password1234567@1");

        boolean registrationButton = driver.findElement(By.xpath("//button[contains(text(),'Registration')]")).isDisplayed();
        System.out.println("4 " + registrationButton);

        driver.findElement(By.xpath("//button[contains(text(),'Registration')]")).click();

    }


    @AfterMethod(enabled = true)
    public void tearDown() {
        driver.quit();
    }


}
