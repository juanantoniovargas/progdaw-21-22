public class Ejercicio13 {
  public static void main(String[] args) {
  int x, pos=0, neg=0;
  
  System.out.println("Introduce 10 números:");
  
  for (int i=0; i<10; i++) {
    x = Integer.parseInt(System.console().readLine());
    if (x>=0) {
      pos = pos + 1;
    } else {
        neg = neg +1;
      }
  }
  
  System.out.println("Números positivos: "+pos);
  System.out.println("Números negativos: "+neg);
  
  }
}
