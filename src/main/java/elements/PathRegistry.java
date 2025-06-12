package elements;

import elements.xpath.WebXPath;

public class PathRegistry {
    private final WebXPath provider;

    public PathRegistry() {
        provider = new WebXPath();
    }

    public String getPath(String code) {
        return provider.getPath(code);
    }
}