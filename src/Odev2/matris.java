package Odev2;

/**
*
* @author Yazar adı ve mail  abdullah hallak , abdullah.hallak70@gmail.com
* @since Programın yazıldığı tarih   20.08.2022
* <p>
*  iki adet static ve iki adet static olmayan fonksiyonları yazıdim.
* </p>
*/

import java.util.Scanner;

public class matris {

	
public static void main(String[] args) {
	int size;
	matrisYazdirma yazdir=new matrisYazdirma();
	ParalelThreadOlustur matris = new ParalelThreadOlustur();
	MatrisOlusturucu matrisOlustur = new MatrisOlusturucu();
	
	System.out.println("Matrisin boyutu giriniz..");
	try (Scanner sc = new  Scanner(System.in)) {
		size=sc.nextInt();
	} 
	
	long[][] matris1= matrisOlustur.matrisOlustur(size, size);
	long[][] matris2= matrisOlustur.matrisOlustur(size, 1);
	long sonuc[][]=new long[size][1];
	matris.carp(matris1, matris2, sonuc);
	System.out.println("Birinci Matris: ");
	yazdir.matrisYazdir(matris1);
	System.out.println("Ikinci Matris: ");
	yazdir.matrisYazdir(matris2);
	System.out.println("Sonuc: ");
	yazdir.matrisYazdir(sonuc);
	  

}
}
