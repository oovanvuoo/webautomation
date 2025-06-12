package elements.selector;

import elements.WebItemsMgr;

public class CSSSelector extends BaseCSSSelector {
    public CSSSelector() {
        dictionary.put(WebItemsMgr.HOMEPAGE, "//android.widget.TextView[@content-desc='Trang chủ']");
        dictionary.put(WebItemsMgr.LOGIN_PHONE, "//android.widget.EditText[@text=\"Số điện thoại\"]");
        dictionary.put(WebItemsMgr.LOGIN_PWD, "//android.widget.EditText[@text=\"Mật khẩu\"]");
        dictionary.put(WebItemsMgr.LOGIN_BUTTON, "//android.widget.Button[@content-desc=\"Đăng nhập\"]");
        dictionary.put(WebItemsMgr.LOGIN_TAB_CUSTOMER, "//android.view.View[@content-desc=\"Khách hàng\nTab 1 trong tổng số 2\"]");
        dictionary.put(WebItemsMgr.LOGIN_TAB_SALER, "//android.view.View[@content-desc=\"Nhân viên\nTab 2 trong tổng số 2\"]");
    
    }
}
