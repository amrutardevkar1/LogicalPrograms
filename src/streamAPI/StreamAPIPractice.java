package streamAPI;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class StreamAPIPractice{
public static void main(String[] args)
{
   String[] ar ={"amruta", "pratima","kajal,"Amu","Gau"};
   List<String> list = Arrays.asList(ar);
   List<String> sorted = list.stream().sorted().collect(Collector.toList());
   
   List<String> reverse = list.stream().sorted(Comparator.reverseOrder()).collect(Collector.toList());
}
}
