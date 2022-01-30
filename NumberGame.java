import java.util.Scanner;

class NumberGame {
    public static void main(String[] args) {
        System.out.println("Test program");        
        
        SecretNumber mySecretNumber = new SecretNumber();
        mySecretNumber.NumberChecker();
    }
}

class SecretNumber {
    private int number;
    public SecretNumber() {
        this.number = (int) (Math.random() * (20 - 1) + 1);
    }
    
    public void setNumber() {
        this.number = (int) (Math.random() * (20 - 1) + 1);
    }

    public int getNumber() {
        return number;
    }

    public void NumberChecker() {
        Scanner scanner = new Scanner(System.in);
        int usersNumber;
        int trysCounter = 0;
        while(true) {
            usersNumber = scanner.nextInt();
            if (this.number < usersNumber) {
                System.out.println("Entered number is greater that secret number");
                trysCounter++;
            } else if (this.number > usersNumber) {
                System.out.println("Entered number is less that secret number");
                trysCounter++;
            } else {                
                System.out.println("Congratulations! You guessed the number!");
                trysCounter++;
                System.out.println("The number of attempts is " + trysCounter);
                break;
            }
        } 
    }    
}
    
    
    
