public class Ejercicio6 {
  public static void main(String[] args) {
  int num, numintro, intentos=4;
  
  num=(int)(Math.random()*101);
  
  do {
    System.out.println("Introduce un numero entre 0 y 100: ");
    numintro = Integer.parseInt(System.console().readLine());
    if (numintro==num) {
      System.out.println("Enhorabuena, has acertado.");
    } else {
      System.out.println("Numero incorrecto.");
      System.out.println("Intentos restantes: "+intentos);
    }
    if ((numintro>num) && (intentos>0)) {
      System.out.println("El número es menor.");
    } else if ((numintro<num) && (intentos>0)) {
      System.out.println("El número es mayor");
    }
    intentos--;
  } while ((numintro!=num) && (intentos>=0));
  
  if (numintro!=num) {
    System.out.println("No has dado con el número.");
  }
  
  }
}
