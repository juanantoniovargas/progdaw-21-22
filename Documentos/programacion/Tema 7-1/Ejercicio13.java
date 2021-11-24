public class Ejercicio13 {
  public static void main(String[] args) {
  int[] num = new int[100];
  
  System.out.println("Generando 100 enteros aleatorios entre 0 y 500:");
  
  for (int i=0; i<100; i++) {
    System.out.print((num[i]=(int)(Math.random()*501))+" ");
  }
  
  int card;
  
  do {
    System.out.print("\n¿Qué quiere destacar? (1 – mínimo, 2 – máximo): ");
    card = Integer.parseInt(System.console().readLine());
  } while ((card!=1) && (card!=2));
  
  int destacar=250;
  
  if (card==1) {
    for (int i=0; i<100; i++) {
      if (num[i] < destacar) {
        destacar = num[i];
      }
    }
  } else {
    for (int i=0; i<100; i++) {
      if (num[i] > destacar) {
        destacar = num[i];
      }
    }
  }
  
  for (int i=0; i<100; i++) {
      if (num[i]==destacar) {
        System.out.print("**"+num[i]+"** ");
      } else {
        System.out.print(num[i]+" ");
      }
    }
  
  }
}
