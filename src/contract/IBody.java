package contract;

import java.util.function.Consumer;

/**
 * @author Mayank
 * Contract which is responsible for converting a number either from Arabic to Roman or Roman to Arabic
 */
@FunctionalInterface
public interface IBody {

    /**
     *
     * @param number
     * @param result
     * @param errorMessage
     */
    void convert(String number, Consumer<String> result, Consumer<String> errorMessage);
}
