public class Solution {

    // Complete the squares function below.
    static int squares(int a, int b) {
        
        int amntSquareVlaues = 0;

        int start = (int)Math.sqrt(a);
        int end = (int)Math.sqrt(b);

        amntSquareVlaues = end - start;

        if( (Math.pow(start,2)) >= a ){
            amntSquareVlaues++;
        }

        return amntSquareVlaues;
    }
}
