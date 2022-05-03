package Ex_05_Arrays;

public class Ex_04_Arrays {

    public static void main(String[] args) {

        int [] numeros = new int [3];
        int [] numeros2 = {1,2,3,4,5};

        // For
        for ( int i = 0 ; i < numeros2.length ; i++ ) {
            System.out.println(numeros2[i]);
        }
        // Foreach
        for ( int j : numeros2 ) {
            System.out.println(j);
        }
    }
}
