package basic_study;

/**
 * Created by chi on 2017/01/15.
 */
/**
 * Created by chi on 2017/01/11.
 */


class User2 {

    //    フィールド
    String name ;
    //    コンストラクタ クラス名で書けばok
    User2(String name){
//        メソッド内からクラス内のフィィールドにアクセスするには
//        Thisを使う。
        this.name = name;
    }

    // コンストラクタもメソッドなのでオーバライドする事ができます。
    User2(){
        //    this() このクラスのコンストラクタ
//        this.name = "名無しの遠藤です!";
        //これは実質、User2(String name)に引数として"
        // Endo"を渡しているのと一緒
        this(" 名無しのEndoです！");
        // "
    }

    void sayHi(){
        System.out.println("Hi!"+this.name);
    }
} //Userクラス

//継承クラス(小クラス)
class AdminUser extends User2 {
    //自動的に親クラスのコンストラクタが呼ばれる。
    AdminUser(String name){
    /**
    * 親クラスのコンストラクタは super();
    * という特殊なメソッドで、
    * 親クラスのコンストラクタに引数がなければ、
    * これを省略することもできます。
    */

    //今回は親クラスで使った、nameを使いたいのでsuper()を呼び出している
    super(name); //これでthis.nameが使えるようになる。
    }

    void sayHello(){
        System.out.println("sayHello!"+this.name);
    }

    //親クラスのメソッドをオーバライドする。

    /**
     * なみにオーバーライドする際にはアノテーション
     * という仕組みを使って
     * @Override と書いてあげると良いでしょう。
     *
     * そうすることで、オーバーライドしていることを
     * 明示的に示すことができるので、
     * 例えばメソッド名を間違えていたりだとか、
     * 引数を間違えていたりした場合にエラーにしてくれます。
     *
     */
    @Override
    void sayHi(){
        System.out.println("[admin]+Hi!!"+this.name);
    }
}



public class MyAppExtend {
    public static void main(String[] args) {
        //インスタンス生成する。
        //クラス名 変数 = nw クラス名)
        User2 tom = new User2("サンシャイン岡崎ぃいいい！いぇぇぇｘ！");
        User2 endo = new User2();

        System.out.println(endo.name); // 名無しのEndoです！
        System.out.println(tom.name); //サンシャイン岡崎ぃいいい！いぇぇぇｘ！
        tom.sayHi(); //Hello Wold!サンシャイン岡崎ぃいいい！いぇぇぇｘ！

//        継承クラス呼び出し。
        System.out.println("ここから下が継承クラスの結果");
        AdminUser bob = new AdminUser("Bob");
        System.out.println(bob.name);
        bob.sayHi(); //親クラスのメソッドのsay_Hiのオーバライド
        bob.sayHello(); //小クラスのメソッド

    }
}
