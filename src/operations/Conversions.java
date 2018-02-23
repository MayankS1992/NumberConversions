package operations;

import java.util.function.Consumer;
import java.util.function.IntConsumer;
import java.util.regex.Pattern;

public class Conversions {
    
    public static void checkNumberType (
            String number,
            Consumer<String> onRomanNumber, IntConsumer onArabicNumber)
    {
        try {
            onArabicNumber.accept(Integer.parseInt(number));
        }
        catch (NumberFormatException e) {
            onRomanNumber.accept(number);
        }
    }

    public static void validateRomanNumber(String romanNumber, Runnable isValid, Consumer<String> onError) {
        if (Pattern.matches("^[IVXLCDM]+$", romanNumber.toUpperCase()))
            isValid.run();
        else
            onError.accept(String.format("Invalid roman digit found in '%s'", romanNumber));
    }

    public static void validateArabicNumber(int arabicNumber, Runnable isValid, Consumer<String> onError) {
    }
}
