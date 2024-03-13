package streamAPI;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class StreamAPIPractice{
public static void main(String[] args)
{
   String[] ar ={"amruta", "pratima","kajal","Amu","Gau"};
   List<String> list = Arrays.asList(ar);
   List<String> sorted = list.stream().sorted().collect(Collectors.toList());
   System.out.println("Sorted list is: " + sorted);
   
   List<String> reverse = list.stream().sorted(Comparator.reverseOrder()).collect(Collectors.toList());
   System.out.println("Reverse sorted list is: " + reverse);
}
}
