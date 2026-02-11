package base;

import org.testng.annotations.Test;
import signup.Agreementpage;
import signup.OTP;
import signup.SignupOne;

public class SignupLanding extends BaseTests{

    @Test
    public void SignupLanding(){
        Agreementpage agreement=homepage.clickstarted();
        agreement.ClickOnAgreement();
        SignupOne signupo=agreement.clickOnSignup();
        signupo.fillinfo("Sneha","Mahat","Sneha@123","Sneha@123");
        OTP otp=signupo.clicknext();
        otp.testMailExample();
        otp.clickverify();






    }



}
