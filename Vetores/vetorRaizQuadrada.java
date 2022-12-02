package teste;
import java.util.*;
import java.lang.Math;
public class Vetor {
	public static void main(String args[])
	   { 
	     Scanner in = new Scanner(System.in);
	    
	     double[] vetorA = new double[11], vetorB = new double[11];
	    
	     for(int i=1; i<=10; i++)
	     {
	       System.out.println("Digite o valor do "+i+"º elemento");
	       vetorA[i] = in.nextInt();
	       vetorB[i] = Math.sqrt(vetorA[i]);
	     }
	    
	     for(int a=1; a<=10; a++)
	     {
	       System.out.println(a+"º valor do vetor A: "+vetorA[a]);
	     }
	    
	     for(int b=1; b<=10; b++)
	     {
	       System.out.println("Raiz do "+ b +"º valor do vetor A: "+vetorB[b]);
	     }  
	   }
	 }