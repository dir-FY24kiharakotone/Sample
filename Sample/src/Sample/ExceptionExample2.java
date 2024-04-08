package Sample;

public class ExceptionExample2 {

    public static void main(String[] args) {
        System.out.println("処理開始");
    
    try {
        //ここに例外が発生する可能性があるコードを書きます
        System.out.println("割り算開始");
        int a = divide(10, 0);
        System.out.println(a); }
    catch (ArithmeticException e) {
        //ArithemtiExceceptionが発生した時の処理を書きます
        System.out.println("Arithemtic Exceotion caught: " + e.getMessage());
        
    }finally {
        //例外有無に関わらず、実行されるコードを書きます
        System.out.println("割り算終了");   
        }   
    System.out.println("処理終了");
    }
    
     public static int divide(int a, int b) throws  ArithmeticException {
         if (b == 0) {
             //0での除算を試みた場合、ArithemeticExceptionを投げます
             throw new ArithmeticException("ゼロ除算エラーです");
         }
             return a / b;
             
         
           
                     
    }
}
    
        
       
     
    
   

