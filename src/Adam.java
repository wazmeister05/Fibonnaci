public class Adam {

    public static void main(String[] args){
        Fibonnaci fibonnaci = new Fibonnaci();

        long start = System.currentTimeMillis();
        System.out.println("Iterative: " + fibonnaci.iterativeFib(1000000));        //will be better than recursive
        System.out.println("Time taken: " + (System.currentTimeMillis() - start));
        start = System.currentTimeMillis();
        System.out.println("Recursive: " + fibonnaci.recursiveFib(40));             //will be worse than iterative
        System.out.println("Time taken: " + (System.currentTimeMillis() - start));
    }

}
