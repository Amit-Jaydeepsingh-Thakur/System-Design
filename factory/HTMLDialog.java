package factory;

import button.button;
import button.HTMLButton;

public class HTMLDialog extends Dialog {
    public button createButton() {
        return new HTMLButton();
    }
}
