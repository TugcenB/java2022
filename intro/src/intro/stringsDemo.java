package intro;

import java.util.Iterator;

public class stringsDemo {

	public static void main(String[] args) {
		String mesaj = "  The weather is nice!   ";
		
//		System.out.println("Eleman sayısı"+mesaj.length());
//		System.out.println("5.th item"+mesaj.charAt(4));
//		System.out.println(mesaj.concat("Hey!"));
//		System.out.println(mesaj);
//		System.out.println(mesaj.startsWith("Hi!"));//bool 
//		System.out.println(mesaj.endsWith("!"));
//		char[] karakterler=new char[5];
//		mesaj.getChars(0, 5, karakterler, 0);
//		System.out.println(karakterler);
//		System.out.println(mesaj.indexOf('a'));
//		System.out.println(mesaj.lastIndexOf('e'));
		
		String yeniMesaj = mesaj.replace(' ', '-');
		System.out.println(yeniMesaj);
		System.out.println(mesaj.substring(2,5));
		
		for(String kelime :mesaj.split(" ")) 
		{
			System.out.println(kelime);
		}
		
		System.out.println(mesaj.toLowerCase());
		System.out.println(mesaj.toUpperCase());
		System.out.println(mesaj.trim());//baştaki sondaki boşlukları kapatır.
	}

}
