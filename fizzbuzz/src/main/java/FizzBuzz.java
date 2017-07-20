public class FizzBuzz {
    public static String say(int input) {
         if(input%15==0){
             return "FizzBuzz";
         } else if (input%3==0){
             return "Fizz";
         } else if (input%5==0){
             return "Buzz";
         }
        return String.valueOf(input);
    }

    public static void main(String[] args) {
        for(int runtime=1;runtime<=30;runtime++){
            System.out.println("Input ="+runtime+"\t=> output = "+say(runtime));
        }

    }

}