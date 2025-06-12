package elements.selector;

import elements.BaseLocator;
import elements.WebItemsMgr;

public class CSSSelector extends BaseLocator {
    public CSSSelector() {
        dictionary.put(WebItemsMgr.HOMEPAGE, "div.homepage");
        dictionary.put(WebItemsMgr.LOGIN_PHONE, "input[name='phone']");
        dictionary.put(WebItemsMgr.LOGIN_PWD, "input[name='password']");
        dictionary.put(WebItemsMgr.LOGIN_BUTTON, "button.login-btn");
        dictionary.put(WebItemsMgr.LOGIN_TAB_CUSTOMER, "div.tab-customer");
        dictionary.put(WebItemsMgr.LOGIN_TAB_SALER, "div.tab-saler");
    }
}