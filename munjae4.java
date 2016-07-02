package silsup;

import java.util.Scanner;

public class munjae4 {
	
	public static void main (String args[]){
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("1~99 사이의 정수를 입력하시오>>");
		int num = scanner.nextInt();//정수를 입력 받는다.
		
		int num1 = num/10; //입력받은수의 10의 자리 숫자
		int num2 = num%10; //입력받은수의 1의 자리 숫자
		
		if ((num1%3 == 0) ^ (num2%3 == 0)){
			System.out.println("박수짝");//십의 자리나 일의 자리 중 하나가 3의 배수일 경우
		} else if((num1%3 == 0) && (num2%3 == 0)){
			System.out.println("박수짝짝");//십의 자리나 일의 자리 둘다 3의 배수일 경우
		}
}
}
