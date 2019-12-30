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

    public double[][] multiplayMatrix(Matrix K)
    {


        double[][] result = new double[N][N];

        if (N == K.N) {
            for (int i = 0; i <N; i++) {
                for (int j = 0; j < N; j++) {
                    double step = 0;
                    for (int k = 0; k < N; k++)
                        step += A[i][k] * K.A[k][j];
                    result[i][j] = step;
                }

            }
        }


        A = result;
        return result;


    }

    public Matrix transposeMatrix() {    //транспонирование матрицы

        Matrix K = new Matrix(N);
        for (int i = 0; i < N; i++)  //идем по строке
        {
            for (int j = 0; j < N; j++) {
                K.A[j][i] = A[i][j];
            }
        }

        return K;

    }

    }




}
