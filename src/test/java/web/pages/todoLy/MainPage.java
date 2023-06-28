package web.pages.todoLy;

import web.controls.Button;
import org.openqa.selenium.By;
import web.controls.Label;

public class MainPage {
    public Button loginButton = new Button(By.xpath("//img[@src='/Images/design/pagelogin.png']"));
    public Button signupBtn = new Button(By.xpath("//img[@src=\"/Images/design/pagesignup.png\"]"));
    public Label alertEmailAlreadyExists = new Label(By.xpath("//span[text()='Account with this email address already exists!']"));

}
