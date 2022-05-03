package Ex_02_Operadores;

public class Ex_01_Operadores {

    public static void main(String[] args) {
        // soma - subtração - divisão - multiplicação (+ , - , / , * )
        int numero01 = 10;
        double numero02 = 20;
        double resultado = numero01 / numero02;
        System.out.println(resultado);
//        System.out.println(numero01 + numero02);
//        System.out.println("Valor " + numero01 + numero02);

//      % resto da divisão
        int resto = 21 % 2;
        System.out.println(resto);

//      Operadores lógicos: <, >, <=, >=, ==, !=
        boolean isDezMaiorQueVinte  = 10 > 20;
        boolean isDezMenorQueVinte  = 10 < 20;
        System.out.println("É 10 maior que 20? " + isDezMaiorQueVinte);
        System.out.println("É 10 menor que 20? " + isDezMenorQueVinte);

//      Comparação: && (AND) || (or) !
        int idade = 29;
        float salario = 3500F;
        boolean isDentroDaLeiMaiorQueTrinta = idade >= 30 && salario >= 4612;
        boolean isDentroDaLeiMenorQueTrinta = idade < 30 && salario >= 3381;
        System.out.println("É dentro da lei maior que 30? " + isDentroDaLeiMaiorQueTrinta);
        System.out.println("É dentro da lei menor que 30? " + isDentroDaLeiMenorQueTrinta);

        double valorTotalContaCorrente = 200;
        double valorTotalContapoupanca = 10000;
        float valorPlaystation = 5000F;
        boolean isPlaystationCincoCompravel = valorTotalContaCorrente > valorPlaystation || valorTotalContapoupanca > valorPlaystation;
        System.out.println("É possível comprar o Playstation 5? " + isPlaystationCincoCompravel);

        // = += -= /= %=
        double bonus = 1800;    // Aqui recebe o valor de 1800
        bonus += 1000;          // Aqui é atribuido 1000 (fica 2800)
        bonus -= 1000;          // Aqui é subtraído 1000 (fica 1800 de novo)
        System.out.println(bonus);

        int contador = 0;
        contador += 1;          // Contador recebe contador + 1
        contador ++;            // Pode ser assim tbm, ele aumenta mais 1
        contador --;            // Pode ser assim tbm, ele diminui mais 1
        System.out.println(contador);
    }
}
