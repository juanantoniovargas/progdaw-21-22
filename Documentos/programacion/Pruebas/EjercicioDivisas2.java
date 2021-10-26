public class EjercicioDivisas2 {
  public static void main(String[] args) {
  String divisa;
  float x, euro, dolar, libra, yen, yuan;
  
  System.out.print("Introduzca la divisa (euro, dolar, libra, yen, yuan): ");
  divisa = System.console().readLine();
  System.out.print("Introduzca la cantidad de dinero: ");
  x = Float.parseFloat(System.console().readLine());
  
    switch (divisa) {
      case "euro": 
      System.out.println(x + " euros");
      dolar = x*1.16f;
      System.out.println(dolar + " dolares");
      libra = x*0.84f;
      System.out.println(libra + " libras");
      yen = x*133.08f;
      System.out.println(yen + " yenes");
      yuan = x*7.44f;
      System.out.println(yuan + " yuanes");
      break;
      case "dolar":
      euro = x*0.86f; 
      System.out.println(euro + " euros");
      System.out.println(x + " dolares");
      libra = x*0.73f;
      System.out.println(libra + " libras");
      yen = x*114.46f;
      System.out.println(yen + " yenes");
      yuan = x*6.40f;
      System.out.println(yuan + " yuanes");
      break;
      case "libra":
      euro = x*1.18f; 
      System.out.println(euro + " euros");
      dolar = x*1.38f;
      System.out.println(dolar + " dolares");
      System.out.println(x + " libras");
      yen = x*157.63f;
      System.out.println(yen + " yenes");
      yuan = x*8.81f;
      System.out.println(yuan + " yuanes");
      break;
      case "yen":
      euro = x*0.0075f; 
      System.out.println(euro + " euros");
      dolar = x*0.0087f;
      System.out.println(dolar + " dolares");
      libra = x*0.0063f;
      System.out.println(libra + " libras");
      System.out.println(x + " yenes");
      yuan = x*0.056f;
      System.out.println(yuan + " yuanes");
      break;
      case "yuan":
      euro = x*0.13f; 
      System.out.println(euro + " euros");
      dolar = x*0.16f;
      System.out.println(dolar + " dolares");
      libra = x*0.11f;
      System.out.println(libra + " libras");
      yen = x*17.90f;
      System.out.println(yen + " yenes");
      System.out.println(x + " yuanes");
      break;
      default:
      System.out.println("No has elegido ninguna de las opciones.");
    }
  
  }
}
