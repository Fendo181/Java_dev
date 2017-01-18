package basic_study;

/**
 * Created by chi on 2017/01/15.
 *
 * 抽象クラスは他のクラスに
 * 継承してもらうことを前提にしているクラスで、
 * それ自身を"インスタンス"化することができません。
 *
 * 抽象クラスを継承するクラスを"具象クラス"呼ばれている。
 *
 * abstractを付けてあげる。
 *
 * 抽象クラスのおかけでコードの可読性(どのメソッドが実装されているのか)すぐに
 * わかり、コードの抽象化に成功していて、たしかに強大になるにつれて
 * 抽象クラスは大事になってくる。
 *
 * このように抽象クラスを使うと
 * 関連するクラスの共通部分だけを切り出して具象クラスの方に実装を任せることができます。
 *開発の規模が大きくなってくると、こうした実装もみかけたりもするので覚えておいてください。
 */

//抽象クラスと呼ばれる。
abstract  class User_abstract{

//    abstractをつける事で具象クラス(継承先のクラス)で実装されないとErrorを起こす!
    //どんだけ実装されたいんだ...
    public abstract void sayHi();//抽象メソッド
}

//具象クラス
class JapaneseUser extends User_abstract{
    @Override//アノテーション
    public void sayHi(){
        System.out.println("こんにちは世界!!");
    }
}

//具象クラス2
class AmericanUser extends User_abstract{
    @Override//アノテーション
    public void sayHi(){
        System.out.println("Hello! Wold!");
    }
}

public class MyApp_abstract {
    public static void main(String[] args) {

        AmericanUser tom = new AmericanUser();
        JapaneseUser takeshi = new JapaneseUser();

        tom.sayHi();
        takeshi.sayHi();

    }
}
