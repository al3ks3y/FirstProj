
/**
 * Write a description of class Part2 here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Part2
{
    // instance variables - replace the example below with your own
    public String findGeneSimple (String dna, String startCodon, String endCodon)
    {
        String result = "";
        int startIndex = dna.indexOf(startCodon);
        if (startIndex==-1){
            return "";
        }
        int endIndex = dna.indexOf(endCodon,startIndex+3);
        if (endIndex==-1){
            return "";
        }
        result =dna.substring(startIndex, endIndex+3);
        return result;
    }

    
    public void TestSimpleGene()
    { String dna1= new String ("ATTTTGTTTATTTTCGGATAATGTGGGATCTATTCTAGGTAAGGTATTTTC");
      System.out.println("Dna was " + dna1);
      String gene =findGeneSimple(dna1, "ATG", "TAA");
      System.out.println("Gene is "+ gene);
      System.out.println();
       String dna2= new String ("GCGGGATGTTTTTGATAATT");
      System.out.println("Dna was " + dna2);
      String gene2 =findGeneSimple(dna2,"ATG", "TAA");
      System.out.println("Gene is "+ gene2);
      
    }
}

