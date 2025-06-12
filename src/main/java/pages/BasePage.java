package pages;

import elements.PathRegistry;
import utils.actions.Check;
import utils.actions.Click;
import utils.actions.Do;
import utils.actions.Get;
import utils.actions.Input;

import org.openqa.selenium.WebDriver;

public class BasePage {
    protected final WebDriver driver;
    protected final Click click;
    protected final Check check;
    protected final Get get;
    protected final Input input;
    protected final Do doAction;
    protected final PathRegistry pathRegistry;
    protected final String APPLY_ENV_URL;

    public BasePage(WebDriver driver, String applyEnvUrl) {
        this.driver = driver;
        this.click = new Click(driver);
        this.check = new Check(driver) ;
        this.get = new Get(driver);
        this.input = new Input(driver) ;
        this.doAction = new Do(driver) ;

        this.pathRegistry = new PathRegistry();
        this.APPLY_ENV_URL = applyEnvUrl;

    }
}
