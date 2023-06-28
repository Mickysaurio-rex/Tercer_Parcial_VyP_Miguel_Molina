package web.testWeb;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import web.pages.todoIst.*;
import web.singletonSession.Session;

public class TestBaseTodoIst {
    protected LoginSection loginSection = new LoginSection();
    protected MainPage mainPage = new MainPage();
    protected MenuSection menuSection = new MenuSection();
    protected MenuCreateProject menuCreateProject = new MenuCreateProject();
    protected MenuEditProject menuEditProject = new MenuEditProject();

    @BeforeEach
    public void openBrowser(){
        Session.getSession().goTo("https://todoist.com/es");
    }

    @AfterEach
    public void closeBrowser(){
        Session.getSession().closeBrowser();
    }
}
