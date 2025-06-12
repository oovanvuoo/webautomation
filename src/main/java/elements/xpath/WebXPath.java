package elements.xpath;

import elements.BaseLocator;
import elements.WebItemsMgr;

public class WebXPath extends BaseLocator {
    public WebXPath() {
        dictionary.put(WebItemsMgr.DASHBOARD_MENU, "");
        
        //div[contains(@class, 'card-header')]//span[normalize-space(.) = 'V Challenge']

    }
}
