import java.util.Scanner;
import javax.swing.JOptionPane;

public class emanuel {
    public static void main(String[] args) {

        int idade;

        Scanner input = new Scanner(System.in); 
        System.out.println("Digite a idade:");
        idade = input.nextInt();
            if ((idade >= 0) && (idade == 2)) {
                 JOptionPane.showMessageDialog(null, "Esta pessoa é um bebe");
            }
                 if ((idade >= 3) && (idade == 11)) {
                    JOptionPane.showMessageDialog(null, "Esta pessoa é uma criança");
                 }
                       if ((idade >= 12) && (idade == 19)) {
                             JOptionPane.showMessageDialog(null, "Esta pessoa é um adolescente");
                     }
                           if ((idade >= 20) && (idade == 30)) {
                                JOptionPane.showMessageDialog(null, "Esta pessoa é um Jovem");
                         }
                                if ((idade >= 31) && (idade == 60)) {
                                      JOptionPane.showMessageDialog(null, "Esta pessoa é um Adulto");
                             }
                                      if (idade > 60){
                                            JOptionPane.showMessageDialog(null, "Esta pessoa é um Idoso");
                                }
       
           
    }
}
