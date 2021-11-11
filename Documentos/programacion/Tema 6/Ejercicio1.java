public class Ejercicio1 {
  public static void main(String[] args) {
  int suma=0, tirada;
  
  System.out.print("Tirada de tres dados:");
  
  for (int i=0; i<3; i++) {
    tirada = (int)(Math.random()*6 + 1);
    suma =  suma + tirada;
    System.out.print(" "+tirada);
  }
  System.out.println();
  System.out.print("Suma de los tres dados: "+suma);
  
  }
}
