public class FormatPhoneNumber {

    public static void main(String[] args) {
        System.out.println(solution("1234-567 89- "));
        System.out.println(solution("1234-567-89 0"));
        System.out.println(solution("123-4 5-6  7-890 12- 3 -4 "));
        System.out.println(solution("1234-567312323124 89- "));
    }

    public static String removeNonDigit(String input) {
        String Result = input.replace("-","");
        Result = Result.replace(" ","");
        return Result;
    }

    public static String solution(String input) {
        String Result = "";
        String Input = removeNonDigit(input);
        if (Input.length() == 9) {
            for (int Index = 0; Index < Input.length(); Index++) {
                if (Index == 3) {
                    Result += "-" + Input.charAt(Index);
                } else if (Index == 6) {
                    Result += "-" + Input.charAt(Index);
                } else
                    Result += Input.charAt(Index);
            }
        } else if (Input.length() == 14) {
            for (int Index = 0; Index < Input.length(); Index++) {
                if (Index == 3) {
                    Result += "-" + Input.charAt(Index);
                } else if (Index == 6) {
                    Result += "-" + Input.charAt(Index);
                } else if (Index == 9) {
                    Result += "-" + Input.charAt(Index);
                } else if (Index == 12) {
                    Result += "-" + Input.charAt(Index);
                } else
                    Result += Input.charAt(Index);
            }
        } else if (Input.length() == 10) {
            for (int Index = 0; Index < Input.length(); Index++) {
                if (Index == 3) {
                    Result += "-" + Input.charAt(Index);
                } else if (Index == 6) {
                    Result += "-" + Input.charAt(Index);
                } else if (Index == 8) {
                    Result += "-" + Input.charAt(Index);
                } else
                    Result += Input.charAt(Index);
            }
        } else {
            return "It isn't Phone Number!!!";
        }
        return Result;
    }
}
