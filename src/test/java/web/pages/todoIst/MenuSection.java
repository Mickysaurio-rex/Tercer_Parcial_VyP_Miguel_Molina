package web.pages.todoIst;

import web.controls.Button;
import web.controls.Label;
import org.openqa.selenium.By;

public class MenuSection {
    public Button menuPerfilButton = new Button(By.xpath("//button[@class=\"reactist_menubutton top_bar_btn settings_btn\"]"));
    public Button logoutButton = new Button(By.id(":r14:"));
    public Button addProjectButton = new Button(By.xpath("//button[@class='_8313bd46 f169a390 _8b7f1a82 _8644eccb _2a3b75a1']"));
    public Label currentProject ;
    public void setCurrentProject(String name){
        currentProject = new Label(By.xpath("//li[@class=\"iydsj+G\"][last()]//span[text()='"+name+"']"));
    }
    public Button menuActionProject = new Button(By.xpath("//li[@class=\"iydsj+G\"][last()]//button"));
}
