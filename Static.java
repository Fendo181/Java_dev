package basic_study;

/**
 * Created by chi on 2017/01/15.
 *
 * statcフィィールとは?
 * static フィールドを使うと個々のインスタンスで値を
 * 保持するのではなくて、
 * クラスに紐付いた形で値を保持することができます
 */


class User_s {
    private String name;
    private static int count=0;

//    コンストラクタ
    public User_s(String name){
        this.name = name;
/**
 *    staticフィールドにアクセスする際には
 *    親クラス.プロパティ名
 *    としてアクセスする。
  */
        User_s.count++;//クラスで紐づくイメージ
    }



    public static void getInfo(){
        System.out.println("# of instances: "+ User_s.count);
    }
}


public class Static {
    public static void main(String[] args) {
        User_s.getInfo(); //0
        User_s tom = new User_s("tom");
//        staticメソッド呼び出し。
        User_s.getInfo(); //1
        User_s bob = new User_s("bob");
        User_s.getInfo();
    }
}
