package signup;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class Agreementpage{
    public WebDriver driver;
    public WebDriverWait wait;

    private By agree=By.cssSelector("#remember");
    private By continueButton = By.cssSelector("a[href*='register?step=setup'] button");



    public Agreementpage(WebDriver driver) {
        this.driver = driver;
        this.wait = new WebDriverWait(driver, Duration.ofSeconds(10));
    }
    public void ClickOnAgreement(){
        WebElement btn=wait.until(ExpectedConditions.elementToBeClickable(agree));
        btn.click();


    }

    public SignupOne clickOnSignup()
    {

        WebElement button=wait.until(ExpectedConditions.elementToBeClickable(continueButton));
        button.click();

        return new SignupOne(driver);
    }

}
