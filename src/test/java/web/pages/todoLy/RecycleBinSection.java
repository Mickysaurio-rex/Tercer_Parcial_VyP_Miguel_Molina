package web.pages.todoLy;

import web.controls.Label;
import org.openqa.selenium.By;

public class RecycleBinSection {
    public Label nameItemDeletedLabel;

    public void setNameItemDeletedLabel(String name){
        nameItemDeletedLabel = new Label(By.xpath("//td//div[text()='"+name+"']"));
    }
}
