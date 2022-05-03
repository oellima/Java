package Ex_03_EstruturasCondicionais;

public class Ex_01_EstruturasCondionais {

    public static void main(String[] args) {

        int idade = 15;
        boolean ehAutorizadoComprarBebida = idade >= 18;

        if (ehAutorizadoComprarBebida) {                                 // if só executa se o valor dentro dele for VERDADEIRO (boolean true)
            System.out.println("Autorizado comprar bebida alcólica");
        } else {
            System.out.println("Proibido comprar bebida alcólica");
        }
    }
}
