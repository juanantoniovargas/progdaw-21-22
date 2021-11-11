/* Ej: num = 5          Ej: num = 9
 * 3 3 3 3 3            5 5 5 5 5 5 5 5 5
 * 3 2 2 2 3            5 4 4 4 4 4 4 4 5
 * 3 2 1 2 3            5 4 3 3 3 3 3 4 5
 * 3 2 2 2 3            5 4 3 2 2 2 3 4 5
 * 3 3 3 3 3            5 4 3 2 1 2 3 4 5
 *                      5 4 3 2 2 2 3 4 5
 *                      5 4 3 3 3 3 3 4 5
 *                      5 4 4 4 4 4 4 4 5
 *                      5 5 5 5 5 5 5 5 5
 */

public class AnilloNumerico {
  public static void main(String[] args) {
  int num;
  
  do {
  System.out.print("Introduce un numero impar: ");
  num = Integer.parseInt(System.console().readLine());
  if (num%2==0){
    System.out.println("Numero incorrecto.");
  } 
  } while (num%2==0);
  
  int pintar=(num/2)+1;
  int cont1=0;
  int cont2=num-1;
  
  for (int i=0; i<num; i++) {
    for (int j=0; j<num; j++) {
      if (pintar<10) {
      System.out.print(pintar+" ");
      } else {
          System.out.print(pintar);
        }
        if (j<cont1) {
          pintar--;
        } else if (j>=cont2) {
          pintar++;
        }
    }
    pintar=(num/2)+1;
    if (i<num/2) {
      cont1++;
      cont2--;
    } else {
      cont1--;
      cont2++;
    }
    System.out.println();
  }
  
  }
}
