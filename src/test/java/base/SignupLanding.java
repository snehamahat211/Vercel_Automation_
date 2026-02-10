package base;

import org.testng.annotations.Test;
import signup.Agreementpage;
import signup.SignupOne;

public class SignupLanding extends BaseTests{

    @Test
    public void SignupLanding(){
        Agreementpage agreement=homepage.clickstarted();
        agreement.ClickOnAgreement();
        SignupOne signupo=agreement.clickOnSignup();
        signupo.fillinfo("Sneha","Mahat","sneha.221742@ncit.edu.np","9843435183","Sneha@123","Sneha@123");
        signupo.clicknext();





    }



}
