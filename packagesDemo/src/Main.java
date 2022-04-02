
import matematik.*;
import matematik.Logaritma;

import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
	// write your code here
        Scanner scanner = new Scanner(System.in);

        System.out.println("Adınız:");

        String isim = scanner.nextLine();

        System.out.println("Merhaba " + isim);

       DortIslem dortIslem = new DortIslem();
       dortIslem.Topla(2,3);
       Logaritma logaritma = new Logaritma();
    }
}
