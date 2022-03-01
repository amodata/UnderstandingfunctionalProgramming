import java.util.*;

public class Sample {
  public static void main(String[] args) {
    List<Integer> numbers = Arrays.asList(1, 2, 3);

    numbers.stream()
      .map(e -> e * 2) //What is e? parameter. What is 2? constant
      .forEach(System.out::println);

    //A lambda is self-contained. It does not depend on anything external.
    //It may use constants and its parameters for its work.

    System.out.println("------");
    int factor = 4;
    
    numbers.stream()
      .map(e -> e * factor) //What is e? parameter. What is factor? **
      .forEach(System.out::println);
  
    //factor is not defined within that anonymous function.
    //We have to look for the factor elsewhere.

    //Where?

    //There are two ways to look for it:
    //1. Look at the caller of the function to provide it - dynamic scoping
    //2. Look at the defining scope of the anonymous function - lexical scoping

    //In this example, the defining scope of the anonymous function
    //e -> e * factor is the main. The defining scope of main is
    //the class' static context (fields)

    //Thus, when using lexical scope, we will look for factor in main
    //and if not present, as a static field in the class.

    //The anonymous function e -> e * factor has to close over the
    //defining scope to bind factor. Because it has to close-over, 
    //it is called a closure. closure is close-over.

    //a lambda does not have any external dependencies.
    //a closure binds to external (immutable) state.
  }
}

