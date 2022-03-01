import java.util.*;

public class Sample {
  public static void main(String[] args) {
    //imperative style is where we tell what to do and also how to do it

    List<String> names = Arrays.asList("Dory", "Gill", "Bruce", "Nemo", "Darla", "Marlin", "Jacques");

    //Is Nemo there?

    boolean found = false;

    //for(int i = 0; i < names.size(); i++) //how but that is too verbose
    for(String name: names) {
      //if(name == "Nemo") //No
      if(name.equals("Nemo")) { //how
        found = true;
	break; //how
      }
    }

    if(found) {
      System.out.println("Nemo found");
    } else {
      System.out.println("Nemo not found");
    }
  }
}

//Imperative style is packed with accidental complexity
//It gets verbose and tiring over time
//Easier to get things wrong, error prone
//Often involves garbage variables
//Often has mutability
//hard to reason, hard to parallelize

