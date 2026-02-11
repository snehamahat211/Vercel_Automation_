package signup;

import org.openqa.selenium.*;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class SignupThree {
    private WebDriver driver;
    private WebDriverWait wait;
    private By experience=By.cssSelector("button[role='combobox'][aria-controls*='radix']");
    private By  years=By.cssSelector("button[id$='-form-item']");
    private By numofstu=By.cssSelector("input[name='number_of_students_recruited_annually'][placeholder='Enter an approximate number.'][type='number']");
    private By focusarea=By.xpath("//input[@name='focus_area']");
    private By successmetric=By.xpath("//input[@name='success_metrics']");
    private By service=By.cssSelector("button[role='checkbox'][id$='-form-item']");
    private By nexttwo=By.xpath("//button[ text()='Next']");




    public SignupThree(WebDriver driver) {
        this.driver = driver;
        this.wait = new WebDriverWait(driver, Duration.ofSeconds(10));
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

    public void numofstud(String num) {
        type(numofstu, num);
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
    public void fillformtwo(String num,String area,String metric){
        exp();
        numofstud(num);;
        focus(area);
        successmetric(metric);
        service();
    }
    public void clicknexttwo()
    {
        WebElement button=wait.until(ExpectedConditions.elementToBeClickable(nexttwo));
        button.click();

    }
}
