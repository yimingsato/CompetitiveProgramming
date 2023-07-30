import java.util.*;

public class AnimalContest1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int square = sc.nextInt();
		int circle = sc.nextInt(); 
		if (square*square > circle*circle*3.14) {
			System.out.print("SQUARE");
		}else {
			System.out.print("CIRCLE");
		}
		

	}

}
