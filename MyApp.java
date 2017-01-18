package basic_study;

/**
 * Created by chi on 2017/01/11.
 */


class User{

//    フィールド
    String name ;
//    コンストラクタ クラス名で書けばok
    User(String name){
//        メソッド内からクラス内のフィィールドにアクセスするには
//        Thisを使う。
        this.name = name;
    }

//    コンストラクタもメソッドなのでオーバライドする事ができます。
    User(){
        //    this() このクラスのコンストラクタ
//        this.name = "名無しの遠藤です!";

        //これは実質、User2(String name)に引数として"
        // Endo"を渡しているのと一緒
        this(" 名無しのEndoです！");
        // "
    }

    void sayHi(){

        System.out.println("Hello Wold!"+this.name);
    }
} //Userクラス

//継承クラス


public class MyApp {

    public static void main(String[] args) {
        //インスタンス生成する。
        //クラス名 変数 = nw クラス名)
        User2 tom = new User2("サンシャイン岡崎ぃいいい！いぇぇぇｘ！");
        User2 endo = new User2();
        System.out.println(endo.name);

        System.out.println(tom.name);
        tom.sayHi();


    }
}
