public class ex001 {
    public static void main(String[] args) {

        double soma = 0;
        double mult = 1;


        for (int i = 0; i != 30; i++) {
           if (i % 2 == 0) {
             mult = (i + mult); 
           } 
           else {
             soma = (i * soma);
           }
        }
        System.out.println(mult);
        System.out.println(soma);
    }
}
