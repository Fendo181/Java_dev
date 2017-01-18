package basic_study;

/**
 * Created by chi on 2017/01/15.
 *
 * thread
 */


/**
 * こちらのように抽象メソッドを一つだけ持つ
 * インターフェースのことを入力に
 * 対して出力が一つだけに定まるという意味で
 * 「関数型インターフェース」と呼びます。
 *
 */
//インターフェース
//class MyRunnable implements  Runnable{
////    抽象メソッド
//    public void run(){
//        for(int i =0; i<3; i++){
//            System.out.print('*');
//        }
//    }
//}




public class MyApp_Thread {
//    これもスレッド
    public static void main(String[] args) {
//        MyRunnable r = new MyRunnable();
//        Thread t = new Thread(r);
//        t.start();
//        もっと短くできる。

//        new Thread(new MyRunnable()).start();//無名クラスを使って、抽象メソッドをそのまま実装する。


        /**
         * こうしてあげると
         * あたかもインターフェースを
         * インスタンス化しているように見えるのですが、
         * 実際はそのインターフェースを実装している
         * クラスをインスタンス化していることになります。
         *
         */

        /**
         * 関数型インターフェースはラムダ式という
         * 特殊な記法で置き換えることが
         * できるようになりました。
         * //ラムダ式
         * (引数)->(処理
         *
         * むずいなぁ
         *
         */
        new Thread(() -> {
                for(int i =0; i<15; i++) {
                    System.out.print('*');
                }
        }).start();//無名クラスを使って、抽象メソッドをそのまま実装する。

//        new Thread(new  Runnable(){
//            //    抽象メソッド
//            public void run(){
//                for(int i =0; i<3; i++){
//                    System.out.print('*');
//                }
//            }
//        }).start();//無名クラスを使って、抽象メソッドをそのまま実装する。


        for(int i =0; i<15; i++){
            System.out.print('.');
        }
    }
}
