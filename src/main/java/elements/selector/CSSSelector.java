package elements.selector;

import elements.BaseLocator;
import elements.WebItemsMgr;

public class CSSSelector extends BaseLocator {
    public CSSSelector() {
        dictionary.put(WebItemsMgr.LOGIN_PHONE, "input[name='phone']");
        dictionary.put(WebItemsMgr.LOGIN_PWD, "input[name='password']");
        dictionary.put(WebItemsMgr.LOGIN_BUTTON, "button.login-btn");
        dictionary.put(WebItemsMgr.LOGIN_BUTTON_REGISTER, "button.btn.btn-primary.mt-2[type=\"submit\"]" );
        dictionary.put(WebItemsMgr.LOGIN_BUTTON_LOGIN, "button.btn.btn-primary.mt-2[type=\"submit\"]" );
        dictionary.put(WebItemsMgr.LOGIN_BUTTON_REDIRECT_LOGIN_PAGE, "a.nav-link[href=\"/user/login\"]" );
        dictionary.put(WebItemsMgr.LOGIN_INPUT_USERNAME, "input[id='identifier']");
        dictionary.put(WebItemsMgr.LOGIN_INPUT_PASSWORD, "input[id='password']");
        
        dictionary.put(WebItemsMgr.DASHBOARD_MENU, "a.nav-link[href='/dashboard']");
        dictionary.put(WebItemsMgr.CHALLENGE_MENU, "a.nav-link[href='/challenges']");
        dictionary.put(WebItemsMgr.CHALLENGE_DROPDOWN, "a.nav-link.d-inline.dropdown-toggle.dropdown-toggle-split");
        dictionary.put(WebItemsMgr.CHALLENGE_DROPDOWN_CREATE, "a.dropdown-item[href=\"/challenge/create\"]");
        dictionary.put(WebItemsMgr.CHALLENGE_FORM, "select#event_id.form-control[name=\"event_id\"]");
        dictionary.put(WebItemsMgr.CHALLENGE_FORM_TITLE, "input#title");
        dictionary.put(WebItemsMgr.CHALLENGE_FORM_FLAG, "input#flag");
        dictionary.put(WebItemsMgr.CHALLENGE_FORM_DESCRIPTION, "textarea#flask-pagedown-description");
        dictionary.put(WebItemsMgr.CHALLENGE_FORM_CATEGORY, "select#category");
        dictionary.put(WebItemsMgr.CHALLENGE_FORM_POINT, "input#points");   
        dictionary.put(WebItemsMgr.CHALLENGE_FORM_SOLUTION, "textarea#howtosolve");
        dictionary.put(WebItemsMgr.CHALLENGE_FORM_BTN_SUBMIT, "button.btn.btn-success.form-control[type=\"submit\"]");

        dictionary.put(WebItemsMgr.PROFILE, "img.navbar-avatar");
        dictionary.put(WebItemsMgr.MY_CHALLENGE_REDIRECT, ".dropdown-menu.show a.dropdown-item[href^=\"/challenge/by/\"]");
        dictionary.put(WebItemsMgr.LOGOUT_BUTTON, "a.dropdown-item[href=\"/user/logout\"]");
        
        dictionary.put(WebItemsMgr.MY_CHALLENGE_FIRST_ITEM, "a[href^=\"/challenge/\"]:first-of-type .card-header span:first-child");
        
        dictionary.put(WebItemsMgr.CHALLENGE_ITEM_TITLE, "#title-display");
        // dictionary.put(WebItemsMgr.CHALLENGE_ITEM_DESCRIPTION, "#description-display");
        dictionary.put(WebItemsMgr.CHALLENGE_ITEM_CATEGORY, "#category-display");
        dictionary.put(WebItemsMgr.CHALLENGE_ITEM_POINT, "#points-display");
        // dictionary.put(WebItemsMgr.CHALLENGE_ITEM_SOLUTION, "#howtosolve-display");
        // Example of a more complex selector

    }
}