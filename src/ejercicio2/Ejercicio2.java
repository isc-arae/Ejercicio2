package ejercicio2;

import java.util.Scanner;

/**
 *
 * @author isc_arae
 */
public class Ejercicio2 {

    int lado1, lado2, lado3, mayor = 0;
    String equilatero = "NO";
    
    public void inicializar()
    {
        Scanner leer = new Scanner(System.in);
        
	System.out.println("Ingrese el primer lado:");
	lado1 = leer.nextInt();

        System.out.println("Ingrese el segundo lado:");
	lado2 = leer.nextInt();

	System.out.println("Ingrese el tercer lado:");
	lado3 = leer.nextInt();
    }
    
    public void ladoMayor(){
        if(lado1 > mayor)
            mayor = lado1;
        if(lado2 > mayor)
            mayor = lado2;
        if(lado3 > mayor)
            mayor = lado3;
	
        if(lado1 == lado2 & lado2 == lado3)
	    System.out.println("No hay Lado Mayor ya que todos los Lados son Iguales a " + mayor);
        else	
            System.out.println("El Valor del Lado Mayor es: " + mayor);
    }
    
    //calcula si con los datos ingresados el triangulo es equilatero o no
    public void equilatero(){
         if(lado1 == lado2 & lado2 == lado3 & lado3 == lado1){
             equilatero = "SI";
         }
         System.out.println("El Triangulo " + equilatero + " es Equilatero");
    }
    
    public static void main(String[] args) {
        Ejercicio2 llamarMetodo = new Ejercicio2();
        llamarMetodo.inicializar();
        llamarMetodo.ladoMayor();
        llamarMetodo.equilatero();
    }
    
}
