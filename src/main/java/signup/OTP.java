package  signup;

import com.mailosaur.MailosaurClient;
import com.mailosaur.MailosaurException;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.http.Message;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class OTP {
	public WebDriver driver;
    public WebDriverWait wait;
    String apikey="";
    String serverId="";
    String serverDomain="";

    public Message waitforEmail (String emailid, MailosaurClient mailosaur)throws MailosaurException {
        Wait<MailosaurClient> wait=new FluentWait<>(mailosaur)
                .withTimeout(Duration.ofSeconds(30))
                .pollingEvery(Duration.ofMillis(100))
                .ignoring(Exception.class);


    }





    private By codebox=By.cssSelector("input[data-input-otp='true']");

    public OTP(WebDriver driver) {
        this.driver=driver;
        this.wait=new WebDriverWait(driver, Duration.ofSeconds(10));
    }






}