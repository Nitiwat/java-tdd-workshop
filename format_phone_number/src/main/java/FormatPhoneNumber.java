public class FormatPhoneNumber {

    public String removeNonDigit(String input) {
        String x = input.replace("-","");
        x = x.replace(" ","");
        return x;

    }

    public String solution(String input) {
        String x = "";
        if(removeNonDigit(input).length()==9) {
            for (int i = 0; i < input.length(); i++) {
                if (i == 3) {
                    x += "-" + input.charAt(i);
                } else if (i == 6) {
                    x += "-" + input.charAt(i);
                } else
                    x += input.charAt(i);
            }
        } else
        for (int i = 0; i < removeNonDigit(input).length(); i++) {
            if (i == 3) {
                x += "-" + removeNonDigit(input).charAt(i);
            } else if (i == 6) {
                x += "-" + removeNonDigit(input).charAt(i);
            } else if (i == 9) {
                x += "-" + removeNonDigit(input).charAt(i);
            } else  if (i == 12) {
                x += "-" + removeNonDigit(input).charAt(i);
            } else
                x += removeNonDigit(input).charAt(i);
        }
        return x;
    }

}
