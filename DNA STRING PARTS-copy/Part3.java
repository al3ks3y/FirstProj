
/**
 * Write a description of class Part3 here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Part3
{
    // instance variables - replace the example below with your own
    public boolean twoOcurrences (String stringa, String stringb)
    {
        boolean result = false;
        int startIndex = stringa.indexOf(stringb);
        if (startIndex==-1){
            return false;
        }
        int secondIndex = stringa.indexOf(stringb,startIndex+stringb.length());
        if (secondIndex>=1){
            result =true;
        }
        return result;
    }

    
    public void Test2occurSimpleGene()
    { String dna1= new String ("A story by Abby Long");
      System.out.println("Text was " + dna1);
      boolean gene =twoOcurrences(dna1, "by");
      System.out.println("Occurred twice = " + gene);
       String dna2= new String ("GCGGGATGTTTTTGATAATT");
      System.out.println("text was " + dna2);
      boolean gene2 =twoOcurrences(dna2,"GG");
      System.out.println("Occurred twice = " + gene2);
      String dna3= new String ("Olga goes to Olginsk");
      System.out.println("text was " + dna3);
      boolean gene3 =twoOcurrences(dna3,"Ol");
      System.out.println("Occurred twice = " + gene3);
      
    }
}
