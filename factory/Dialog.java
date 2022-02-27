package factory;

import button.button;;

public abstract class Dialog {
    public void renderWindow() {
        button okButton = createButton();
        okButton.render();
    }

    public abstract button createButton();
}
