public class BucleFor {
  public static void main(String[] args) {
  double x;
  
  System.out.print("Introduce el numero de repeticiones: ");
  x = Double.parseDouble(System.console().readLine());
  
  for (int i=1; i<=x; i++) {
    System.out.println("Hola "+i);
  }
  
  }
}
