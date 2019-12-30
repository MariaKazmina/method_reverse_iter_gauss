public class Vec {

    private double[] f;
    private int N;


    Vec (int n)
    {
        N = n;
    }

    public double[] getVec() {
        return f;
    }

    public void setVec(double[] f) {
        this.f = f;
    }

    public int getN() {
        return N;
    }

}
