package web.pages.todoIst;

import web.controls.Button;
import web.controls.TextBox;
import org.openqa.selenium.By;

public class MenuItem {
    public Button createItemButton = new Button(By.xpath("//button[@class=\"plus_add_button\"]"));
    public TextBox nameItemBoxClear = new TextBox(By.xpath("//div[@aria-label=\"Nombre de la tarea\"]//p[@data-placeholder=\"Nombre de la tarea\"]"));
    public TextBox nameItemBoxFull;
    public void setNameItemBoxFull(String name){
        nameItemBoxFull = new TextBox(By.xpath("//div[@aria-label=\"Nombre de la tarea\"]//p[text()='"+name+"']"));
    }
    public TextBox descriptionItemBoxClear = new TextBox(By.xpath("//p[@data-placeholder=\"Descripción\"]"));
    public TextBox descriptionItemBoxFull;
    public void setDescriptionItemBoxFull(String description){
        descriptionItemBoxFull = new TextBox(By.xpath("//p[text()='"+description+"']"));
    }
    public Button addTrabajo = new Button(By.xpath("//button[@data-testid=\"task-editor-submit-button\"]"));

}
