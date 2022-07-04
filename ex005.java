import java.util.Scanner;
import javax.swing.JOptionPane;

public class ex005 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in); 
        int horas;
        double valorHora = 10.25;
        double salario;
        
        System.out.println("Quantas horas você trabalhou?");
        horas = input.nextInt();
        salario = (horas * valorHora);
                if (salario < 50) {
            JOptionPane.showMessageDialog(null, "Atenção, dirija-se à direção do Hotel!");
        }    
        System.out.println("Você trabalhou" + horas + "horas e ganhou R$" + salario);            
    }
}
