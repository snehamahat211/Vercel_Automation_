package signup;

import org.openqa.selenium.*;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class SignupFour {
    private WebDriver driver;
    private WebDriverWait wait;

    private By registration =By.id("«r1pt»-form-item");
    private By dropdown=By.id("«r1pu»-form-item");
    private By pref=By.id("«r1q1»-form-item");
    private By uploadone=By.xpath("//div[./div/span[contains(text(), 'Upload a file')]][1]");
    private By uploadtwo=By.xpath("//div[./div/span[contains(text(), 'Upload a file')]][2]");

    public SignupFour(WebDriver driver){
        this.driver=driver;
        this.wait=new  WebDriverWait(driver, Duration.ofSeconds(10));
    }
    private WebElement waituntilvisible(By locator) {
        return wait.until(ExpectedConditions.visibilityOfElementLocated(locator));
    }


    private void click(By locator) {
        WebElement element = waituntilvisible(locator);
        try {
            element.click();
        } catch (Exception e) {
            ((JavascriptExecutor) driver).executeScript("arguments[0].click();", element);
        }
    }

    public void Regnum(){
        WebElement button =wait.until(ExpectedConditions.elementToBeClickable(registration));
        button.sendKeys("12345");
    }





}
