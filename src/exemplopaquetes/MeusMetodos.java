package exemplopaquetes;

import java.util.Scanner;

/**
 *
 * @author irodriguezsteuerberg
 */
public class MeusMetodos {

public float validarFloatPositivo(){
Scanner sc = new Scanner(System.in);    
float valor;
do {
 System.out.println("Introduce un numero");   
 valor = sc.nextFloat();
} while(valor<=0);
return valor;
}

public static float darValor(){
Scanner sc = new Scanner(System.in);    
float valor;
do {
 System.out.println("Introduce un numero");   
 valor = sc.nextFloat();
} while(valor<=0);
return valor;    
}





}
