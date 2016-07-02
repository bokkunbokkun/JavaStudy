package silsup;

import java.util.Scanner;

public class munjae8 {
	private static Scanner scanner;
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("두 점의 x좌표와 y좌표를 입력해주십시오. >> ");//좌표 입력
		int pointX1 = scanner.nextInt();
		int pointY1 = scanner.nextInt();
		int pointX2 = scanner.nextInt();
		int pointY2 = scanner.nextInt();
		
		if (((pointX1<50)&&(pointX2<50))||//두 점의 x좌표가 모두 50보다 작거나
				((100<pointX1)&&(100<pointX2))||//두 점의 x좌표가 모두 100보다 크거나
				(pointY1<50)&&(pointY2<50)||//두 점의 y좌표가 모두 50보다 작거나
				(100<pointY1)&&(100<pointY2)){//두 점의 y좌표가 모두 100보다 크거나
			System.out.println("사각형이 겹치지 않습니다.");
		} else {System.out.println("사각형이 겹칩니다.");
		
	}
}
}
