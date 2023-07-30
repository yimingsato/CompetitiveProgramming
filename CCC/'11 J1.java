import java.util.*;
import java.io.*;
public class WhichAlien {

    public static void main(String[] Args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int y = sc.nextInt();

        if (x >= 3 && y <= 4) {
            System.out.println("TroyMartian");
        }
        if (x <= 6 && y >= 2) {
            System.out.println("VladSaturnian");
        }
        if (x <= 2 && y <= 3) {
            System.out.println("GraemeMercurian");
        }
    }
}
