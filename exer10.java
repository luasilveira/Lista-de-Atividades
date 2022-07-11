import javax.swing.JOptionPane;

public class exer10 {
    public static void main(String[] args) {
        String resp = "";
            float peso = 0; 
            float altura = 0;
            float IMC = 0;
                resp = JOptionPane.showInputDialog("Coloque o seu peso: (Ex.: 65.0) ");
                peso = Float.parseFloat(resp);
                resp = JOptionPane.showInputDialog("Coloque a sua altura: (Ex.: 1.77)  ");
                altura = Float.parseFloat(resp);
                IMC = (peso / (altura * altura));
                JOptionPane.showMessageDialog(null, "O seu IMC é " + IMC);
                if (IMC <= 18.5) {
                    JOptionPane.showMessageDialog(null, "O seu peso está Abaixo do normal ");
                }
                if ((IMC > 18.5) && (IMC == 24.4)) {
                    JOptionPane.showMessageDialog(null, "O seu peso é Ideal ");
                }
               if ((IMC >= 24.5) && (IMC == 29.9)) {
                JOptionPane.showMessageDialog(null, "O seu peso é Pré-Obesidade ");
                }
                if ((IMC >= 30) && (IMC == 34.4)) {
                    JOptionPane.showMessageDialog(null, "O seu peso é Obesidade Classe I");
                }
                if ((IMC >= 35) && (IMC == 39.9)) {
                    JOptionPane.showMessageDialog(null, "O seu peso é Obesidade Cevera");
                }
                if (IMC > 39.9) {
                    JOptionPane.showMessageDialog(null, "O seu peso é Obesidade Mórbida");
               }
           }
    }
