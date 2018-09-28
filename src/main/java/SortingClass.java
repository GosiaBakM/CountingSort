public class SortingClass {

private RandomArrayGenerator table[];

int[] sortingByCounting(int sizeOfArray){
  RandomArrayGenerator randomArrayGenerator = new RandomArrayGenerator(sizeOfArray);
  int [] randomArray = randomArrayGenerator.getRandomTable();
    int maxValueOfArray = randomArray[0];

    for (int i = 0; i < (sizeOfArray -1); i++) {
        if(randomArray[i+1] > randomArray[i] ){
            maxValueOfArray = randomArray[i+1];
        }
    }
    int [] replacementArray = new int[maxValueOfArray];


return null;
}

}


