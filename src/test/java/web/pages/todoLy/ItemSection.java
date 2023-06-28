package web.pages.todoLy;

import web.controls.Button;
import web.controls.Label;
import web.controls.TextBox;
import org.openqa.selenium.By;

public class ItemSection {
    public TextBox nameItemBox = new TextBox(By.id("NewItemContentInput"));
    public Button addNewItemBtn = new Button(By.id("NewItemAddButton"));
    public Button menuIcon = new Button(By.xpath("//div[@style=\"display: block;\"]/img"));
    public Button deleteItem = new Button(By.xpath("//li[@class=\"delete separator\"]"));
    public Label recentItemLabel;
    public void setRecentItemLabel(String name){
        recentItemLabel= new Label(By.xpath("//td//div[text()='"+name+"']"));
    }
}
