public class Fibonnaci {

    //recursive method with two recursive calls in the method
    //iterative approach

    public long iterativeFib(int x) {
        if (x <= 1) {
            return x;
        }

        long fib = 1;
        long prevFib = 1;

        for (int i = 2; i < x; i++) {          //start from 2 as first if dealt with 0 and 1
            long temp = fib;
            fib = fib + prevFib;
            prevFib = temp;
        }

        return fib;
    }

    public long recursiveFib(int x){
        if (x <= 2){                //cover larger area with base case
            return 1;
        }
        return recursiveFib(x - 1) + recursiveFib( x - 2);
    }

}