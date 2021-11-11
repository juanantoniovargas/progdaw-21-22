public class Ejercicio19a {
  public static void main(String[] args) {
  int altura, espacios, caracteres;
  String caracter;
  
  System.out.print("Introduce la altura de la pirámide: ");
  altura = Integer.parseInt(System.console().readLine());
  System.out.print("Introduce un carácter con el que pintarla: ");
  caracter = (System.console().readLine());
  espacios=0;
  caracteres=altura;
  System.out.println();
  
  for (int i=0; i<altura; i++) {
    for (int j=0; j<espacios; j++) {
      System.out.print(" ");
    }
    espacios++;
    for (int j=0; j<caracteres; j++) {
      System.out.print(caracter+" ");
    }
    caracteres--;
    System.out.println();
  }
  
  }
}
