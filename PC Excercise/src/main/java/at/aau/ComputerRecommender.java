package at.aau;

public class ComputerRecommender {
    /* Equivalence Partitions
     * 1-5;A
     * 6-INF;B
     * ...
     */
    public ComputerType getRecommendedComputerTypePerBudget(int maxBudget) throws Exception {
        if (maxBudget < 450){
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
