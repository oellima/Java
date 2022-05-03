package Ex_01_TiposPrimitivos;

public class Ex_02_TiposPrimitivos {

    public static void main(String[] args) {
        String nome = "Leandro";
        String endereco = "rua Gameleira";
        double salario = 5431.12;
        String dataRecebimentoSalario = "20/02/2022";

        // String tbm imprime na tela o resultado concatenado, mas tbm pode ser usado com o 'sout'
        String relatorio = " Eu " + nome + " morando no endereço " + endereco + " confirmo que recebi o salário de " + salario + " na data " + dataRecebimentoSalario;
        System.out.println(relatorio);
    }
}
