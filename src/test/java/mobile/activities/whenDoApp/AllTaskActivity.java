package mobile.activities.whenDoApp;

import mobile.controls.Label;
import org.openqa.selenium.By;

public class AllTaskActivity {
    public Label recentTaskLabel;
    public void setRecentTaskLabel(String nameTask){
        recentTaskLabel = new Label(By.xpath("//android.widget.TextView[@text='"+nameTask+"']"));
    }
}
