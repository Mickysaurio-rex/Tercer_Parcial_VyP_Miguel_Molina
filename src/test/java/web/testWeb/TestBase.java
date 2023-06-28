package web.testWeb;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import web.pages.todoLy.*;
import web.singletonSession.Session;

public class TestBase {

    protected MainPage mainPage= new MainPage();
    protected LoginSection loginSection = new LoginSection();
    protected MenuSection menuSection = new MenuSection();
    protected BarProjects barProjects = new BarProjects();
    protected SettingMenu settingMenu = new SettingMenu();
    protected SignUpSection signUpSection = new SignUpSection();
    protected ItemSection itemSection = new ItemSection();
    protected RecycleBinSection recycleBinSection = new RecycleBinSection();
    @BeforeEach
    public void openBrowser(){
        Session.getSession().goTo("http://todo.ly/");
    }

    @AfterEach
    public void closeBrowser(){
        Session.getSession().closeBrowser();
    }

}
