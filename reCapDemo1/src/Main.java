public class Main {

    public static void main(String[] args) {
        // sayı sıralama uygulaması
        int sayi1 = 5;
        int sayi2 = 10;
        int sayi3 = 15;
        int enBuyuk = sayi1;

        if (enBuyuk < sayi2) {
                enBuyuk=sayi2;
        }
        if(enBuyuk<sayi3){
                enBuyuk=sayi3;
        }
        System.out.println("EN BÜYÜK "+enBuyuk);
    }
}
