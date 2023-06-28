package web.pages.todoIst;

import web.controls.Button;
import web.controls.TextBox;
import org.openqa.selenium.By;

public class LoginSection {
    public TextBox emailBox = new TextBox(By.id("element-0"));
    public TextBox pwdBox = new TextBox(By.id("element-3"));
    public Button startEmailButton = new Button(By.xpath("//button[@type='submit']"));
}
