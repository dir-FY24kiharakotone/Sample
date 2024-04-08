package Sample;

public class ForSample {

    public static void main(String[] args) {
       for (var i = 1; i <= 10; i++) {
           if (i > 8)
            break; //ifの条件を満たしたら、繰り返しから抜け出してプログラムは終了する
       
           System.out.println(i);
               
       }

    }
}


