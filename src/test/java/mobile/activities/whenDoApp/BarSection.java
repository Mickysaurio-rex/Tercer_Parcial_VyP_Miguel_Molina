package mobile.activities.whenDoApp;

import mobile.controls.Label;
import org.openqa.selenium.By;
import web.controls.Button;

public class BarSection {
    public Button myListBtn = new Button(By.xpath("//android.widget.CheckedTextView[@text='My List']"));
    public Button allTasksBtn = new Button(By.xpath("//android.widget.CheckedTextView[@text='All Tasks']"));

}
