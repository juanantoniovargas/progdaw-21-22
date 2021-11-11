/*
 *   ******               
 *       *     ***    ****
 *      *       *       * 
 *     *       ***     *  
 *    *               ****
 *   ******              
 */
public class DibujoZ {
  public static void main(String[] args) {
  int altura, espacios, relleno;
  
  do {
  System.out.print("Introduce la altura de la Z: ");
  altura = Integer.parseInt(System.console().readLine());
  if (altura<3) {
    System.out.println("Valor incorrecto, ha de ser >3.");
  }
  } while (altura<3); 
  
  espacios=altura-2;
  relleno=altura;
  
  for (int i=0; i<altura; i++) {
    if ((i==0) || (i==altura-1)) {
      for (int j=0; j<relleno; j++) {
        System.out.print("*");
      }
      System.out.println();
    }
    for (int j=0; j<espacios; j++) {
      System.out.print(" ");
    }
    espacios--;
    if (i<altura-2) {
      System.out.print("*");
      System.out.println();
    }
  }
  
  }
}
