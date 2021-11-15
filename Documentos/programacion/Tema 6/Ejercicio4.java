public class Ejercicio4 {
  public static void main(String[] args) {
  
  System.out.println("Mostrando 20 números enteros aleatorios entre 0 y 10 (ambos incluidos): ");
  
  for (int i=0; i<20; i++) {
    System.out.print((int)(Math.random()*11)+"  ");
  }
  
  }
}
