import java.util.Scanner;

public class ex006 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int caso,libras;
        double valor,kilos;
        System.out.println("1. Converter quilo para libra");
        System.out.println("2. Converter libra para quilo");
        caso = input.nextInt();
            switch (caso) {
                case 1:
                  System.out.println("Quantas libras serão convertidas");
                  libras = input.nextInt();
                    valor = libras * 454;  
                    System.out.println("libras: " + valor);
                    break;
            
                case 2:
                System.out.println("Quantas kilos serão convertidas para libras");
                kilos = input.nextInt();    
                valor = kilos / 454;
                System.out.println("Kilos: " + valor);
                    break;
            } 
    }    
}
