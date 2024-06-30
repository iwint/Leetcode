package Easy;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;

public class FizzBuzz {

    public List<String> fizzBuzz(int n) {
       ArrayList<String> list = new ArrayList<>();

       String fizz = "Fizz";
       String buzz = "Buzz";
       String fizz_buzz = "FizzBuzz";


        for (int i = 1; i <= n ; i++) {
           if(i % 3 == 0 && i%5 == 0){
               list.add(fizz_buzz);
           } else if (i%3 ==0) {
               list.add(fizz);
           } else if (i%5==0) {
               list.add(buzz);
           }else {
               list.add(Integer.toString(i));
           }
        }

        return list;

    }
}
