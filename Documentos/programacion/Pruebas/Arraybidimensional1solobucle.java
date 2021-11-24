public class Arraybidimensional1solobucle {
  public static void main(String[] args) {
  final int filas=5;
  final int columnas=10;
  
  final int min=50;
  final int max=100;
  
  int[] [] num = new int [filas] [columnas];
  
  // relleno con doble bucle
  
  for (int i=0; i<filas; i++) {
    for (int j=0; j<columnas; j++) {
      num[i][j] = (int)(Math.random()*(max-min+1))+min;
    }
  }
  
  // presentación con doble bucle
  
  for (int i=0; i<filas; i++) {
    for (int j=0; j<columnas; j++) {
      System.out.printf("%3s ",num[i][j]);
    }
    System.out.println();
  }
  
  System.out.println();
  
  // presentación con un bucle
  
  int fil=0;
  int col=0;
  
  for (int i=0; i<filas*columnas; i++) {
    System.out.printf("%3s ",num[fil][col]);
    col++;
    if (col>=columnas) {
      col=0;
      fil++;
      System.out.println();
    }
  }
  
  }
}
