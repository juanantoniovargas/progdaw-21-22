public class Ejercicio14 {
  public static void main(String[] args) {
  String[] palabra = new String[8];
  
  System.out.println("Introduce 8 palabras (entre ellas algunos colores):");
  
  for (int i=0; i<8; i++) {
    palabra[i] = System.console().readLine();
  }
  
  System.out.println("\nArray resultado:");
  
  for (int i=0; i<8; i++) {
    switch (palabra[i]) {
      case "verde": case "rojo": case "azul": case "amarillo": case "naranja": case "rosa": case "negro": case "blanco": case "morado":
        System.out.print(palabra[i]+" ");
      break;
      default:
    }
  }
  
  for (int i=0; i<8; i++) {
    switch (palabra[i]) {
      case "verde": case "rojo": case "azul": case "amarillo": case "naranja": case "rosa": case "negro": case "blanco": case "morado":
        
      break;
      default:
      System.out.print(palabra[i]+" ");
    }
  }
  
  }
}
