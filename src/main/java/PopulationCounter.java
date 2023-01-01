import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.text.NumberFormat;
import java.util.List;
import java.util.Locale;

public class PopulationCounter {
    public static void main(String[] args) throws Exception {
        long sum = 0;
//        String path = args[0];
        //   String path = "./data/worldcitiespop.csv";
        String path = "/home/ashar/xloop/java/population/populatron_java/data/worldcitiespop.csv";

        // List<String> lines = Files.readAllLines(Paths.get(path), StandardCharsets.ISO_8859_1);

        ReadFile readFile = new ReadFile(); 

        List<String> lines =  readFile.getLines(path);

        // System.out.println(lines);

        
        // for(int i = 1; i < lines.size(); i++) {
        //     String line = lines.get(i);
        //     String[] terms = line.split(",");           // parse 
        //     String popText = terms[4];






        //     if(popText.length() == 0) {
        //         continue;
        //     }
        //     long population = Integer.parseInt(popText);
        //     sum += population;
        // }
        
        ParseData parsedData = new ParseData();
        List<String> popList = parsedData.parseMyData(lines);
        
        SumPopulation sumPopulation = new SumPopulation();
        long calculatedSum = sumPopulation.getPopulationSum(popList);

        String num = NumberFormat.getInstance(Locale.getDefault()).format(calculatedSum);
        System.out.printf("World population is: %s\n", num);
    }
}
