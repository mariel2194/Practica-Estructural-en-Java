import java.util.Scanner;

public class Ejercicio5 {

  public static void main(String[] ar) {
    Scanner teclado = new Scanner(System.in);
    int num1, num2;
    System.out.print("Ingrese primer valor:\n");
    num1 = teclado.nextInt();
    System.out.print("Ingrese segundo valor:\n");
    num2 = teclado.nextInt();

    // System.out.print("La suma de los dos primero valores es:" + suma(num1,num2)+
    // "\n");
    // System.out.print("El producto del tercer y cuarto valor es:" +
    // producto(num3,num4) + "\n");

    if (num1 > num2) {
      System.out.print("El primer valor es mayor que el segundo valor");
      System.out.print("La suma de los dos valores es:" + suma(num1, num2) + "\n");
      System.out.print("La diferencia de los dos valores es:" + resta(num1, num2) + "\n");
    } else {
      System.out.print("El segundo valor es mayor que el primer valor");
      System.out.print("El producto de los dos valores es:" + producto(num1, num2) + "\n");
      System.out.print("El producto de los dos valores es:" + division(num1, num2) + "\n");
    }
  }

  public static int suma(int num1, int num2) {
    return num1 + num2;
  }

  public static int producto(int num3, int num4) {
    return num3 * num4;
  }

  public static int resta(int num1, int num2) {
    return num1 - num2;
  }

  public static int division(int num1, int num2) {
    return num1 / num2;
  }
}