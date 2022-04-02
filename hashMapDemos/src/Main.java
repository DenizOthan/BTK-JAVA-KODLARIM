import java.util.HashMap;

public class Main {

    public static void main(String[] args) {
	// write your code here
        HashMap<String,String> sozlük = new HashMap<String,String>();
        sozlük.put("book","kitap");
        sozlük.put("table","masa");
        sozlük.put("computer","bilgisayar");
        sozlük.remove("table");
        System.out.println(sozlük.get("table"));

    }
}
