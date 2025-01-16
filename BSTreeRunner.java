//(c) A+ Computer Science
//www.apluscompsci.com

//Name - Bilvani Kondabolu

//import jdk.incubator.vector.VectorOperators;

import static java.lang.System.*;

public class BSTreeRunner
{
   public static void main( String args[] )
   {
 		//add test cases here
      BinarySearchTree test = new BinarySearchTree();
      test.add(90);
      test.add(80);
      test.add(70);
      test.add(85);
      test.add(100);
      test.add(98);
      test.add(120);
      System.out.println("IN ORDER");
      test.inOrder();
      System.out.println("REVERSE ORDER");
      test.revOrder();
      System.out.println(" ORDER");

   }
}