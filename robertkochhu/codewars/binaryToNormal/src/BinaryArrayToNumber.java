import java.util.List;

public class BinaryArrayToNumber {

    public static int ConvertBinaryArrayToInt(List<Integer> binary) {
        int theNumber = 0;
        for (int i = 0; i < binary.size(); i++) {
            if (binary.get(i) == 1) {
                theNumber += Math.pow(2, binary.size() - 1 - i);
            }
        }
        return theNumber;
    }
}