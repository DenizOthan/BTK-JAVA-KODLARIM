import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        ArrayList<String> sehirler = new ArrayList<String>();
        sehirler.add("Ankara");
        sehirler.add("İstanbul");
        sehirler.add("İzmir");
        sehirler.remove("İstanbul");
        for (String sehir:sehirler){
            System.out.println(sehir);
        }
    }
}
