public class Ejercicio5 {
  public static void main(String[] args) {
  int num, menor=200, mayor=0;
  
  System.out.println("Mostrando 50 números enteros aleatorios entre 100 y 199 (ambos incluidos): ");
  
  for (int i=0; i<50; i++) {
    num=((int)(Math.random()*100+100));
    System.out.print(num+" ");
    
    if (num>mayor) {
      mayor=num; 
    } else if (num<menor) {
      menor=num;
    }
    
  }
  
  System.out.println();
  System.out.println("El número mayor es: "+mayor);
  System.out.println("El número menor es: "+menor);
  System.out.println("La media es: "+(menor+mayor)/2);
  
  }
}
