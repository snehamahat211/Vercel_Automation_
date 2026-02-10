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
    private By lastname=By.id("«r1»-form-item");
    private By email=By.id("«r2»-form-item");
    private By phone=By.id("«r4»-form-item");

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

    public void entername(String nameo) {
        type(name, nameo);
    }

    public void enterlastname(String ln) {
        type(lastname, ln);
    }

    public void enteremail(String mail) {
        type(email, mail);
    }



    public void fillinfo(String nameo,String ln,String mail) {
        entername(nameo);
        enterlastname(ln);
        enteremail(mail);
    }



//    public void name(String nameone){
//        wait.until(ExpectedConditions.elementToBeClickable(name)).sendKeys(nameone);
//    }




}
