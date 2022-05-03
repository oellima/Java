package Ex_03_EstruturasCondicionais;

public class Ex_02_EstruturasCondicionais {

    public static void main(String[] args) {

        // idade < 15 categoria infantil
        // idade >= 15 e idade < 18 categoria juvenil
        // idade >= 18 categoria adulto

        int idade = 10;
        if (idade < 15) {
            System.out.println("Categoria Infantil");
        } else if (idade >= 15 && idade < 18) {
            System.out.println("Categoria Juvenil");
        } else {
            System.out.println("Categoria Adulto");
        }
    }
}
