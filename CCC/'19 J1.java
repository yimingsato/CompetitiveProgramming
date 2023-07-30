import java.util.*;
public class Junior1 {

    public static void main (String[] args){
        Scanner sc = new Scanner(System.in);
        int apples3 = sc.nextInt();
        int apples2 = sc.nextInt();
        int apples1 = sc.nextInt();
        int banana3 = sc.nextInt();
        int banana2 = sc.nextInt();
        int banana1 = sc.nextInt();
        int totalApples = apples1 + apples2 * 2 + apples3 * 3;
        int totalBananas = banana1 + banana2 * 2 + banana3 * 3;
        if (totalApples > totalBananas) {
            System.out.println("A");
        }else if(totalBananas > totalApples){
            System.out.println("B");
        }else{
            System.out.println("T");
        }
sc.close();

    }

}
