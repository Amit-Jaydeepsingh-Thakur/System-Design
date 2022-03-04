import com.hashmap.storage.HashMap;

public class Main {
    public static void main(String[] args) {
        System.out.println("My HashMap");
        HashMap map = new HashMap();
        map.put("Samsung", 1);
        map.put("Apple", 2);
        map.put("Apple", 3);

        try {
            System.out.println(map.get("Samsung"));
        }
        catch(Exception exception) {
            System.out.println(exception);
        }

//        System.out.println(map.get("Apple"));
//        System.out.println(map.get("Apple"));
//        System.out.println(map.get("Motorola"));


    }
}



