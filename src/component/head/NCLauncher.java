package component.head;

import component.body.Body;
import component.head.Head;
import contract.IInputProvider;
import contract.IOutputProvider;
import operations.Providers;

public class NCLauncher {
    public static void main(String args[]){
        Providers provider = new Providers();
        IInputProvider input = provider;
        IOutputProvider output = provider;

        Body body = new Body();
        Head head = new Head(input, body, output);

        head.run();

    }
}
