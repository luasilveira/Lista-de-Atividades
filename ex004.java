import java.util.Scanner;

public class ex004 {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in); 
        int horas;
        double valorHora = 10.25;
        double salario;
        
        System.out.println("Quantas horas você trabalhou?");
        horas = ler.nextInt();
        salario = (horas * valorHora);
        System.out.println("Você trabalhou" + horas + "horas e ganhou R$" + salario);
    }
}
