package component.body;

import contract.IBody;
import operations.Conversions;
import operations.FromRomanConversion;
import operations.ToRomanConversion;

import java.util.function.Consumer;

public class Body implements IBody {
    @Override
    public void convert(String number, Consumer<String> success, Consumer<String> onError) {
        Conversions.checkNumberType(number,
                romanNumber -> Conversions.validateRomanNumber(romanNumber,
                        ()->{
                            int result = FromRomanConversion.convert(romanNumber);
                            success.accept(Integer.toString(result));
                        }, onError),
                arabicNumber -> Conversions.validateArabicNumber(arabicNumber,
                        ()->{
                            String result = ToRomanConversion.convert(arabicNumber);
                            success.accept(result);
                        }, onError));
    }
}
