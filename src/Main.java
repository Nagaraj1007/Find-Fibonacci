
public class Main {

    public static int findFibonacci(int number){
        if (number == 0){
            return 0;
        }
        if (number == 1){
            return 1;
        }
        return findFibonacci(number - 1 ) + findFibonacci(number - 2);
    }

    public static void main(String[] args) {
        System.out.println(findFibonacci(9));
    }
}