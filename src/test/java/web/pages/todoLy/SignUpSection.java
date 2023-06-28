package web.pages.todoLy;

import web.controls.Button;
import web.controls.Label;
import web.controls.TextBox;
import org.openqa.selenium.By;

public class SignUpSection {
    public TextBox fullNameBox = new TextBox(By.id("ctl00_MainContent_SignupControl1_TextBoxFullName"));
    public TextBox emailBox = new TextBox(By.id("ctl00_MainContent_SignupControl1_TextBoxEmail"));
    public TextBox pwdBox = new TextBox(By.id("ctl00_MainContent_SignupControl1_TextBoxPassword"));
    public Label checkTermsLabel = new Label(By.id("ctl00_MainContent_SignupControl1_CheckBoxTerms"));
    public Button signUpBtn = new Button(By.id("ctl00_MainContent_SignupControl1_ButtonSignup"));
}
