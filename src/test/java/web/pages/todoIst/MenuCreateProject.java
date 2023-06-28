package web.pages.todoIst;

import web.controls.Button;
import web.controls.TextBox;
import org.openqa.selenium.By;

public class MenuCreateProject {
    public TextBox nameProjectTxt = new TextBox(By.id("edit_project_modal_field_name"));
    public Button selectColorButton =  new Button(By.xpath("//button[@aria-labelledby=\"edit_project_modal_field_color_label\"]"));
    public Button selectorBlue = new Button(By.xpath("//li[@data-value=\"blue\"]//span[@class=\"color_dropdown_select__name\"]"));
    public Button selectorYellow = new Button(By.xpath("//li[@data-value=\"yellow\"]//span[@class=\"color_dropdown_select__name\"]"));
    public Button saveCreateProject = new Button(By.xpath("//button[@type='submit']"));

}
