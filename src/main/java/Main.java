public class Main {

    public static void main(String[] args) {

//        for (int i:  new RandomArrayGenerator(20).getRandomTable()) {
//           System.out.println(i);
//        }

        SortingClass sortingClass = new SortingClass();

        for (int i: sortingClass.sortingByCounting(20)
             ) {
            System.out.println(i);
        }

    }
}
