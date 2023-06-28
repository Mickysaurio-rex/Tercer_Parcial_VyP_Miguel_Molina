package web.testWeb;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class LoginTestTodoIst extends TestBaseTodoIst{
    @Test
    public void verifyLoginSuccessfully() throws InterruptedException{
        mainPage.iniciarSesionButton.click();

        loginSection.emailBox.setText("miguel_segundo_examen@upb.com");
        loginSection.pwdBox.setText("Verificacion123");
        loginSection.startEmailButton.click();

        Thread.sleep(4000);

        Assertions.assertTrue(menuSection.menuPerfilButton.isControlDisplayed(),
                "ERROR!! login was not successfully, review credentials");

        menuSection.menuPerfilButton.click();

    }
}
