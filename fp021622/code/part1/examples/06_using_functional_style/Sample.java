import java.util.*;

public class Sample {
  public static void main(String[] args) {
    List<String> names = Arrays.asList("Dory", "Gill", "Bruce", "Nemo", "Darla", "Marlin", "Jacques");

    //find if there are any names of length 5
    //In the imperative style we think of the how
    //In the declarative and functional style we think of the whats

    //imperative style
    boolean found = false;

    for(String name: names) {
      if(name.length() == 5) {
        found = true;
	break;
      }
    }

    System.out.println("Has any name of length 5? " + found);

    //functional style
    //think of this as a series of transformation and/or functions we can
    //delegate to

    //in the given list of names, does any match the predicate length == 5

    System.out.println("Has any name of length 5? " + names.stream()
      .anyMatch(name -> name.length() == 5));

    //anyMatch will not check every single value in the collection.
    //It will shortcircuit the computation. If a value is met, it will
    //immedately stop and waste no computations.

    //The computational complexity of imperative style and functional style
    //code are one and the same if both are written properly

    //The same performance but a greater benefit from the point of view
    //of code redability and maintainbility
  }
}
