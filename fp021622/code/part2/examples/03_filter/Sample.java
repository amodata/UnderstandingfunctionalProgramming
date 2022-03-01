import java.util.*;

public class Sample {
  public static void main(String[] args) {
    List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6);

    numbers.stream()
      .filter(e -> e % 2 == 0)
      .forEach(System.out::println);
  }
}

//filter
//takes a Predicate as argument
// 0 <= # of elements in the output <= # of elements in the input
// the output is a subset of the input, no new elements

//think of a filter like a garage gate
