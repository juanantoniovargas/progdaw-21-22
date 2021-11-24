public class Ejercicio15 {
  public static void main(String[] args) {
  int[] num = new int [10];
  int clientes;
  int j=0;
  int aux=0;
  
  for (int i=0; i<10; i++) {
    if (i==0) {
      System.out.print(" Mesa nº   "+(i+1));
    } else {
      System.out.print(" "+(i+1));
    }
  }
  
  for (int i=0; i<10; i++) {
    num[i] = (int)(Math.random()*5);
    if (i==0) {
      System.out.print("\nOcupación  "+num[i]);
    } else {
      System.out.print(" "+num[i]);
    }
  }
    
  do {
    System.out.print("\n¿Cuántos son? (Introduzca un número negativo para salir del programa): ");
    clientes = Integer.parseInt(System.console().readLine());
    if (clientes>4) {
      System.out.println("Lo siento, no admitimos grupos de "+clientes+", haga grupos de 4 personas como máximo e \nintentelo de nuevo.");
    } else if (clientes<=0) {
      System.out.println("Gracias. Hasta pronto.");
    } else {
      /* if (num[j]==0) {
          aux = clientes;
        } else { */
      do {
        if (num[j]<=(4-clientes)) {
          aux = num[j]+clientes;
        }
        j++;
      } while (aux!=(num[j-1]+clientes));
      
      num[j-1]=aux;
      System.out.println("\nPor favor, sientese en la mesa número "+j);
      j=0;
      
      for (int i=0; i<10; i++) {
        if (i==0) {
          System.out.print(" Mesa nº   "+(i+1));
        } else {
          System.out.print(" "+(i+1));
        }
      }
      
      for (int i=0; i<10; i++) {
        if (i==0) {
          System.out.print("\nOcupación  "+num[i]);
        } else {
          System.out.print(" "+num[i]);
        }
      }
    }
  } while (clientes>0);
  
  }
}
