import java.util.LinkedList;
import java.util.List;

public class ParseData {

    List<String> populationStrings;                            //[]     // [ "s0", "a", " a"," as" ]


    public List<String> parseMyData(List<String> myParseData){
    
        populationStrings = new LinkedList<>();

        for(int i = 1; i < myParseData.size(); i++){
            String val = myParseData.get(i);
            String[] terms = val.split(",");           // parse         //20430            // [ad,andorra la vella,Andorra la Vella,07,20430,42.5,1.5166667]

            String popText = terms[4];
            populationStrings.add(popText);
        }
        
        
        return populationStrings;

    }

}
