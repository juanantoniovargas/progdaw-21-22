public class Ejercicio5 {
  public static void main(String[] args) {
  int[] num = new int[10];
  int mayor=0, menor=1000;
  
  System.out.println("Introduce 10 números:");
  
  for (int i=0; i<10; i++) {
    num[i] = Integer.parseInt(System.console().readLine());
    if (mayor<num[i]) {
      mayor = num[i];
    } else if (menor>num[i]) {
      menor = num[i];
    }
  }
  
  for (int i=0; i<10; i++) {
    if (mayor==num[i]) {
      System.out.print(num[i] + " <- máximo ");
    } else if (menor==num[i]) {
      System.out.print(num[i] + " <- mínimo ");
    } else {
      System.out.print(num[i] + " ");
    }
  }
  
  }
}
