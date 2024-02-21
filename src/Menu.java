import java.util.Scanner;

class Menu {

    Scanner scanner = new Scanner(System.in);
    int dollChoice;
    int operationChoice;

    // Doll LIST
    RussianDoll doll1 = new RussianDoll(2);
    RussianDoll doll2 = new RussianDoll(4);
    RussianDoll doll3 = new RussianDoll(6);
    RussianDoll doll4 = new RussianDoll(8);
    RussianDoll selectedDoll = null;

    void menu() {
        do {
            System.out.println("-----------------------------");
            System.out.println("|\t\tDoll list            |");
            System.out.println("-----------------------------");
            System.out.println("|\t1 --> Doll 1             |");
            System.out.println("|\t2 --> Doll 2             |");
            System.out.println("|\t3 --> Doll 3             |");
            System.out.println("|\t4 --> Doll 4             |");
            System.out.println("-----------------------------");
            System.out.println("Enter your choice");
            dollChoice = scanner.nextInt();

            if (dollChoice < 1 || dollChoice > 4) {
                System.out.println("Error! Your choice must be between 1 and 4");
            }

        } while (dollChoice < 1 || dollChoice > 4);


        switch (dollChoice) {
            case 1:
                selectedDoll = doll1;
                break;
            case 2:
                selectedDoll = doll2;
                break;
            case 3:
                selectedDoll = doll3;
                break;
            case 4:
                selectedDoll = doll4;
                break;
        }

        System.out.println("------PLAY WITH THE DOLL-----");
        System.out.println("Press 1 to open the doll");
        System.out.println("Press 2 to close the doll");
        System.out.println("Press 3 to put the doll1 in the doll2");
        System.out.println("Press 4 to take the doll from another");
        operationChoice = scanner.nextInt();

        switch (operationChoice) {
            case 1:
                selectedDoll.Open();
                break;
            case 2:
                selectedDoll.Close();
                break;
            case 3:
                System.out.println("Enter the doll number to put inside (1-4): ");
                int targetDollNumber = scanner.nextInt();

                RussianDoll targetDoll = null;
                switch (targetDollNumber) {
                    case 1:
                        targetDoll = doll1;
                        break;
                    case 2:
                        targetDoll = doll2;
                        break;
                    case 3:
                        targetDoll = doll3;
                        break;
                    case 4:
                        targetDoll = doll4;
                        break;
                    default:
                        System.out.println("Invalid target doll choice");
                        break;
                }

                if (targetDoll != null && isDollLarger(targetDoll)) {
                    selectedDoll.putIn(targetDoll);

                }
                break;
            case 4:
                System.out.println("from where?");
                int takeOff = scanner.nextInt();
                RussianDoll from = null;
                switch (takeOff) {
                    case 1:
                        from = doll1;
                        break;
                    case 2:
                        from = doll2;
                        break;
                    case 3:
                        from = doll3;
                        break;
                    case 4:
                        from = doll4;
                        break;
                    default:
                        System.out.println("Invalid target doll choice");
                        break;
                }

                if (from != null) {
                    selectedDoll.pullOut(from);

                }
                break;
            default:
                System.out.println("Invalid operation choice");
        }
        menu();

    }
    boolean isDollLarger(RussianDoll checkDoll) {
        boolean larger = true;
        System.out.println("Selected Doll Size: " + selectedDoll.getSize());
        System.out.println("Target Doll Size: " + checkDoll.getSize());
        if (selectedDoll.getSize() < checkDoll.getSize()) {
            return larger;
        }
        else if (selectedDoll.getSize() > checkDoll.getSize()){
            System.out.println("Error! The selected doll is not larger than the target doll.");
            return !larger;
        }
        return larger;
    }
}


