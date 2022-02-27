import factory.Dialog;
import factory.WindowDialog;
import factory.HTMLDialog;

public class FactoryPattern {
    public static Dialog dialog;
    public static void main(String[] args) {
        System.out.println("In the Main Function");
        configure();
        runConfiguration();
    }
    
    static void configure() {
        if (System.getProperty("os.name").equals("Windows 10")) {
            dialog = new WindowDialog(); 
        }
        else {
            dialog = new HTMLDialog();
        }
    }

    static void runConfiguration() {
        dialog.renderWindow();
    }
}
