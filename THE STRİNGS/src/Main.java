


import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("iþlem ");
		Scanner sc=new Scanner (System.in);
		
		System.out.println("ifade:  ");
		String ifade =sc.nextLine();
		
		if(ifade.contains("topla")) {
			Islem(ifade,1);
			
		}
		else if(ifade.contains("çýkar")) {
			Islem(ifade,2);
		}
		else if(ifade.contains("çarp")) {
			Islem(ifade,3);
		}
		else if(ifade.contains("böl")) {
			Islem(ifade,4);
		}else {
			System.out.println("iþlem ifadesi bulunmamaktadýr");
		}
		
	}//main

	
	public static void Islem(String ifade, int islem) {
		int s1=0;
		int s2=0;
		boolean flag=false;
		
		for(int i=0;i<ifade.length();i++) {
			char character=ifade.charAt(i);
			if(character>47 && character<58) {
				if(!flag) {
					s1=Integer.parseInt(character+"");
					flag=true;
				}else {
					s2=Integer.parseInt(character+"");
				}
			}
		}
		
		switch(islem) {
		case 1: System.out.println("total: " + (s1+s2)); break;
		case 2: System.out.println("fark : " + (s1-s2)); break;
		case 3: System.out.println("çarpma: " + (s1*s2));break;
		case 4: System.out.println("bölme: " + (s1/s2)); break;
		}
		
		
	}//method<
	

}// class
