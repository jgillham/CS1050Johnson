package CS1050_005.James_Curran;

import java.util.Scanner;
import CS1050_005.James_Curran.Assignment4JamesCurran;
import java.io.*;

public class TestDriverAssignment4JamesCurran
{
  public static void main (String[] args) throws IOException
  {
    Scanner keyboard = new Scanner(System.in);
    System.out.println( "What is the minimum length?" ); 
    
    int i = keyboard.nextInt();
    Assignment4JamesCurran A4 = new Assignment4JamesCurran();
    System.out.println( "Enter a String:" );
    /** Functions in Assignment4JamesCurran do not exist, yet
    A4.setGivenString( keyboard.nextLine() );
    while( !A4.stringLongEnough( A4.getGivenString() ) )
    {
      System.out.println( "Please enter another String:" );
      A4.setGivenString( keyboard.nextLine() );
    }
    System.out.println( "URL and filename:" );
    String filename = keyboard.nextLine();
    A4.setInputFileHandle( A4.openDataFile( filename ) );
    
    filename = "outputfile.txt"; 
    
    A4.setOutputFileHandle( A4.openOutputFile ( filename ) );
    boolean caseCheck = false;
    while ( A4.getInputFileHandle().hasNextLine() )
    {
      String temporary = getInputFileHandle().nextLine();
      if ( A4.stringExists( temporary, A4.getGivenString(), caseCheck ) )
      {
        A4.WriteStringtoOutputFile().println( temporary );
      } 
    }
    */
  }
}
     
