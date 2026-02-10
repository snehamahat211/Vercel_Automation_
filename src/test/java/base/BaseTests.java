package base;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
import signup.Homepage;
import signup.Loginpage;

public class BaseTests {
    private WebDriver driver;
    protected Homepage homepage;
    protected Loginpage loginpage;

    @Test

    public void setup()
    {
        driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://authorized-partner.vercel.app/");
        homepage = new Homepage(driver);
        homepage.clickLogin();
        loginpage=new Loginpage(driver);
        loginpage.clicksignin();

    }

}
