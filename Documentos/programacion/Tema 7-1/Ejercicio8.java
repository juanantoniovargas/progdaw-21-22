public class Ejercicio8 {
  public static void main(String[] args) {
  int[] temp = new int[12];
  
  System.out.println("Introduce la tº media de cada mes del año:");
  
  for (int i=0; i<12; i++) {
    temp[i] = Integer.parseInt(System.console().readLine());
  }
  
  System.out.println("Diagrama:");
  
  for (int i=0; i<12; i++) {
    for (int j=0; j<temp[i]; j++) {
      System.out.print("*");
    }
    System.out.println();
  }
  
  }
}
