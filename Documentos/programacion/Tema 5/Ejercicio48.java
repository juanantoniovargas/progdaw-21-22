public class Ejercicio48 {
  public static void main(String[] args) {
  long num, numsuelto=0;
  
  System.out.print("Introduce un numero: ");
  num = Long.parseLong(System.console().readLine());
  
  boolean esta = false;
  
  for (int i=0; i<num; i++) {
      numsuelto = num%10;
    for (int j=0; j<10; j++) {
      if (numsuelto==j) {
        esta = true;
      } 
    }
    System.out.print(numsuelto+" ");
    num = num/10;
  }
  
  }
}
