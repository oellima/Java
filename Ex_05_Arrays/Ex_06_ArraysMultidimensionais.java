package Ex_05_Arrays;

public class Ex_06_ArraysMultidimensionais {

    public static void main(String[] args) {

        // Inicialização de Array (modelo 1)
        int [][] arrayInt = new int [3][];

        arrayInt[0] = new int[2];
        arrayInt[1] = new int[3];
        arrayInt[2] = new int[6];

        // Inicialização de Array (modelo 2)
        int [][] arrayInt2 = {{0,0},{1,2,3},{1,2,3,4,5,6}};

        for (int [] arrayBase: arrayInt) {
            for (int num: arrayBase) {
                System.out.println(num);
            }
        }
    }
}
