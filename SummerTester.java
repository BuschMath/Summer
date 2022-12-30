public class SummerTester {
    public static void main(String[] args){
    Summer oneToOneHundred = new Summer(1, 100);
    Summer OneHundredTo1000 = new Summer(100, 1000);

    int smallSum = oneToOneHundred.Sum();
    int largeSum = OneHundredTo1000.Sum();

    System.out.print("The sum of 1 to 100 is: ");
    System.out.println(smallSum);

    System.out.print("The sum of 100 to 1000 is: ");
    System.out.println(largeSum);
    }
}
