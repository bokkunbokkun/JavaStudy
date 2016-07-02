package silsup;

import java.util.Scanner;

public class munjae6 {
	public static void main(String[] args) {
		System.out.println("몇 년도 입니까? >>");
		Scanner a = new Scanner(System.in);
		int year = a.nextInt();
		if (year%400==0){
			System.out.println("윤년입니다.");
		} else if (year%100==0){
			System.out.println("평년입니다.");
		} else if (year%4==0){
			System.out.println("윤년입니다.");
		} else{
			System.out.println("평년입니다.");
		}
	}
}
