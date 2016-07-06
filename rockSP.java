package openChallenge;

import java.util.Scanner;

public class rockSP {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		// 철수와 영희의 패를 입력 받는다.
		System.out.println("가위 바위 보 게임입니다. 가위, 바위, 보 중에서 입력하세요 ");
		System.out.println("철수  >> ");
		String soo = scanner.next();
		System.out.println("영희  >> ");
		String hee = scanner.next();
		
		//비기는 경우
		
		if(soo.equals(hee)){
			System.out.println("비겼습니다.");
		}
		
		
		if (soo.equals("바위")){
			String a = (hee.equals("가위"))? winSoo() : winHee() ;
			System.out.println(a);
		}
		
		if (soo.equals("가위")){
			String a = (hee.equals("바위"))? winHee() : winSoo();
			System.out.println(a);
		}
		
		if (soo.equals("보")){
			String a = (hee.equals("바위"))? winSoo() : winHee() ;
			System.out.println(a);
		}
		
		
		
	}
	// 철수가 이기는 메소드
	public static String winSoo (){
		return "철수가 이겼습니다.";
	}
	// 영희가 이기는 메소드	
	public static String winHee (){
		return "영희가 이겼습니다.";
	}
	
}
