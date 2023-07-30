import java.util.*;
import java.io.*;

public class TriangleTimes {
    public static void main(String[] Args){
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int y = sc.nextInt();
        int z = sc.nextInt();


        if (x + y + z != 180) {
            System.out.println("Error");
        }else if (x == 60 && y == 60 && z == 60){
            System.out.println("Equilateral");
        }else if(x == y || y == z || z == x){
            System.out.println("Isosceles");
        }else{
            System.out.println("Scalene");
        }
    }
}
