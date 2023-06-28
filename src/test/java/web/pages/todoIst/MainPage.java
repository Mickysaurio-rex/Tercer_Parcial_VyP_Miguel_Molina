package web.pages.todoIst;

import web.controls.Button;
import org.openqa.selenium.By;

public class MainPage {
    public Button iniciarSesionButton = new Button(By.xpath("//a[contains(text(),'Iniciar')]"));
}
