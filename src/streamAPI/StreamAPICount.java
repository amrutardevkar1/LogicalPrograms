package streamAPI;
import java.util.Arrays;
import java.util.List;
import java.lang.Integer;

public class StreamAPICount{

 public static void main(String[] args)
  {
    Integer[] an ={1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18};
    List<Integer> listn = Arrays.asList(an);
    
    System.out.println(listn);
     long count1 = listn.stream().filter((n) ->  (n % 2)==0).count();
    System.out.println("Count of numbers divisible by 2: " + count1);
    
    long count = listn.stream().filter((n) ->  (n % 3)==0).count();
    System.out.println("Count of numbers divisible by 3: " + count);
    
    long count2 = listn.stream().filter((n) ->  (n % 4)==0).count();
    System.out.println("Count of numbers divisible by 4: " + count2);
    
    long count3 = listn.stream().filter((n) ->  (n % 5)==0).count();
    System.out.println("Count of numbers divisible by 5: " + count3);
    
    long count4 = listn.stream().filter((n) ->  (n % 6)==0).count();
    System.out.println("Count of numbers divisible by 6: " + count4);
    
    long count5 = listn.stream().filter((n) ->  (n % 7)==0).count();
    System.out.println("Count of numbers divisible by 7: " + count5);
    
    long count6 = listn.stream().filter((n) ->  (n % 8)==0).count();
    System.out.println("Count of numbers divisible by 8: " + count6);

    
    
  }
}
