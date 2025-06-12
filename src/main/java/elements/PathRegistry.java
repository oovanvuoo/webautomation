package elements;

import elements.selector.CSSSelector;
import elements.xpath.WebXPath;

public class PathRegistry {
    private final WebXPath xprovider;
    private final CSSSelector cprovider;

    public PathRegistry() {
        xprovider = new WebXPath();
        cprovider = new CSSSelector();
    }

    public String getByXPath(String code) {
        return xprovider.getPath(code);
    }

    public String getByCSSSelector(String code) {
        return cprovider.getPath(code);
    }
}