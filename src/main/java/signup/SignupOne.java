package signup;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class SignupOne {
    private By name=By.id("«r0»-form-item");
    public WebDriver driver;
    public WebDriverWait wait;
    public SignupOne(WebDriver driver){
        this.driver=driver;
        this.wait = new WebDriverWait(driver, Duration.ofSeconds(10));
    }

    private WebElement waitForVisible(By locator) {
        return wait.until(ExpectedConditions.visibilityOfElementLocated(locator));
    }

    private void type(By locator, String text) {
        WebElement input = waitForVisible(locator);
        input.sendKeys(Keys.CONTROL + "a", Keys.BACK_SPACE);
        input.sendKeys(text);
    }

    public void entername(String user) {
        type(name, user);
    }



    public void fillinfo(String user) {
        entername(user);
    }


//    public void name(String nameone){
//        wait.until(ExpectedConditions.elementToBeClickable(name)).sendKeys(nameone);
//    }




}
