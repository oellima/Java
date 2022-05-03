package Ex_04_EstruturaRepeticao;

public class Ex_01_EstruturasRepeticao {

    public static void main(String[] args) {
        // while, do while, for
        int count = 0;
        while (count < 10) {
            System.out.println(count);
            count += 1;
            // ou pode ser dessa forma também ( count++; )
        }
        count = 0;
        do {
            System.out.println("Dentro do do-while" + ++count);
        } while (count < 10);

        for(int i = 0; i < 10; i++) {
            System.out.println("For " + i);
        }
    }
}
