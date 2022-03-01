import java.util.*;

public class Sample {
  public static void main(String[] args) {
    //imperative style is where we tell what to do and also how to do it
    //declarative style is where we tell what to do but *not* how to do it

    List<String> names = Arrays.asList("Dory", "Gill", "Bruce", "Nemo", "Darla", "Marlin", "Jacques");

    //Is Nemo there?
    if(names.contains("Nemo")) {
      System.out.println("Nemo found");
    } else {
      System.out.println("Nemo not found");
    }
  }
}

//Declarative style has less accidental complexity
//There is no explicit mutability
//this honors better software design principles, like 
//Single Level of Abstraction Principle (SLAP)
//easier to understand and easier to modify
