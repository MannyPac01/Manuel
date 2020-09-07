package ForStatement;

public class sumOdd {
    public static boolean isOdd(int number){
        if (number > 0){
            return number % 2 != 0;
        }
        return false;
    }
    public static int SumOdd(int start, int end){
        int sum = 0;
        if ((start > 0) && (end > 0) && start <= end){
            for (int i = start; i <= end; i++) {
                if (isOdd(i)){
                    sum += i;
                }
            }
            return sum;
        }
        return -1;
    }
}
