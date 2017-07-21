import java.util.ArrayList;
import java.util.List;

public class PrimeFactor {
    public List<Integer> of(int number) {
        List<Integer> list = new ArrayList<Integer>();
        do {
            if (number != 1 && number % 2 == 0) {
                list.add(2);
                number = number / 2;
            } else if (number % 3 == 0) {
                list.add(3);
                number = number / 3;
            }else
                return list;
        }while (number>0);

        return list;
    }
}
