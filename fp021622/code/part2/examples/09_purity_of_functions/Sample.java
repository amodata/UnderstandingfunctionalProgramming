import java.util.*;

public class Sample {
  public static void main(String[] args) {
    //A lambda should be pure, that is it should not have any side-effects.
    //Each time we call a pure function with the same input we get the
    //same output. Pure functions are idempotent.

    //Two rules for purity:
    //1. A pure function does not modify any external state
    //2. A pure function does not depend on any external state that may possibly change

    Arrays.asList(1, 2, 3).stream()
      .map(e -> e * 2) //is this lambda a pure function?
      .forEach(System.out::println);

    //Yes because it does not change anything and it does not depend on
    //any external state.

    final int factor = 2;
    Arrays.asList(1, 2, 3).stream()
      .map(e -> e * factor) //is this lambda/closure a pure function?
      .forEach(System.out::println);

    //Yes because the function does not change anything and the factor
    //is immutable.

    int[] stuff = new int[] { 2 };
    Arrays.asList(1, 2, 3).stream()
      .map(e -> e * stuff[0]) //is this lambda/closure a pure function?
      .forEach(System.out::println);


  }
}
