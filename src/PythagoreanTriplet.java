import java.util.*;
class PythagoreanTriplet{
    private int a,b,c;
    public PythagoreanTriplet(){}
    public PythagoreanTriplet(int a,int b,int c)
    {
        this.a=a;
        this.b=b;
        this.c=c;
    }

    public static List<PythagoreanTriplet> triplet = new ArrayList<>();
    public static PythagoreanTriplet pt=new PythagoreanTriplet();
    public static int N;

    public static PythagoreanTriplet makeTripletsList() {
        triplet = new ArrayList<>();
        return pt;
    }
    public static PythagoreanTriplet withFactorsLessThanOrEqualTo(int limit) {
        return pt;
    }
    public static PythagoreanTriplet thatSumTo(int sum) {
        N = sum;
        return pt;
    }
    public static List<PythagoreanTriplet> build() {
        for (int i = 1; i <= N/3; i++) {
            for (int j = i; j <= (N-i)/2; j++) {
                if (Math.pow(i,2) + Math.pow(j,2) == Math.pow(N-i-j,2)) {
                    triplet.add(new PythagoreanTriplet(i,j,N-i-j));
                }
            }
        }
        return triplet;
    }
    @Override
    public boolean equals(Object other) {
        if (! (other instanceof PythagoreanTriplet))
            return false;
        PythagoreanTriplet tripletx = (PythagoreanTriplet) other;
        return (tripletx.a == this.a && tripletx.b == this.b && tripletx.c == this.c);
    }
}

