public class Berechnung {
   public static void main(String args[]) {
      Integer a = Integer.parseInt( args[0] );
      Integer b = Integer.parseInt( args[2] );
      String art = args[1];

      System.out.print(a + " " + art + " " + b + " = ");

      if(art.equals("+")) {
          System.out.print( a+b );
      } else if(art.equals("x")) {
          System.out.print( a*b );
      } else if(art.equals("/")) {
          System.out.print( a/b ); 
          System.out.print( " Rest: " ); 
          System.out.println( a%b ); 
          System.out.print( 1.0*a/b ); 
      } else if(art.equals("-")) {
          System.out.print( a-b );
      } else {
         System.out.print( "UNBEKANNT" );
      }
  }
}