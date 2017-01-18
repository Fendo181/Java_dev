package basic_study;

/**
 * Created by chi on 2017/01/15.
 * 例外処理
 *
 * エラー発生時に終了させずに
 * 分かりやすいメッセージを出したり
 * 別の処理をしたい場合は例外の仕組みが使えたりします。
 *
 * エラー発生時
 * Exception in thread "main" java.lang.ArithmeticException: / by zero
 *
 *
 * ①例外でそうな場所をtryで囲んであげる。
 * ②例外(ArithmeticException)をcatchして例外が発生した時
 * の処理を記述する。
 * ③
 */


/**
 * 今回、何らかの理由で b がマイナスだったら例外を返したかったとしましょう。
 *その場合に独自の例外を設定したいので
 *標準の Exception クラスを継承してあげます。
 */

class  MyException extends Exception{
//    コンストラクタでerroメッセージを受け取る事が出来る。
    public MyException(String s){
        //コンストラクタで値を受け取る
        super(s);
    }
}


public class MyApp_try {

    public static void div(int a, int b){
        try {
            //bがマイナスだった時の例外処理"投げる"。
            if(b<0){
                throw new MyException("マイナスをいれないで！");
            }
            System.out.println(a / b);
            /**
             * その後に例外を catch() してあげるのですが、
             * 今回は「ArithmeticException」という例外が出ているので、そちらを
             * e で受け取って(catch)あげて
             * e に設定されているエラーメッセージを表示するだけにしてあげましょう。
             */
        }catch (ArithmeticException e){
//            System.out.println(e.getMessage());
//            System.err.println()で赤文字にする
            System.err.println(e.getMessage()); //標準のErrorメソッド
        }catch (MyException e){
            System.err.println(e.getMessage());  //独自の例外クラスを作った際の例外処理
        }finally {
            /**
             * 、例外が発生しようがしまいが
             * 最後に何らかの後処理をしたいという場合は
             * finally というブロックが使えます。
             */
            System.out.println("---endo----");
        }
    }

    public static void main(String[] args) {
        div(3,0); //0除算でerro
        div(3,-2);

    }
}
