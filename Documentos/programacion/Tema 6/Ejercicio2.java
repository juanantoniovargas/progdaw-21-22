public class Ejercicio2 {
  public static void main(String[] args) {
  
  System.out.println("Mostrando aleatoriamente una carta de la baraja francesa:");
  
  int numero = (int)(Math.random()*13) +1;
  
  switch (numero) {
    case 1:
    System.out.print("A");
    break;
    case 11:
    System.out.print("J");
    break;
    case 12:
    System.out.print("Q");
    break;
    case 13:
    System.out.print("K");
    break;
    default:
    System.out.print(numero);
  }
  
  int carta = (int)(Math.random()*4);
  
  switch (carta) {
    case 0:
    System.out.print(" de picas");
    break;
    case 1:
    System.out.print(" de corazones");
    break;
    case 2:
    System.out.print(" de diamantes");
    break;
    case 3:
    System.out.print(" de tréboles");
    break;
    default:
  }
  
  }
}
