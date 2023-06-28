package mobile.activities.whenDoApp;

import mobile.controls.Button;
import mobile.controls.Label;
import org.openqa.selenium.By;

public class MainActivity {
    public Button addNewTareaBtn = new Button(By.id("com.vrproductiveapps.whendo:id/fab"));
    public Label recentTaskLabel;
    public Label noteRecentTaskLabel;
    public void setRecentTaskLabel(String nameTask){
        recentTaskLabel = new Label(By.xpath("//android.widget.TextView[@text='"+nameTask+"']"));
    }
    public void setNoteRecentTaskLabel(String note){
        noteRecentTaskLabel = new Label(By.xpath("//android.widget.TextView[@text='"+note+"']"));
    }
    public Button lateralBarBtn = new Button(By.xpath("//android.widget.ImageButton[@content-desc=\"Open navigation drawer\"]"));


}
