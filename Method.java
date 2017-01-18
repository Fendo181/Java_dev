package basic_study;

/**
 * Created by chi on 2017/01/11.
 */

//method

public class Method {
//    main関数
    public static void main(String[] args) {
//        文字列 =  String型
        sayHi("endo");
        sayHi("Takahashi!");
//       値が返ってくるので、入れる箱を用意しないと
//       いけない
        String mag = sayHello(("Kikuchi"));
        System.out.println(mag);
    }

//    クラス内に記述する。
    public static void sayHi(String s){
        System.out.println("sayHi!" +s );
    }

//  値を返すメソッド
    public static String sayHello(String name) {
        return "Hello!"+name;

    }
}


