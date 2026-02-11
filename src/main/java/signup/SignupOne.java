package signup;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.UUID;

public class SignupOne {

    private String generatedEmail;

    private By name=By.id("«r0»-form-item");
    private By lastname=By.id("«r1»-form-item");
    private By email=By.id("«r2»-form-item");
    private By phonenm=By.id("«r4»-form-item");
    private By password=By.cssSelector("input[name='password']");
    private By confirmp=By.cssSelector("input[name='confirmPassword']");
    private By next=By.xpath("//button[text()='Next']");

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
    private String generateRandomEmail(){
        return "user"+ UUID.randomUUID().toString().substring(0,8)+"@bftp0kad.mailosaur.net";
    }

    public void entername(String nameo) {
        type(name, nameo);
    }

    public void enterlastname(String ln) {
        type(lastname, ln);
    }

    public void enteremail() {

        generatedEmail=generateRandomEmail();
        type(email,generatedEmail);
    }

    public void enterphone(String mail) {
        type(phonenm, mail);
    }

    public void enterpassword(String pass) {
        type(password, pass);
    }
    public void confirmpassword(String cpass) {
        type(confirmp, cpass);
    }



    public void fillinfo(String nameo,String ln,String phone,String pass,String cpass) {
        entername(nameo);
        enterlastname(ln);
        enteremail();
        enterphone(phone);
        enterpassword(pass);
        confirmpassword(cpass);
    }
    public String getGeneratedEmail() {
        return generatedEmail;
    }

    public OTP clicknext()
    {
        WebElement loginElement=wait.until(ExpectedConditions.elementToBeClickable(next));
        loginElement.click();
        return new OTP(driver,generatedEmail);


    }




}
