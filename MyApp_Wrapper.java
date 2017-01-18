package basic_study;

/**
 * Created by chi on 2017/01/15.
 *
 * Java なのですが、
 * 基本データ型と参照型があると伝えましたが、
 * 実は基本データ型には、それに対応する
 * 参照型のクラスが用意されていたりします。
 *
 * 例えば、
 * int には Integer クラス
 * double には Double クラスと
 *
 * これらを
 * "ラッパークラス（Wrapper Class）と呼ぶので"、
 * 用語として覚えておいてください。
 *
 *
 * Java のクラスによっては参照型の引数しか受け付けないものもあるので
 * ラッパークラスと基本データ型を
 * 相互に変換できるようにしておきましょう。
 * */
public class MyApp_Wrapper {

    public static void main(String[] args) {
        /**
         * Integer のラッパークラス型で i を宣言してあげて
         * 例えば 32 という基本データ型を
         * ラッパークラスにしたい場合には
         *
         * Integer クラスのインスタンスを作ってあげて
         * 基本データ型を渡してあげれば OK です。
         *
         */
        Integer i = new Integer(32);

        /**
         * 逆にラッパークラスの値を
         * 基本データ型として取り出すには
         * int で受けてあげたいので
         * 「int n」としつつ「i.intValue();」としてあげてください。
         */
        int n = i.intValue();

        //自動変換を参照型に入れるという意味で、auto boxing、
        Integer i2 = 40; //auto boxing
        // 逆にこちらの方を auto unboxing と言ったりするので、用語として覚えておきましょう。
        int n2 = i2; //suto unboxing

        Integer i3 = 50;
        /**
         *
         * 参照型のデータには値そのものではなくて
         * 値が入っているメモリ領域の場所が入る
         * と説明してきましたが、
         * どの場所も指し示していない状態にしたい場合
         * には「null」という特殊な値を代入してあげます。
         *
         */


        i3 = null;
        //例外起きそう!
        try {
            int n3 = i3; //nullはunboxingできない。= 例外が発生する
        } catch (NullPointerException e) {
            System.err.println(e.getMessage());
        }


        System.out.println(n);
        System.out.println(n2);

    }
}
