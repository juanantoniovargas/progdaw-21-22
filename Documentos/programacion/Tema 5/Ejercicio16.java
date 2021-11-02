public class Ejercicio16 {
  public static void main(String[] args) {
  int num;
  
  System.out.print("Introduce un numero: ");
  num = Integer.parseInt(System.console().readLine());
  
  if (!(num%2 == 0) && !(num%3 == 0) && !(num%5 == 0)){
    System.out.println(num+" Es un numero primo");
  } else {
    System.out.println(num+" No es un numero primo");
  }
  
  }
}
