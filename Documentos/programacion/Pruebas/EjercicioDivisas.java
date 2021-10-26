public class EjercicioDivisas {
  public static void main(String[] args) {
  String divisa;
  float x, euro, dolar, libra, yen, yuan;
  
  System.out.print("Introduzca la divisa (euro, dolar, libra, yen, yuan): ");
  divisa = System.console().readLine();
  System.out.print("Introduzca la cantidad de dinero: ");
  x = Float.parseFloat(System.console().readLine());
  
  if ("euro".equals(divisa)) {
    switch (divisa) {
      case "euro": 
      System.out.println(x + " euros");
      case "dolar":
      dolar = x*1.16f;
      System.out.println(dolar + " dolares");
      case "libra":
      libra = x*0.84f;
      System.out.println(libra + " libras");
      case "yen":
      yen = x*133.08f;
      System.out.println(yen + " yenes");
      case "yuan":
      yuan = x*7.44f;
      System.out.println(yuan + " yuanes");
      break;
      default:
      System.out.println("No has elegido ninguna de las opciones.");
    }
  } else if ("dolar".equals(divisa)){
    switch (divisa) {
      case "dolar":
      System.out.println(x + " dolares");
      case "euro":
      euro = x*0.86f; 
      System.out.println(euro + " euros");
      case "libra":
      libra = x*0.73f;
      System.out.println(libra + " libras");
      case "yen":
      yen = x*114.46f;
      System.out.println(yen + " yenes");
      case "yuan":
      yuan = x*6.40f;
      System.out.println(yuan + " yuanes");
      break;
      default:
      System.out.println("No has elegido ninguna de las opciones.");
    }
  } else if ("libra".equals(divisa)){
    switch (divisa) {
      case "libra":
      System.out.println(x + " libras");
      case "euro":
      euro = x*1.18f; 
      System.out.println(euro + " euros");
      case "dolar":
      dolar = x*1.38f;
      System.out.println(dolar + " dolares");
      case "yen":
      yen = x*157.63f;
      System.out.println(yen + " yenes");
      case "yuan":
      yuan = x*8.81f;
      System.out.println(yuan + " yuanes");
      break;
      default:
      System.out.println("No has elegido ninguna de las opciones.");
    }
  } else if ("yen".equals(divisa)){
    switch (divisa) {
      case "yen":
      System.out.println(x + " yenes");
      case "euro":
      euro = x*0.0075f; 
      System.out.println(euro + " euros");
      case "dolar":
      dolar = x*0.0087f;
      System.out.println(dolar + " dolares");
      case "libra":
      libra = x*0.0063f;
      System.out.println(libra + " libras");
      case "yuan":
      yuan = x*0.056f;
      System.out.println(yuan + " yuanes");
      break;
      default:
      System.out.println("No has elegido ninguna de las opciones.");
    }
  } else if ("yuan".equals(divisa)){
    switch (divisa) {
      case "yuan":
      System.out.println(x + " yuanes");
      case "euro":
      euro = x*0.13f; 
      System.out.println(euro + " euros");
      case "dolar":
      dolar = x*0.16f;
      System.out.println(dolar + " dolares");
      case "libra":
      libra = x*0.11f;
      System.out.println(libra + " libras");
      case "yen":
      yen = x*17.90f;
      System.out.println(yen + " yenes");
      break;
      default:
      System.out.println("No has elegido ninguna de las opciones.");
    }
  } else {
    System.out.println("No has elegido ninguna de las opciones.");
  }
  
  }
}
