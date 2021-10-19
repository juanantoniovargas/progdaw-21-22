public class Ejercicio2 {
  public static void main(String[] args) {
  int hora;
  
  System.out.print("¿Qué hora es? ");
  hora = Integer.parseInt(System.console().readLine());
  
  if ((hora >= 6) && (hora <= 12)) {
    System.out.println("Buenos días");
  }
  if ((hora >= 13) && (hora <= 20)) {
  System.out.println("Buenas tardes");
  }
  if (((hora >= 21) && (hora < 24)) || ((hora <= 5) && (hora >0))) {
  System.out.println("Buenas noches");
  }
  if ((hora < 0) || (hora > 24)) {
  System.out.println("Hora incorrecta");
  }
  
  }
}
