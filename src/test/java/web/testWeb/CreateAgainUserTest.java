package web.testWeb;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class CreateAgainUserTest extends TestBase {
    @Test
    public void cuentaRepetidaTest() throws InterruptedException {
        String emailName = "MiguelVerificacion2@upb.com";
        mainPage.signupBtn.click();
        signUpSection.fullNameBox.setText("Miguel Molina");
        signUpSection.emailBox.setText(emailName);
        signUpSection.pwdBox.setText("12345");
        signUpSection.checkTermsLabel.click();
        signUpSection.signUpBtn.click();
        Thread.sleep(1000);
        Assertions.assertTrue(menuSection.logoutButton.isControlDisplayed(), "ERROR, the user was not created");

        menuSection.logoutButton.click();
        Thread.sleep(1000);
        mainPage.signupBtn.click();
        signUpSection.fullNameBox.setText("Miguel Molina");
        signUpSection.emailBox.setText(emailName);
        signUpSection.pwdBox.setText("12345");
        Thread.sleep(1000);
        signUpSection.checkTermsLabel.click();
        signUpSection.signUpBtn.click();
        Thread.sleep(1000);
        Assertions.assertTrue(mainPage.alertEmailAlreadyExists.isControlDisplayed(), "!ERROR, user did not exist");
    }
}