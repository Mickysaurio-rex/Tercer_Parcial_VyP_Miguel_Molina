package mobile.activities.messageApp;

import mobile.controls.Label;
import mobile.controls.TextBox;
import org.openqa.selenium.By;

public class SelectContactActivity {
    public TextBox contactBox = new TextBox(By.id("com.google.android.apps.messaging:id/recipient_text_view"));
    public Label selectContactLabel = new Label(By.id("com.google.android.apps.messaging:id/contact_picker_create_group"));
}
