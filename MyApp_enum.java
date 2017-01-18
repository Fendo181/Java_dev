package basic_study;

/**
 * Created by chi on 2017/01/15.
 *
 * 列挙型は
 * クラスのように自分で作ることができるデータ型で
 * 定数をまとめたものになります
 */

/**
 *
 * ここではResultという、列挙型を作る。
 *
 *  列挙型を定義すると ordinal() という特殊なメソッドも定義されて
 *  0 からはじまる連番がセットされたりします。
 * この場合だと、SUCCESS が 0 で ERROR が 1 ですね。
 *
 * この数値を取り出したい場合は
 * ordinal メソッドを使えば良いので、
 * 例えば「System.out.println(res.ordinal());」としてあげると
 * SUCCESS の場合は 0
 * ERROR の場合は 1
 * が出力されるはずです。
 *
 * 挙型は実はもっと奥が深くて、
 * 内部的には特殊なクラスとして扱われているので実はこの中にフィールドやメソッドを持つことができます。
 */

enum Result{
    SUCCESS,
    ERROR,
}



public class MyApp_enum {
    public static void main(String[] args) {
        Result res;
//        res = Result.ERROR;
        res = Result.SUCCESS;


        switch (res){
            case SUCCESS:
                System.out.println("成功しました！");
                System.out.println(res.ordinal());
                break;
            case ERROR:
                System.out.println("エラーです！");
                System.out.println(res.ordinal());
                break;
        }
        System.out.println(res);
    }
}
