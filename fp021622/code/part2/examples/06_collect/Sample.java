import java.util.*;
import static java.util.stream.Collectors.*;

public class Sample {
  public static void main(String[] args) {
    List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6);

    List<Integer> result = numbers.stream()
      .filter(e -> e % 2 == 0)
      .map(e -> e * 2)
      .collect(toList()); //collect is a special form of reduce

    System.out.println(result);
  }
}

