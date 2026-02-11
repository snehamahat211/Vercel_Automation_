package signup;

import org.openqa.selenium.*;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class SignupFour {
    private WebDriver driver;
    private WebDriverWait wait;

    private By registration =By.cssSelector("input[name='business_registration_number'][placeholder*='registration number']");
    private By dropdown=By.cssSelector("button[aria-controls^='radix-'][role='combobox']");
    private By pref=By.cssSelector("button[data-state='checked']");
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
        button.sendKeys(Keys.CONTROL + "a", Keys.BACK_SPACE);
        button.sendKeys("12345");
    }

    public void Dropdown(){
            click(dropdown);
            driver. findElement(By. xpath("//span[text()='United States of America']")). click();

    }

    public void Prefer(){
        click(pref);
    }

    public void uploadDocument() {
        driver. findElement(uploadone). sendKeys("\"C:\\Users\\user\\Downloads\\CV-Sneha-Mahat.pdf\"");
    }

    public void uploadDocumenttwo() {
        driver. findElement(uploadtwo). sendKeys("\"C:\\Users\\user\\Downloads\\CV-Sneha-Mahat.pdf\"");
    }









}
