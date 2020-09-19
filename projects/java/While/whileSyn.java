package While;

public class whileSyn {
    public static void main(String[] args) {
//        int count = 1;
//        while(count != 6){
//            System.out.println("Count value is " + count);
//            count++;
//        }

//        for (int i = 0; i < 6; i++) {
//            System.out.println("Count value is " + i);
//        }
//        count = 1;
//        while(true){
//            if(count==6){
//                break;
//            }
//            System.out.println("Count value is " + count);
//            count++;
//        }
//
//        count = 6;
//        do {
//            System.out.println("Count value was "+ count);
//            count++;
//            if(count>100){
//                break;
//            }
//        }while(count != 6);
        int count = 0;
        while(count != 11){
            count++;
            if (!isEvenNumber(count)){
                continue;
            }
            System.out.println("Number " + count + " is even :" + isEvenNumber(count));

        }

        int number = 4;
        int finishNumber = 20;
        int evenNumbersFound = 0;

        while (number<= finishNumber){
            number++;
            if(!isEvenNumber(number)){
                continue;
            }

            System.out.println("Even number " + number);

            evenNumbersFound++;
            if (evenNumbersFound >=5) {
                break;
            }
        }
        System.out.println("Total even numbers fonud = " + evenNumbersFound);

    }
    public static boolean isEvenNumber(int num){
        if (num % 2 == 0){
            return true;
        }
        return false;
    }


}
