package ex01;

import java.util.Scanner;


//정수의 총합 구하기1

public class Ex01_01 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		
		System.out.print("정수를 입력해주세요 : ");
		int n = sc.nextInt();
		int sum = 0;
		for(int i = 1; i <= n; i++) {
			sum+=i;
		}
		
		System.out.println("1부터 " + n + "까지의 합은 " + sum);
		
	}
}
