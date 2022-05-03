package Ex_04_EstruturaRepeticao;

public class Ex_03_EstruturasRepeticao {

    public static void main(String[] args) {

        // Imprima os primeiros 25 números de um dado valor. Por exemplo, 50.

        int valorMaximo = 50;
        for (int i = 0; i <= valorMaximo; i++) {
            if (i > 25) {
                break;
            }
            System.out.println(i);
        }
    }
}
