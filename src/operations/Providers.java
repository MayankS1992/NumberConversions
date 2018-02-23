package operations;

import contract.IInputProvider;
import contract.IOutputProvider;

import java.util.Scanner;

public class Providers implements IInputProvider, IOutputProvider {
    @Override
    public String number() {
        System.out.print("Please Enter a Roman/Arabic Number.");
        try(Scanner number = new Scanner(System.in)){
            return number.nextLine().trim();
        }
    }

    @Override
    public void displayResult(String result) {
        System.out.println(result);
    }

    @Override
    public void displayError(String errorMessage) {
        System.out.println("---- Error Message -----"+errorMessage);
    }
}
