public class p_mlp_calc {

    static int p_mlp = 0;
    
    public static int calculate(int buses, int number) {
        p_mlp = buses*number;
        return p_mlp;
    }

    @Override
    public String toString() {
        return ("The passenger capacity at the maximum-load point is " + p_mlp);
    }
}