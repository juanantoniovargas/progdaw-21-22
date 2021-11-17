public class Ejercicio4 {
  public static void main(String[] args) {
  int[] num = new int[20];
  int[] cuadrado = new int[20];
  int[] cubo = new int[20];
  
  for (int i=0; i<20; i++) {
    num[i] = (int)(Math.random() * 101);
    cuadrado[i] = num[i]*num[i];
    cubo[i] = num[i]*num[i]*num[i];
  }
  
  for (int i=0; i<20; i++) {
    System.out.printf("%-10s %-10s %-10s", num[i], cuadrado[i], cubo[i]);
    System.out.println();
  }
  
  }
}
