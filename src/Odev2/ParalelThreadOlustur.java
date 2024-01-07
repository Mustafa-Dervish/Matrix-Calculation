package Odev2;

public class ParalelThreadOlustur{
	
	
	long[][] matris1;
	long[][] matris2;
	long[][] sonuc;
	
	
	void carp(long[][] matris1,long[][] matris2,long[][] sonuc) {
		int i=0;
		String name;
		this.matris1=matris1;
		this.matris2=matris2;
		this.sonuc=sonuc;
		Threads[] thread = new Threads[matris1.length];
		while(i!=matris1.length) {
			thread[i]= new Threads(matris1, matris2, sonuc, i);
			i++;
		}
		
		 
		for(i=0;i<matris1.length;i++) {
			thread[i].start();
		}
		
	}
}
