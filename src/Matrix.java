public class Matrix {
    private double[][] A;
    private int N;

    Matrix(int n) {
        A = new double[N][N];
        N = n;
    }

    //кривое заполнение матрицы
    public void fillMatrix() {
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                A[i][j] = i;
            }
        }
    }

    //вывод матрицы на экран
    public void showMatrix() {
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++)
               System.out.print(A[i][j]);
            System.out.println(" ");
        }
    }




}
