package Switch;

public class Main {
    public static void main(String[] args) {
        int value = 1;
        if(value == 1) {
            System.out.println("Value was 1");
        } else if (value == 2){
            System.out.println("Value was 2");
        }else {
            System.out.println("Was not 1 or 2");
        }

        int switchValue = 3;

        switch(switchValue) {
            case 1:
                System.out.println("Value was 1");
                break;

            case 2:
                System.out.println("Value was 2");
                break;

            case 3: case 4: case 5:
                System.out.println("was a 3, or a 4 , or a 5");
                System.out.println("Actually it was a " + switchValue);
                break;

            default:
                System.out.println("Was not 1 or 2");
                break;
        }

        // create a new switch statement using char instead of int
        // create a new char variable
        // create a switch statement testing for
        // A, B, C, D, or E
        // display a message if any of these are found and then break
        // add a default which displays a message saying not found

        String charSwitchValue = "R";

        switch (charSwitchValue){
            case "A":
                System.out.println("Value was " + charSwitchValue);
                break;

            case "B":
                System.out.println("Value was " + charSwitchValue);
                break;

            case "C":
                System.out.println("Value was " + charSwitchValue);
                break;

            case "D":
                System.out.println("Value was " + charSwitchValue);
                break;

            case "E":
                System.out.println("Value was " + charSwitchValue);
                break;

            default:
                System.out.println("Not Found");
        }

        String month = "january";
        switch (month.toLowerCase()) {
            case "january":
                System.out.println("Jan");
                break;
            case "june":
                System.out.println("Jun");
                break;
            default:
                System.out.println("Not Sure");
        }
    }
}
