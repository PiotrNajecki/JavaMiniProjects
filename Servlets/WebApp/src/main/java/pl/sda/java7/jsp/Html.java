package pl.sda.java7.jsp;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @author michaljedryszka
 */
public class Html {
    private StringBuilder page = new StringBuilder();
    private List<String> tags = new ArrayList<>();

    private Html(){}

    public static Html page() {
        return new Html();
    }

    public String render() {
        return page.toString();
    }

    public Html tag(String name) {
        page.append("<").append(name).append(">");
        tags.add(name);
        return this;
    }

    public Html write(String value) {
        page.append(value);
        return this;
    }
    public Html etag(String name) {
        page.append("<").append(name).append(" />");
        return this;
    }

    public Html tag(String name, String... attributes) {
        page.append("<").append(name);
        attributes(attributes);
        page.append(">");
        tags.add(name);
        return this;
    }

    public Html etag(String name, String... attributes) {
        page.append("<").append(name);
        attributes(attributes);
        page.append("/>");
        return this;
    }

    private void attributes(final String[] attributes) {
        for (int i = 0; i <= attributes.length - 1; ) {
            page.append(" ");
            page.append(attributes[i]);
            i++;
            if (i <= attributes.length -1) {
                page.append("=\"");
                page.append(attributes[i]);
                page.append("\" ");
                i++;
            }
        }
    }

    public Html end() {
        page.append("</").append(tags.remove(tags.size() - 1));
        page.append(">");
        return this;
    }
}
