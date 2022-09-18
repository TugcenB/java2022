package miniProjects;

public class SesliHarfler {

	public static void main(String[] args) {
		char harf='ö';
		
		char[] sesli = new char[]{'A','O','I','U','E','İ','Ö','Ü','a','o','ı','u','e','i','ü','ö'};
		int i=0;
		for (char temp : sesli) {
			if (temp==harf) {
				System.out.println("Sesli harf");
				return;
			}
			i++;
		}
		if (i==16) {
			System.out.println("Sessiz harf");
		}

	}

}
