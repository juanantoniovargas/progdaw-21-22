public class Ejercicio14 {
  public static void main(String[] args) {
  int num, intentos=4, numalea;
  String indicacion;
  
  System.out.print("Introduce un número (0-100), el programa tratará de adivinarlo: ");
  num = Integer.parseInt(System.console().readLine());
  
  numalea=(int)(Math.random()*101);
  
  do {
    System.out.println(numalea);
    if (numalea==num) {
      System.out.println("Número acertado.");
    } else if (intentos>0) {
      System.out.println("Intentos restantes: "+intentos);
      System.out.println("¿El número es mayor o menor?");
      indicacion = System.console().readLine();
      if ("mayor".equals(indicacion)) {
        numalea=(int)(Math.random()*(101-numalea)+numalea);
      } else {
        numalea=(int)(Math.random()*numalea);
      }
    }
    intentos--;
  } while ((numalea!=num) && (intentos>=0));
  
  if (numalea!=num) {
    System.out.println("Número no acertado.");
  }
  
  }
}
