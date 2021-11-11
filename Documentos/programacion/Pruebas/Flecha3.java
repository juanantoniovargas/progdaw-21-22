/*
 *    *                  *   
 *   ***       *        ***     
 *  *****     ***      *****        
 *   ***       *      *******       
 *   ***       *       *****     
 *   ***       *       *****      
 *                     *****     
 */

public class Flecha3 {
  public static void main(String[] args) {
  int ancho, alto, espacios, relleno;
  
  System.out.print("Introduce el alto de la flecha: ");
  alto = Integer.parseInt(System.console().readLine());
  do {
  System.out.print("Introduce el ancho de la flecha: ");
  ancho = Integer.parseInt(System.console().readLine());
  if ((ancho<3) || (ancho%2==0)) {
    System.out.println("El ancho ha de ser impar y mayor que 3.");
  }
  } while ((ancho<3) || (ancho%2==0));
  
  espacios = ancho/2;
  relleno=1;
  
  for (int i=0; i<ancho/2+1; i++) {
    for (int j=0; j<espacios; j++) {
      System.out.print(" ");
    }
    espacios--;
    for (int j=0; j<relleno; j++) {
      System.out.print("*");
    }
    relleno = relleno + 2;
    System.out.println();
  }
  
  for (int i=0; i<alto-(ancho/2+1); i++) {
    System.out.print(" ");
    for (int j=0; j<relleno-4; j++) {
      System.out.print("*");
    }
    System.out.println();
  }
  
  }
}
