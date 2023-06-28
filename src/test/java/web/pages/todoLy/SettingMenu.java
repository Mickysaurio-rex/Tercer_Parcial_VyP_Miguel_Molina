package web.pages.todoLy;

import web.controls.Button;
import web.controls.TextBox;
import org.openqa.selenium.By;

public class SettingMenu {
    public TextBox fullNameTxtBox = new TextBox(By.id("FullNameInput"));
    public Button buttonOk = new Button(By.xpath("//span[text()='Ok']"));
    public TextBox oldPwdBox = new TextBox(By.id("TextPwOld"));
    public TextBox newPwdBox = new TextBox(By.id("TextPwNew"));

}
