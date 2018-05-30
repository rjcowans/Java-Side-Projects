public class runner{
   public runner(int test){
      // this is your new main.
      
      function1(test);
      System.out.println(function2(test));
      System.out.println(function3(test));
      Chopper chopper = new Chopper();
   }
   
   public void function1(int test){System.out.println(test);}
   public int function2(int test){ return test;}
   public String function3(int test){return "test";}
}