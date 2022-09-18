package miniProjects;

import java.util.Iterator;

public class MukemmelSayi {

	public static void main(String[] args) {
		//6 -->1,2,3
		//28 --> 1,2,7,14
		
		int number = 24;
		
		int total = 0;
		for(int i = 1;i<number;i++) {
			if(number%i == 0) {
				total += i;
			}
		}
		
		if(number == total) {
			System.out.println("Sayı mükemmeldir.");
		}
		else {
			System.out.println("Sayı mükemmel değildir.");
		}

	}

}
