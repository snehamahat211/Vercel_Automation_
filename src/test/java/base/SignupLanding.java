package base;

import org.testng.annotations.Test;
import signup.*;

public class SignupLanding extends BaseTests{

    @Test
    public void SignupLanding(){
        Agreementpage agreement=homepage.clickstarted();
        agreement.ClickOnAgreement();
        SignupOne signupo=agreement.clickOnSignup();
        signupo.fillinfo("Sneha","Mahat","Sneha@123","Sneha@123");
        OTP otp=signupo.clicknext();
        otp.testMailExample();
        SignupTwo signupt=otp.clickverify();
        signupt.fillform("ICT Tcch","HR","icttech@gmail.com","google.com","thimi");
        SignupThree signthree=signupt.clicknextone();
        signthree.fillformtwo("20","Software Development","90");
        signthree.clicknexttwo();







    }



}
