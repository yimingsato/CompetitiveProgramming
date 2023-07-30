import java.util.*;
import java.io.*;
public class SpecialDay {

    public static void main(String[] Args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int y = sc.nextInt();
        if (x == 2 && y == 18){
            System.out.println("Special");
        }else if (x < 2){
            System.out.println("Before");
        }else if(x > 2 ){
            System.out.println("After");
        }else if (x == 2 && y < 18){
            System.out.println("Before");
        }else if (x == 2 && y > 18){
            System.out.println("After");
        }
    }
}
