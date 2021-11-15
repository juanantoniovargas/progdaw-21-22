public class Ejercicio9 {
  public static void main(String[] args) {
  int cont=0, num;
  
  do {
    num = (int)(Math.random()*101);
    if (num%2==0) {
    System.out.print(num+" ");
    cont++;
    }
  } while (num != 24);
  
  System.out.println();
  System.out.print("Total de numeros mostrados: "+cont);
  
  }
}
