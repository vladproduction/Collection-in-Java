package vladproduction.working_with_arrays;

public class ForEachDemo {
    public static void main(String[] args) {
        ForEachDemo forEachDemo = new ForEachDemo();
        forEachDemo.run();
    }

    private void run() {
        //array wanted to be print by for each iterating:
        int [] a = new int [] {1,2,6,4,55,78,10,100,7};
        for (int items: a){
            System.out.print(items+" ");
        }
        System.out.println();
    }
}
