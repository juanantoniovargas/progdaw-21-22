public class PiramideNumeros {
  public static void main(String[] args) {
  int altura, relleno=1;
  
  System.out.print("Introduce la altura: ");
  altura = Integer.parseInt(System.console().readLine());
  
  if ((altura<3) || (altura%2==0)) {
    System.out.print("Número incorrecto, ha de ser impar y mayor que tres.");
  } else {
    for (int i=0; i<altura; i++) {
      for (int j=1; j<=relleno; j++) {
        if (j<9) {
          System.out.print(j);
        } else {
          System.out.print(j%10);
        }
      }
      if (i<altura/2) {
        relleno++;
      } else {
        relleno--;
      }
      System.out.println();
    }
  }
  
  }
}
