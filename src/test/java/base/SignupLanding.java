package base;

import org.testng.annotations.Test;
import signup.Agreementpage;

public class SignupLanding extends BaseTests{

    @Test
    public void SignupLanding(){
        Agreementpage agreement=homepage.clickstarted();
        agreement.ClickOnAgreement();
        agreement.clickOnSignup();


    }



}
