package src;
import src.Input.*;
// This is your appName class where all of your program will be housed. It can allow for static and non static methods and allows more flexibility at the entrypoint.
// This is useful to keep beginner programmers in java from overusing the static class which can become very problematic if used incorrectly.
public class yourAppNameHere{
   public yourAppNameHere(String args[]){
      // In this example we have retained the string args if you brought in additional external.
      // Any other parameters you would want to pass into the main should be passed into this class constructor.

      int test = 3;
      String firstAppConstructor = "This was called in the first class yourApplication uses.";
      String firstClassMethod = "This was called using the first method of the first class yourApplication uses.";

      function1(test);
      System.out.println(function2(test));
      System.out.println(function3(test));

      inputClass input = new inputClass(firstAppConstructor);
      input.tellInformation(firstClassMethod);
   }
   
   public void function1(int test){System.out.println(test);}
   public int function2(int test){ return test;}
   public String function3(int test){return "test";}
}
