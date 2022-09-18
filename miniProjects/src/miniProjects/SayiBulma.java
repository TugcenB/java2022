package miniProjects;

public class SayiBulma {

	public static void main(String[] args) {
		int[] sayilar = new int[] {1,2,5,7,8,0};
		
	int aranacak =8;
	
	boolean varMı = false;
	
	for (int sayi : sayilar) {
		if (sayi==aranacak) {
			varMı = true;
			break;
		}
	}
	if (varMı) {
		System.out.println("Sayı mevcuttur");
	}
	else {
		System.out.println("sayı mevcut değildir");
	}

	}

}
