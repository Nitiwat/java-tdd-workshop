public class FormatPhoneNumber {

    public String removeNonDigit(String input) {
        String Result = input.replace("-","");
        Result = Result.replace(" ","");
        return Result;
    }

    public String solution(String input) {
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
        } else {
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
        }
        return Result;
    }
}
