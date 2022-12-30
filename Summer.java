public class Summer{
    public Summer(int a, int b){
        startInt = a;
        endInt = b;
    }

    public int Sum(){
        int i = startInt;
        int sum = 0;
        while(i <= endInt){
            sum += i++;
        }

        return sum;
    }

    private int startInt;
    private int endInt;
}