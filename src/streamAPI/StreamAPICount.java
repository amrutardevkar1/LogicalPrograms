package streamAPI;
import java.util.Arrays;
import java.util.List;
import java.lang.Integer;

public class StreamAPICount{

 public static void main(String[] args)
  {
    Integer[] an ={1,2,3,4,5,6,7,8,9,10};
    List<Integer> listn = Arrays.asList(an);

    long count = listn.stream().filter((n) -> {n%3 ==0;}).count();
  }
}
