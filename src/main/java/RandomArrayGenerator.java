import java.util.Random;

public class RandomArrayGenerator {

    private int [] randomTable;

    RandomArrayGenerator(int sizeOfArray){
        this.randomTable = new int [sizeOfArray];
        Random random = new Random();
        for (int i = 0; i < sizeOfArray; i++) {
            this.randomTable[i] = random.nextInt(50);
        }
    }

    public int[] getRandomTable() {
        return randomTable;
    }
}
