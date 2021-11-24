public class Ejercicio17 {
  public static void main(String[] args) {
  int[] num = new int[10];
  
  for (int i=0; i<10; i++) {
    num[i] = (int)(Math.random()*101);
    System.out.print(num[i]+" ");
  }
  
  int numintro;
  boolean esta = false;
  
  do {
    System.out.print("\nEscoge un número: ");
    numintro = Integer.parseInt(System.console().readLine());
    for (int i=0; i<10; i++) {
      if (num[i]==numintro) {
        esta = true;
      } 
    }
    if (!(esta)) {
      System.out.println("Número incorrecto.");
    }
  } while (!(esta));
  
  System.out.println("Rotando el array hasta que el número introducido sea el primero:");
  
  int aux;
  
  do {
    aux=num[9];
    for (int i=9; i>=1; i--) {
      num[i]=num[i-1];
    }
    num[0]=aux;
  } while (numintro!=num[0]); 
  
  for (int i=0; i<10; i++) {
    System.out.print(num[i]+" ");
  }
  
  }
}
