import java.util.stream.IntStream;


public class MoreLoopFun {
    public static void main(String[] args) {
        /*
        for(initialization; boolean; update){
            what we want to do
        }
         */

        //a for loop that counts by ones from 1 to 5
        for(int start = 1; start < 5; start++ ){
            System.out.println(start);
        }

        //a for loop that prints the powers of two up to 100
        //can you have an infinite for loop?


        //write a for loop that counts by 4s from 5 up to 50


        //write a for loop that sums the numbers from 1 to 10
        int total = 0;
        for(int i : IntStream.range(1, 11).toArray()) {
            total+=i;
        }
        System.out.println(total);

        ////////////////////////////////////////////////////
        //for loops compared to while loops////////////////
        //////////////////////////////////////////////////

        for(int i : IntStream.range(0, 11).map((n) -> (int) Math.pow(2, n)).toArray()) {
            System.out.println(i);
        }
    }
}
