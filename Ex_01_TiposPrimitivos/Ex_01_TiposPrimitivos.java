package Ex_01_TiposPrimitivos;

public class Ex_01_TiposPrimitivos {

    public static void main(String[] args) {
        // int, double, float, char, byte, short, long, boolean
        // CAST = serve para forçar a variavél
        int idade = 10;
        int idade1 = (int) 10000000000L;                                    // Usa-se assim para forçar a variável a 'int' (intiero) a ler um 'long' Não é uma boa prática!
        long numeroGrande = 100000;
        double salarioDouble = 2000.0;
        double salarioFloat = 2500.0F;                                      // Usa o 'F' para identificar o FLOAT no valor numérico
        byte idadeByte = -128;                                              // suporta de -128 até 127
        short idadeShort = 10;
        boolean verdadeiro = true;
        boolean falso = false;
        char caractere = '\u0041';                                          // Lista de caracteres na internet

        String nome = "Goku";                                               // String é uma classe, sempre começa com 'S' maiúsculo

        System.out.println("A idade é: " + idade + " anos");
        System.out.println(falso);
        System.out.println("Char " + caractere);
        System.out.println("Oi, meu nome é: " + nome);
    }
}
