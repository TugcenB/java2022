package intro;

public class ReCapDemo2 {

	public static void main(String[] args) {
		double[] myList = {1.2,8.5,3.6,4.8,5,6};
		double total = 0;
		double max = myList[0];
		
		for(double number : myList)
		{
			if (max<number) {
				max =number;
			}
			total += number;
			
		}
		System.out.println("Toplam : "+total);
		System.out.println("Listedeki en büyük sayı :"+max);
		

	}

}
