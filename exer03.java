public class exer03 {
     /** 
     * @param args
     * @return 
     */
    public static void main(String[] args) {
        // Resolução das equações
        int A = 1;
        int B = 2;
        int C = 3;
        int D = 4;
        int E = 5;
        int F = 6;
        int G = 7;
        int H = 8;
        int I = 9;
        int Primeira = (C - B - A + B + A + C);
        int Segunda = (B * C - D * E);
        int Terceira = (B + F - C / G * I);
        final int Quarta = (C % D - H);
         System.out.println("O resultado da primeira é " + Primeira);
         System.out.println("O resultado da segunda é " + Segunda);
         System.out.println("O resultado da terceira é " + Terceira);
         System.out.println("O resultado da quarta é " + Quarta);
    }
}
