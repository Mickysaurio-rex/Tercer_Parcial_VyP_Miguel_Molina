package web.singletonSession;

import org.openqa.selenium.WebDriver;
import web.factoryBrowser.FactoryBrowser;

public class Session {
    private static Session session = null;
    private WebDriver browser;
    private Session(){
        browser = FactoryBrowser.make("edge").create();
    }

    public static Session getSession(){
        if (session == null)
            session = new Session();

        return session;
    }

    public void closeBrowser(){
        session = null;
        browser.quit();
    }

    public void goTo(String url){
        browser.get(url);
    }

    public WebDriver getBrowser() {
        return browser;
    }
}
