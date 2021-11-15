/* Ej: 9
 *         x
 *        x x
 *       x x x
 *      x x x x
 *     x x x x x
 *    c x x x x c
 *   c c x x x c c
 *  c c c x x c c c
 * c c c c x c c c c
 */

public class Piramide {
  public static void main(String[] args) {
  int altura, espacios, relleno=1;
  String caracter1, caracter2;
  
  do {
    System.out.print("Introduce la altura de la pirámide (ha de ser impar): ");
    altura = Integer.parseInt(System.console().readLine());
    if (altura%2==0) {
      System.out.println("Número incorrecto.");
    }
  } while (altura%2==0);
  System.out.print("Introduce el primer caracter con el que pintarla: ");
  caracter1 = System.console().readLine();
  System.out.print("Introduce el segundo caracter con el que pintarla: ");
  caracter2 = System.console().readLine();
  
  espacios = altura-1;
  int cont = -(altura/2);
  
  for (int i=0; i<altura; i++) {
    for (int j=0; j<espacios; j++) {
      System.out.print(" ");
    }
    for (int j=0; j<relleno; j++) {
      if (i<altura/2+1) {
        System.out.print(caracter1+" ");
      } else if ((j>altura/2) || (j<cont)) {
        System.out.print(caracter2+" ");
      } else {
        System.out.print(caracter1+" ");
      }
    }
    cont++;
    espacios--;
    relleno++;
    System.out.println();
  }
  
  }
}
