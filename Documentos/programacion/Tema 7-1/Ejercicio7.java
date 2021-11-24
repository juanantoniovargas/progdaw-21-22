public class Ejercicio7 {
  public static void main(String[] args) {
  int[] num = new int[100];
  
  System.out.println("Generando 100 numeros aleatorios del 0 al 20:");
  
  for (int i=0; i<100; i++) {
    System.out.print((num[i]=(int)(Math.random()*21))+" ");
  }
  
  System.out.println();
  System.out.println("Introduce dos valores:");
  int valor1 = Integer.parseInt(System.console().readLine());
  int valor2 = Integer.parseInt(System.console().readLine());
  
  for (int i=0; i<100; i++) {
    if (num[i]!=valor1) {
      System.out.print((num[i])+" ");
    } else {
      System.out.print("'"+ valor2 + "' ");
    }
  }
  
  }
}
