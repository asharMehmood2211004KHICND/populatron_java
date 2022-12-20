import java.nio.file.Paths;
import java.util.List;
import java.io.IOException;

// import com.google.common.io.Files;

import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.text.NumberFormat;
import java.util.List;
import java.util.Locale;


public class ReadFile {
    

    List<String> getLines(String myPath) throws IOException{

        List<String> csvFileData  = Files.readAllLines(Paths.get(myPath), StandardCharsets.ISO_8859_1);
        return csvFileData;
    }

    


    


}
