package Ex_05_Arrays;

public class Ex_03_Arrays {

    public static void main(String[] args) {

        String [] nomes = new String [5];

        nomes [0] = "Leandro";
        nomes [1] = "Thiago";
        nomes [2] = "Rafaella";
        nomes [3] = "Apollo";
        nomes [4] = "Roma";

        for (int i = 0; i < nomes.length; i++) {
            System.out.println(nomes[i]);
        }
    }
}
