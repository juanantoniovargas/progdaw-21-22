public class EjercicioDivisas3 {
  public static void main(String[] args) {
  String divisa;
  
  float x;
  
  double euro=0;
  double dolar=0;
  double libra=0;
  double yen=0;
  double yuan=0;
  
  final double factor_euro_dolar=1.16;
  final double factor_euro_libra=0.84;
  final double factor_euro_yen=133.06;
  final double factor_euro_yuan=7.43;
  
  System.out.print("Introduzca la divisa (euro, dolar, libra, yen, yuan): ");
  divisa = System.console().readLine();
  System.out.print("Introduzca la cantidad de dinero: ");
  x = Float.parseFloat(System.console().readLine());
  
  switch (divisa) {
    case "euro":
    euro = x;
    break;
    case "dolar":
    euro = x / factor_euro_dolar;
    break;
    case "libra":
    euro = x / factor_euro_libra;
    break;
    case "yen":
    euro = x / factor_euro_yen;
    break;
    case "yuan":
    euro = x / factor_euro_yuan;
    break;
    default:
    System.out.println("No has elegido ninguna de las opciones.");
  }
  
  dolar = euro * factor_euro_dolar;
  libra = euro * factor_euro_libra;
  yen = euro * factor_euro_yen;
  yuan = euro * factor_euro_yuan;
  
  System.out.println(euro + " euros");
  System.out.println(dolar + " dolares");
  System.out.println(libra + " libras");
  System.out.println(yen + " yenes");
  System.out.println(yuan + " yuanes");
  
  }
}
