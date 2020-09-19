package While;

public class NumberPalindrome {
    public static void main(String[] args) {
//        System.out.println("Is pal: " +isPalindrome(-12321));
        numberToWords(0);
        System.out.println("*******************************************************");
        numberToWords(000);
//        numberToWords(123);
//        System.out.println("*******************************************************");
//        numberToWords(-1);
//        System.out.println("*******************************************************");
//        numberToWords(1000);
//        System.out.println("*******************************************************");
//        numberToWords(1010);
//        System.out.println(getDigitCount(123));
//        System.out.println(getDigitCount(0));
    }

    public static boolean isPalindrome(int number) {
        int reverse = 0;
        int num = number;
        while (number != 0) {
            int lastDigit = number % 10;
            reverse = reverse * 10;
            reverse += lastDigit;
            number /= 10;
            System.out.println("lastDigit " + lastDigit);
            System.out.println("number " + number);
            System.out.println("reverse " + reverse);
        }
        return num == reverse;
    }

    public static int sumFirstAndLastDigit(int number){
        int ans = 0;
        if (number <0) return -1;
        else{
            int lastDigit = number % 10;
            int firstDigit = number;
            while (firstDigit >= 10){
                firstDigit /= 10;
            }
            ans = firstDigit + lastDigit;
        }
        return ans;
    }

    public static int getEvenDigitSum(int number){
        int ans = 0;
        if(number<0) return -1;
        else{
            while (number != 0){
                int lastDigit = number % 10;
                if (lastDigit % 2 == 0){
                    ans += lastDigit;
                }
                number /= 10;
            }
        }
        return ans;
    }

    public static boolean hasSharedDigit(int num1, int num2){
        boolean test = false;
        if ((num1 >= 10 && num1 <= 99) && (num2 >= 10 && num2 <= 99)){
            if (num1 / 10 == num2 / 10 || num1 % 10 == num2 % 10 || num1 / 10 == num2 % 10 || num1 % 10 == num2 / 10){
                test = true;
            }
        }
        else{
            test = false;
        }
        return test;
    }

    public static boolean hasSameLastDigit(int num1, int num2, int num3){
        boolean test = false;
        if ((num1 >= 10 && num1 <= 1000) && (num2 >= 10 && num2 <= 1000) && (num3 >= 10 && num3 <= 1000)){
            if ((num1 % 10 == num2 % 10) || (num1 % 10 == num3 % 10) || (num2 % 10 == num3 % 10)){
                test = true;
            }
        }
        return test;
    }

    public static boolean isValid(int num){
        boolean test = false;
        if (num >= 10 && num <= 1000){
            test = true;
        }
        return test;
    }

    public static int getGreatestCommonDivisor(int first, int second){
        int test = 0;
        if ((first < 10) || second < 10){
            test = -1;
        }
        else {
            int div1 = 0;
            int order1 = (first < second)? first : second;
            System.out.println(order1);
            int order2 = (order1 == first)? second : first;
            System.out.println(order2);
            for (int i = order1; i>1; i--) {
                if((order1 % i == 0) && (order2 % i == 0)) {
                    div1 = i;
                    break;
                }
            }
            test =  div1;
        }
        return test;
    }


    public static int getGreatestCommonDivisor1 ( int first, int second) {
        if(first <10 || second <10) {
            return -1;
        }
        int div1 = 0;
        int order1 = (first < second)? first : second;
        System.out.println(order1);
        int order2 = (order1 == first)? second : first;
        System.out.println(order2);
        for (int i = order1; i>1; i--) {
            if((order1 % i == 0) && (order2 % i == 0)) {
                div1 = i;
                break;
            }
        }
        return div1;
    }

    public static void printFactors(int number){
        if (number < 1){
            System.out.println("Invalid Value");
        }
        int num = number;
        String val = "";
//        while (number > 0){
//            if (num % number ==0)
//            {
//                val += number + " ";
//                System.out.println(val);
//            }
//            number -= 1;
//        }
        int i = 1;
//        val = "";
        while (i <= num){
            if (num % i == 0){
                val += i + " ";
            }
            i += 1;

        }
        System.out.println(val);
    }

    public static boolean isPerfectNumber(int number){
        if (number <1){
            return false;
        }
        int ans = 0;
        for (int i = 1; i < number; i++) {
            if (number % i == 0){
                ans += i;
            }
        }
        return ans == number;
    }

    public static void numberToWords(int number){
        if (number < 0){
            System.out.println("Invalid Value");
        }
        int num = reverse(number);
        int len = getDigitCount(num);
//        System.out.println(number);
//        System.out.println(num);
//        System.out.println(len);

        while (num < 0){
            int lastDigit = num % 10;
            switch(lastDigit){
                case 0:
                    System.out.println("Zero");
                    break;
                case 1:
                    System.out.println("One");
                    break;
                case 2:
                    System.out.println("Two");
                    break;
                case 3:
                    System.out.println("Three");
                    break;
                case 4:
                    System.out.println("Four");
                    break;
                case 5:
                    System.out.println("Five");
                    break;
                case 6:
                    System.out.println("Six");
                    break;
                case 7:
                    System.out.println("Seven");
                    break;
                case 8:
                    System.out.println("Eight");
                    break;
                case 9:
                    System.out.println("Nine");
                    break;
            }
            num /= 10;
        }
        int x = getDigitCount(number) - len;
        if ((getDigitCount(number) != len) || number == 0){
            if (number == 0){
                x = 1;
            }
            for (int i = 0; i < x; i++) {
                System.out.println("Zero");
            }
        }
    }

    public static int reverse(int number){
        int rev = 0;
        while (number != 0) {
            int lastDigit = number % 10;
            rev = rev * 10;
            rev += lastDigit;
            number /= 10;
        }
        return rev;
    }

    public static int getDigitCount(int number){
        int cnt = 0;
        if (number < 0){
            return -1;
        }
        else if (number ==0){
            return 1;
        }else {
            while (number > 0) {
                cnt += 1;
                number /= 10;
            }
        }
        return cnt;
    }
}

