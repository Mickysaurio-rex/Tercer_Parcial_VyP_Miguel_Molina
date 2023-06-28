package web.pages.todoIst;

import web.controls.Button;
import org.openqa.selenium.By;

public class MenuEditProject {
    public Button editProjectButton = new Button(By.xpath("//li[@role=\'menuitem\'][3]"));
    public Button deleteProjectButton = new Button(By.xpath("//li[@role=\'menuitem\'][10]"));
    public Button aceptDeleteButton = new Button(By.xpath("//button[@class=\"_8313bd46 _7a4dbd5f _5e45d59f _2a3b75a1 _56a651f6\"]"));
}
