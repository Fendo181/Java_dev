package basic_study;

/**
 * Created by chi on 2017/01/15.
 * static 修飾子を使ってクラスに紐付いたいくつかの処理を見てきたのですが、
 * インスタンスにおけるコンストラクタのように、
 * クラスを使う前にも何らかの初期化処理をしたい場合があります。
 *その場合に使えるのが
 * static イニシャライザなので
 * 使い方を見ておきましょう。
 *
 */

class User_i{
    private String name;
    private  static int count ; //クラス変数

//    Class変数初期化　=イニシャライズ
    /**
     * 「static { …」とした後に、この中に
     * クラスが初期化される際に行う処理を書いてあげれば OK です。
     *
     * クラス変数の初期化
     */

    static {
        User_i.count=10;
        System.out.println("①一番最初に初期化出来る！。Static initialize");
    }

// インスタンスイニシャライザ　= インスタンスを初期化する。
    /**
     * コンストラクタとの違いなのですが、
     * インスタンスイニシャライザは"インスタンス化される前"
     * コンストラクタはインスタンス化された後に実行されるという違いがあります。
     */

    /**
     * 仕様用途
     * コンストラクタがオーバーロードされていて複数あった場合、
     * 共通処理をこちらに書いておいて先に実行しておくといったことをよくやります。
     */
    {
        System.out.println("②インスタンスが生成される前に初期化できる！Insutance Initializer");
    }

    public User_i(String name){
        this.name = name;
        User_i.count++;
        System.out.println("③インスタンス生成後に初期化できる!Constructor ");
    }


    public static void getInfo(){
        System.out.println("# of instances: "+ User_i.count);
    }

}
public class MyApp_Initialize {
    public static void main(String[] args) {
        User_i.getInfo(); //0
        User_i tom = new User_i("tom");
//        staticメソッド呼び出し。
        User_i.getInfo(); //1
        User_i bob = new User_i("bob");
        User_i.getInfo();
    }
}
