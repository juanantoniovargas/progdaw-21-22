public class Ejercicio8 {
  public static void main(String[] args) {
  
  System.out.println("Quiniela trucada: ");
  
  for (int i=0; i<15; i++) {
    for (int j=0; j<3; j++) {
      int result = (int)(Math.random()*6);
      switch (result) {
        case 0:
        case 1:
        case 2:
        System.out.print("1 ");
        break;
        case 3:
        case 4:
        System.out.print("x ");
        break;
        case 5:
        System.out.print("2 ");
        break;
        default:
      }
    }
    System.out.println();
  }
  
  }
}
