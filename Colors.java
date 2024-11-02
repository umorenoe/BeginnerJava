
public class Colors {

  public static void main(String args[]) {
    /*
     * For calling instance method you must to instantiate an object of class Blue.
     */
    Blue mySpetialBlue = new Blue();
    mySpetialBlue.instanceMethod();

    /*
    * For calling static method you don't have to instantiate an object,
    * you can just simply call the method using the class name.
    * This could be memory efficient as the code wrapped by static keyword is loaded in the class memory area.
    * Will be helpful for constants or utility methods.
    * You should only write stateless code to ensure thread safety.
    */
    Blue.staticMethod();

    /**
     * But you still can call the static method using an object.
     */
    mySpetialBlue.staticMethod();

    /*
    * But you can't do this, it will end in an compilation error.
    */
    //Blue.instanceMethod();
  }
}