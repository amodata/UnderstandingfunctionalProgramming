import java.util.*;

public class Sample {
  public static void main(String[] args) {
/*
Functions:
we can pass data/objects to a function
we can create data/objects in a function
we can return data/objects from a function

Higher-Order functions:
we can pass functions a function
we can create functions in a function
we can return functions from a function

In addition to doing object decomposition we can also do functional decomposition
*/

    //Thread thread = new Thread(new Runnable() {
    //  public void run() {
    //    System.out.println("In another thread");
    //  }
    //});
    //This is the old idiology of Java where we were allowed to pass
    //only object and not function.

    //But, in the new Java
    Thread thread = new Thread(() -> System.out.println("In another thread"));

    //We pass a function, albeit an anonymous function, to Thread's constructor
    //In this case, the Thread's constructor is a higher-order function

    //We are able to treat a function as a first class citizen.

    //Code as data or we can pass functions like we pass data

    thread.start();
    System.out.println("In main");
  }
}

