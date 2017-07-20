public class MyRange {
    public String of(String input) {
        String Result = "";
        for(int i =getFirstNumber(input);i<=getLastNumber(input);i++){
            Result += i;
        }
        return Result;
    }

    public int getLastNumber(String input) {
        if (EndSign(input)) {
            return Character.getNumericValue(input.charAt(3));
        } else
            return Character.getNumericValue((input.charAt(3)))-1;
    }

    public boolean EndSign(String input) {
        return input.endsWith("]");
    }

    public boolean FirstSign(String input) {
        return input.startsWith("[");
    }

    public int getFirstNumber(String input) {
        if (FirstSign(input)) {
            return Character.getNumericValue(input.charAt(1));
        } else
            return Character.getNumericValue(input.charAt(1))+1;
    }
}
