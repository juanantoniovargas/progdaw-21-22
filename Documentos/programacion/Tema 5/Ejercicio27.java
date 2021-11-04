public class Ejercicio27 {
  public static void main(String[] args) {
  int num, contador=0, suma=0;
  
  System.out.print("Introduce un número: ");
  num = Integer.parseInt(System.console().readLine());
  
  for (int i=0; i<num; i=i+3) {
    contador++;
    if (i!=0) {
      System.out.println(i);
    }
    suma = suma + i;
  }
  contador--;
  System.out.println("Total de múltipos: "+contador);
  System.out.println("Suma de todos los múltipos: "+suma);
  
  }
}
