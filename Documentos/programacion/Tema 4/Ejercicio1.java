public class Ejercicio1 {
  public static void main(String[] args) {
  String dia;
  
  System.out.print("Introduzca un día de la semana: ");
  dia = System.console().readLine();
  
  switch (dia) {
  case "lunes":
  System.out.println("toca lenguajes de marca.");
  break;
  case "martes":
  System.out.println("toca entornos de desarrollo.");
  break;
  case "miércoles":
  System.out.println("toca lenguajes de marca.");
  break;
  case "jueves":
  System.out.println("toca entornos de desarrollo.");
  break;
  case "viernes":
  System.out.println("toca formación y orientacoón laboral.");
  break;
  case "sábado":
  
  case "domingo":
  System.out.println("¡Ese día no hay clase!");
  break;
  default:
  System.out.println("No has introducido un día de la semana.");
  }
  
  }
}
