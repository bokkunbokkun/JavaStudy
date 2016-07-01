import java.util.Scanner;

public class munjae6 {
	
	private static Scanner scanner;

	//세가지 길이의 선분으로 삼각형을 만들수 있는지 확인합니다.
	public static void main (String args[]){
		scanner = new Scanner(System.in);
		
		//세개의 숫자를 입력받습니다.
		int num1 = scanner.nextInt();
		int num2 = scanner.nextInt();
		int num3 = scanner.nextInt();
		
		
		//가장 큰 숫자를 찾고, 나머지는 선분1,선분2가 되게 해줍니다.
		int biggest, seg1, seg2;
		if ((num1>num2)&&(num1>num3)){
			biggest = num1;
			seg1 = num2;
			seg2 = num3;
		} else if ((num1>num2)&&(num1<num3)){
			biggest = num3;
			seg1= num1;
			seg2 = num2;
		} else {
			biggest = num2;
			seg1 = num1;
			seg2 = num3;
		}
		
		
		// 짧은 두 선분을 더했을때, 가장 긴 것보다 길면 삼각형은 만들어질 수 없습니다.
		if (seg1+seg2 > biggest){
			System.out.println("삼각형을 만들 수 없습니다.");
		} else System.out.println("삼각형을 만들 수 있습니다.");
	}
	}
	
	
	
