public class Ejercicio18 {
  public static void main(String[] args) {
  int x;
  int cifra = 0;
  
  System.out.print("Introduce un número: ");
  x = Integer.parseInt (System.console().readLine());
  
  if (x<10) {
    cifra = x;
  }
  if ((x>=10) && (x<100)) {
    cifra = x/10;
  }
  if ((x>=100) && (x<1000)) {
    cifra = x/100;
  }
  if ((x>=1000) && (x<10000)) {
    cifra = x/1000;
  }
  if ((x>=10000) && (x<100000)) {
    cifra = x/10000;
  }
  
  System.out.print("La primera cifra introducida fue: "+cifra);
  
  }
}
