package basic_study;

/**
 * Created by chi on 2017/01/15.
 *
 * //Interface
 *
 *
 * クラスの継承と違って
 * インターフェースはクラスにいくつでも適用させることができるので
 * かなり柔軟にクラスの拡張をすることができます。
 *
 */

/**
 * 例えば Printable というインターフェースを作って、
 * どのクラスにも印刷のための機能を提供したかったとします。*
 */

interface  Printable{
    //定数
    /**
     * 定数なのですが、public static final は省略できるので、
     * 例えば VERSION を定数で管理したかった場合は
     * 「double VERSION = 1.2;」と書いてあげれば OK です。
    * */

    double VERSION = 1.1;


    //抽象メソッド
    /**
     *
     * 抽象メソッドは public abstract を省略できるので、
     * 例えば「void print();」のように書いてあげて
     * あとで実装していきましょう。
     */
    void  print();

    // defaulltメソッド

    /**
     * default メソッドなのですが、
     * 抽象メソッドと違ってここに直接実装が書けるメソッドになります。
     *なので例えば
     * 「public default void getInfo() { …」とした後に実装を書いていくことができるので、
     * 例えばインターフェースのバージョンをこちらで表示してあげましょう。
     *
     */
    public  default  void getInfo(){
        System.out.println("Printable機能のバージョンは"+Printable.VERSION+"です！");
    }

    // staticメソッド
    /**
     * static メソッドなのですが、これはこのインターフェースに属するメソッドで、
     * 主な使い道としては default メソッドが複雑になってきた時に処理をまとめるという
     * ヘルパー的な使い方があるかと思います。
     *
     */
    //今回はなし

}

/**
 * これでインターフェースができたので、
 * User クラスでこれを使うには implements というキーワードを使ってあげてください。
 */

class User_interface implements Printable{
    //抽象メソッドはOverrrideしないといけないので書いていきましょう。
    @Override
    public void print(){
        System.out.println("Now printing user profile ...");
    }
}

public class MyApp_Interface {
    public static void main(String[] args) {
        User_interface tom = new User_interface();
        //抽象メソッド
        tom.print();
        //defaultメソッド
        tom.getInfo();
    }
}
