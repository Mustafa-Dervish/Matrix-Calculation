/**
*
* @authorMUSTAFA DERVİŞ mustafa.dervis@ogr.sakarya.edu.tr

* @since 20/08/2022
* <p>
* MUSTAFA DERVİŞ B201210593 mustafa.dervis@ogr.sakarya.edu.tr
  MAHMOUD ALABDOLLA B201210594 mahmoud.alabdolla@ogr.sakarya.edu.tr
  ABDULLAH HALLAK B20121060   abdullah.hallak@ogr.sakarya.edu.tr
* </p>
*/

package Odev2;

public class Threads extends Thread{
	
	long[][] matris1;
	long[][] matris2;
	long[][] sonuc;
	int satir;
	
	Threads(long[][] matris1,long[][] matris2,long[][] sonuc,int satir){
		this.matris1=matris1;
		this.matris2=matris2;
		this.sonuc=sonuc;
		this.satir=satir;
	}
	

	@Override
	public void run() {
		    
		 sonuc[satir][0]=0;      
		 	for(int k=0;k<matris1.length;k++)      
		 	{      
		 		sonuc[satir][0]+=matris1[satir][k]*matris2[k][0];      
		 	}
		 
	}
	
	
}
