public class CuentaPositivos2 {
  public static void main(String[] args) {
  
  System.out.println("Introduce numeros:");
  System.out.println("Para terminar, introduce un numero negativo.");
  
  int numintro=0;
  int cuentanum=0;
  int suma=0;
  
  while (numintro >=0) {
    numintro = Integer.parseInt(System.console().readLine());
    cuentanum++;
    suma += numintro;
  } 
  
  System.out.println("Has introducido "+ (cuentanum-1)+" numeros positivos.");
  System.out.println("La suma total de ellos es "+(suma-numintro));
  
  }
}
