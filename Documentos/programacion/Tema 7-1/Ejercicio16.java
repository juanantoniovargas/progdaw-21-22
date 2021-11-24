public class Ejercicio16 {
  public static void main(String[] args) {
  int[] num = new int[20];
  
  for (int i=0; i<20; i++) {
    num[i] = (int)(Math.random()*401);
    System.out.print(num[i]+" ");
  }
  
  int resaltar;
  
  do {
    System.out.print("\n¿Qué números quiere resaltar?(1 – los múltiplos de 5, 2 – los múltiplos de 7): ");
    resaltar = Integer.parseInt(System.console().readLine());
  } while ((resaltar!=1) && (resaltar!=2));
  
  for (int i=0; i<20; i++) {
    switch (resaltar) {
      case 1:
      if (num[i]%5==0) {
        System.out.print("["+num[i]+"] ");
      } else {
        System.out.print(num[i]+" ");
      }
      break;
      case 2:
      if (num[i]%7==0) {
        System.out.print("["+num[i]+"] ");
      } else {
        System.out.print(num[i]+" ");
      }
      break;
      default:
    }
  }
  
  }
}
