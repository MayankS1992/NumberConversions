package contract;

public interface IOutputProvider {
    /**
     * display Result after Conversion
     * @param result
     */
    void displayResult(String result);

    /**
     * display Error
     * @param errorMessage
     */
    void displayError(String errorMessage);
}
