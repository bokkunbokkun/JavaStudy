package silsup;

import java.util.Scanner;

public class munjae3 {
	
	public static void main(String[] args) {
		System.out.println("얼마를 출금하시겠습니까? >> ");
		Scanner scanner = new Scanner(System.in); //총 금액 입력 받기
		int money = scanner.nextInt();
		int fifThousand = money/50000; //가장 큰 단위부터 나눈 몫을 해당 단위에 저장하고, 나머지는 money에 저장.
		money %= 50000;
		int tenThousand = money/10000;  
		money %= 10000;
		int fiveThousand = money/5000;  
		money %= 5000;
		int oneThousand = money/1000;  
		money %= 1000;
		int fivehund = money/500;  
		money %= 500;
		int onehund = money/100;  
		money %= 100;
		int fifty = money/50;  
		money %= 50;
		int ten = money/10;  
		int one = money%10;
		
		
		System.out.println("오만 원권 : "+fifThousand+", 일만 원권 : "+tenThousand+ 
				", 오천 원권 : "+fiveThousand+", 천 원권 : "+oneThousand+
				", 오백 원권 : "+fivehund+", 백 원권 : "+onehund+
				", 오십 원권 : "+fifty+", 십 원권 : "+ten+", 일 원권 : "+one);
}

}
