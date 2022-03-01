import java.util.*;
import static java.util.stream.Collectors.*;

public class Sample {
  public static void main(String[] args) {
    List<Integer> numbers = Arrays.asList(1, 2, 3);

    //suppose we have a one-to-one function, f11,
    //then Stream<T>.map(f11) ==> Stream<R>

    List<Integer> result1 = numbers.stream()
      .map(e -> e + 1)
      .collect(toList());

    System.out.println(result1);

    //suppose we have a one-to-many function, f1n,
    //then Stream<T>.map(f1n) ==> Stream<List<R>>
    //is this what we want?

    List<List<Integer>> result2 = numbers.stream()
      .map(e -> Arrays.asList(e - 1, e + 1))
      .collect(toList());

    System.out.println(result2);

    //suppose we have a collection of people. 
    //We ask for a transformation of people to their age.
    //Each person has only one age at the time of asking.
    //Stream<Person>.map(Person::getAge) ===> Stream<Long>

    //We ask for a transformation of people to their email addresses.
    //A person may have zero, one, two, three, ... email addresses.
    //Stream<Person>.map(Person::getEmailAddresses) ===> Stream<List<Addr>>

    //if we want to go from a collection to a collection of collection,
    //you got it.

    //But, what if I want a collection of email addresses, for example,
    //and not a colletion of collection of email addresses?

    List<Integer> result3 = numbers.stream()
      .flatMap(e -> Arrays.asList(e - 1, e + 1).stream())
      .collect(toList());

    System.out.println(result3);

    //If we have a one to one mapping, use map
    //if we have a one to many mapping, then use flatMap to go from
    //a collection to a collection instead of a collection to a collection
    //of collection.

  }
}
