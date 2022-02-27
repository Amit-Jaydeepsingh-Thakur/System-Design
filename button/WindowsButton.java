package button;

public class WindowsButton implements button {
    
    @Override
    public void render() {
        System.out.println("Calling render from Windows");
    }

    @Override
    public void onClick() {
        System.out.println("Calling onClick from Windows");
    }
}
