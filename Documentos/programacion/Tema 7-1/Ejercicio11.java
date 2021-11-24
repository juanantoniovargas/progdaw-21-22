public class Ejercicio11 {
  public static void main(String[] args) {
  int[] num = new int[10];
  
  System.out.println("Introduce 10 enteros:");
  
  for (int i=0; i<10; i++) {
    num[i] = Integer.parseInt(System.console().readLine());
  }
  
  System.out.println("Tabla:");
  
  for (int i=0; i<10; i++) {
    System.out.printf("%-4s", i);
  }
  
  System.out.println();
  
  for (int i=0; i<10; i++) {
    System.out.printf("%-4s", num[i]);
  }
  
  System.out.println("\nOrdenando la tabla para poner los primos al principio:");
  
  for (int i=0; i<10; i++) {
    System.out.printf("%-4s", i);
  }
  
  System.out.println();
  
  for (int i=0; i<10; i++) {
    boolean primo = true;
    for (int j=2; j<num[i]; j++) {
      if (num[i]%j==0){
        primo = false;
      }
    }
    if (primo) {
      System.out.printf("%-4s", num[i]);
    }
  }
  
  for (int i=0; i<10; i++) {
    boolean primo = true;
    for (int j=2; j<num[i]; j++) {
      if (num[i]%j==0){
        primo = false;
      }
    }
    if (primo) {
    } else {
      System.out.printf("%-4s", num[i]);
    }
  }
  
  }
}
