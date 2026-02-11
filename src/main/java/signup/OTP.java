package  signup;

import com.mailosaur.MailosaurClient;
import com.mailosaur.MailosaurException;
import com.mailosaur.models.MessageSearchParams;
import com.mailosaur.models.SearchCriteria;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;
import com.mailosaur.models.Message;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.io.IOException;
import java.time.Duration;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class OTP {
	public WebDriver driver;
    public WebDriverWait wait;
    String apikey="FfNdYwSt71EsY0VIYFF0caDOhN089BWb";
    String serverId="bftp0kad";
    String serverDomain="";

    private By codebox=By.cssSelector("input[data-input-otp='true']");
    private String emailid;

    public OTP(WebDriver driver,String emailid) {
        this.driver=driver;
        this.emailid=emailid;
        this.wait=new WebDriverWait(driver, Duration.ofSeconds(10));
    }

    public Message waitforEmail (String emailid, MailosaurClient mailosaur) {
        Wait<MailosaurClient> wait=new FluentWait<>(mailosaur)
                .withTimeout(Duration.ofSeconds(60))
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

    public void testMailExample()  {

        MailosaurClient mailosaur =new MailosaurClient(apikey);
        Message message =waitforEmail(emailid,mailosaur);

        if(message ==null){
            throw new RuntimeException("No otp emailreceived for "+emailid);
        }
        String body=message.text().body();
        System.out.println("body: "+body);

        Pattern pattern =Pattern.compile("\\b([0-9]{6})\\b");
        Matcher matcher=pattern.matcher(body);

        if(!matcher.find()){
            throw new RuntimeException("Invalid email id "+emailid);
        }


        String otp=matcher.group(1);
        System.out.println("otp: "+otp);

        driver.findElement(codebox).sendKeys(otp);
    }}