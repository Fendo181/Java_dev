package basic_study;

/**
 * Created by chi on 2017/01/11.
 */
public class Preference {
    public static void main(String[] args) {
        //       基本データ型
        int x =10;
        int y = x;
        y = 5;
        System.out.println(x);
        System.out.println(y);

        //       参照データ型
        int[] a = {3,5,7};
        int[] b = a;
        b[1] = 8;
        System.out.println(a[1]); //これはaがb[1](番地)を参照しているから
        System.out.println(b[1]);
        //        文字列の参照データ型
        String s = "hello";
        String t =s;
        t = "words";

        /**
         * 基本的に文字列は変更が不可になっていて、
         * 違う文字列を割り当てると別の領域に新しく
         * データを確保するという仕組みになっているからです。
         *
         * 文字列は参照型データになっているが、挙動が基本型に沿っている。
         */
        System.out.println(s); //hello
        System.out.println(t); //words

     }
}
