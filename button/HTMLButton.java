package button;

public class HTMLButton implements button {
    
    @Override
    public void render() {
        System.out.println("Calling render from HTML");
    }

    @Override
    public void onClick() {
        System.out.println("Calling onClick from HTML");
    }
}
