package signup;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class Loginpage {
    public WebDriver driver;
    private WebDriverWait wait;
    private By Buttonsignin=By.cssSelector("a[href='/register']");
    public Loginpage(WebDriver driver)
    {
        this.driver=driver;
        this.wait = new WebDriverWait(driver, Duration.ofSeconds(10));

    }
    public void clicksignin()
    {
        WebElement signinElement=wait.until(ExpectedConditions.elementToBeClickable(Buttonsignin));
        signinElement.click();
    }


}
