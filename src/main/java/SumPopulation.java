import java.util.List;

public class SumPopulation {
    long popSum = 0;

    public long getPopulationSum(List<String> populationList){
        for(int i=0;i<populationList.size();i++){

            if(populationList.get(i).length()!=0){

                 popSum += Integer.parseInt(populationList.get(i));
                System.out.println(popSum);
            }

            
        }
        //System.out.println(popSum);
        return popSum;
    } 
    
}
