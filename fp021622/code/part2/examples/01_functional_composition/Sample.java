import java.util.*;
import java.util.function.*;

public class Sample {
  public static void printIt(
    int n, String msg, Function<Integer, Integer> func) {

    System.out.println(n + " " + msg + ": " + func.apply(n));
  }

  public static void main(String[] args) {
    Function<Integer, Integer> inc = e -> e + 1;

    printIt(5, "incremented", inc);
    printIt(6, "incremented", inc);

    Function<Integer, Integer> doubled = e -> e * 2;
    printIt(5, "doubled", doubled);
    printIt(6, "doubled", doubled);


/*
      -------->| inc |-------->
      -------->| doubled |-------->

                |     incAndDoubled           |
      -------->||---->|inc|---->|doubled|---->||----->
*/

    Function<Integer, Integer> incAndDoubled = inc.andThen(doubled);

    printIt(5, "incremented and doubled", incAndDoubled);
    printIt(6, "incremented and doubled", incAndDoubled);
  }
}

