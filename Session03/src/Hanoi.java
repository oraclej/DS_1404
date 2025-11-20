public class Hanoi {
    public static void main(String[] args) {
        hanoi(10, 'A', 'B', 'C');
    }

    public static void hanoi(int n, char from, char aux, char to){
        if(n == 1)
            System.out.printf("Move Ring from %c to %c%n", from, to);
        else{
            hanoi(n-1, from, to, aux);
            System.out.printf("Move Ring from %c to %c%n", from, to);
            hanoi(n-1, aux, from, to);
        }
    }

    public static void aFunction(int n){
        for (int i = 0; i < n; i++) {
            System.out.println();
        }
        for (int i = 0; i < n; i++) {
            System.out.println();
        }
        for (int i = 0; i < 2*n; i++) {
            System.out.println();
        }
    }

    public static void function2(int n){
        System.out.println("Hi");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                for (int k = 0; k < 2*n; k++) {

                }
            }
        }
        for (int i = 0; i < n; i++) {

        }
    }
}
