package Odev2;

public class MatrisOlusturucu {

	
	long[][] matrisOlustur( int m,int n ) 
	{ 
		long [][] matris= new long [m][n];
		int c =0;
		 for(int i =0 ; i<matris.length;i++) {
				for(int j =0 ; j<matris[0].length;j++) {
					matris[i][j]=i+j+c;	
				}
				c=c+(matris[0].length)-1;
			}
		 return matris;
	}
}
