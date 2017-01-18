package basic_study;

/**
 * Created by chi on 2017/01/11.
 */
public class MethodOveload {

    public static void sayHi(String s) {
//       この関数内でしか使えない
//        int x = 10;
        System.out.println("Hi!"+s);

    }
    /**
     *
     * 引数の個数が違えば同じ名前で登録ができるので、
     * 単純に引数なしの同じ名前のメソッドを登録してみたいと思います。
     */

    public static void sayHi() {
        System.out.println("sayHi! noBody!");

    }

//    Overload
    public static void main(String[] args) {
        sayHi("Endo");
        sayHi();

    }

}
