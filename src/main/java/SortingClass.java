public class SortingClass {

    private int [] sortedArray;

    int[] sortingByCounting(int sizeOfArray) {
        RandomArrayGenerator randomArrayGenerator = new RandomArrayGenerator(sizeOfArray);
        int[] randomArray = randomArrayGenerator.getRandomTable();
        int maxValueOfArray = randomArray[0];

        for (int i = 0; i < (sizeOfArray - 1); i++) {
            if (maxValueOfArray < randomArray[i + 1]) {
                maxValueOfArray = randomArray[i + 1];
            }
        }
        int[] replacementArray = new int[maxValueOfArray + 1];

        for (int i = 0; i < (sizeOfArray); i++) {
            if (replacementArray[randomArray[i]] == 0)
                replacementArray[randomArray[i]] = 1;
            else replacementArray[randomArray[i]] ++ ;
        }
        int indexOfSortedArray = 0;
        int [] sortedArray = new int [sizeOfArray];

        for (int i = 1; i < replacementArray.length; i++) {
            if(replacementArray[i] == 0 ) continue;
            for (int j = 0; j < replacementArray[i]; j++) {
                sortedArray[indexOfSortedArray] = i;
                indexOfSortedArray++;
            }
        }
        return sortedArray;
    }
}


