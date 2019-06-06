import edu.duke.*;
import java.io.*;
public class Part4
{
    // instance variables - replace the example below with your own
    public String findyoutube (URLResource ur)
    {
        //URLResource ur= new URLResource("http://www.dukelearntoprogram.com/course2/data/manylinks.html");
        String yt= "youtube.com";
        String url= "";
        for (String word : ur.words()) {
        word.toLowerCase(); //to lowercase
        int foundIndex = word.indexOf(yt); //looking for youtube.com
        if (foundIndex!=-1){ //if found    
            int startIndex = word.indexOf("\"");
        if (startIndex==-1){
            return "";
        }
        int endIndex = word.indexOf("\"",startIndex+1);
        if (endIndex==-1){
            return "";
        }
        url =word.substring(startIndex, endIndex-1);
        //System.out.println(url);
        
        }
        
}
      return url;  
    }

    
    public void Test2occurSimpleGene()
    { URLResource ur= new URLResource("http://www.dukelearntoprogram.com/course2/data/manylinks.html");
      String result = new String();
        result =findyoutube(ur);
      System.out.println(result);
    }
}
