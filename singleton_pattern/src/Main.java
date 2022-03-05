import com.singleton.util.Singleton;

public class Main {
    public static void main(String[] args) {
        System.out.println("Singleton Pattern");

        Singleton singleton1 = Singleton.createInstance(1);
        System.out.println(singleton1.value);

        Singleton singleton2 = Singleton.createInstance(1);
        System.out.println(singleton2.value);

    }
}
