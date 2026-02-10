package signup;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import java.time.Duration;


public class Homepage {
    public WebDriver driver;
    private WebDriverWait wait;
    private By Loginlink = By.xpath("//button[contains(text(),'Get Started')]");

    public Homepage(WebDriver driver) {
        this.driver = driver;
        this.wait = new WebDriverWait(driver, Duration.ofSeconds(10));
    }

    public Agreementpage clickstarted()
    {
       WebElement loginElement=wait.until(ExpectedConditions.elementToBeClickable(Loginlink));
       loginElement.click();
       return new Agreementpage(driver);
     }


}
