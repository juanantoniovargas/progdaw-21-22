/*
 *                        *
 *   *                   *********
 *  ******     *        **********
 * *******    ******   ***********
 *  ******     *        **********
 *   *                   *********
 *                        *
 */

public class Flecha2 {
  public static void main(String[] args) {
  int ancho, alto, relleno, espacios;
  
  System.out.print("Introduce el ancho de la flecha: ");
  ancho = Integer.parseInt(System.console().readLine());
  System.out.print("Introduce el alto de la flecha: ");
  alto = Integer.parseInt(System.console().readLine());
  
  while ((alto%2==0) || (alto<3)) {
      System.out.println("Numero incorrecto, ha de introducir una altura impar y mayor que 3.");
      System.out.print("Introduce el alto de la flecha: ");
      alto = Integer.parseInt(System.console().readLine());
    }
  
  relleno = ancho-(alto/2+1);
  espacios = alto/2;
  
  for (int i=0; i<alto; i++) {
    for (int j=0; j<espacios; j++) {
      System.out.print(" ");
    }
    System.out.print("*");
    if (!((i==alto-1) || (i==0))) {
      for (int j=0; j<relleno; j++) {
        System.out.print("*");
      } 
    }
    if (i<alto/2) {
      relleno++;
      espacios--;
    } else {
      relleno--;
      espacios++;
    }
    System.out.println();
  }
  
  }
}
