package factory;

import button.button;
import button.WindowsButton;

public class WindowDialog extends Dialog {
    public button createButton() {
        return new WindowsButton();
    }
}
