package signup;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class SignupTwo {
    public WebDriver driver;
    public WebDriverWait wait;

    private By agencyname=By.id("«r7u»-form-item");
    private By roleagency=By.id("«r7v»-form-item");
    private By emailadd=By.id("«r80»-form-item");
    private By web=By.id("«r81»-form-item");
    private By address=By.id("«r82»-form-item");
    private By operation=By.id("«r82»-form-item");
    private By nextone=By.cssSelector("button[type='submit'and text()='Next']");



    public SignupTwo(WebDriver driver) {
        this.driver=driver;
        this.wait = new WebDriverWait(driver, Duration.ofSeconds(10));
    }
    private WebElement waittosee(By locator) {
        return wait.until(ExpectedConditions.visibilityOfElementLocated(locator));
    }

    private void type(By locator, String text) {
        WebElement input = waittosee(locator);
        input.sendKeys(Keys.CONTROL + "a", Keys.BACK_SPACE);
        input.sendKeys(text);
    }
    public void nameofagency(String nameo) {
        type(agencyname, nameo);
    }
    public void roleofagency(String role) {
        type(roleagency, role);
    }
    public void emailaddress(String mail) {
        type(emailadd, mail);
    }
    public void website(String site) {
        type(web, site);
    }
    public void add(String ress) {type(address,ress);}
    public void operate(String op) {
        type(operation, op);
    }

}
