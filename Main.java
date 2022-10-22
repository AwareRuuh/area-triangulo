import java.util.Scanner;

public class Main {
public static void main(String[] args) {
  Scanner sc1 = new Scanner(System.in);
   Double B,h,A;
        System.out.println("Informe o valor da base: ");
        B = sc1.nextDouble();
        System.out.println("Informe o valor da altura: ");
        h = sc1.nextDouble();
  
        A = (B*h)/2;
        System.out.println("O valor que você inseriu é B: "+B+" h: "+h);
        System.out.println("A área do triângulo é: "+A);
        sc1.close();
    }   
}
