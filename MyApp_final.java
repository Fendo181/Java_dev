package basic_study;

/**
 * Created by chi on 2017/01/15.
 * final = 変更できない。
 *
 * final クラス =　継承できない。
 * final メソッド = overrideできない。
 *final フィールド(変数名) =値を変更できない
 *(private static final)でよくやる。
 *
 *
 *
 * クラスにも、メソッドにも、フィールドにも
 * 付ける事ができる。
 */

class User_f{
    protected  String name;
//    値を現行できない。
    /**
     * ちなみに定数の時に static と final があわせて使われるのは
     * どうせ値が変わらないなら、インスタンスを変数にしておいて
     * インスタンス毎に値を持たせるよりも
     * static を付けて 1 つだけのクラス変数にしてしまえば良いという考え方なので]
     * それも覚えておくと良いかと思います
     *
     * 順番も大丈夫
     *
     * アクセス修飾子 static finalの順番で書かれるのがベター
     *
     */

    private  static  final double VERSION = 1.1;
    public User_f(String name){
        this.name =name;
    }

    public void sayHi(){
        System.out.println("Hi!"+this.name);
    }

}

//継承
class AdminUser_f extends User_f{

//    コンストラクタ
    public AdminUser_f(String name){
        super(name);
    }

    @Override
    public void sayHi(){
        System.out.println("[admin] hi!"+this.name);
    }

}
public class MyApp_final {
    public static void main(String[] args) {
        AdminUser_f tom =new AdminUser_f("endo");
        tom.sayHi();
    }
}
