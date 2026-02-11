package signup;

import org. openqa. selenium.*;
import org. openqa. selenium. support. ui. ExpectedConditions;
import org. openqa. selenium. support. ui. WebDriverWait;

import java. time. Duration;

public class SignupTwo {
    public WebDriver driver;
    public WebDriverWait wait;

    private By agencyname=By. id("«r7u»-form-item");
    private By roleagency=By. id("«r7v»-form-item");
    private By emailadd=By. id("«r80»-form-item");
    private By web=By. id("«r81»-form-item");
    private By address=By. id("«r82»-form-item");
    private By operation=By. cssSelector("button[aria-haspopup='dialog'][role='combobox']");
    private By nextone=By. xpath("//button[ text()='Next']");



    public SignupTwo(WebDriver driver) {
        this. driver=driver;
        this. wait = new WebDriverWait(driver, Duration. ofSeconds(30));
    }
    private WebElement waittosee(By locator) {
        return wait. until(ExpectedConditions. visibilityOfElementLocated(locator));
    }

    private void type(By locator, String text) {
        WebElement input = waittosee(locator);
        input. sendKeys(Keys. CONTROL + "a", Keys. BACK_SPACE);
        input. sendKeys(text);
    }

    private void click(By locator) {
        WebElement element = waittosee(locator);
        try {
            element. click();
        } catch (Exception e) {
            ((JavascriptExecutor) driver). executeScript("arguments[0]. click();", element);
        }
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
    public void operate() {
        click(operation);
        driver. findElement(By. xpath("//span[text()='Canada']")). click();
    }


    public void fillform(String nameo,String role,String mail,String site,String ress){
        nameofagency(nameo);
        roleofagency(role);
        emailaddress(mail);
        website(site);
        add(ress);
        operate();
    }

    public SignupThree clicknextone() {

        WebElement button = wait. until(ExpectedConditions. elementToBeClickable(nextone));
        button. click();
        return new SignupThree(driver);
    }}