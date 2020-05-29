/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicioprogramacion;

import java.io.IOException;
import java.util.Scanner;

/**
 *
 * @author Nucks
 */
public class Vectores {
    
    public static void main(String[] args) throws IOException {
	Scanner key = new Scanner(System.in);
	
	int cont=0;
	int a1=0,a2=0,a3=0,a4=0,a5=0;	
		char a;
		char n1 = 0;
		char k = 0;
		char max=0,min=0;
	
		char z []=new char [] {'A','B','C','D','E'};
		
	
	
	
		int i=1;
			
	while (n1!='#') {
		
		
	System.out.println();
	System.out.print("Introduce la calificacion energetica de la vivienda (en mausculas) "+i+": ");
	n1=(char) System.in.read();
	key.nextLine();
	
	

		
	if ( n1==z[4]) {
		System.out.println("Esta vivienda pertenece a la "+z[4]+"");
		cont++;
		a5++;
		i++;
    }
	
	
	if (n1==z[0]) {
		System.out.println("Esta vivienda pertenece a la "+z[0]+"");
		cont++;
		a1++;
		i++;
    }
	
	if (n1==z[1]) {
		System.out.println("Esta vivienda pertenece a la "+z[1]+"");
		cont++;
		a2++;
		i++;
    }
	
	if (n1==z[2]) {
		System.out.println("Esta vivienda pertenece a la "+z[2]+"");
		cont++;
		a3++;
		i++;
    }
	
	if (n1==z[3]) {
		System.out.println("Esta vivienda pertenece a la "+z[3]+"");
		cont++;
		a4++;
		i++;
	
}
	if(n1=='#') {
		
		System.out.println("FIN");
		System.out.print("Redireccionando al metodo de calculos: ");
		
		int contresult=cont+1;
		System.out.println();
		System.out.println();
		System.out.println("Se han visitado "+contresult+" viviendas, de las cuales "+a1+" pertenecen a la Categoria A, "+a2+" pertenecen a la Categoria B, "+a3+" pertenecen a la Categoria C, "+a4+" pertenecen a la Categoria D y "+a5+" pertenecen a la Categoria E");
		
		
		if (a1>0) {
			max=z[0];
			}
			if (a1>0&&a2==0&&a3==0&&a4==0&&a5==0) {
			min=z[0];
			}
			if (a2>0&&a1==0) {
			max=z[1];
			}
			if (a2>0&&a3==0&&a4==0&&a5==0) {
			min=z[1];
			}
			if (a3>0&&a1==0&&a2==0) {
			max=z[2];
			}
			if (a3>0&&a4==0&&a5==0) {
			min=z[2];
			}
			if (a4>0&&a1==0&&a2==0&&a3==0) {
			max=z[3];
			}
			if (a4>0&&a5==0) {
			min=z[3];
			}
			if (a5>0&&a1==0&&a2==0&&a3==0&&a4==0) {
			max=z[4];
			}
			if (a5>0) {
			min=z[4];
			}


			
			
			System.out.println("La categoria maxima es "+max+" y la categoria minima es "+min+"");
			
			
		
		 a1=0;
		 a2=0;
		 a3=0;
		 a4=0;
		 a5=0;	
		 max=0;
		 min=0;
		 
		System.out.print("¿Quiere volver a introducir datos?, introduzca una letra o numero para continuar y # para salir  ");
		n1=(char) System.in.read();
		key.nextLine();
		
	
	}

	}
	
   }
	}
	


    

