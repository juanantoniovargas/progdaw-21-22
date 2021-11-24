public class Ejercicio12 {
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
  
  int inicial, fin;
  
  do {
    System.out.print("\nIndica la posición inicial: ");
    inicial = Integer.parseInt(System.console().readLine());
    System.out.print("Indica la posición final: ");
    fin = Integer.parseInt(System.console().readLine());
    if (inicial>fin) {
      System.out.println("La posición inicial ha de ser menor que la final.");
    }
    if ((inicial>9) || (inicial<0) || (fin>9) || (fin<0)) {
      System.out.println("La posición inicial y final han de estar entre 0 y 9.");
    }
  } while ((inicial>fin) || (inicial>9) || (inicial<0) || (fin>9) || (fin<0));
  
  System.out.println("Nueva tabla: ");
  
  for (int i=0; i<10; i++) {
    System.out.printf("%-4s", i);
  }
  
  System.out.println();
  
  int aux=num[9];
  
  for (int i=9; i>fin; i--) {
    num[i]=num[i-1];
  }
  
  int aux2=num[inicial];
  num[inicial] = num[fin];
  num[fin]=aux2;
  
  for (int i=inicial; i>0; i--) {
    num[i]=num[i-1];
  }
  
  num[0]=aux;
  
  for (int i=0; i<10; i++) {
    System.out.printf("%-4s", num[i]);
  }
  
  }
}
