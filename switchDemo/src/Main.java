public class Main {

    public static void main(String[] args) {
        // write your code here
        //CTRL SHIFT ALT L ile düzenlemeyi yapabiliz...
        char grade = 'C';
        switch (grade) {
            case 'A':
                System.out.println("TEBRİKLER GEÇTİNİZ..");
                break;
            case 'B':
                System.out.println("GÜZEL GEÇTİNİZ..");
                break;
            case 'C':
                System.out.println("GEÇTİNİZ.");
                break;
            case 'D':
                System.out.println("KALDINIZ.");
                break;
            default:
                System.out.println("Geçersiz not girdiniz");
        }
    }
}
