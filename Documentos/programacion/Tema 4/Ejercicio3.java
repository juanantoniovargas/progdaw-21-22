public class Ejercicio3 {
  public static void main(String[] args) {
  int x;
  
  System.out.print("Introduzca un número del 1 al 7: ");
  x = Integer.parseInt (System.console().readLine());
  
  switch (x) {
    case 1: 
    System.out.println("lunes");
    break;
    case 2:
    System.out.println("martes");
    break;
    case 3:
    System.out.println("miercoles");
    break;
    case 4: 
    System.out.println("jueves");
    break;
    case 5:
    System.out.println("viernes");
    break;
    case 6:
    System.out.println("sabado");
    break;
    case 7:
    System.out.println("domingo");
    break;
    default:
    System.out.println("No has elegido un numero del 1 al 7.");
  }
  
  }
}
