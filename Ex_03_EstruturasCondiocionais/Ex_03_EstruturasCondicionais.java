package Ex_03_EstruturasCondicionais;

public class Ex_03_EstruturasCondicionais {

    public static void main(String[] args) {

        // Doar se salário for maior que 5000

        double salario = 3000;

        String mensagemDoar = "Eu vou doar 500 para o DevDojo";
        String mensagemNaoDoar = "Ainda não tenho condições, mas vou ter!";
        String resultado;

        // (condição) ? verdadeiro : falso                                              // Ternário
        // String resultado = salario > 5000 ? mensagemDoar : mensagemNaoDoar;          // Operação Ternário (pode ser feito assim também)
        // System.out.println(salario > 5000 ? mensagemDoar : mensagemNaoDoar);         // Imprimir tbm pelo "sout"

        if (salario > 5000) {
            resultado = mensagemDoar;
        } else {
            resultado = mensagemNaoDoar;
        }
        System.out.println(resultado);
    }
}
