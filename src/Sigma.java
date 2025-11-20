public class Sigma {
    public static void main(String[] args) {
        System.out.println(sigma(4));
    }

    public static int sigma(int n){
        if(n < 1)
            throw new RuntimeException("Out of Range");
        if(n == 1)
            return 1;
        return sigma(n-1) + n;
    }
}
