/*
 *   *    *               
 *   **   *    * *    *  *
 *   * *  *    ***    ** *
 *   *  * *    * *    * **
 *   *   **           *  *
 *   *    *               
 */
public class DibujoN {
  public static void main(String[] args) {
  int altura, espacios=-1, espacios2;
  
  do {
  System.out.print("Introduce la altura de la N: ");
  altura = Integer.parseInt(System.console().readLine());
  if (altura<3) {
    System.out.println("Valor incorrecto, ha de ser >3.");
  }
  } while (altura<3); 
  
  espacios2=altura-2;
  
  for (int i=0; i<altura; i++) {
    System.out.print("*");
    for (int j=0; j<espacios; j++) {
      System.out.print(" ");
    }
    if (!((i==0) || (i==altura-1))) {
      System.out.print("*");
    }
    espacios++;
    for (int j=0; j<espacios2; j++) {
      System.out.print(" ");
    }
    espacios2--;
    System.out.print("*");
    System.out.println();
  }
  
  }
}
