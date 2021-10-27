public class Ejercicio19 {
  public static void main(String[] args) {
  int altura, espacios, caracteres=1;
  String caracter;
  
  System.out.print("Introduce la altura de la pirámide: ");
  altura = Integer.parseInt(System.console().readLine());
  System.out.print("Introduce un carácter con el que pintarla: ");
  caracter = (System.console().readLine());
  espacios=altura;
  
  for (int j=0; j<altura; j++) {
    for (int i=0; i<espacios; i++) {
      System.out.print(" ");
    }
    espacios--;
    for (int k=0; k<caracteres; k++) {
      System.out.print(caracter);
    }
    caracteres = caracteres + 2;
    System.out.println();
  }
  
  }
}
