package Odev2;

public class matrisYazdirma {
	long[][] matris;

	void matrisYazdir(long[][] matris) {
		
		this.matris=matris;
		 for (int i = 0; i < matris.length; i++) 
		    { 
		        for (int j = 0; j < matris[0].length; j++) 
		        {
		        	
		            System.out.print(matris[i][j] + " ");
		        }
		        System.out.println(); 
		    }	
	}
}
