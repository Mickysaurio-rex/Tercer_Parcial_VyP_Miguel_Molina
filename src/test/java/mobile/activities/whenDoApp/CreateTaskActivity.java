package mobile.activities.whenDoApp;

import mobile.controls.Button;
import mobile.controls.TextBox;
import org.openqa.selenium.By;

public class CreateTaskActivity {
    public TextBox titleTaskBox = new TextBox(By.id("com.vrproductiveapps.whendo:id/noteTextTitle"));
    public TextBox noteTaskBox = new TextBox(By.id("com.vrproductiveapps.whendo:id/noteTextNotes"));
    public Button saveTaskBtn = new Button(By.id("com.vrproductiveapps.whendo:id/saveItem"));
    public Button deleteTaskBtn = new Button(By.id("com.vrproductiveapps.whendo:id/deleteItem"));
    public Button confirmDeleteTaskBtn = new Button(By.id("android:id/button1"));

}
