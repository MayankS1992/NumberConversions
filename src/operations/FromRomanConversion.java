package operations;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;


public class FromRomanConversion {

    static Map<Character,Integer> R2A = new HashMap<Character, Integer>();
    static {
        R2A.put('I',1);
        R2A.put('X',10);
        R2A.put('V',5);
        R2A.put('L',50);
        R2A.put('C',100);
        R2A.put('D',500);
        R2A.put('M',1000);
    }

    /**
     * From Roman to Arabic Conversion
     * @param romanNumber
     * @return arabicNumber
     */
    public static int convert(String romanNumber) {
        int[] values = mapRomanToArabicNumbers(romanNumber);  //maps Roman charecters to Arabic numbers
        int[] negatedValues = applySubtractionRule(values);   //Subtration Rule
        int arabicNumber = sumOf(negatedValues);              //Sum of arabic Numbers
        return arabicNumber;
    }

    /**
     * Maps Roman charecters to Arabic characters
     * @param romanNumber
     * @return
     */
    private static int[] mapRomanToArabicNumbers(String romanNumber){
        return romanNumber.chars().map(Character::toUpperCase).map(value->R2A.get((char)value)).toArray();
    }

    /**
     * Applies the subtraction Rule on the arabic characters
     * @param values
     * @return
     */
    private static int[] applySubtractionRule(int[] values){
        int[] negatedValues = new int[values.length];
        System.arraycopy(values,0, negatedValues, 0, values.length);

        for(int i=0; i<negatedValues.length-1;i++){
            if(negatedValues[i+1]>negatedValues[i]){
                negatedValues[i]*= -1;
            }
        }
        return negatedValues;
    }

    private static int sumOf(int[] negatedValues){
        return Arrays.stream(negatedValues).reduce(0,Integer::sum);
    }

}
