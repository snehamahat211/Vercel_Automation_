package signup;

import org.openqa.selenium.*;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class SignupThree {
    private WebDriver driver;
    private WebDriverWait wait;
    private By experience=By.id("«r7t»-form-item");
    private By  years=By.id("«r7v»-form-item");
    private By numofstu=By.id("«r7v»-form-item");
    private By focusarea=By.id("«r80»-form-item");
    private By successmetric=By.id("«r81»-form-item");
    private By service=By.id("«r83»-form-item");
    private By nexttwo=By.xpath("//button[ text()='Next']");




    public SignupThree(WebDriver driver) {
        this.driver = driver;
    }

    private WebElement waituntilvisible(By locator) {
        return wait.until(ExpectedConditions.visibilityOfElementLocated(locator));
    }

    private void type(By locator, String text) {
        WebElement input = waituntilvisible(locator);
        input.sendKeys(Keys.CONTROL + "a", Keys.BACK_SPACE);
        input.sendKeys(text);
    }

    private void click(By locator) {
        WebElement element = waituntilvisible(locator);
        try {
            element.click();
        } catch (Exception e) {
            ((JavascriptExecutor) driver).executeScript("arguments[0].click();", element);
        }
    }
    public void exp()
    {
        click(experience);
        driver.findElement(years).click();
    }

    public void numofstud(String role) {
        type(numofstu, role);
    }

    public void focus(String area){
        type(focusarea, area);

    }

    public void successmetric(String metric) {
        type(successmetric, metric);
    }
    public void service()
    {
        click(service);
    }










}
