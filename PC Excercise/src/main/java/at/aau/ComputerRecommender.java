package at.aau;

public class ComputerRecommender {
    /* Equivalence Partitions
     * 1-449; EntryLevel
     * 450-600; Budget
     * 601-1500; Gaming
     * 1501-INF; Enthusiast
     */


    public ComputerType getRecommendedComputerTypePerBudget(int maxBudget) throws Exception {
        if (maxBudget < 450 & 0 < maxBudget ){
            return ComputerType.ENTRYLVL;
        }
        else if (maxBudget <= 600){
            return ComputerType.BDGTPC;
        }
        else if (maxBudget <= 1500){
            return ComputerType.GMNGPC;
        }
        else if (maxBudget > 1500){
            return ComputerType.ENTHUSIASTHPC;
        }
        else throw new Exception("Invalid Budget Exception");
    }
}
