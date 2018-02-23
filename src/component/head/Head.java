package component.head;

import component.body.Body;
import contract.IBody;
import contract.IInputProvider;
import contract.IOutputProvider;

public class Head {
    IInputProvider input;
    IOutputProvider output;
    IBody body;

    public Head(IInputProvider input, IBody body, IOutputProvider output) {
        this.input = input;
        this.body = body;
        this.output = output;
    }

    public void run() {
        //Read Number
        String number = input.number();
        //Convert
        body.convert(number, result -> output.displayResult(result), errorMessage -> output.displayError(errorMessage) );
    }
}
