public class MyRange {
    public String of(String input) {
        return null;
    }

    public int getLastNumber(String input) {
        return Character.getNumericValue(input.charAt(3));
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
