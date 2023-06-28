package mobile.testMobile;

import mobile.activities.whenDoApp.*;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import mobile.session.Session;

import java.util.Date;

public class CreateUpdateDeleteTaskTest {
    MainActivity mainActivity = new MainActivity();
    CreateTaskActivity createTaskActivity = new CreateTaskActivity();
    BarSection barSection = new BarSection();
    MyListActivity myListActivity = new MyListActivity();
    AllTaskActivity allTaskActivity = new AllTaskActivity();

    @Test
    public void createDeleteTaskTest() throws InterruptedException{
        //Create Task
        String nametask = "Miguel" + new Date().getTime();
        mainActivity.addNewTareaBtn.click();
        createTaskActivity.titleTaskBox.setText(nametask);
        createTaskActivity.saveTaskBtn.click();
        mainActivity.setRecentTaskLabel(nametask);
        Assertions.assertTrue(mainActivity.recentTaskLabel.isControlDisplayed(), "!ERROR, task was not created");
        Thread.sleep(4000);

        //Task Update
        String nameUpdate = "Miguel Update";
        String noteUpdate = "Pongame 100 por fa";
        mainActivity.recentTaskLabel.click();
        createTaskActivity.titleTaskBox.setText(nameUpdate);
        createTaskActivity.noteTaskBox.setText(noteUpdate);
        createTaskActivity.saveTaskBtn.click();
        mainActivity.setRecentTaskLabel(nameUpdate);
        mainActivity.setNoteRecentTaskLabel(noteUpdate);
        Assertions.assertTrue(mainActivity.recentTaskLabel.isControlDisplayed() && mainActivity.noteRecentTaskLabel.isControlDisplayed(), "!ERROR, task was not updated");
        Thread.sleep(4000);

        //Delete Task
        mainActivity.recentTaskLabel.click();
        createTaskActivity.deleteTaskBtn.click();
        createTaskActivity.confirmDeleteTaskBtn.click();
        Assertions.assertFalse(mainActivity.recentTaskLabel.isControlDisplayed(), "!ERROR, task was not deleted");
        Thread.sleep(4000);
        /*mainActivity.lateralBarBtn.click();
        barSection.myListBtn.click();
        myListActivity.setRecentTaskLabel(nameUpdate);
        Assertions.assertFalse(myListActivity.recentTaskLabel.isControlDisplayed(), "!ERROR, task was not deleted");
        Thread.sleep(4000);
        mainActivity.lateralBarBtn.click();
        barSection.allTasksBtn.click();
        allTaskActivity.setRecentTaskLabel(nameUpdate);
        Assertions.assertFalse(allTaskActivity.recentTaskLabel.isControlDisplayed(), "!ERROR, task was not deleted");
*/

    }
    @AfterEach
    public void close() {
        Session.getSession().closeSession();
    }
}
