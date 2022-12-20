import java.io.IOException;
import java.util.List;

public class SumData {

    ReadFile readFile = new ReadFile(); 


    

    ParseData a = new ParseData();

    public void SumDataMethod() throws IOException{

        List<String> lines =  readFile.getLines("./data/worldcitiespop.csv");

         a.parseMyData(lines).stream().map(i->Integer.parseInt(i)).reduce(0, (a, b) -> a + b);


    }



    
}
