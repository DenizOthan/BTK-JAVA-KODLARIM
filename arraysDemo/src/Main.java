public class Main {

    public static void main(String[] args) {
	String ogrenci1 = "DENİZ";
    String ogrenci2 =  "ALİ";
    String ogrenci3 = "SUDE";

    System.out.println(ogrenci1);
    System.out.println(ogrenci2);
    System.out.println(ogrenci3);

    System.out.println("+++++++++++++++++++");

    String[] ogrenciler = new String[4];
    ogrenciler[0] = "DENİZ";
    ogrenciler[1] = "ALİ";
    ogrenciler[2] = "SUDE";
    ogrenciler[3] = "Merve";
    for(int i =0; i<ogrenciler.length;i++){
        System.out.println(ogrenciler[i]);


    }
        System.out.println("............");
        String[] veliler = new String[2];
    veliler[0]="Denizin velisi";
    veliler[1]="Alinin annesi";
    for(int i =0;i< veliler.length;i++){
        System.out.println(veliler[i]);



        
    }


    }
}
