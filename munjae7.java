package silsup;

import java.util.Scanner;

public class munjae7 {
	private static Scanner scanner;
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("x좌표와 y좌표를 입력해주십시오. >> ");
		int pointX = scanner.nextInt();
		int pointY = scanner.nextInt();
		if ((50<=pointX)&&(pointX<=100)
				&&(50<=pointY)&&(pointY<=100)){
			System.out.println("사각형 안에 점이 있습니다.");
		} else {System.out.println("점이 사각형 밖에 있습니다.");
		
	}
}
}
