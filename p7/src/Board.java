import java.util.Random;

public class Board {
    private static final int POPULATION_SIZE = 100;
    private static final int CHROMOSOMES_SIZE = 8;
    private static final int MAX_GENERATION = 1000;
    private static final double MUTATION_RATE = 0.05;

    private static final Random RANDOM = new Random();
    private static final int SELECTION_SIZE = (int) Math.round(POPULATION_SIZE*0.2);
    private static class Individual {
        private int[] genes;
        private int fitness;

        public Individual(){
            this.genes = new int[CHROMOSOMES_SIZE];
            for (int i = 0; i < genes.length; i++) {
                genes[i] = RANDOM.nextInt(CHROMOSOMES_SIZE);
            }
            calculateFitness();
        }
        public Individual(int[] genes){
            this.genes = genes;
            calculateFitness();
        }

        public int getFitness(){
            return fitness;
        }

        public int[] getGenes(){
            return genes;
        }

        public void calculateFitness(){
            // 
            int conflicts = 0;


        }




    }
}
