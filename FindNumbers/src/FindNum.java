import java.util.Scanner;
public class FindNum {
	public static void main(String[] args) {
		int evenNum;
		Scanner input = new Scanner(System.in);
		System.out.print("Enter a number");
		evenNum = input.nextInt();
		for(int i=1;i<evenNum;i++) {
			if((i % 3 == 0)&&(i % 4 == 0)) {
				System.out.println(i);
			}
		}
	}
}
