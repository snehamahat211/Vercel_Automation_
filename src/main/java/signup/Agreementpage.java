package signup;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class Agreementpage {
    public WebDriver driver;
    private WebDriverWait wait;
    private By agreeCheckbox =By.id("remember");


    public Agreementpage(WebDriver driver){
        this.driver=driver;
        this.wait=new WebDriverWait(driver, Duration.ofSeconds(20));
    }

    public void clickagreement(boolean check){
        WebElement Checkbox=wait.until(ExpectedConditions.elementToBeClickable(agreeCheckbox));
        ((JavascriptExecutor)driver).executeScript("arguments[0].scrollIntoView(true);",Checkbox);
        if (Checkbox.isSelected() !=check){
            Checkbox.click();
        }





    }


}
