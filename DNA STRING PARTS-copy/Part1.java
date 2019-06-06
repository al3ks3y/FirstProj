import edu.duke.*;
import java.io.*;
/**
 * Write a description of class Part1 here.
 *
 * @author (Alex)
 * @version (a version number or a date)
 */
public class Part1
{
    // instance variables - replace the example below with your own
    private int x;
    

    
    public String findGeneSimple (String dna)
    {
        String result = "";
        int startIndex = dna.indexOf("ATG");
        if (startIndex==-1){
            return "";
        }
        int endIndex = dna.indexOf("TAA",startIndex+3);
        if (endIndex==-1){
            return "";
        }
        result =dna.substring(startIndex, endIndex+3);
        return result;
    }

    
    public void TestSimpleGene()
    { String dna1= new String ("ATTTTGTTTATTTTCGGATAATGTGGGATCTATTCTAGGTAAGGTATTTTC");
      System.out.println("Dna was " + dna1);
      String gene =findGeneSimple(dna1);
      System.out.println("Gene is "+ gene);
      System.out.println();
       String dna2= new String ("GCGGGATGTTTTTGATAATT");
      System.out.println("Dna was " + dna2);
      String gene2 =findGeneSimple(dna2);
      System.out.println("Gene is "+ gene2);
      
    }
}
