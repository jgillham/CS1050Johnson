package CS1050_005.James_Curran;

import java.io.*;

public class Assignment4JamesCurran
{
    BufferedWriter outputFile = null;
    // Example code for writing file
    /**
     *  javadoc here
     */
    public BufferedWriter  openOutputFile( String givenFilename)  throws IOException
    {  
       BufferedWriter output = null;
       try 
       {
         File file = new File(givenFilename);
         output = new BufferedWriter(new FileWriter(file));
       } 
       catch ( IOException e ) 
       {            
         e.printStackTrace();         
         throw e;
       }
       return output;
    }  // end method openOutputFile
    /**
     *  javadoc here
     */
    public void writeStringToOutputfile( String givenString )
    {
      try 
      {
         getOutputFileHandle().write( givenString );  
      } 
      catch ( IOException e ) 
      {            
         e.printStackTrace();         
      }
    }  /// end method writeStringToOutputfile
    /**
     *  javadoc here
     */
    public void closeOutputfile()
    {
        try
        {
            getOutputFileHandle().close();         
        }
        catch ( IOException e )
        {
            e.printStackTrace();
        }
    }  // end method closeOutputfile
    /**
     *  javadoc here
     */
    public BufferedWriter getOutputFileHandle( )
    {
      return ( outputFile ); // return class instance of the opened output file
    }  // end method getOutputFileHandle
    /**
     *  javadoc here for public void setOutputFileHandle
     *
     *  @param givenOpenedOutputfile - type BufferedWriter an opened BufferedWriter
     *         that will be used for writting out strinf on this class instance          
     */
    public void setOutputFileHandle( BufferedWriter givenOpenedOutputfile )
    {
      this.outputFile = givenOpenedOutputfile; // store in class instance the opened output file
    }  // end method setOutputFileHandle
}
