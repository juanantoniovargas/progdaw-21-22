public class Ejercicio11 {
  public static void main(String[] args) {
  int nota, contsusp=0, contsuf=0, contbien=0, contnot=0, contsobr=0;
  
  System.out.println("Notas:");
  
  for (int i=0; i<20; i++) {
    nota = (int)(Math.random()*11);
    
    switch (nota) {
      case 0: case 1: case 2: case 3: case 4:
      System.out.print(nota + " -> ");
      System.out.println("Suspenso");
      contsusp++;
      break;
      case 5:
      System.out.print(nota + " -> ");
      System.out.println("Suficiente");
      contsuf++;
      break;
      case 6:
      System.out.print(nota + " -> ");
      System.out.println("Bien");
      contbien++;
      break;
      case 7: case 8:
      System.out.print(nota + " -> ");
      System.out.println("Notable");
      contnot++;
      break;
      case 9: case 10:
      System.out.print(nota + " -> ");
      System.out.println("Sobresaliente");
      contsobr++;
      break;
      default:
    }
  }
  
  System.out.println("Total de suspensos: "+contsusp);
  System.out.println("Total de suficientes: "+contsuf);
  System.out.println("Total de bien: "+contbien);
  System.out.println("Total de notables: "+contnot);
  System.out.println("Total de sobresalientes: "+contsobr);
  
  }
}
