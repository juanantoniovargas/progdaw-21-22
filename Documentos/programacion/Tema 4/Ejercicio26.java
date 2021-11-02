public class Ejercicio26 {
  public static void main(String[] args) {
  int nument;
  String dia, tarjeta;
  float total=0, descuento=0;
  
  System.out.println("Venta de entradas CineCampa.");
  System.out.print("Número de entradas: ");
  nument = Integer.parseInt(System.console().readLine());
  System.out.print("Día de la semana: ");
  dia = (System.console().readLine());
  System.out.print("Tiene tarjeta CineCampa (s/n): ");
  tarjeta = (System.console().readLine());
  
  switch (dia) {
    case "miercoles":
    total = nument * 5;
    break;
    case "jueves":
    if (nument%2 == 0) {
      nument = nument / 2;
      total = nument * 11;
    } else {
      nument = nument / 2;
      total = (nument * 11) + 8;
    }
    break;
    default:
    total = nument * 8;
  }
  
  if ("s".equals(tarjeta)) {
    descuento = total / 10;
    total = total - descuento;
  }
  
  System.out.println("Aquí tiene sus entradas. Gracias por su compra.");
  System.out.println("Precio de las entradas: "+total+"€");
  
  }
}
