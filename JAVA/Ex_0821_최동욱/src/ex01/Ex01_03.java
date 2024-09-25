package ex01;

import java.util.Random;

// 동전의 개수 구하기

public class Ex01_03 {
	 public static void main(String[] args) {
	        Random random = new Random();
	        
	        int money = 10 * (random.nextInt(500) + 1);

	        System.out.println("가지고 있는 돈 : " + money + "원");
	        
	        int[] coins = {500, 100, 50, 10};
	        int[] counts = new int[coins.length];
	        
	        for (int i = 0; i < coins.length; i++) {
	            counts[i] = money / coins[i];
	            money %= coins[i];
	        }
	        

	        for (int i = 0; i < coins.length; i++) {
	                System.out.println(coins[i] + "원 : " + counts[i] + "개");
	        }
	        


	        
	 }
}

