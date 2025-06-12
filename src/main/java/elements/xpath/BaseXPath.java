package elements.xpath;

import java.util.HashMap;
import java.util.Map;

public abstract class BaseXPath {
    protected final Map<String, String> dictionary = new HashMap<>();

    public String getPath(String elementCode) {
        return (elementCode == null || elementCode.trim().isEmpty()) ? 
            "" : dictionary.get(elementCode);
    }
}
