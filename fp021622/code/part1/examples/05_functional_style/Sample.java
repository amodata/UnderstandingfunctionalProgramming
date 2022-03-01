import java.util.*;

public class Sample {
  public static void main(String[] args) {
    //functional style == declarative style + higher-order functions

    //Not all declarative style is functional, but all functional style
    //is declarative.

    List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);

    //imperative style
    int result = 0;

    for(int e: numbers) { //external iterator - we control the iteration with ++, next(), break, continue, etc.
      if(e % 2 == 0) {
        result += e * 2;
      }
    }

    System.out.println(result);

    //functional style
    System.out.println(
      numbers.stream() //internal iterator - the iteration is on autopilot
        .filter(e -> e % 2 == 0) //declarative + higher-order === functional
	.mapToInt(e -> e * 2) //declarative + higher-order === functional
	.sum() //declarative 
    );
  }
}

/*
Rather than thinking about the data as a variable and functions as
mutatator on that data or variable, we think of the functions as
a series of transformations of data.

Think about data transformation rather than data mutation.

Think of this as data flow though a series of function.

This is a very powerful idea that we have seen in many places.

Some examples of such flow of data or simply a flow...

Collection pipeline pattern.


cat myfile.txt | grep "something" | sed ... | wc -l
source         | filter           | map     | reduce (like sum)
air            | purifier         | heater  |...
water          | purifier'        | cooler  |...

functional pipline - pipeline of functions

cascade method pattern
*/
