public class Ejercicio7 {
  public static void main(String[] args) {
  
  System.out.println("Quiniela: ");
  
  for (int i=0; i<15; i++) {
    for (int j=0; j<3; j++) {
      int result = (int)(Math.random()*3);
      switch (result) {
        case 0:
        System.out.print("1 ");
        break;
        case 1:
        System.out.print("2 ");
        break;
        case 2:
        System.out.print("x ");
        break;
        default:
      }
    }
    System.out.println();
  }
  
  }
}
