public class Ejercicio10 {
  public static void main(String[] args) {
  int num, caracter;
  
  for (int i=0; i<10; i++) {
    num = (int)(Math.random()*40)+1;
    caracter = (int)(Math.random()*6);
    for (int j=0; j<num; j++) {
      switch (caracter) {
        case 0:
        System.out.print("*");
        break;
        case 1:
        System.out.print("-");
        break;
        case 2:
        System.out.print("=");
        break;
        case 3:
        System.out.print(".");
        break;
        case 4:
        System.out.print("|");
        break;
        case 5:
        System.out.print("@");
        break;
        default:
      }
    }
    System.out.println();
  }
  
  }
}
