public class Ejercicio3 {
  public static void main(String[] args) {
  
  System.out.println("Mostrando aleatoriamente una carta de la baraja española:");
  
  int numero = (int)(Math.random()*10) +1;
  
  switch (numero) {
    case 1:
    System.out.print("as");
    break;
    case 8:
    System.out.print("sota");
    break;
    case 9:
    System.out.print("caballo");
    break;
    case 10:
    System.out.print("rey");
    break;
    default:
    System.out.print(numero);
  }
  
  int carta = (int)(Math.random()*4);
  
  switch (carta) {
    case 0:
    System.out.print(" de oros");
    break;
    case 1:
    System.out.print(" de espadas");
    break;
    case 2:
    System.out.print(" de bastos");
    break;
    case 3:
    System.out.print(" de copas");
    break;
    default:
  }
  
  }
}
