package  signup;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class OTP {
	public WebDriver driver;
    public WebDriverWait wait;
    String apikey="";
    String serverId="";
    String serverDomain="";





    private By codebox=By.cssSelector("input[data-input-otp='true']");

    public OTP(WebDriver driver) {
        this.driver=driver;
        this.wait=new WebDriverWait(driver, Duration.ofSeconds(10));
    }






}