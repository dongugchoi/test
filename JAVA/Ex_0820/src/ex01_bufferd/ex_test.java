package ex01_bufferd;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// -> 묶어서 import java.io.*; 


public class ex_test {
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.print("개수 입력 : ");
		int n  = Integer.parseInt(br.readLine());
		
		System.out.print("숫자 입력 : ");
		String str = br.readLine();
		int sum = 0;
		for(int i =0; i<n; i++) {
			sum += str.charAt(i) - '0';
			
		}
		System.out.println("숫자의 합 :" + sum);
		br.close();
	}
    		
    	
    
}
