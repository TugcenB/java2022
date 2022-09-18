package intro;

public class SwitchDemo {

	public static void main(String[] args) {
		char grade = 'C';
		
		switch (grade) {
		case 'A': 
			System.out.println("Müko");
			break;
		case 'B' :
			System.out.println("Çok iyi");
			break;
		case 'C' :
			System.out.println("Ağlama geçtin");
			break;
		case 'D' :
			System.out.println("Error!");
			break;
		case 'F' :
			System.out.println("Geçemedinnn");
			break;
			default:
				System.out.println("Öyle bi not yok");

		}

	}

}
