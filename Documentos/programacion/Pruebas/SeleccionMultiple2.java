public class SeleccionMultiple2 {
  public static void main (String[] args) {
  int x;
  
  System.out.println("Elija una opción:");
  System.out.println("1. fruta");
  System.out.println("2. pescado");
  System.out.println("3. carne");
  System.out.print("--> ");
  
  x = Integer.parseInt(System.console().readLine());
  
  switch (x) {
    case 1: 
    System.out.println("La manzana es una fruta.");
    break;
    case 2:
    System.out.println("La trucha es un pez, que puede ser un pescado.");
    break;
    case 3:
    System.out.println("El solomillo es una parte del porcino.");
    break;
    default:
    System.out.println("No has elegido ninguna de las opciones.");
  }
  
  /*
  if (x==1) {
    System.out.println("La manzana es una fruta.");
  } else if (x==2) {
    System.out.println("La trucha es un pez, que puede ser un pescado.");
  } else if (x==3) {
    System.out.println("El solomillo es una parte del porcino.");
  } else {
    System.out.println("No has elegido ninguna de las opciones.");
  }
  */
  
  }
}
