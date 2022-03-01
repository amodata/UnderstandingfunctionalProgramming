import java.util.*;

public class Sample {
  public static void main(String[] args) {
    List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6);

    numbers.stream()
      .filter(e -> e % 2 == 0)
      .map(e -> e * 2.0)
      .forEach(System.out::println);
  }
}

/*
map is a transformation

Given [x1, x2,..., xi,..., xn]
and
f(x) that gives y

[x1, x2,..., xi,..., xn].map(f) ===> [y1, y2,..., yi,..., yn]

Logically speaking map transforms each element in the given collection 

# of elements in the output == # of elements in the input
But, the type and the value in the output may be different from that of the
input.

map takes a Function as its parameter

Stream<T>.map(Function<T, R>) ==> Stream<R>

*/
