import java.util.*;
import static java.util.stream.Collectors.*;

public class Sample {
  public static boolean isLength5(String name) {
    System.out.println("isLength5 called for " + name);
    return name.length() == 5;
  }

  public static String transform(String name) {
    System.out.println("transform called for " + name);
    return name.toUpperCase();
  }

  public static void main(String[] args) {
    List<String> names = Arrays.asList("Dory", "Gill", "Bruce", "Nemo", "Darla", "Marlin", "Jacques");

    //find the first name, in uppercase, but of length 5
    //imperative
    String result = null;//smell

    for(String name: names) {
      if(isLength5(name)) {
        result = transform(name);
	break;
      }
    }
    //how much work? 4 units of work

    System.out.println(result);

    System.out.println("-------");

    //functional
    System.out.println(
      names.stream()
        .filter(Sample::isLength5)
	.map(Sample::transform)
	.findFirst()
	.orElse(""));

    //Good news. Streams are lazy. Functional programming relies on
    //lazy evaluation for performance

    //The stream does not run a given function, like in filter,
    //on all the elements in the collection.

    //There are two kinds of operations: intermediate and terminal.
    //intermediate operations (like filter, map) fuse together 
    //but are not run until a terminal operation is triggered.

    //Polymorphism is to object oriented programming as 
    //lazy evaluation is to functional programming
  }
}

