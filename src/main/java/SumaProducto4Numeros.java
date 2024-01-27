import java.util.Scanner;

public class SumaProducto4Numeros {
 
    public static void main(String[] ar) {
      Scanner teclado=new Scanner(System.in);
      int num1,num2,num3,num4,suma,producto;
      System.out.print("Ingrese primer valor:\n");
      num1=teclado.nextInt();
      System.out.print("Ingrese segundo valor:\n");
      num2=teclado.nextInt();
      System.out.print("Ingrese tercer valor:\n");
      num3=teclado.nextInt();
      System.out.print("Ingrese cuarto valor:\n");
      num4=teclado.nextInt();
     
      System.out.print("La suma de los dos primero valores es:" + suma(num1,num2)+ "\n");     
      System.out.print("El producto del tercer y cuarto valor es:" + producto(num3,num4) + "\n");
      
    }
  public static int suma(int num1,int num2){
      int suma;
      suma=num1+num2;
      return suma;
    }

    public static int producto(int num3,int num4){ 
    int producto;
    producto=num3*num4;
    return producto;

  }
}


  



