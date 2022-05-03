package Ex_04_EstruturaRepeticao;

public class Ex_05_EstruturasRepeticao {

    public static void main(String[] args) {

        // Dado o valor de um carro, descubra em quantas vezes ele pode ser parcelado
        // Cindição valorParcela >= 1000

        double valorTotal = 30000;
        for (int parcela = (int) valorTotal; parcela >= 1; parcela--) {
            double valorParcela = valorTotal / parcela;
            if (valorParcela < 1000) {
                continue;
            }
            System.out.println("Parcela " + parcela + " R$ " + valorParcela);
        }
    }
}
