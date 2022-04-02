public class Main {

    public static void main(String[] args) {
        WomanGameCalculator womanGameCalculator = new WomanGameCalculator();
        KidsGameCalculator kidsGameCalculator = new KidsGameCalculator();
        kidsGameCalculator.hesapla();
        womanGameCalculator.hesapla();

        womanGameCalculator.gameOver();

    }
}
