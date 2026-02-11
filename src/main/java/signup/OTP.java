package  signup;

import com.mailosaur.MailosaurClient;
import com.mailosaur.MailosaurException;
import com.mailosaur.models.MessageSearchParams;
import com.mailosaur.models.SearchCriteria;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.http.Message;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.io.IOException;
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

    public Message waitforEmail (String emailid, MailosaurClient mailosaur)throws MailosaurException {
        Wait<MailosaurClient> wait=new FluentWait<>(mailosaur)
                .withTimeout(Duration.ofSeconds(30))
                .pollingEvery(Duration.ofMillis(100))
                .ignoring(Exception.class);
        return wait.until(mailosaurClient->{
            try{
                MessageSearchParams params=new MessageSearchParams();
                params.withServer(serverId);

                SearchCriteria criteria=new SearchCriteria();
                criteria.withSentTo(emailid);

                Message message = (Message) mailosaurClient.messages().get(params,criteria);
                return message;}
            catch (MailosaurException | IOException e){
                return null;
            }
        });
    }







}