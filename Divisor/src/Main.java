public class Main {
    public static void main(String[] args) {
      ForArr myArr = new ForArr(new int[]{ 8, 4, 16, 20, 1 });
      int smallest = myArr.getSmallest(myArr.arr);
        System.out.println(myArr.getDivisor(myArr.arr));
    }

}
class ForArr{
    int[] arr;
    ForArr(int[] a){
        arr = a;
    }
    int getSmallest(int[] theSmallest){
        int t;
        for (int i = 0; i < theSmallest.length; i++)
        {
            for (int j = i + 1; j < theSmallest.length; j++)
            {
                if (theSmallest[i] > theSmallest[j])
                {
                    t = theSmallest[i];
                    theSmallest[i] = theSmallest[j];
                    theSmallest[j] = t;
                }
            }
        }
        return theSmallest[0];
    }
    int getDivisor(int[] b) {
        int i;
        int divisor = 0;
        for (i = 0; i < getSmallest(b); i++) {
            if ((double) (b[i] % getSmallest(b)) != 0) {
                divisor = 1;
            }else{
                divisor = getSmallest(b);
            }
        }
        return divisor;
    }
}
