package mobile.activities.whenDoApp;

import mobile.controls.Button;
import mobile.controls.Label;
import org.openqa.selenium.By;

public class MainActivity {
    public Button addNewTareaBtn = new Button(By.id("com.vrproductiveapps.whendo:id/fab"));
    public Label recentTaskLabel;
    public void setRecentTaskLabel(String nameTask){
        recentTaskLabel = new Label(By.xpath("//android.widget.TextView[@text='"+nameTask+"']"));
    }

}
