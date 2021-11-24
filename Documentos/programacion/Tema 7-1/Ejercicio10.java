public class Ejercicio10 {
  public static void main(String[] args) {
  int[] num = new int[20];
  
  System.out.println("Generando 20 numeros aleatorios del 0 al 100:");
  
  for (int i=0; i<20; i++) {
    System.out.println(num[i]=(int)(Math.random()*101));
  }
  
  System.out.println("Números ordenados (pares al principio, impares al final):");
  
  for (int i=0; i<20; i++) {
    if (num[i]%2==0) {
      System.out.print(num[i]+" ");
    }
  }
  
  for (int i=0; i<20; i++) {
    if (num[i]%2!=0) {
      System.out.print(num[i]+" ");
    }
  }
  
  }
}
