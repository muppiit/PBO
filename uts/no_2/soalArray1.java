package PBO.uts.no_2;

public class soalArray1 {
    public static void main(String[] args) {
        int[][] arrayInt = { { 1, 1, 4 }, { 2, 1, 2 }, { 3, 2, 1 } };
        int total = 0;
        int totalElement = 0;
        for (int i = 0; i < arrayInt.length; i++) {
            for (int j = 0; j < arrayInt[i].length; j++) {
                total += arrayInt[i][j];
                totalElement++;
            }
        }
        System.out.println("Jumlah elemen pada array : " + totalElement);
        System.out.println("Jumlah total elemen array : " + total);
    }
}
