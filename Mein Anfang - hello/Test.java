public class Test {

   /* This is my first java program.
    * This will print 'Hello World' as the output
    */

   public static void main(String []argumente) {
    if(argumente.length == 0) {
        System.out.println("Hello World");
    } else if(argumente.length == 1) {
        System.out.println("hi salam " +argumente[0]);
    } else {
        System.out.println("hallo " + argumente[1] + " und " + argumente[0]);
    }
   }
}