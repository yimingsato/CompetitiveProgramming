import java.util.*;
import java.io.*;
public class WhosInTheMiddle {
    public static void main(String[] Args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int y = sc.nextInt();
        int z = sc.nextInt();

        if (x < y && y < z || z < y && y < x) {
            System.out.println(y);
        } else if (y < z && z < x || x < z && z < y) {
            System.out.println(z);
        } else if (z < x && x < y || y < x && x < z) {
            System.out.println(x);
        }

    }
}
