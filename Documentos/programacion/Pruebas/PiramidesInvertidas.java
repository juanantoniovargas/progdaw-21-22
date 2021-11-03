public class PiramidesInvertidas {
  public static void main(String[] args) {
  int altura1, altura2;
  int hmax;
  
  System.out.print("Introduce la altura de la primera pirámide: ");
  altura1 = Integer.parseInt(System.console().readLine());
  System.out.print("Introduce la altura de la segunda pirámide: ");
  altura2 = Integer.parseInt(System.console().readLine());
  
  if (altura1>altura2) {
    hmax = altura1;
  } else {
    hmax =altura2;
  }
  
  int espacios1=0, espacios2=0, relleno1, relleno2;
  relleno1 = altura1;
  relleno2 = altura2;
  
  for (int i=0; i<hmax; i++) {
    for (int j=0; j<espacios1; j++) {
      System.out.print(" ");
    }
    for (int j=0; j<relleno1; j++) {
      System.out.print("*");
    }
    for (int j=0; j<relleno1-1; j++) {
      System.out.print("*");
    }
    if (espacios1>=altura1) {
      espacios1--;
    }
    for (int j=0; j<espacios1; j++) {
      System.out.print(" ");
    }
    
    System.out.print(" ");
    
    for (int j=0; j<espacios2; j++) {
      System.out.print(" ");
    }
    for (int j=0; j<relleno2; j++) {
      System.out.print("*");
    }
    for (int j=0; j<relleno2-1; j++) {
      System.out.print("*");
    }
    espacios1++;
    if (espacios1>altura1) {
      espacios1=altura1;
    }
    relleno1--;
    espacios2++;
    relleno2--;
    System.out.println();
  }
  
  }
}
